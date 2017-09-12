<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'role.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="addRole.action" method="post" name="addRoleform" onsubmit = "return star();">
    <div align="center" style="margin-bottom:10px;display:none;" >
 	<p>角色编号：<input name="sr.roleId"  type="text"/>
 	角色名称：<input name="sr.rolename" type="text" /></p>
 	 所含权限：<p>
      <input type="checkbox" name="xssh" id="xssh" value="形式审核"/>形式审核&nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="技术审核"/>技术审核 &nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="分类查询"/>分类查询&nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="需求管理"/>新材料及应用 &nbsp; 
      <input type="checkbox" name="areaKinds" id="areaKinds" value="现代农业"/>现代农业 &nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="新能源与高效节能技术"/>新能源与高效节能技术 &nbsp;               		
      </p>
 	<input type="submit" name="submit" value="添加" onclick="return confirm('提交后不能修改，您确认要提交吗？')" style="margin-top:20px; margin-right:70px;color:#cc3300 ">
		<input type="reset" value="重置" style="margin-top:20px; margin-right:60px; color:#ff0000">
 </div>
  </form>
  </body>
</html>
