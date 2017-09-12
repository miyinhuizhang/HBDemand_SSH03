package com.dbc.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dbc.dao.AdminDAO;
import com.dbc.entity.SysUser;

public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO {
	public void save(SysUser user) {
		this.getHibernateTemplate().save(user);
	}
	@SuppressWarnings("unchecked")
	public List<SysUser> findAll() {
		String hql = "from SysUser user";
		return (List<SysUser>) this.getHibernateTemplate().find(hql);
	}
	public void remove(SysUser user) {
		this.getHibernateTemplate().delete(user);
	}
	public void update(SysUser user) {
		this.getHibernateTemplate().update(user);
	}
	public SysUser findByName(String name) {
		SysUser user = (SysUser) this.getHibernateTemplate().get(SysUser.class, name);

		return user;
	}
	@SuppressWarnings("unchecked")
	public String login(String username,String password,SysUser user) {
		String hql = "from SysUser user where user.username='"
			+ username + "' and user.password='"
		    + password + "'";
		List<SysUser> users = (List<SysUser>) this.getHibernateTemplate().find(hql);
		if (users.size() > 0) {	
			return "S";
		}
		return null;
	}
}




