package com.dbc.dao;
import java.util.List;

import com.dbc.entity.TbComand;
public interface DemandDAO {
	public void saveDemand(TbComand demand);
	public List<TbComand> findAllDemand();
	public void removeDemand(TbComand demand);
	public void updateDemand(TbComand demand);
	public TbComand findDemandByName(String name);
	
	
	public List<TbComand> findAll_unSHDemand();
	public List<TbComand> findAll_ySHDemand();
	public List<TbComand> findAll_unTJDemand();
	
	public List<TbComand> findAll_unBHDemand();
	public List<TbComand> findAll_unXHDemand();
	public List<TbComand> findAll_yBHDemand();
	public List<TbComand> findAll_yXHDemand();
}
