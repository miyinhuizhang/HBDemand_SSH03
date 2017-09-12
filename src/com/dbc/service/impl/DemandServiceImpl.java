package com.dbc.service.impl;
import java.util.List;

import com.dbc.dao.DemandDAO;
import com.dbc.service.DemandService;
import com.dbc.entity.TbComand;

public class DemandServiceImpl implements DemandService {
	private DemandDAO demandDao;
	
	public DemandDAO getDemandDao() {
		return demandDao;
	}
	public void setDemandDao(DemandDAO demandDao) {
		this.demandDao = demandDao;
	}
	
	
	public void save(TbComand demand) {
		this.demandDao.saveDemand(demand); // 完成真正的业务逻辑
		System.out.println("save+dao");
	}
	
	
	public List<TbComand> findAll() {
		return this.demandDao.findAllDemand();
	}
	
	public List<TbComand> findAll_unSTJ() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_unTJDemand();
	}	
	@Override
	public List<TbComand> findAll_unSH() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_unSHDemand();
	}
	
	@Override
	public List<TbComand> findAll_ySH() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_ySHDemand();
	}
	
	@Override
	public List<TbComand> findAll_yXH() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_yXHDemand();
	}
	
	@Override
	public List<TbComand> findAll_unXH() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_unXHDemand();
	}
	
	@Override
	public List<TbComand> findAll_yBH() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_yBHDemand();
	}

	@Override
	public List<TbComand> findAll_unBH() {
		// TODO Auto-generated method stub
		return this.demandDao.findAll_unBHDemand();
	}
	
	
	public void delete(TbComand demand) {
		this.demandDao.removeDemand(demand);
	}
	public void update(TbComand demand) {
		this.demandDao.updateDemand(demand);
	}
	public TbComand findByName(String name) {
		return this.demandDao.findDemandByName(name);
	}
}