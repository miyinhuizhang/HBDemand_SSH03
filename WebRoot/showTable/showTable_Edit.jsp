<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>未提交的征集表</title>
</head>
<style type="text/css">
<!--
 .STYLE1 {
	font-family: "楷体";
	font-size: 18px;
	color: #666666;
	font-weight: bold;
}
 .STYLE2 {
	font-family: "楷体";
	font-size: 16px;
	color: #000000;
}
-->
</style>
<body>
	<div align="center" style="font-size: 22px; margin-top:50px">未提交的征集表信息</div>
		<table class="STYLE2" border="1" align="center" cellpadding="4" cellspacing="0" style="margin-top:20px;margin-bottom:50px">
			
			<tr>
				<th>需求编号</th>
				<th>需求名称</th>
				<th>关键字</th>
				<th>提交状态</th>
				<th>操作</th>
			</tr>
			<s:iterator value="#request.demands_unTJ" id="demand">
			  <tr><td width="100px"><s:property value="#demand.no"/></td>
				<td width="100px"><s:property value="#demand.cmadName"/></td>
				<td width="100px"><s:property value="#demand.keyword1"/>&nbsp;&nbsp;<s:property value="#demand.keyword2"/>
					&nbsp;&nbsp;<s:property value="#demand.keyword3"/>
				</td>
				<td width="100px">未提交</td>
				<td width="100px">
					<a href="../deleteDemand.action?cmadName=<s:property value="#demand.cmadName"/>">删除</a>	
					<a href="../showTable/showTable_unCommit.jsp?cmadName=<s:property value="#demand.cmadName"/>">编辑</a>				
				</td></tr>
			</s:iterator>
		</table>
</body>
</html>