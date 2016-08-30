package ru.otr.lbss.model.api;

import java.util.UUID;

import javax.xml.bind.annotation.XmlTransient;

public abstract class BaseMessage {
	private UUID docId;

	@XmlTransient
	public UUID getDocId() {
		return docId;
	}

	public void setDocId(UUID docId) {
		this.docId = docId;
	}
}
