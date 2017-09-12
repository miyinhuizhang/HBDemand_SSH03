package com.dbc.dao;
import java.util.List;

import com.dbc.entity.EcoKind;
import com.dbc.entity.SubjectKind;
import com.dbc.entity.SysUser;
import com.dbc.entity.TbFpdepartment;

public interface UserDAO {
	
	public List<SysUser> findAllUsers();
	public List<EcoKind> findEAll();
	public List<SubjectKind> findSubAll();
	public List<TbFpdepartment> findTAll();
	
	public void saveUser(SysUser user);
	public void removeUser(SysUser user);
	public void updateUser(SysUser user);
	public SysUser findByName(String name);

	public SysUser loginUser(String username,String password);
}
