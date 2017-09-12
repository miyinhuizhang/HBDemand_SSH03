package com.dbc.service.impl;

import java.util.List;
import com.dbc.dao.ClassifyDAO;
import com.dbc.entity.Gmjjhy;
import com.dbc.entity.Xkfl;
import com.dbc.service.ClassifyService;

public class ClassifyServiceImpl implements ClassifyService
{
	private ClassifyDAO classifyDao;
	
	public ClassifyDAO getClassifyDao() {
		return classifyDao;
	}

	public void setClassifyDao(ClassifyDAO classifyDao) {
		this.classifyDao = classifyDao;
	}

	//获取国民经济行业的第一个下拉框
	public List<Gmjjhy> getFirstGmjjhy()
	{
		return classifyDao.getFirstGmjjhy();
	}

	public List<Gmjjhy> getSecondGmjjhy(String secondCode)
	{
		return classifyDao.getSecondGmjjhy(secondCode);
	}

	public List<Gmjjhy> getThirdGmjjhy(String thirdCode)
	{
		return classifyDao.getThirdGmjjhy(thirdCode);
	}
	
	//获取学科分类第一个下拉框
	public List<Xkfl> getFirstXkfl()
	{
		return classifyDao.getFirstXkfl();
	}

	public List<Xkfl> getSecondXkfl(String secondXcode)
	{
		return classifyDao.getSecondXkfl(secondXcode);
	}

	public List<Xkfl> getThirdXkfl(String thirdXcode)
	{
		return classifyDao.getThirdXkfl(thirdXcode);
	}
}
