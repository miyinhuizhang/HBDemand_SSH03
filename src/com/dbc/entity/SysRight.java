package com.dbc.entity;

/**
 * SysRight entity. @author MyEclipse Persistence Tools
 */

public class SysRight{

	// Fields

	private String rightId;
	private String rightname;

	// Constructors

	/** default constructor */
	public SysRight() {
	}

	// Property accessors

	public String getRightId() {
		return this.rightId;
	}

	public void setRightId(String rightId) {
		this.rightId = rightId;
	}

	public String getRightname() {
		return this.rightname;
	}

	public void setRightname(String rightname) {
		this.rightname = rightname;
	}

	@Override
	public String toString() {
		return "SysRight [rightId=" + rightId + ", rightname=" + rightname
				+ "]";
	}
	
}