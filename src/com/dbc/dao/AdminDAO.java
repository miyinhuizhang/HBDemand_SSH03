package com.dbc.dao;
import java.util.List;

import com.dbc.entity.SysUser;
public interface AdminDAO {
	public void save(SysUser suser);
	public List<SysUser> findAll();
	public void remove(SysUser suser);
	public void update(SysUser suser);
	public String login(String username,String password,SysUser user);
	public SysUser findByName(String name);
}
