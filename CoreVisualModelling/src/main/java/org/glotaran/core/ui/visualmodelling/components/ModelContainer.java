/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DatasetContainer.java
 *
 * Created on Jul 15, 2009, 10:18:18 AM
 */
package org.glotaran.core.ui.visualmodelling.components;

import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import org.glotaran.core.models.tgm.Tgm;
import org.glotaran.core.ui.visualmodelling.common.EnumTypes;
import org.glotaran.core.ui.visualmodelling.common.VisualCommonFunctions;
import org.glotaran.core.ui.visualmodelling.nodes.CohSpecNode;
import org.glotaran.core.ui.visualmodelling.nodes.DispersionModelingNode;
import org.glotaran.core.ui.visualmodelling.nodes.IrfParametersNode;
import org.glotaran.core.ui.visualmodelling.nodes.KineticParametersNode;
import org.glotaran.core.ui.visualmodelling.nodes.KmatrixNode;
import org.glotaran.core.ui.visualmodelling.nodes.OscspecParametersNode;
import org.glotaran.core.ui.visualmodelling.nodes.PropertiesAbstractNode;
import org.glotaran.core.ui.visualmodelling.nodes.WeightParametersNode;
import org.glotaran.tgmfilesupport.TgmDataObject;
import org.openide.cookies.SaveCookie;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;
import org.openide.windows.WindowManager;

/**
 *
 * @author slk230
 */
public class ModelContainer
        extends javax.swing.JPanel
        implements ExplorerManager.Provider, Lookup.Provider, PropertyChangeListener {

    /**
     * path to the icon used by the component and its open action
     */
//    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    private static final String PREFERRED_ID = "ModelSpecificationView";
    private static final long serialVersionUID = 1;
    private ExplorerManager manager = new ExplorerManager();
    private ModelSpecificationView modelSpecificationView = new ModelSpecificationView();
    private ModelSpecificationNodeContainer container = new ModelSpecificationNodeContainer();
    private Lookup lookup;
    private TgmDataObject model;

    /**
     * Creates new form DatasetContainer
     */
    public ModelContainer() {
        initComponents();
        manager.setRootContext(new PropertiesAbstractNode("Model specification", container));//,ExplorerUtils.createLookup(manager, null)));
        manager.addPropertyChangeListener(this);
        ActionMap map = this.getActionMap();
        map.put("delete", ExplorerUtils.actionDelete(manager, true)); // or false
        InputMap keys = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        keys.put(KeyStroke.getKeyStroke("DELETE"), "delete");
        // following line tells the top component which lookup should be associated with it
        lookup = ExplorerUtils.createLookup(manager, map);
    }

    public ModelContainer(TgmDataObject object) {
        initComponents();
        manager.setRootContext(new PropertiesAbstractNode(object.getName(), container, Lookups.singleton(object), this));//,ExplorerUtils.createLookup(manager, null)));
        manager.addPropertyChangeListener(this);
        modelSpecificationView.addPropertyChangeListener(this);
        model = object;
        ActionMap map = this.getActionMap();
        map.put("delete", ExplorerUtils.actionDelete(manager, true)); // or false
        InputMap keys = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        keys.put(KeyStroke.getKeyStroke("DELETE"), "delete");
        // following line tells the top component which lookup should be associated with it
        lookup = ExplorerUtils.createLookup(manager, map);
        fillInModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jBRemove = new javax.swing.JButton();
        jBRefreshModel = new javax.swing.JButton();
        jBSaveModel = new javax.swing.JButton();
        jBReorderModel = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(180, 240));
        setLayout(new java.awt.GridBagLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.panel.border.title_1"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(180, 214));
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(modelSpecificationView, BorderLayout.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(panel, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 26));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jBRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/glotaran/core/main/resources/Delete-icon-16.png"))); // NOI18N
        jBRemove.setText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBRemove.text")); // NOI18N
        jBRemove.setToolTipText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBRemove.toolTipText")); // NOI18N
        jBRemove.setFocusable(false);
        jBRemove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRemove.setMaximumSize(new java.awt.Dimension(26, 26));
        jBRemove.setMinimumSize(new java.awt.Dimension(26, 26));
        jBRemove.setPreferredSize(new java.awt.Dimension(26, 26));
        jBRemove.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel1.add(jBRemove, gridBagConstraints);

        jBRefreshModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/glotaran/core/main/resources/Refresh.png"))); // NOI18N
        jBRefreshModel.setText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBRefreshModel.text")); // NOI18N
        jBRefreshModel.setToolTipText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBRefreshModel.toolTipText")); // NOI18N
        jBRefreshModel.setFocusable(false);
        jBRefreshModel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRefreshModel.setMaximumSize(new java.awt.Dimension(26, 26));
        jBRefreshModel.setMinimumSize(new java.awt.Dimension(26, 26));
        jBRefreshModel.setPreferredSize(new java.awt.Dimension(26, 26));
        jBRefreshModel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRefreshModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefreshModelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel1.add(jBRefreshModel, gridBagConstraints);

        jBSaveModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/glotaran/core/main/resources/Save.png"))); // NOI18N
        jBSaveModel.setText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBSaveModel.text")); // NOI18N
        jBSaveModel.setToolTipText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBSaveModel.toolTipText")); // NOI18N
        jBSaveModel.setFocusable(false);
        jBSaveModel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSaveModel.setMaximumSize(new java.awt.Dimension(26, 26));
        jBSaveModel.setMinimumSize(new java.awt.Dimension(26, 26));
        jBSaveModel.setPreferredSize(new java.awt.Dimension(26, 26));
        jBSaveModel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSaveModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveModelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanel1.add(jBSaveModel, gridBagConstraints);

        jBReorderModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/glotaran/core/main/resources/Sort-descending-icon.png"))); // NOI18N
        jBReorderModel.setText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBReorderModel.text")); // NOI18N
        jBReorderModel.setToolTipText(org.openide.util.NbBundle.getMessage(ModelContainer.class, "ModelContainer.jBReorderModel.toolTipText")); // NOI18N
        jBReorderModel.setMaximumSize(new java.awt.Dimension(26, 26));
        jBReorderModel.setMinimumSize(new java.awt.Dimension(26, 26));
        jBReorderModel.setPreferredSize(new java.awt.Dimension(26, 26));
        jBReorderModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReorderModelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jBReorderModel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jBRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveActionPerformed
        container.remove(manager.getSelectedNodes());
        model.setModified(true);
    }//GEN-LAST:event_jBRemoveActionPerformed

    private void jBRefreshModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefreshModelActionPerformed
        manager.getRootContext().removePropertyChangeListener(this);
        manager.getRootContext().getChildren().remove(manager.getRootContext().getChildren().getNodes());
        manager.getRootContext().addPropertyChangeListener(this);
        fillInModel();
        model.setModified(false);
    }//GEN-LAST:event_jBRefreshModelActionPerformed

    private void jBSaveModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveModelActionPerformed
        if (model.getCookie(SaveCookie.class) != null) {
            try {
                model.getCookie(SaveCookie.class).save();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }//GEN-LAST:event_jBSaveModelActionPerformed

    private void jBReorderModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReorderModelActionPerformed
        if (!model.getTgm().getDat().getKinparPanel().getKinpar().isEmpty()) {
            if (manager.getRootContext().getChildren().findChild("KinPar") != null) {
                ((KineticParametersNode) manager.getRootContext().getChildren().findChild("KinPar")).sortKineticParameters();
            }
        }
    }//GEN-LAST:event_jBReorderModelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRefreshModel;
    private javax.swing.JButton jBRemove;
    private javax.swing.JButton jBReorderModel;
    private javax.swing.JButton jBSaveModel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    public Tgm getModel() {
        return model.getTgm();
    }

    private void fillInModel() {
//==============filling up parameters ============
        if (model.getTgm().getDat() != null) {
            if (!model.getTgm().getDat().getKMatrixPanel().getJVector().getVector().isEmpty()) {
                manager.getRootContext().getChildren().add(
                        new Node[]{new KmatrixNode(model, this)});
            } else {
                if (!model.getTgm().getDat().getKinparPanel().getKinpar().isEmpty()) {
                    manager.getRootContext().getChildren().add(
                            new Node[]{new KineticParametersNode(model.getTgm().getDat().getKinparPanel(), this)});
                }
            }
            if (model.getTgm().getDat().getIrfparPanel().getIrf() != null) {
                if (!model.getTgm().getDat().getIrfparPanel().getIrf().isEmpty()) {
                    manager.getRootContext().getChildren().add(
                            new Node[]{new IrfParametersNode(model, this)});
                }
            }

            if (model.getTgm().getDat().getIrfparPanel().getParmu() != null) {
                if (model.getTgm().getDat().getIrfparPanel().getParmu().length() != 0) {
                    manager.getRootContext().getChildren().add(
                            new Node[]{new DispersionModelingNode(model.getTgm().getDat().getIrfparPanel(), EnumTypes.DispersionTypes.PARMU, this)});
                }
            }

            if (model.getTgm().getDat().getIrfparPanel().getPartau() != null) {
                if (model.getTgm().getDat().getIrfparPanel().getPartau().length() != 0) {
                    manager.getRootContext().getChildren().add(
                            new Node[]{new DispersionModelingNode(model.getTgm().getDat().getIrfparPanel(), EnumTypes.DispersionTypes.PARTAU, this)});
                }
            }
            if (model.getTgm().getDat().getWeightParPanel().getWeightpar() != null) {
                if (!model.getTgm().getDat().getWeightParPanel().getWeightpar().isEmpty()) {
                    manager.getRootContext().getChildren().add(
                            new Node[]{new WeightParametersNode(model.getTgm().getDat().getWeightParPanel(), this)});
                } else if (model.getTgm().getDat().getWeightParPanel().isPoisson() != null) {
                    manager.getRootContext().getChildren().add(
                            new Node[]{new WeightParametersNode(model.getTgm().getDat().getWeightParPanel(), this)});
                }
            }
            if (model.getTgm().getDat().getCohspecPanel().getCohspec() != null) {
                if (model.getTgm().getDat().getCohspecPanel().getCohspec().getType() != null) {
                    if (!model.getTgm().getDat().getCohspecPanel().getCohspec().getType().isEmpty()) {
                        manager.getRootContext().getChildren().add(
                                new Node[]{new CohSpecNode(model.getTgm().getDat().getCohspecPanel(), this)});
                    }
                }
            }
        
        if (model.getTgm().getDat().getOscspecPanel() != null) {
            if (model.getTgm().getDat().getOscspecPanel().getOscspec() != null) {
                if(model.getTgm().getDat().getOscspecPanel().getOscspec().getType() != null) {
                manager.getRootContext().getChildren().add(
                        new Node[]{new OscspecParametersNode(model, this)});
                }
            }
        }
    }
}

@Override
        public ExplorerManager getExplorerManager() {
        return manager;
    }

    @Override
        public Lookup getLookup() {
        return lookup;
    }

    @SuppressWarnings("element-type-mismatch")
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getSource() == manager
                && ExplorerManager.PROP_SELECTED_NODES.equals(evt.getPropertyName())) {
            WindowManager.getDefault().getRegistry().getActivated().setActivatedNodes(manager.getSelectedNodes());
            return;
        }
        if (!evt.getPropertyName().equals("nodeChange")) {
            model.setModified(VisualCommonFunctions.modelParametersChange(model.getTgm().getDat(), evt));
        

}
        if (evt.getSource().getClass().equals(KmatrixNode.class  

    )) {
    System.out.println (

"KMatrix Added");
        }
    }
}
