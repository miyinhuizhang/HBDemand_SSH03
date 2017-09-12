package com.dbc.dao.impl;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dbc.dao.UserDAO;
import com.dbc.entity.EcoKind;
import com.dbc.entity.SubjectKind;
import com.dbc.entity.SysUser;
import com.dbc.entity.TbFpdepartment;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	public void saveUser(SysUser user) {
		this.getHibernateTemplate().save(user);
	}
	@SuppressWarnings("unchecked")
	public List<SysUser> findAllUsers() {
		String hql = "from SysUser user";
		return (List<SysUser>) this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<EcoKind> findEAll() {
		String hql = "from EcoKind user";
		return (List<EcoKind>) this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<SubjectKind> findSubAll() {
		String hql = "from SubjectKind user";
		return (List<SubjectKind>) this.getHibernateTemplate().find(hql);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<TbFpdepartment> findTAll() {
		String hql = "from TbFpdepartment user";
		return (List<TbFpdepartment>) this.getHibernateTemplate().find(hql);
	}
	
	public void removeUser(SysUser user) {
		this.getHibernateTemplate().delete(user);
	}
	public void updateUser(SysUser user) {
		this.getHibernateTemplate().update(user);
	}
	public SysUser findByName(String name) {
		SysUser user = (SysUser) this.getHibernateTemplate().get(SysUser.class, name);

		return user;
	}
	@SuppressWarnings("unchecked")
	public SysUser loginUser(String username,String password) {
		String hql = "from SysUser user where user.username='"
				+ username + "' and user.password='"
				+ password + "'";
		List<SysUser> users = (List<SysUser>) this.getHibernateTemplate().find(hql);
		if (users.size() > 0) {
			return users.get(0);
		}else{
			return null;
		}
	}
}




