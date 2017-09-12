package com.dbc.service.impl;

import java.util.List;

import com.dbc.entity.SysRole;
import com.dbc.dao.RoleDAO;
import com.dbc.service.RoleService;

public class RoleServiceImpl implements RoleService{

	private RoleDAO roleDao;
	
	public RoleDAO getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDAO roleDao) {
		this.roleDao = roleDao;
	}

	public void save(SysRole sr) {
		this.roleDao.save(sr);
	}

	public List<SysRole> findAll() {
		
		return this.roleDao.findAll();
	}

	public void remove(SysRole sr) {
		this.roleDao.remove(sr);
	}

	public void update(SysRole sr) {
		this.roleDao.update(sr);
	}

	public SysRole findByName(String name) {
		
		return this.roleDao.findByName(name);
	}

	@Override
	public List<SysRole> findByLoginUserId(String id) {
		String hql="select distinct r from com.dbc.entity.SysUser u join u.sysRole r join r.sysRight m where u.userId = '"+id+"'";
		return roleDao.findByHql(hql);
	}

}
