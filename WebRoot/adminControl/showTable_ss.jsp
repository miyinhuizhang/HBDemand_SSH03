<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*,java.util.*,java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>审核中</title>
<script language="javascript">
function gbcount(message,total,used,remain) //限制文本域字数
{
	var max;
	max = total.value;
	if (message.value.length > max)
	{
		message.value = message.value.substring(0,max);
		used.value = max;
		remain.value = 0;
		alert("留言不能超过 200 个字!"); 
    } 
    else {
    	used.value = message.value.length;
    	remain.value = max - used.value;
    	} 
} 
function star()
{
	if (document.getElementById("yj").value == "") {
		window.alert("请填写审核意见！");		
		document.getElementById("yj").focus();
		return false;
	}
}
</script>
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
<form action="modifyBSDemand.action" method="post" name="collectform" onsubmit = "return star();">
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
  <tr>
  	<td >所属管理部门<i class="red">*</i> </td>
    <td colspan="4">${demand.fpbm }</td>
  </tr>
  <tr>
    <td>审核意见<i class="red">*</i> </td>
	<td colspan="4" >
		<textarea name="demand.shyj" id="shyj" placeholder="（请填写审核意见）" onKeyDown="gbcount(yj,total2,used2,remain2);" 
            onKeyUp="gbcount(shyj,total2,used2,remain2);"  style="height:80px; width:450px"></textarea>
        <p>最多字数：<input disabled maxLength="4" name="total2" size="3" value="200" class="inputtext"> 
               已用字数： <input disabled maxLength="4" name="used2" size="3" value="0" class="inputtext"> 
               剩余字数： <input disabled maxLength="4" name="remain2" size="3" value="200" class="inputtext"></p>
	</td>
  </tr>
   <tr>
    <td>审核结果<i class="red">*</i> </td>
	<td colspan="4" >
		<input type=radio name="demand.bsstate" id="xsstate" value="1">同意 &nbsp; &nbsp;
		<input type="radio" name="demand.bsstate" id="xsstate" value="0" />不同意
	</td>
  </tr>
  <tr align="center">
  <td colspan="4">
  	<input type="submit" name="submit" value="提交审核" style="margin-top:20px; margin-right:70px;color:#cc3300 ">
  </td>
  </tr>
</table>
</form>
</body>
</html>