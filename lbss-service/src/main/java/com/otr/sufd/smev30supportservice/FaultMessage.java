
package com.otr.sufd.smev30supportservice;

import javax.xml.ws.WebFault;
import com.otr.sufd.smev30supportservice.xml.faultmessage.FaultDetail;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@SuppressWarnings("serial")
@WebFault(name = "faultDetail", targetNamespace = "http://www.otr.com/sufd/smev30SupportService/xml/faultMessage")
public class FaultMessage extends Exception {

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultDetail faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public FaultMessage(String message, FaultDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public FaultMessage(String message, FaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return returns fault bean:
     *         com.otr.sufd.smev30supportservice.xml.faultmessage.FaultDetail
     */
    public FaultDetail getFaultInfo() {
        return faultInfo;
    }

}
