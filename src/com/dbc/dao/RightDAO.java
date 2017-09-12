package com.dbc.dao;

import java.util.List;

import com.dbc.entity.SysRight;

public interface RightDAO {

	public void save(SysRight srt);
	public List<SysRight> findAll();
	public void remove(SysRight srt);
	public void update(SysRight srt);
	public List<SysRight> findByHql(String sql,Object...objects);
}
