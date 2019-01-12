
package com.wsm.cxf.doemp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="dept">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emps" type="{http://www.wsm.com/cxf/doemp}emp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dept", propOrder = {
    "deptno",
    "dname",
    "emps",
    "loc"
})
public class Dept {

    protected Integer deptno;
    protected String dname;
    @XmlElement(nillable = true)
    protected List<Emp> emps;
    protected String loc;

    /**
     * 获取deptno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * 设置deptno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeptno(Integer value) {
        this.deptno = value;
    }

    /**
     * 获取dname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置dname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDname(String value) {
        this.dname = value;
    }

    /**
     * Gets the value of the emps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Emp }
     * 
     * 
     */
    public List<Emp> getEmps() {
        if (emps == null) {
            emps = new ArrayList<Emp>();
        }
        return this.emps;
    }

    /**
     * 获取loc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoc() {
        return loc;
    }

    /**
     * 设置loc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoc(String value) {
        this.loc = value;
    }

}
