//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.01.07 alle 12:41:15 AM CET 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmBusinessStartupResponseRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupResponseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/user}choreographyInstanceRequest"/&gt;
 *         &lt;element name="messageData" type="{http://eu.chorevolution.farmbusinessstartup/user}farmBusinessStartupResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupResponseRequestType", propOrder = {
    "choreographyId",
    "messageData"
})
public class FarmBusinessStartupResponseRequestType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected FarmBusinessStartupResponse messageData;

    /**
     * Recupera il valore della proprietà choreographyId.
     * 
     * @return
     *     possible object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public ChoreographyInstanceRequest getChoreographyId() {
        return choreographyId;
    }

    /**
     * Imposta il valore della proprietà choreographyId.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public void setChoreographyId(ChoreographyInstanceRequest value) {
        this.choreographyId = value;
    }

    /**
     * Recupera il valore della proprietà messageData.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupResponse }
     *     
     */
    public FarmBusinessStartupResponse getMessageData() {
        return messageData;
    }

    /**
     * Imposta il valore della proprietà messageData.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupResponse }
     *     
     */
    public void setMessageData(FarmBusinessStartupResponse value) {
        this.messageData = value;
    }

}
