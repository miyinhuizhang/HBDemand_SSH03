package com.dbc.service;

import java.util.List;
import com.dbc.entity.Gmjjhy;
import com.dbc.entity.Xkfl;

public interface ClassifyService
{
	//获取国民经济行业的第一个下拉框
	public List<Gmjjhy> getFirstGmjjhy();
	
	public List<Gmjjhy> getSecondGmjjhy(String secondCode);

	public List<Gmjjhy> getThirdGmjjhy(String thirdCode);
	
	//获取学科分类的第一个下拉框
	public List<Xkfl> getFirstXkfl();

	public List<Xkfl> getSecondXkfl(String secondXcode);

	public List<Xkfl> getThirdXkfl(String thirdXcode);
}
