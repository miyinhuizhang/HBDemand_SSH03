<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改用户信息</title>
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
<form action="user_updateUser.action" method="post">
	<div align="left" style="margin-top:30px">修改用户信息</div>
		<table class="STYLE2" align="center" style="margin-top:20px;margin-bottom:50px">
			<tr>
				<th width="30%">用户名：</th>
				<td width="70%"><input name="user.username" type="text" 
				value="${user.username}"></td>
			</tr>
			<tr>
				<th width="30%">登录密码：</th>
				<td width="70%"><input name="user.password" type="text" 
				value="${user.password}"></td>
			</tr>
			<tr>
				<th width="30%">机构代码：</th>
				<td width="70%"><input name="user.id" type="text" readonly="true"
				value="${user.id}">（不可修改）</td>
			</tr>
			<tr>
				<th width="30%">通讯地址：</th>
				<td width="70%"><input name="user.postalAdds" type="text"
				value="${user.postalAdds}"></td>
			</tr>
			<tr>
				<th width="30%">公司网址：</th>
				<td width="70%"><input name="user.webAdds" type="text"
				value="${user.webAdds}"></td>
			</tr>
			<tr>
				<th width="30%">法人代表：</th>
				<td width="70%"><input name="user.lawPeople" type="text"
				value="${user.lawPeople}"></td>
			</tr>
			<tr>
				<th width="30%">联系人姓名：</th>
				<td width="70%"><input name="user.contacts" type="text"
				value="${user.contacts}"></td>
			</tr>
			<tr>
				<th width="30%">电子邮箱：</th>
				<td width="70%"><input name="user.email" type="text"
				value="${user.email}"></td>
			</tr>
			<tr>
				<th width="30%">邮政编码：</th>
				<td width="70%"><input name="user.postNum" type="text"
				value="${user.postNum}"></td>
			</tr>
			<tr>
				<th width="30%">手机号码：</th>
				<td width="70%"><input name="user.cellphone" type="text"
				value="${user.cellphone}"></td>
			</tr>
			<tr>
				<th width="30%">座机号码：</th>
				<td width="70%"><input name="user.telephone" type="text"
				value="${user.telephone}"></td>
			</tr>
			<tr>
				<th width="30%">传真号码：</th>
				<td width="70%"><input name="user.faxAds" type="text"
				value="${user.faxAds}"></td>
			</tr>
			<tr>
				<th>机构属性：${user.instSx}</th>
				<td><input type="radio" name="user.InstSx" value="企业" checked="true"/>企业 &nbsp;
                <input type="radio" name="user.InstSx" value="高等院校" />高等院校 &nbsp;
                <input type="radio" name="user.InstSx" value="高等院校" />研究机构 &nbsp;
                <input type="radio" name="user.InstSx" value="高等院校" />其他 &nbsp;</td>
			</tr>
			<tr>
				<th colspan="2"><input type="hidden" name="username" style="margin-right: 40px"value="${user.username}">
					<input type="submit" value="修改" style="margin-right: 40px"> <input type="reset"
					value="重置"></th>
			</tr>
		</table>
	</form>
</body>
</html>