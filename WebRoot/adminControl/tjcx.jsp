<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
<title>统计查询</title>
<script language="javascript">
function altRows(id){
	
	if(document.getElementsByTagName){
		var table = document.getElementById(id);
		var rows = table.getElementsByTagName("tr"); 
		for(i = 0; i < rows.length; i++){
			if(i % 2 == 0){
				rows[i].className = "evenrowcolor";
			}else{
				rows[i].className = "oddrowcolor";
		    }      
        }
    }
}
window.onload=function(){
	altRows('alternatecolor');
}
</script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/gb.ResultPage.min.js?v=D59787997F3B8FCE" ></script>

<style type="text/css">
table.hovertable {
font-family: verdana,arial,sans-serif;
font-size:11px;
color:#333333;
border-width: 1px;
border-color: #999999;
border-collapse: collapse;
}
table.hovertable th {
background-color:#c3dde0;
border-width: 1px;
padding: 8px;
border-style: solid;
border-color: #a9c6c9;
}
table.hovertable tr {
background-color:#d4e3e5;
}
table.hovertable td {
border-width: 1px;
padding: 8px;
border-style: solid;
border-color: #a9c6c9;
}
.button {
	display: inline-block;
	outline: none;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
	font: 14px/100% Arial, Helvetica, sans-serif;
	padding: .5em 2em .55em;
	text-shadow: 0 1px 1px rgba(0,0,0,.3);
	-webkit-border-radius: .5em; 
	-moz-border-radius: .5em;
	border-radius: .5em;
	-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	-moz-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	box-shadow: 0 1px 2px rgba(0,0,0,.2);
}
.button:hover {
	text-decoration: none;
}
.button:active {
	position: relative;
	top: 1px;
}
.orange {
	color: #fef4e9;
	border: solid 1px #da7c0c;
	background: #f78d1d;
	background: -webkit-gradient(linear, left top, left bottom, from(#faa51a), to(#f47a20));
	background: -moz-linear-gradient(top,  #faa51a,  #f47a20);
	filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#faa51a', endColorstr='#f47a20');
}
.orange:hover {
	background: #f47c20;
	background: -webkit-gradient(linear, left top, left bottom, from(#f88e11), to(#f06015));
	background: -moz-linear-gradient(top,  #f88e11,  #f06015);
	filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#f88e11', endColorstr='#f06015');
}
.orange:active {
	color: #fcd3a5;
	background: -webkit-gradient(linear, left top, left bottom, from(#f47a20), to(#faa51a));
	background: -moz-linear-gradient(top,  #f47a20,  #faa51a);
	filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#f47a20', endColorstr='#faa51a');
}
</style></head>
<body onload="pageLoadDisableWordTimes();" onkeydown="if(event.keyCode==13) {SubmitKey();return false;}else{}">
  <form id="Form1" name="Form1" action="multiQueryAction.action" method="post">        
 <dl id="searchdiv">  
  <dd class="divsearch" id="ddSubmit" name="ddSubmit" onkeydown="if(event.keyCode==13){SubmitForm();return false;}" >
      <div align="center"> 输入检索条件(最多选择4个)：</div>
        <table id="txt" align="center">
            <tr><td><input id="txt_i" value="1" type="hidden" name="txt_i" /></td>
            <td><input id="txt_c" value="4" type="hidden" name="txt_c" /></td></tr>
            <tr id="hidden_logical_txt" style="display:none">
                <td>
                    <select id="txt_1_logical" name="txt_1_logical">                      
                        <option value="or">或者</option>
                        <option value="and" >并且</option>
                        <option value="not">不含</option>
                    </select>
                </td>
            </tr>
            <tr id="txt_1" class="mainKey">
                <td class="aomBtn">
                    <a href="javascript:AddRowEx('txt','txt_i','txt_c');">
                         <input type="button" value="+"/>
                    </a><a href="javascript:DeleteRowSaveID('txt','txt_i','txt_c');">
                        <input type="button" value="-"/>
                    </a>
                </td>
                <td>
                  <select id="txt_1_sel" name="txt_1_sel" onchange="disableWordTimes(this);return false;" class="selectW1">
                        <option value='userName' selected>机构名称</option>
                        <option value='gov'>归口管理单位</option>
                        <option value='cmadName' >需求名称</option>
                        <option value='areaplace'>所在地域</option>   
                    </select>
                    <input  id="txt_1_value1" name="txt_1_value1" size="10"  value="${txt_1_value1 }"
                              maxlength="120" type="text" onFocus="if(KeywordVal(this.value)==false) this.value='';document.getElementById('currentid').value=this.id;"
                              onkeypress="SignVal(this,'sign',event)" onpaste="return SignVal(this,'value',event)"  onkeyup="SignVal1(this)"  />
                     <select id="txt_1_special1" name="txt_1_special1" onChange="">
                        <option value='%'>模糊</option>
                        <option value='' selected>精确</option>
                    </select>
                </td>
            </tr>
        </table>
      <input type="hidden" id="txt_1_extension" name ="txt_extension" value=""/>
      <input type="hidden" id="txt_2_extension" name ="txt_extension" value=""/>
      <input type="hidden" id="txt_3_extension" name ="txt_extension" value=""/>
      <input type="hidden" id="txt_4_extension" name ="txt_extension" value=""/>
     
  </dd>
</dl>
 <div class="btnPlace2" align="center">
         <input type="submit" name="submit" class="button orange"  value="检索" style="margin-left:20px; margin-top:20px"  >     
      </div>              
</form>
	<table class="hovertable" align="center">
					<thead>
						<tr >
							<th width="12%"><span>机构名称</span></th>
							<th  width="20%"><span>技术需求名称</span></th>
							<th width="10%"><span>需求时限</span></th>
							<th width="10%"><span>归口管理部门</span></th>
							<th width="10%"><span>所在地域</span></th>
						</tr>
						<c:forEach var="demand" items="${tbComands }">
			<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';" align="center"  height="24px">
				<td width="10">${demand.userName}</td>
				<td width="10">${demand.cmadName}</td>
				<td width="10">${demand.minyear} -${demand.maxyear}  </td>
				<td width="10">${demand.gov}</td>
				<td width="10">${demand.areaplace}</td>
			</tr>
		</c:forEach>
	</thead>
</table>
</body>
</html>
