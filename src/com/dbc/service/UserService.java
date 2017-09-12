package com.dbc.service;
import java.util.List;

import com.dbc.entity.EcoKind;
import com.dbc.entity.SubjectKind;
import com.dbc.entity.SysUser;
import com.dbc.entity.TbFpdepartment;

public interface UserService {
	public void save(SysUser user);
	public void delete(SysUser user);
	public void update(SysUser user);
	public SysUser findByName(String name);
	
	public List<SysUser> findAll();
	public List<EcoKind> findEAll();
	public List<SubjectKind> findSubAll();
	public List<TbFpdepartment> findTAll();

	public String loginUser(String username,String password,SysUser suser);
	
	public SysUser getloginUser(String username,String password);
}
