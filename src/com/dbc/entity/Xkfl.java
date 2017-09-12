package com.dbc.entity;

/**
 * Xkfl entity. @author MyEclipse Persistence Tools
 */

public class Xkfl implements java.io.Serializable {

	// Fields

	private String code;
	private String title;

	// Constructors

	/** default constructor */
	public Xkfl() {
	}

	/** full constructor */
	public Xkfl(String code, String title) {
		this.code = code;
		this.title = title;
	}

	// Property accessors

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}