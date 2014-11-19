//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.09 at 03:30:53 PM CEST 
//


package org.glotaran.core.models.gta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datasetContainer" type="{http://glotaran.org/schema/GlobalAndTargetAnalysisSchema}GtaDatasetContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="model" type="{http://glotaran.org/schema/GlobalAndTargetAnalysisSchema}GtaModelReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connection" type="{http://glotaran.org/schema/GlobalAndTargetAnalysisSchema}GtaConnection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nodeCounter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="output" type="{http://glotaran.org/schema/GlobalAndTargetAnalysisSchema}GtaOutput" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edgeCounter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="simulationContainer" type="{http://glotaran.org/schema/GlobalAndTargetAnalysisSchema}GtaSimulationContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datasetContainer",
    "model",
    "description",
    "name",
    "version",
    "connection",
    "nodeCounter",
    "output",
    "edgeCounter",
    "simulationContainer"
})
@XmlRootElement(name = "GtaProjectScheme")
public class GtaProjectScheme {

    @XmlElement(nillable = true)
    protected List<GtaDatasetContainer> datasetContainer;
    @XmlElement(nillable = true)
    protected List<GtaModelReference> model;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String version;
    @XmlElement(nillable = true)
    protected List<GtaConnection> connection;
    @XmlElement(required = true)
    protected String nodeCounter;
    @XmlElement(nillable = true)
    protected List<GtaOutput> output;
    @XmlElement(required = true)
    protected String edgeCounter;
    @XmlElement(nillable = true)
    protected List<GtaSimulationContainer> simulationContainer;

    /**
     * Gets the value of the datasetContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtaDatasetContainer }
     * 
     * 
     */
    public List<GtaDatasetContainer> getDatasetContainer() {
        if (datasetContainer == null) {
            datasetContainer = new ArrayList<GtaDatasetContainer>();
        }
        return this.datasetContainer;
    }

    /**
     * Gets the value of the model property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the model property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtaModelReference }
     * 
     * 
     */
    public List<GtaModelReference> getModel() {
        if (model == null) {
            model = new ArrayList<GtaModelReference>();
        }
        return this.model;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtaConnection }
     * 
     * 
     */
    public List<GtaConnection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<GtaConnection>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the nodeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeCounter() {
        return nodeCounter;
    }

    /**
     * Sets the value of the nodeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeCounter(String value) {
        this.nodeCounter = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtaOutput }
     * 
     * 
     */
    public List<GtaOutput> getOutput() {
        if (output == null) {
            output = new ArrayList<GtaOutput>();
        }
        return this.output;
    }

    /**
     * Gets the value of the edgeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdgeCounter() {
        return edgeCounter;
    }

    /**
     * Sets the value of the edgeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdgeCounter(String value) {
        this.edgeCounter = value;
    }

    /**
     * Gets the value of the simulationContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simulationContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimulationContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GtaSimulationContainer }
     * 
     * 
     */
    public List<GtaSimulationContainer> getSimulationContainer() {
        if (simulationContainer == null) {
            simulationContainer = new ArrayList<GtaSimulationContainer>();
        }
        return this.simulationContainer;
    }

}