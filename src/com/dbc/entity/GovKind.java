package com.dbc.entity;

/**
 * GovKind entity. @author MyEclipse Persistence Tools
 */

public class GovKind implements java.io.Serializable {

	// Fields

	private String govId;
	private String govname;

	// Constructors

	/** default constructor */
	public GovKind() {
	}

	/** full constructor */
	public GovKind(String govId, String govname) {
		this.govId = govId;
		this.govname = govname;
	}

	// Property accessors

	public String getGovId() {
		return this.govId;
	}

	public void setGovId(String govId) {
		this.govId = govId;
	}

	public String getGovname() {
		return this.govname;
	}

	public void setGovname(String govname) {
		this.govname = govname;
	}

}