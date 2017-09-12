<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有用户</title>
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
	<div align="center" style="font-size: 22px; margin-top:50px">全部用户信息</div>
		<table class="STYLE2" border="1" align="center" cellpadding="4" cellspacing="0" style="margin-top:20px;margin-bottom:50px">
			
			<tr>
				<th>用户编号</th>
				<th>用户名</th>
				<th>身份</th>
			</tr>
			<s:iterator value="#request.suser" id="suser">
			  <tr><td width="100px"><s:property value="#suser.userId"/></td>
				<td width="100px"><s:property value="#suser.username"/></td>
				<td width="100px"><s:property value="#suser.userId"/></td>
			  </tr>
			</s:iterator>
		</table>
</body>
</html>