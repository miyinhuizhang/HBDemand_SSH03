<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*,java.util.*,java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>审核中</title>
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
<table border="1" align="center" cellpadding="4" cellspacing="0">
  <tr>
    <td width="148">机构全称</td>
    <td width="235">${demand.userName }</td>
    <td width="148">组织机构代码</td>
    <td width="235">${demand.id }</td>
  </tr>
  <tr>
    <td >归口管理部门 </td>
    <td>${demand.gov }</td>
    <td>所在地域</td>
    <td>${demand.areaplace }</td>
  </tr>
  <tr>
    <td>机构简介<i class="red">*</i></td>
    <td colspan="3">${demand.tecnameMg }</td>
  </tr>
  <tr>
    <td>技术需求名称<i class="red">*</i> </td>
    <td>${demand.cmadName }</td> 
	<td>需求年限 </td> 
	<td>${demand.minyear }-${demand.maxyear }</td>
  </tr>
  <tr>
	<td colspan="4">需求概述(共3方面 限1500字)<i class="red">*</i>
  </tr>
  <tr>
    <td>1.主要问题</td>
	<td colspan="3">${demand.comandMg1 }</td>
  </tr>
  <tr>
	<td>2.技术关键 </td>
	<td colspan="3">${demand.comandMg2 }</td>
  </tr>
  <tr>
    <td>3.预期目标</td>
    <td colspan="3">${demand.comandMg3 }</td>
  </tr>
  <tr>
    <td>关键字 <i class="red">*</i>（不得少于一个,不得多于五个）</td>
    <td colspan="3">${demand.keyword1 }&nbsp;&nbsp;${demand.keyword2 }&nbsp;&nbsp;${demand.keyword3 }
    &nbsp;&nbsp;${demand.keyword4 }&nbsp;&nbsp;${demand.keyword5 }</td>
  </tr>
  <tr>
    <td>拟投入自有资金</td>
    <td colspan="3">${demand.nimoney }万元</td>
  </tr>
  <tr>
    <td>技术需求解决方式  <i class="red">*</i></td>
	<td>${demand.cmadModel }</td>
    <td>合作意向单位</td>
    <td>${demand.corrComp }</td>
  </tr>
  <tr>
    <td>学科分类<i class="red">*</i></td>
	<td colspan="3">${demand.useKind }</td>
  </tr>
  <tr>
    <td>需求技术所属领域  <i class="red">*</i></td>
    <td colspan="3">${demand.areaKind }</td>
  </tr>
  <tr>
    <td>需求技术应用行业<i class="red">*</i> </td>
	<td colspan="4">${demand.xuekeKind }</td>
  </tr>
</table>
</body>
</html>