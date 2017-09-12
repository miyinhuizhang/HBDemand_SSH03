package com.dbc.service;

import java.util.List;

import com.dbc.entity.TbComand;

public interface MultiQueryService {
	
	public List<TbComand> queryUsers(String username,String name,String txt3,String txt4,Class<TbComand> clazz);

}
