package com.dbc.service;
import java.util.List;

import com.dbc.entity.TbComand;

public interface DemandService {
	public void save(TbComand demand);
	public List<TbComand> findAll();
	public void delete(TbComand demand);
	public void update(TbComand demand);
	public TbComand findByName(String name);
	
	public List<TbComand> findAll_unSH();
	public List<TbComand> findAll_ySH();
	public List<TbComand> findAll_unSTJ();
	
	public List<TbComand> findAll_yXH();
	public List<TbComand> findAll_yBH();
	public List<TbComand> findAll_unXH();
	public List<TbComand> findAll_unBH();
}
