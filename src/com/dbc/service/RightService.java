package com.dbc.service;

import java.util.List;

import com.dbc.entity.SysRight;

public interface RightService {

	public void save(SysRight srt);
	public List<SysRight> findAll();
	public void remove(SysRight srt);
	public void update(SysRight srt);
	public List<SysRight> findByLoginUserId(String id);
}
