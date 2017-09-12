package com.dbc.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dbc.dao.RightDAO;
import com.dbc.entity.SysRight;
import com.dbc.service.RightService;

public class Ttest {
	
	private RightDAO roghtDao = new RightDAOImpl();
	@Autowired
	RightService rightService;
	
	@Test
	public void test() {
		String hql="from SysRight";
		List<SysRight> list = rightService.findByLoginUserId("1");
		for (SysRight sysRight : list) {
			System.out.println(sysRight);
		}
	}

}
