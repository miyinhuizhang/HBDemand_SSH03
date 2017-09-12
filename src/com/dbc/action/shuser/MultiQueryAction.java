package com.dbc.action.shuser;
import java.util.List;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.dbc.entity.TbComand;
import com.dbc.service.MultiQueryService;
//import com.dbc.service.impl.MultiQueryServiceImpl;

public class MultiQueryAction extends ActionSupport {
	
	private static final long serialVersionUID = -281275682819237996L;
		
	private TbComand tbComand = new TbComand(); 
	private List<TbComand> tbComands;
	
	private MultiQueryService multiQueryService;
	//private MultiQueryServiceImpl<TbComand> multiQueryServices;	

	private String txt_1_value1;
	private String txt_2_value1;
	private String txt_3_value1;
	private String txt_4_value1;	

		
	public String doQuery() throws Exception  {
		txt_1_value1 = getParam("txt_1_value1");
		txt_2_value1 = getParam("txt_2_value1");
		txt_3_value1 = getParam("txt_3_value1");
		txt_4_value1 = getParam("txt_4_value1");
		tbComands = multiQueryService.queryUsers(txt_1_value1,txt_2_value1,txt_3_value1,txt_4_value1,TbComand.class);
		return SUCCESS;
	}
	private String getParam(String key) {
		return ServletActionContext.getRequest().getParameter(key);
	}
	
	public TbComand getTbComand() {
		return tbComand;
	}
	public void setTbComand(TbComand tbComand) {
		this.tbComand = tbComand;
	}
	public List<TbComand> getTbComands() {
		return tbComands;
	}
	public void setTbComands(List<TbComand> tbComands) {
		this.tbComands = tbComands;
	}
	public MultiQueryService getMultiQueryService() {
		return multiQueryService;
	}
	public void setMultiQueryService(MultiQueryService multiQueryService) {
		this.multiQueryService = multiQueryService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTxt_1_value1() {
		return txt_1_value1;
	}

	public void setTxt_1_value1(String txt_1_value1) {
		this.txt_1_value1 = txt_1_value1;
	}
	public String getTxt_2_value1() {
		return txt_2_value1;
	}

	public void setTxt_2_value1(String txt_2_value1) {
		this.txt_2_value1 = txt_2_value1;
	}

	public String getTxt_3_value1() {
		return txt_3_value1;
	}

	public void setTxt_3_value1(String txt_3_value1) {
		this.txt_3_value1 = txt_3_value1;
	}
	public String getTxt_4_value1() {
		return txt_4_value1;
	}

	public void setTxt_4_value1(String txt_4_value1) {
		this.txt_4_value1 = txt_4_value1;
	}
}
