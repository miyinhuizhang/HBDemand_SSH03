package com.dbc.action.demand;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;
import com.dbc.entity.Xkfl;
import com.dbc.entity.Gmjjhy;
import com.opensymphony.xwork2.ActionSupport;
import com.dbc.service.ClassifyService;

@SuppressWarnings("serial")
public class ClassifyAction extends ActionSupport
{
	private ClassifyService classifyService;
	private List<Xkfl> firstid;
	private List<Xkfl> secondid;
	private List<Xkfl> thirdid;
	private List<Gmjjhy> first;
	private List<Gmjjhy> second;
	private List<Gmjjhy> third;
	
	private String xkCode2;
	private String xkCode3;
	private String GmCode2;
	private String GmCode3;
	
	@JSON(serialize=false)
	public ClassifyService getClassifyService()
	{
		return classifyService;
	}
	
	public void setClassifyService(ClassifyService classifyService)
	{
		this.classifyService = classifyService;
	}

	public List<Xkfl> getFirstid()
	{
		return firstid;
	}
	
	public void setFirstid(List<Xkfl> firstid)
	{
		this.firstid = firstid;
	}
	
	public List<Xkfl> getSecondid()
	{
		return secondid;
	}

	public void setSecondid(List<Xkfl> secondid)
	{
		this.secondid = secondid;
	}
	
	public List<Xkfl> getThirdid()
	{
		return thirdid;
	}
	
	public void setThirdid(List<Xkfl> thirdid)
	{
		this.thirdid = thirdid;
	}
	
	public List<Gmjjhy> getFirst()
	{
		return first;
	}

	public void setFirst(List<Gmjjhy> first)
	{
		this.first = first;
	}

	public List<Gmjjhy> getSecond()
	{
		return second;
	}
	
	public void setSecond(List<Gmjjhy> second)
	{
		this.second = second;
	}

	public List<Gmjjhy> getThird()
	{
		return third;
	}
	
	public void setThird(List<Gmjjhy> third)
	{
		this.third = third;
	}

	public String getXkCode2() {
		return xkCode2;
	}

	public void setXkCode2(String xkCode2) {
		this.xkCode2 = xkCode2;
	}

	public String getXkCode3() {
		return xkCode3;
	}

	public void setXkCode3(String xkCode3) {
		this.xkCode3 = xkCode3;
	}

	public String getGmCode2() {
		return GmCode2;
	}

	public void setGmCode2(String gmCode2) {
		this.GmCode2 = gmCode2;
	}

	public String getGmCode3() {
		return GmCode3;
	}

	public void setGmCode3(String gmCode3) {
		this.GmCode3 = gmCode3;
	}

	//国民经济第一个下拉框
	public String FirstGm()
	{
		first=classifyService.getFirstGmjjhy();
		System.out.println(first.size());
		return "Success";
	}

	public String SecondGm()
	{
		second=classifyService.getSecondGmjjhy(GmCode2);
		System.out.println(second.size());
		return "Success";
	}

	public String ThirdGm()
	{
		third=classifyService.getThirdGmjjhy(GmCode3);
		System.out.println(third.size());
		return "Success";
	}
	
	//学科分类第一个下拉框	
	public String FirstSubject()
	{
		firstid=classifyService.getFirstXkfl();
		System.out.println(firstid.size());
		return "Success";
	}

	public String SecondSubject()
	{
		secondid=classifyService.getSecondXkfl(xkCode2);
		System.out.println(secondid.size());
		return "Success";
	}

	public String ThirdSubject()
	{
		thirdid=classifyService.getThirdXkfl(xkCode3);
		System.out.println(thirdid.size());
		return "Success";
	} 
}
