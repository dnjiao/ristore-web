package org.mdacc.ristore.ws.fm.models;

import javax.persistence.Entity;

//@Entity
public class FoundationTRF {

	private String trf;
	public FoundationTRF(String trf) {
		this.trf = trf;
	}
	public String getTrf() {
		return trf;
	}
	public void setTrf(String trf) {
		this.trf = trf;
	}
	
}
