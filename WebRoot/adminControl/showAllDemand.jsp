<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>全部需求</title>
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
<div align="center" style="font-size: 22px; margin-top:50px">全部征集表信息</div>
	<table>
		<tr>
		  <p>---------------------------------------------------------------选择检索条件--------------------------------------------------------------</p>
		</tr>
		<tr>
		  <td>按研究类型查询：<select name="fenlei" id="fenlei">
      			<option value="基础研究">基础研究</option>
      			<option value="应用研究">应用研究</option>
      			<option value="试验发展">试验发展</option>
      			<option value="究发展与成果应用">研究发展与成果应用</option>
      			<option value="技术推广与科技服务">技术推广与科技服务</option>
      			<option value="生产性活动">生产性活动</option>
    		</select></td>
    		<td>按归口管理部门查询：<select name="gov">  
			    <option value="邯郸市科技局">邯郸市科技局</option>
				<option value="人事处">人事处</option>
				<option value="机关党委">机关党委</option>
				<option value="政策法规处">政策法规处</option>
				<option value="计划财务处">计划财务处</option>
				<option value="平台与基础处">平台与基础处</option>
				<option value="国际合作处">国际合作处</option>
				<option value="高新技术处">高新技术处</option>
				<option value="农村科技处">农村科技处</option>
				<option value="社会发展处">社会发展处</option>
				<option value="成果与市场处">成果与市场处</option>
				<option value="监察室">监察室</option>
				<option value="离退休干部处">离退休干部处</option>
				<option value="知识产权局">知识产权局</option>
				<option value="半干旱中心">半干旱中心</option>
        	</select></td>
        	<td>按所在地域查询：<select name="area">
      			<option value="石家庄市">石家庄市</option>
			      <option value="辛集市(直辖县)">辛集市(直辖县)</option>
			      <option value="唐山市">唐山市</option>
			      <option value="秦皇岛市">秦皇岛市</option>
			      <option value="邯郸市">邯郸市</option>
			      <option value="邢台市">邢台市</option>
			      <option value="保定市">保定市</option>
			      <option value="定州市(直辖县)">定州市(直辖县)</option>
			      <option value="张家口市">张家口市</option>
			      <option value="沧州市">沧州市</option>
			      <option value="廊坊市">廊坊市</option>
			      <option value="衡水市">衡水市</option>
			      <option value="其他（河北工大）">其他（河北工大）</option>
    		</select></td>
		</tr>
		</table>
		<table class="STYLE2" border="1" align="center" cellpadding="4" cellspacing="0" style="margin-top:20px;margin-bottom:50px">
			<tr>
				<th>需求编号</th>
				<th>需求名称</th>
				<th>关键字</th>
				<th>需求分类</th>
			</tr>
			<s:iterator value="#request.showdemand" id="demand">
			  <tr><td width="100px"><s:property value="#demand.no"/></td>
				<td width="100px"><s:property value="#demand.cmadName"/></td>
				<td width="100px"><s:property value="#demand.keyword1"/>&nbsp;&nbsp;<s:property value="#demand.keyword2"/>
					&nbsp;&nbsp;<s:property value="#demand.keyword3"/>
				</td>
				<td width="100px"><s:property value="#demand.useKind"/></td>
	          </tr>
			</s:iterator>
</table>
</body>
</html>