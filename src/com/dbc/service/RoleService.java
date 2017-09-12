package com.dbc.service;

import java.util.List;
import com.dbc.entity.SysRole;

public interface RoleService {

	public void save(SysRole sr);
	public List<SysRole> findAll();
	public void remove(SysRole sr);
	public void update(SysRole sr);
	public SysRole findByName(String name);
	public List<SysRole> findByLoginUserId(String id);
}
