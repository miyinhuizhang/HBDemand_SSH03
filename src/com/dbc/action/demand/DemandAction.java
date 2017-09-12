package com.dbc.action.demand;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.dbc.service.DemandService;
import com.dbc.entity.TbComand;

@SuppressWarnings("serial")
public class DemandAction extends ActionSupport {
	private TbComand demand;
	private List<TbComand> showdemand;
	private List<TbComand> demands;
	private List<TbComand> demands_ySH;
	private List<TbComand> demands_unTJ;
	private DemandService demandService;
	private String message;
	
	public TbComand getDemand() {
		return demand;
	}
	public void setDemand(TbComand demand) {
		this.demand = demand;
	}
	
	public List<TbComand> getShowdemand() {
		return showdemand;
	}
	public void setShowdemand(List<TbComand> showdemand) {
		this.showdemand = showdemand;
	}
	public List<TbComand> getDemands() {
		return demands;
	}
	public void setDemands(List<TbComand> demands) {
		this.demands = demands;
	}
	
	public List<TbComand> getDemands_unTJ() {
		return demands_unTJ;
	}
	public void setDemands_unTJ(List<TbComand> demands_unTJ) {
		this.demands_unTJ = demands_unTJ;
	}
	public List<TbComand> getDemands_ySH() {
		return demands_ySH;
	}
	public void setDemands_ySH(List<TbComand> demands_ySH) {
		this.demands_ySH = demands_ySH;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public DemandService getDemandService() {
		return demandService;
	}
	
	public void setDemandService(DemandService demandService) {
		this.demandService = demandService;
	}
	
	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demand", this.demand);
		return SUCCESS;
	}
	public String addDemand() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		this.demandService.save(this.demand);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demand", this.demand);
		return "addDemand";
	}
	
	public String modifyDemand() {
		this.demandService.update(this.demand);
		message = "修改信息成功。";
		return "modifyDemand";
	}
	
	public String showDemand() {
		this.showdemand=demandService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("showdemand", this.showdemand);
		message = "显示信息成功。";
		return "showDemand";
	}
	
	
	public String showDemand_unTJ() {
		this.demands_unTJ=this.demandService.findAll_unSTJ();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands_unTJ", this.demands_unTJ);
		message = "未提交表项";
		return "showDemand_unTJ";
	}
	
	public String showDemand_unSH() {
		this.demands=this.demandService.findAll_unSH();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands", this.demands);
		message = "未审核表项";
		return "showDemand_unSH";
	}
	
	public String showDemand_ySH() {
		this.demands_ySH=this.demandService.findAll_ySH();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demands_ySH", this.demands_ySH);
		message = "未审核表项";
		return "showDemand_ySH";
	}	
	
	public String findDemand() throws UnsupportedEncodingException {
		
		String a=getParam("cmadName");
		String name = new String(a.getBytes("ISO8859-1"),"UTF-8");
		demand=this.demandService.findByName(name);	
		System.out.println(demand.getCmadName());
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("demand", demand);
		
		message = "查找需求信息";
		return "findDemand";
	}
	
	public String getParam(String key)
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getParameter(key);
	}
}