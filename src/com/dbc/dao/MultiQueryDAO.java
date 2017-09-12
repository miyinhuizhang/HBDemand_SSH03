package com.dbc.dao;

import java.io.Serializable;
import java.util.List;

import com.dbc.entity.TbComand;

public interface MultiQueryDAO {

	public List<TbComand> getObjects(String queryString);
	public List<TbComand> getAllObjects(Class<TbComand> clazz);
	public <T> T getObject(Class<T> clazz,Serializable zzbm);
}
