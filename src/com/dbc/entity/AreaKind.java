package com.dbc.entity;

/**
 * AreaKind entity. @author MyEclipse Persistence Tools
 */

public class AreaKind implements java.io.Serializable {

	// Fields

	private String areaid;
	private String areaname;

	// Constructors

	/** default constructor */
	public AreaKind() {
	}

	/** full constructor */
	public AreaKind(String areaid, String areaname) {
		this.areaid = areaid;
		this.areaname = areaname;
	}

	// Property accessors

	public String getAreaid() {
		return this.areaid;
	}

	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}

	public String getAreaname() {
		return this.areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

}