package com.dbc.service.impl;
import java.util.List;

import com.dbc.dao.UserDAO;
import com.dbc.service.UserService;
import com.dbc.entity.EcoKind;
import com.dbc.entity.SubjectKind;
import com.dbc.entity.TbFpdepartment;
import com.dbc.entity.SysUser;

public class UserServiceImpl implements UserService {
	private UserDAO userDao;
	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	
	public void save(SysUser user) {
		this.userDao.saveUser(user); // 完成真正的业务逻辑
	}
	
	public List<SysUser> findAll() {
		return this.userDao.findAllUsers();
	}
	@Override
	public List<EcoKind> findEAll() {
		// TODO Auto-generated method stub
		return this.userDao.findEAll();
	}
	@Override
	public List<SubjectKind> findSubAll() {
		// TODO Auto-generated method stub
		return this.userDao.findSubAll();
	}
	@Override
	public List<TbFpdepartment> findTAll() {
		// TODO Auto-generated method stub
		return this.userDao.findTAll();
	}
	
	
	public void delete(SysUser user) {
		this.userDao.removeUser(user);
	}
	public void update(SysUser user) {
		this.userDao.updateUser(user);
	}
	public SysUser findByName(String name) {
		return this.userDao.findByName(name);
	}
	
	public String loginUser(String username,String password,SysUser suser) {
		if(this.userDao.loginUser(username,password)!=null)
		{
			return "C";
		}
		else
			return null;
	}
	@Override
	public SysUser getloginUser(String username, String password) {
		return userDao.loginUser(username, password);
	}
}