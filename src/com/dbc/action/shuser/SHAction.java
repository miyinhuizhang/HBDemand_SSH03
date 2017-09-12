package com.dbc.action.shuser;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dbc.entity.TbComand;
import com.dbc.service.DemandService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SHAction extends ActionSupport {
	
	private TbComand demand;
	private List<TbComand> demands;
	private List<TbComand> demands_yXH;
	private List<TbComand> demands_unXH;
	private List<TbComand> demands_yBH;
	private List<TbComand> demands_unBH;
	private DemandService demandService;
	
	public TbComand getDemand() {
		return demand;
	}

	public void setDemand(TbComand demand) {
		this.demand = demand;
	}

	public List<TbComand> getDemands() {
		return demands;
	}

	public void setDemands(List<TbComand> demands) {
		this.demands = demands;
	}

	public List<TbComand> getDemands_yXH() {
		return demands_yXH;
	}

	public void setDemands_yXH(List<TbComand> demands_yXH) {
		this.demands_yXH = demands_yXH;
	}

	public List<TbComand> getDemands_unXH() {
		return demands_unXH;
	}

	public void setDemands_unXH(List<TbComand> demands_unXH) {
		this.demands_unXH = demands_unXH;
	}

	public List<TbComand> getDemands_yBH() {
		return demands_yBH;
	}

	public void setDemands_yBH(List<TbComand> demands_yBH) {
		this.demands_yBH = demands_yBH;
	}

	public List<TbComand> getDemands_unBH() {
		return demands_unBH;
	}

	public void setDemands_unBH(List<TbComand> demands_unBH) {
		this.demands_unBH = demands_unBH;
	}

	public DemandService getDemandService() {
		return demandService;
	}

	public void setDemandService(DemandService demandService) {
		this.demandService = demandService;
	}

	public String showDemand_yXH() {
		this.demands_yXH=this.demandService.findAll_yXH();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands_yXH", this.demands_yXH);
		return "showDemand_yXH";
	}
	
	public String showDemand_unXH() {
		this.demands_unXH=this.demandService.findAll_unXH();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands_unXH", this.demands_unXH);
		return "showDemand_unXH";
	}
	
	public String showDemand_yBH() {
		this.demands_yBH=this.demandService.findAll_yBH();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands_yBH", this.demands_yBH);
		return "showDemand_yBH";
	}
	
	public String showDemand_unBH() {
		this.demands_unBH=this.demandService.findAll_unBH();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands_unBH", this.demands_unBH);
		return "showDemand_unBH";
	}
	
	public String modifyDemand() {
		this.demandService.update(this.demand);;
		return "modifyDemand";
	}
	
	public String findDemand() throws UnsupportedEncodingException {
		
		String a=getParam("cmadName");
		String name = new String(a.getBytes("ISO8859-1"),"UTF-8");
		demand=this.demandService.findByName(name);	

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demand", demand);
		
		return "findDemand";
	}
	
	public String getParam(String key)
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getParameter(key);
	}

}
