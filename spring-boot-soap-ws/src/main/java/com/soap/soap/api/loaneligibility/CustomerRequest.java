//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.10.20 a las 04:45:01 PM CDT 
//


package com.soap.soap.api.loaneligibility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cibilScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "customerName",
    "age",
    "yearlyIncome",
    "cibilScore",
    "employmentMode"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    protected int cibilScore;
    @XmlElement(required = true)
    protected String employmentMode;

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Define el valor de la propiedad age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Obtiene el valor de la propiedad yearlyIncome.
     * 
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Define el valor de la propiedad yearlyIncome.
     * 
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Obtiene el valor de la propiedad cibilScore.
     * 
     */
    public int getCibilScore() {
        return cibilScore;
    }

    /**
     * Define el valor de la propiedad cibilScore.
     * 
     */
    public void setCibilScore(int value) {
        this.cibilScore = value;
    }

    /**
     * Obtiene el valor de la propiedad employmentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Define el valor de la propiedad employmentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}
