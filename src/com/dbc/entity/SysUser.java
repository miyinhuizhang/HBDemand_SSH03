package com.dbc.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */

public class SysUser {

	// Fields

	private String userId;
	private String username;
	private String password;
	private String truename;
	private String phone;
	private String department;
	private String fpbm;
	private Set<SysRole> sysRole = new HashSet<SysRole>();

	// Constructors

	/** default constructor */
	public SysUser() {
	}
	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFpbm() {
		return this.fpbm;
	}

	public void setFpbm(String fpbm) {
		this.fpbm = fpbm;
	}

	public Set<SysRole> getSysRole() {
		return sysRole;
	}

	public void setSysRole(Set<SysRole> sysRole) {
		this.sysRole = sysRole;
	}

	@Override
	public String toString() {
		return "SysUser [userId=" + userId + ", username=" + username
				+ ", password=" + password + ", truename=" + truename
				+ ", phone=" + phone + ", department=" + department + ", fpbm="
				+ fpbm + "]";
	}

}