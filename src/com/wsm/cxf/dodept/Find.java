
package com.wsm.cxf.dodept;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>find complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="find">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptno" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "find", propOrder = {
    "deptno"
})
public class Find {

    @XmlElement(namespace = "http://www.wsm.com/cxf/dodept")
    protected int deptno;

    /**
     * ��ȡdeptno���Ե�ֵ��
     * 
     */
    public int getDeptno() {
        return deptno;
    }

    /**
     * ����deptno���Ե�ֵ��
     * 
     */
    public void setDeptno(int value) {
        this.deptno = value;
    }

}
