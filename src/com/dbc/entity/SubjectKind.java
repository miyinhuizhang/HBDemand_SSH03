package com.dbc.entity;

/**
 * SubjectKind entity. @author MyEclipse Persistence Tools
 */

public class SubjectKind implements java.io.Serializable {

	// Fields

	private String code;
	private String title;

	// Constructors

	/** default constructor */
	public SubjectKind() {
	}

	/** minimal constructor */
	public SubjectKind(String code) {
		this.code = code;
	}

	/** full constructor */
	public SubjectKind(String code, String title) {
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