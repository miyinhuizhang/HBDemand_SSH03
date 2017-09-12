package com.dbc.action.shuser;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import com.dbc.entity.TbComand;
import com.dbc.service.DemandService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateSHAction extends ActionSupport {
	
	private TbComand demand;
	private DemandService demandService;
	
	public TbComand getDemand() {
		return demand;
	}
	public void setDemand(TbComand demand) {
		this.demand = demand;
	}
	
	public DemandService getDemandService() {
		return demandService;
	}
	
	public void setDemandService(DemandService demandService) {
		this.demandService = demandService;
	}

	public String getParam(String key)
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getParameter(key);
	}
	
	public String updateDemand() throws UnsupportedEncodingException {
		
		this.demandService.update(demand);
		return "updateSuc";
	}
}
