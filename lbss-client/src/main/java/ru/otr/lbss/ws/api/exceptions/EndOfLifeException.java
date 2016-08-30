
package ru.otr.lbss.ws.api.exceptions;

import javax.xml.ws.WebFault;

import ru.otr.lbss.ws.api.types.basic.Void;

/**
 * 
 * Превышено время жизни сообщения (end of life). Действия клиента: должны
 * предприниматься повторные попытки доставить сообщение, возможно с увеличенным
 * временем жизни.
 * 
 * 
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "EndOfLifeReached", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class EndOfLifeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4680869182828090526L;
	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private Void faultInfo;

	/**
	 * 
	 * @param faultInfo
	 * @param message
	 */
	public EndOfLifeException(String message, Void faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param faultInfo
	 * @param cause
	 * @param message
	 */
	public EndOfLifeException(String message, Void faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         ru.it.smev.message_exchange.autogenerated.types.basic.v1_1.Void
	 */
	public Void getFaultInfo() {
		return faultInfo;
	}

}
