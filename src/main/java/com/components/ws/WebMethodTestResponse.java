
package com.components.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "webMethodTestResponse", namespace = "http://ws.components.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webMethodTestResponse", namespace = "http://ws.components.com/")
public class WebMethodTestResponse {

    @XmlElement(name = "return", namespace = "")
    private com.components.ws.impl.User _return;

    /**
     * 
     * @return
     *     returns User
     */
    public com.components.ws.impl.User getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.components.ws.impl.User _return2) {
        this._return = _return2;
    }

}
