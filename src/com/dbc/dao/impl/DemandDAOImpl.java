package com.dbc.dao.impl;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dbc.dao.DemandDAO;
import com.dbc.entity.SysUser;
import com.dbc.entity.TbComand;

public class DemandDAOImpl extends HibernateDaoSupport implements DemandDAO {
	
	public void saveDemand(TbComand demand) {
		this.getHibernateTemplate().save(demand);
	}
	@SuppressWarnings("unchecked")
	public List<TbComand> findAllDemand() {
		String hql = "from TbComand comand";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_unTJDemand() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String name=(String)session.getAttribute("username");
		String hql = "from TbComand comand where comand.tjstate = '0' and comand.userName = '" + name + "'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_unSHDemand() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String name=(String)session.getAttribute("username");
		String hql = "from TbComand comand where comand.tjstate = '1' and comand.shstate = '0' and comand.userName = '" + name + "'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_ySHDemand() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String name=(String)session.getAttribute("username");
		String hql = "from TbComand comand where comand.shstate = '1' and comand.xsstate = '1' and comand.bsstate = '1' and comand.userName = '" + name + "'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_yXHDemand() {
		String hql = "from TbComand comand where comand.tjstate = '1' and comand.xsstate = '1' and comand.bsstate = '0'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_unXHDemand() {
		String hql = "from TbComand comand where comand.xsstate = '0' and comand.tjstate = '1'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_yBHDemand() {
		String hql = "from TbComand comand where comand.bsstate = '1' and comand.xsstate = '1'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	public List<TbComand> findAll_unBHDemand() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		SysUser user=(SysUser)session.getAttribute("user");
		
		String hql = "from TbComand comand where comand.bsstate = '0' and comand.xsstate = '1' and comand.fpbm = '"+user.getFpbm()+"'";
		return (List<TbComand>) this.getHibernateTemplate().find(hql);
	}	
	
	
	public void removeDemand(TbComand demand) {
		this.getHibernateTemplate().delete(demand);
	}
	public void updateDemand(TbComand demand) {
		this.getHibernateTemplate().update(demand);
	}
	public TbComand findDemandByName(String name) {
		TbComand demand = (TbComand) this.getHibernateTemplate().get(TbComand.class, name);

		return demand;
	}
}