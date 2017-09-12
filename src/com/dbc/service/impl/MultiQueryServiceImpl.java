package com.dbc.service.impl;
import java.util.List;
import org.apache.struts2.ServletActionContext;

import com.dbc.dao.MultiQueryDAO;
import com.dbc.dao.impl.MultiQueryDAOImpl;
import com.dbc.entity.TbComand;
import com.dbc.service.MultiQueryService;

public class MultiQueryServiceImpl<T> implements MultiQueryService{

	private MultiQueryDAO multiQueryDao;
	private String txt_1_special1;
	private String txt_2_special1;
	private String txt_1_sel;
	private String txt_2_sel;
	private String txt_1_logical;
	private String txt_3_special1;
	private String txt_3_sel;
	private String txt_2_logical;
	private String txt_4_special1;
	private String txt_4_sel;
	private String txt_3_logical;

	public MultiQueryDAO getMultiQueryDao() {
		return multiQueryDao;
	}

	public void setMultiQueryDao(MultiQueryDAO multiQueryDao) {
		this.multiQueryDao = multiQueryDao;
	}

	public String getTxt_1_special1() {
		return txt_1_special1;
	}

	public void setTxt_1_special1(String txt_1_special1) {
		this.txt_1_special1 = txt_1_special1;
	}

	public String getTxt_2_special1() {
		return txt_2_special1;
	}

	public void setTxt_2_special1(String txt_2_special1) {
		this.txt_2_special1 = txt_2_special1;
	}

	public String getTxt_1_sel() {
		return txt_1_sel;
	}

	public void setTxt_1_sel(String txt_1_sel) {
		this.txt_1_sel = txt_1_sel;
	}

	public String getTxt_2_sel() {
		return txt_2_sel;
	}

	public void setTxt_2_sel(String txt_2_sel) {
		this.txt_2_sel = txt_2_sel;
	}

	public String getTxt_1_logical() {
		return txt_1_logical;
	}

	public void setTxt_1_logical(String txt_1_logical) {
		this.txt_1_logical = txt_1_logical;
	}

	public String getTxt_3_special1() {
		return txt_3_special1;
	}

	public void setTxt_3_special1(String txt_3_special1) {
		this.txt_3_special1 = txt_3_special1;
	}

	public String getTxt_3_sel() {
		return txt_3_sel;
	}

	public void setTxt_3_sel(String txt_3_sel) {
		this.txt_3_sel = txt_3_sel;
	}

	public String getTxt_2_logical() {
		return txt_2_logical;
	}

	public void setTxt_2_logical(String txt_2_logical) {
		this.txt_2_logical = txt_2_logical;
	}

	public String getTxt_4_special1() {
		return txt_4_special1;
	}

	public void setTxt_4_special1(String txt_4_special1) {
		this.txt_4_special1 = txt_4_special1;
	}

	public String getTxt_4_sel() {
		return txt_4_sel;
	}

	public void setTxt_4_sel(String txt_4_sel) {
		this.txt_4_sel = txt_4_sel;
	}

	public String getTxt_3_logical() {
		return txt_3_logical;
	}

	public void setTxt_3_logical(String txt_3_logical) {
		this.txt_3_logical = txt_3_logical;
	}

	public List<TbComand> queryUsers(String username,String name,String txt3,String txt4,Class<TbComand> clazz){
		txt_1_sel = getParam("txt_1_sel");
		txt_1_special1 = getParam("txt_1_special1");
		String queryString="SELECT u FROM TbComand u WHERE u."+txt_1_sel+" like '"+txt_1_special1+""+username+""+txt_1_special1+"'";				
		txt_2_sel = getParam("txt_2_sel");
		txt_2_special1 = getParam("txt_2_special1");
		txt_1_logical = getParam("txt_2_logical");
		if(txt_1_logical==null){
			queryString = queryString;
		}
		else{
		if(name == null||name.equals(""))
		{
			txt_2_special1 = "%";
		}
		queryString = queryString+""+txt_1_logical+" u."+txt_2_sel+" like '"+txt_2_special1+""+name+""+txt_2_special1+"'";	
		}
		txt_3_sel = getParam("txt_3_sel");
		txt_3_special1 = getParam("txt_3_special1");
		txt_2_logical = getParam("txt_3_logical");
		if(txt_2_logical==null){
			queryString = queryString;
		}
		else{
		if(txt3 == null||txt3.equals(""))
		{
			txt_3_special1 = "%";
		}
		queryString = queryString+""+txt_2_logical+" u."+txt_3_sel+" like '"+txt_3_special1+""+txt3+""+txt_3_special1+"'";
		}
		txt_4_sel = getParam("txt_4_sel");
		txt_4_special1 = getParam("txt_4_special1");
		txt_3_logical = getParam("txt_4_logical");
		if(txt_3_logical==null){
			queryString = queryString;
		}
		else{
		if(txt4 == null||txt4.equals(""))
		{
			txt_4_special1 = "%";
		}
		queryString = queryString+""+txt_3_logical+" u."+txt_4_sel+" like '"+txt_4_special1+""+txt4+""+txt_4_special1+"'";	
		}
		return multiQueryDao.getObjects(queryString);		 
	}	

	private String getParam(String key) {
		return ServletActionContext.getRequest().getParameter(key);
	}
}
