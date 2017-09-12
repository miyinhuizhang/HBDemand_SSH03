package com.dbc.entity;

/**
 * TbFpdepartment entity. @author MyEclipse Persistence Tools
 */

public class TbFpdepartment implements java.io.Serializable {

	// Fields

	private Integer bmno;
	private String bmname;

	// Constructors

	/** default constructor */
	public TbFpdepartment() {
	}

	/** full constructor */
	public TbFpdepartment(Integer bmno, String bmname) {
		this.bmno = bmno;
		this.bmname = bmname;
	}

	// Property accessors

	public Integer getBmno() {
		return this.bmno;
	}

	public void setBmno(Integer bmno) {
		this.bmno = bmno;
	}

	public String getBmname() {
		return this.bmname;
	}

	public void setBmname(String bmname) {
		this.bmname = bmname;
	}

}