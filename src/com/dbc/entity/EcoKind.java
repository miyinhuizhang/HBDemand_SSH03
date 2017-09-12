package com.dbc.entity;

/**
 * EcoKind entity. @author MyEclipse Persistence Tools
 */

public class EcoKind implements java.io.Serializable {

	// Fields

	private String ecoId;
	private String ecoName;

	// Constructors

	/** default constructor */
	public EcoKind() {
	}

	/** full constructor */
	public EcoKind(String ecoId, String ecoName) {
		this.ecoId = ecoId;
		this.ecoName = ecoName;
	}

	// Property accessors

	public String getEcoId() {
		return this.ecoId;
	}

	public void setEcoId(String ecoId) {
		this.ecoId = ecoId;
	}

	public String getEcoName() {
		return this.ecoName;
	}

	public void setEcoName(String ecoName) {
		this.ecoName = ecoName;
	}

}