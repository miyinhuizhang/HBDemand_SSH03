package com.dbc.action.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dbc.entity.SysRole;
import com.dbc.service.RoleService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RoleAction extends ActionSupport{

	private SysRole sr;
	private List<SysRole> srs;
	private RoleService roleService;
	public SysRole getSr() {
		return sr;
	}
	public void setSr(SysRole sr) {
		this.sr = sr;
	}
	
	public List<SysRole> getSrs() {
		return srs;
	}
	public void setSrs(List<SysRole> srs) {
		this.srs = srs;
	}
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public String updateRole() {
		this.roleService.update(sr);
		return "updateRole";
	}
	public String addRole() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		this.roleService.save(this.sr);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("sr", this.sr);
		return "addRole";
	}
	public String showRole() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		this.srs=this.roleService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("srs", this.srs);
		return "showRole";
	}
}
