package com.dbc.dao;

import java.util.List;

import com.dbc.entity.SysRole;

public interface RoleDAO {

	public void save(SysRole sr);
	public List<SysRole> findAll();
	public List<SysRole> findByHql(String sql,Object...objects);
	public void remove(SysRole sr);
	public void update(SysRole sr);
	public SysRole findByName(String name);
}
