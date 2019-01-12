
package com.wsm.cxf.dodept;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>emp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="emp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="d" type="{http://www.wsm.com/cxf/dodept}dept" minOccurs="0"/>
 *         &lt;element name="empno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hiredate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mgr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emp", propOrder = {
    "comm",
    "d",
    "empno",
    "ename",
    "hiredate",
    "job",
    "mgr",
    "sal"
})
public class Emp {

    protected Double comm;
    protected Dept d;
    protected Integer empno;
    protected String ename;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hiredate;
    protected String job;
    protected Integer mgr;
    protected Double sal;

    /**
     * 获取comm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComm() {
        return comm;
    }

    /**
     * 设置comm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComm(Double value) {
        this.comm = value;
    }

    /**
     * 获取d属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dept }
     *     
     */
    public Dept getD() {
        return d;
    }

    /**
     * 设置d属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dept }
     *     
     */
    public void setD(Dept value) {
        this.d = value;
    }

    /**
     * 获取empno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * 设置empno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpno(Integer value) {
        this.empno = value;
    }

    /**
     * 获取ename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEname() {
        return ename;
    }

    /**
     * 设置ename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEname(String value) {
        this.ename = value;
    }

    /**
     * 获取hiredate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHiredate() {
        return hiredate;
    }

    /**
     * 设置hiredate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHiredate(XMLGregorianCalendar value) {
        this.hiredate = value;
    }

    /**
     * 获取job属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置job属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob(String value) {
        this.job = value;
    }

    /**
     * 获取mgr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMgr() {
        return mgr;
    }

    /**
     * 设置mgr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMgr(Integer value) {
        this.mgr = value;
    }

    /**
     * 获取sal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSal() {
        return sal;
    }

    /**
     * 设置sal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSal(Double value) {
        this.sal = value;
    }

}
