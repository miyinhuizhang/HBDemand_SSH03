package com.dbc.service;

import java.util.List;
import com.dbc.entity.Gmjjhy;
import com.dbc.entity.Xkfl;

public interface ClassifyService
{
	//��ȡ���񾭼���ҵ�ĵ�һ��������
	public List<Gmjjhy> getFirstGmjjhy();
	
	public List<Gmjjhy> getSecondGmjjhy(String secondCode);

	public List<Gmjjhy> getThirdGmjjhy(String thirdCode);
	
	//��ȡѧ�Ʒ���ĵ�һ��������
	public List<Xkfl> getFirstXkfl();

	public List<Xkfl> getSecondXkfl(String secondXcode);

	public List<Xkfl> getThirdXkfl(String thirdXcode);
}
