package com.dbc.service.impl;

import java.util.List;

import com.dbc.dao.RightDAO;
import com.dbc.entity.SysRight;
import com.dbc.service.RightService;

public class RightServiceImpl implements RightService{

	private RightDAO rightDao;
	
	public RightDAO getRightDao() {
		return rightDao;
	}

	public void setRightDao(RightDAO rightDao) {
		this.rightDao = rightDao;
	}

	public void save(SysRight srt) {
		this.rightDao.save(srt);
	}

	public List<SysRight> findAll() {
		// TODO Auto-generated method stub
		return this.rightDao.findAll();
	}

	public void remove(SysRight srt) {
		this.rightDao.remove(srt);
		
	}
	
	public void update(SysRight srt) {
		this.rightDao.update(srt);
	}

	public List<SysRight> findByLoginUserId(String id) {
		String hql="select distinct m from com.dbc.entity.SysUser u join u.sysRole r join r.sysRight m where u.userId = '"+id+"'";
		return rightDao.findByHql(hql);
	}
}
