<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="../js/select.js"></script>
<script type="text/javascript" src="../js/jquery-1.4.js"></script>
<title>修改征集表信息</title>
<script language="javascript">
function star()
{
	if (document.getElementById("Tecname_mg").value == "") {
		window.alert("请填写机构简介！");		
		document.getElementById("Tecname_mg").focus();
		return false;
	}
	else if(document.getElementById("cmadName").value == "") {
		window.alert("请填写需求名称！");
		document.getElementById("cmadName").focus();
		return false;
	}
	else if (document.getElementById("Comand_mg1").value == ""||document.getElementById("Comand_mg2").value == ""||document.getElementById("Comand_mg3").value == "") {
		window.alert("请填写三项需求概述！");
		return false;
	}
	else if (document.getElementById("keyword1").value == "") {
		window.alert("请至少填写一个关键字！");
		document.getElementById("keyword1").focus();
		return false;
	}
	else if (document.getElementById("fir").value == "") {
		window.alert("请选择学科分类！");
		return false;
	}
	else if (document.getElementById("subjectKind").value!="基础研究"&&document.getElementById("fir_h").value == "") {
		window.alert("请选择应用行业分类！");
		return false;
	}
	else if(document.getElementById("subjectKind").value!="基础研究"&&document.getElementById("cmadModel").value == "") {
		window.alert("请选择技术需求合作模式！");
		document.getElementById("cmadModel").focus();
		return false;
	}
	else(confirm("提交后不能修改，您确认要提交吗？"))
		document.getElementById("collectform").submit();
}
function show()                           //隐藏某区域
{
	if(document.getElementById("subjectKind").value=="基础研究")
	{
		document.getElementById("hidethis1").style.display="none";
		document.getElementById("hidethis2").style.display="none";
	}else{
		document.getElementById("hidethis1").style.display="";
		document.getElementById("hidethis2").style.display="";
    }
}
function isNums(obj){                          //判断输入是否为小数或整数
	if (obj.value.replace(/\d{1,}\.{0,1}\d{0,}/,'')){
		alert("资金必须为数字！")
       	obj.value="";
       	obj.focus();
		return false;
	}
    return true;
}
</script>
<script language="javascript">
function isNum(str){                          //判断输入是否为数字
	for (ilen = 0; ilen < str.length; ilen++) {
		if (str.charAt(ilen) < '0' || str.charAt(ilen) > '9') {
            return false;
        }
    }
    return true;
}

function key(s,t)
{
 	if(s.value!=""&&event.keyCode==9&&s.value.length<=10)
 		t.style.display="";
}
function keycount(obj)
{
	if(obj.value.length>10){
    	alert("关键字不得超过10个字！");
    	obj.value="";
    	obj.focus();
    }	
}
function yearJudge(obj1,obj2)                   //判断年限
{
	var year=new Date().getFullYear();	
    if(obj1.value==""||obj2.value==""){
    	alert("需求年限不能为空！");
    	obj1.focus();
    	obj2.focus();
    }
    else{
    	if(!isNum(obj1.value)||!isNum(obj2.value)) {
			alert("年份输入不合法，请输入数字!");
			obj1.value="";
    		obj2.value="";
    		obj1.focus();
    	}else if(parseInt(obj1.value)<year-10||parseInt(obj2.value)>year+30){
    		alert("最小年限至少为十年前，最大年限为30年后！");
    		obj1.value="";
    		obj2.value="";
    		obj1.focus();
    	}else if(parseInt(obj1.value)>parseInt(obj2.value)){
    		alert("最小年限不能大于最大年限！");
    		obj2.value="";
    		obj2.focus();
    	}
    }
}
function gbcount(message,total,used,remain) //限制文本域字数
{
	var max;
	max = total.value;
	if (message.value.length > max)
	{
		message.value = message.value.substring(0,max);
		used.value = max;
		remain.value = 0;
		alert("留言不能超过 500 个字!"); 
    } 
    else {
    	used.value = message.value.length;
    	remain.value = max - used.value;
    	} 
} 
function name()        //选择其他时显示注明信息
{
	var a=document.getElementById("area3");
	if(document.getElementById("qita").checked==true)
		a.style.display="";
}
</script>
</head><style type="text/css">
<!--
 .STYLE1 {
	font-family: "楷体";
	font-size: 20px;
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
<form action="modifyDemand.action" method="post" onsubmit="return star();">
	<div align="center" style="font-size: 22px; margin-top:50px">修改征集表信息</div>	
<table border="1" align="center" cellpadding="4" cellspacing="0">
  <tr>
    <td width="247">机构全称</td>
    <td width="495">${demand.userName}</td>
    <td width="230">组织机构代码</td>
    <td width="450">${demand.id}</td>
  </tr>
  <tr>
    <tr>
    <td >归口管理部门 :${demand.gov}</td>
    <td><select name="demand.gov" id="gov">
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
    </select></td>
    <td>所在地域:${demand.areaplace}</td>
    <td><select name="demand.areaplace" id="areaplace">
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
  <tr>
    <td>机构简介<i class="red">*</i></td>
    <td colspan="3"><textarea name="demand.tecnameMg" value="demand.tecnameMg" id="tecnameMg" placeholder="（单位基本情况，研究基础等，限500字）" 
    		onKeyDown="gbcount(tecnameMg,total,used,remain);" 
            onKeyUp="gbcount(tecnameMg,total,used,remain);" style="height:70px; width:450px"></textarea>
            <p>最多字数：<input disabled maxLength="4" name="total" size="3" value="500" class="inputtext"> 
               已用字数： <input disabled maxLength="4" name="used" size="3" value="0" class="inputtext"> 
               剩余字数： <input disabled maxLength="4" name="remain" size="3" value="500" class="inputtext"></p>    </td>
  </tr>
  <tr>
    <td>技术需求名称:<i class="red">*</i> </td>
    <td><input name="demand.cmadName" type="text" id="cmadName" value="${demand.cmadName}"> </td>
	<td>需求年限 </td> 
	<td><input name="demand.minyear" type="text" id="minyear">-
	    <input name="demand.maxyear" type="text" id="maxyear" onblur="yearJudge(minyear,maxyear);"></td>
  </tr>
  <tr>
	<td colspan="4">需求概述(共3方面 限1500字)<i class="red">*</i>
  </tr>
  <tr>
    <td>1.主要问题</td>
	<td colspan="3"><textarea name="demand.comandMg1" id="comandMg1" placeholder="（需要解决的重大技术问题）"
			onkeydown="gbcount(comandMg1,total1,used1,remain1);" 
            onkeyup="gbcount(comandMg1,total1,used1,remain1);"  style="height:150px; width:650px"></textarea>
	        <p>最多字数：<input disabled maxLength="4" name="total1" size="3" value="500" class="inputtext"> 
               已用字数： <input disabled maxLength="4" name="used1" size="3" value="0" class="inputtext"> 
               剩余字数： <input disabled maxLength="4" name="remain1" size="3" value="500" class="inputtext"></p>    </td>
  </tr>
  <tr>
	<td>2.技术关键 </td>
	<td colspan="3"><textarea name="demand.comandMg2" id="comandMg2" placeholder="（所需的主要技术、关键指标）" 
			onKeyDown="gbcount(comandMg2,total2,used2,remain2);" 
            onKeyUp="gbcount(comandMg2,total2,used2,remain2);"  style="height:150px; width:650px"></textarea>
			<p>最多字数：<input disabled maxLength="4" name="total2" size="3" value="500" class="inputtext"> 
               已用字数： <input disabled maxLength="4" name="used2" size="3" value="0" class="inputtext"> 
               剩余字数： <input disabled maxLength="4" name="remain2" size="3" value="500" class="inputtext"></p></td>
  </tr>
  <tr>
    <td>3.预期目标</td>
    <td colspan="3"><textarea name="demand.comandMg3" id="comandMg3" placeholder="（技术创新性、社会经济效益）" 
    		onKeyDown="gbcount(comandMg3,total3,used3,remain3);" 
            onKeyUp="gbcount(comandMg3,total3,used3,remain3);"  style="height:150px; width:650px"></textarea>
			<p>最多字数：<input disabled maxLength="4" name="total3" size="3" value="500" class="inputtext"> 
               已用字数： <input disabled maxLength="4" name="used3" size="3" value="0" class="inputtext"> 
               剩余字数： <input disabled maxLength="4" name="remain3" size="3" value="500" class="inputtext"></p>    </td>
  </tr>
 <tr>
    <td>关键字 <i class="red">*</i>（不得少于一个,不得多于五个）</td>
    <td colspan="3"><input type="text" name="demand.keyword1" id="keyword1" onkeydown="key(keyword1,keyword2)" onchange="keycount(keyword1)" />
        <input type="text" name="demand.keyword2" id="keyword2" style="display: none" onkeydown="key(keyword2,keyword3)" onchange="keycount(keyword2)"/>
        <input type="text" name="demand.keyword3" id="keyword3" style="display: none" onkeydown="key(keyword3,keyword4)" onchange="keycount(keyword3)"/>
        <input type="text" name="demand.keyword4" id="keyword4" style="display: none" onkeydown="key(keyword4,keyword5)" onchange="keycount(keyword4)"/>
        <input type="text" name="demand.keyword5" id="keyword5" style="display: none" onchange="keycount(keyword5)"/>    </td>
  </tr>
  <tr>
    <td>拟投入自有资金</td>
    <td colspan="3"><input name="demand.nimoney" type="text" id="nimoney" onchange="isNums(nimoney)" >万元</td>
  </tr>
  <tr>
    <td>技术需求解决方式  <i class="red">*</i></td>
	<td><p><input type="radio" name="demand.cmadModel" id="cmadModel" value="独立研发" />独立研发 &nbsp;
        <input type="radio" name="demand.cmadModel" id="cmadModel" value="委托开发" />委托开发 &nbsp;
        <input type="radio" name="demand.cmadModel" id="cmadModel" value="合作研发" />合作研发 &nbsp;
        <input type="radio" name="demand.cmadModel" id="cmadModel" value="其他"/>其他</p></td>
    <td>合作意向单位</td>
    <td><input name="demand.corrComp" type="text" id="corrComp" ></td>
  </tr>
  <tr>
    <td>科技活动类型<i class="red">*</i></td>
    <td colspan="3"><select name="subjectKind" id="subjectKind" onchange="show()">
      <option value="应用研究">应用研究</option>
      <option value="基础研究">基础研究</option>
      <option value="试验发展">试验发展</option>
      <option value="究发展与成果应用">研究发展与成果应用</option>
      <option value="技术推广与科技服务">技术推广与科技服务</option>
      <option value="生产性活动">生产性活动</option>
    </select></td>
  </tr>
  <tr>
    <td>学科分类<i class="red">*</i></td>
	<td colspan="3"><select name="fir" id="fir" onchange="getSecondXkfls()">
			<option>-----请选择-----</option>
		</select>
	  <select name="sec" id="sec" onchange="getThirdXkfls()">
      		<option>-----请选择-----</option>
      </select>
	  <select name="thi" id="thi" onchange="inputXkfl()">
       		<option>-----请选择-----</option>
      </select>
      	<input name="demand.useKind" type="hidden" id="GMJJHY"/>
      </td>
  </tr>
  <tr id="hidethis1">
    <td>需求技术所属领域  <i class="red">*</i></td>
    <td colspan="3"><p>
      <input type="checkbox" name="areaKinds" id="areaKinds" value="电子信息"/>电子信息&nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="光机电一体化"/>光机电一体化 &nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="生物技术与制药"/>生物技术与制药&nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="新材料及应用"/>新材料及应用 &nbsp; 
      <input type="checkbox" name="areaKinds" id="areaKinds" value="现代农业"/>现代农业 &nbsp;
      <input type="checkbox" name="areaKinds" id="areaKinds" value="新能源与高效节能技术"/>新能源与高效节能技术 &nbsp;               		
      </p>
      <p>
        <input type="checkbox" name="areaKinds" id="areaKinds" value="资源与环境"/>资源与环境 
        <input type="checkbox" name="areaKinds" id="areaKinds" value="高技术服务业"/>高技术服务业 &nbsp;
        <input type="checkbox" name="areaKinds" id="areaKinds" value="海洋"/>海洋 &nbsp;
         <input type="checkbox" name="areaKinds" id="areaKinds" value="社会公共事业 "/>社会公共事业 &nbsp;
        <input type="checkbox" name="areaKinds" id="areaKinds" value="医疗卫生"/>医疗卫生 &nbsp;
        <input type="checkbox" name="qita" id="qita" value="" onchange="name()" />其他技术&nbsp;
        <input type="text" name="areaKinds" id="area3" placeholder="请注明其他领域名称" style="display:none;">    
        </p>      
        	<input name="demand.areaKind" type="hidden" id="areaKind" />
        </td>
  </tr>
  <tr id="hidethis2">
    <td>需求技术应用行业<i class="red">*</i> </td>
	<td colspan="4"><select name="fir_h" id="fir_h" onchange="getSecondGmjjhys()">
		<option>-----请选择-----</option>
		</select>
	  <select name="sec_h" id="sec_h" onchange="getThirdGmjjhys()">
        <option>-----请选择-----</option>
      </select>
	  <select name="thi_h" id="thi_h" onchange="inputGmjjhy()">
        <option>-----请选择-----</option>
      </select>
      	<input name="demand.xuekeKind" type="hidden" id="XKFL" />
      </td>
  </tr>
  <tr align="center">
    <td colspan="4">
  		<input type="submit" name="submit" value="重新提交" style="margin-top:20px; margin-right:70px;color:#cc3300 ">
    </td>
  </tr>
</table>
</form>
</body>
</html>