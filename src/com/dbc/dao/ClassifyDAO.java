package com.dbc.dao;

import com.dbc.entity.Gmjjhy;
import com.dbc.entity.Xkfl;

import java.util.*;
public interface ClassifyDAO
{
	//获取国民经济行业的第一个下拉框
	public List<Gmjjhy> getFirstGmjjhy();
		
	//获取国民经济行业的第二个下拉框
	public List<Gmjjhy> getSecondGmjjhy(String secondCode);
		
	//获取国民经济行业的第三个下拉框
	public List<Gmjjhy> getThirdGmjjhy(String thirdCode);
			
	public List<Xkfl> getFirstXkfl();

	public List<Xkfl> getSecondXkfl(String secondXcode);

	public List<Xkfl> getThirdXkfl(String thirdXcode);
}
