<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>已审核的征集表</title>
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
	<div align="center" style="font-size: 22px; margin-top:50px">已审核的征集表信息</div>
		<table class="STYLE2" border="1" align="center" cellpadding="4" cellspacing="0" style="margin-top:20px;margin-bottom:50px">
			
			<tr>
				<th>需求编号</th>
				<th>需求名称</th>
				<th>关键字</th>
				<th>审核状态</th>
				<th>操作</th>
			</tr>
			<s:iterator value="#request.demands_ySH" id="demand">
			  <tr><td width="100px"><s:property value="#demand.no"/></td>
				<td width="100px"><s:property value="#demand.cmadName"/></td>
				<td width="100px"><s:property value="#demand.keyword1"/>&nbsp;&nbsp;<s:property value="#demand.keyword2"/>
					&nbsp;&nbsp;<s:property value="#demand.keyword3"/>
				</td>
				<td width="100px">已审核</td>
				<td width="50px">
					<a href="showTable_yhus.action?cmadName=<s:property value='#demand.cmadName'/>">查看</a>				
				</td></tr>
			</s:iterator>
		</table>
</body>
</html>