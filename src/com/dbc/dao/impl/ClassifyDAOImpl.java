package com.dbc.dao.impl;

import java.util.List;

import com.dbc.dao.ClassifyDAO;
import com.dbc.entity.Gmjjhy;
import com.dbc.entity.Xkfl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class ClassifyDAOImpl extends HibernateDaoSupport implements ClassifyDAO
{
	//获取国民经济行业的第一个下拉框
	public List<Gmjjhy> getFirstGmjjhy()
	{
		@SuppressWarnings("unchecked")
		List<Gmjjhy> gm=this.getHibernateTemplate().find("from Gmjjhy g where g.code like '%0000'");
		return gm;
	}
	
	//获取国民经济行业的第二个下拉框
	public List<Gmjjhy> getSecondGmjjhy(String secondCode)
	{
		@SuppressWarnings("unchecked")
		List<Gmjjhy> gm= this.getHibernateTemplate().find("from Gmjjhy g where g.code like '"+secondCode.substring(0, 1)+"%00'");
		return gm;
	}
	
	public List<Gmjjhy> getThirdGmjjhy(String thirdCode)
	{
		@SuppressWarnings("unchecked")
		List<Gmjjhy> gm=this.getHibernateTemplate().find("from Gmjjhy g where g.code like '"+thirdCode.substring(0, 3)+"%'");
	    return gm;
	}
	
	//获取学科分类第一个下拉框
	public List<Xkfl> getFirstXkfl()
	{
		@SuppressWarnings("unchecked")
		List<Xkfl> xk=this.getHibernateTemplate().find("from Xkfl x where x.code like '%00000'");
		return xk;
	}

	public List<Xkfl> getSecondXkfl(String secondXcode)
	{
		@SuppressWarnings("unchecked")
		List<Xkfl> xk=this.getHibernateTemplate().find("from Xkfl x where x.code like '"+secondXcode.substring(0, 2)+"%00'");
		return xk;
	}

	public List<Xkfl> getThirdXkfl(String thirdXcode)
	{
		@SuppressWarnings("unchecked")
		List<Xkfl> xk=this.getHibernateTemplate().find("from Xkfl x where x.code like '"+thirdXcode.substring(0, 5)+"%'");
		return xk;
	}
}
