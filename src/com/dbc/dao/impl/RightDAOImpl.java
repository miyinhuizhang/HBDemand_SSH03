package com.dbc.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dbc.dao.RightDAO;
import com.dbc.entity.SysRight;

public class RightDAOImpl extends HibernateDaoSupport implements RightDAO{

	public void save(SysRight srt) {
		this.getHibernateTemplate().save(srt);
	}

	@SuppressWarnings("unchecked")
	public List<SysRight> findAll() {
		String hql = "from SysRight srt order by srt.rightId";
		return (List<SysRight>) this.getHibernateTemplate().find(hql);
	}

	public void remove(SysRight srt) {
		this.getHibernateTemplate().delete(srt);
	}

	public void update(SysRight srt) {
		this.getHibernateTemplate().update(srt);
	}
	@SuppressWarnings("unchecked")
	public List<SysRight> findByHql(String hql, Object... objects) {
		
		return (List<SysRight>) this.getHibernateTemplate().find(hql,objects);
	}

}
