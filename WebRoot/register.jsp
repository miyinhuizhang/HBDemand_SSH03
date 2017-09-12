<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%><%@ page import="java.sql.*" %><%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>注册</title>
<script language="javascript">
function validate(){
			if(document.getElementById("username").value==""){
				alert("用户名为空！请重新输入");
				document.getElementById("username").focus();
				return false;
			}else if(document.getElementById("username").value.length > 30 ||document.getElementById("username").value.length < 5 ){
				alert("用户名应小于30位大于5位！请重新输入");
				document.getElementById("username").focus();
				return false;
			}
			else if(document.getElementById("password").value==""){
				alert("密码为空！请重新输入");
				document.getElementById("password").focus();
				return false;
			}
			else if(document.getElementById("surepsw").value==""){
				alert("请确认密码！确保密码正确");
				document.getElementById("surepsw").focus();
				return false;
			}
			else if(document.getElementById("password").value!=document.getElementById("surepsw").value){
				alert("两次密码输入相异！请重新输入");
				document.getElementById("surepsw").focus();
				return false;
			}else if (document.getElementById("password").value.length > 20 || document.getElementById("password").value.length < 6) {
				alert("密码应小于6位或大于20位");
				document.getElementById("password").focus();
				return false;
			}else if(document.getElementById("postalAdds").value==""){
				alert("通讯地址为必填项！请重新输入");
				document.getElementById("postalAdds").focus();
				return false;
			}
			else if(document.getElementById("lawPeople").value==""){
				alert("法人代表为必填项！请重新输入");
				document.getElementById("lawPeople").focus();
				return false;
			}
			else if(document.getElementById("contacts").value==""){
				alert("联系人为必填项！请重新输入");
				document.getElementById("contacts").focus();
				return false;
			}
			else if(document.getElementById("email").value==""){
				alert("电子邮箱为必填项！请重新输入");
				document.getElementById("email").focus();
				return false;
			}
			else if(document.getElementById("cellphone").value==""){
				alert("手机号为必填项！请重新输入");
				document.getElementById("cellphone").focus();
				return false;
			}else if(document.getElementById("ID").value==""){
				alert("机构代码为必填项！请重新输入");
				document.getElementById("ID").focus();
				return false;
			}
		}
function isNum(obj){                          //判断输入是否为数字
	for (ilen = 0; ilen < obj.value.length; ilen++) {
		if (obj.value.charAt(ilen) < '0' || obj.value.charAt(ilen) > '9') {
            return false;
        }
    }
    return true;
}
function checkUserName(){
	$.ajax({
                    type : "post",
                    url : "checkName.action",
                    dataType : "text",//设置需要返回的数据类型
                    data:{"name":document.getElementById("username").value},
                    success : function(d) {
                    alert("1");  
                    	var a1=document.getElementById("a1");
                    	if(d=="用户名已存在！")
                    	{   
                        	a1.style.display = '';
                       	 	document.getElementById("username").focus();
                    	}
                    	else
                    	{
                    		a1.style.display = 'none';
                    	}
                    },
                    error : function() {
                        //alert("错误");
                    }
                });	
	}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/import_basic.css" rel="stylesheet" type="text/css"/>
<link href="skins/sky/import_skin.css" rel="stylesheet" type="text/css" id="skin" themeColor="blue"/>
<script type="text/javascript" src="js/jquery-1.4.js"></script>
<script type="text/javascript" src="js/bsFormat.js"></script>
<!--框架必需end--><!--引入弹窗组件start-->
<script type="text/javascript" src="js/attention/zDialog/zDrag.js"></script>
<script type="text/javascript" src="js/attention/zDialog/zDialog.js"></script>
<!--引入弹窗组件end--><!--修正IE6支持透明png图片start-->
<script type="text/javascript" src="js/method/pngFix/supersleight.js"></script>
<!--修正IE6支持透明png图片end-->
</head>
<style type="text/css">
<!--
 .red {
	color: #ff0000;
}
</style>
<body>
<form action="user_register.action" method="post" name="zhuceform" onsubmit = "return validate();" >
	<div id="mainFrame">
		<div id="hbox">
        	<div id="bs_bannercenter">
            	<div id="bs_bannerleft">
                	<div id="bs_bannerright">
                    	<div class="bs_banner_logo"></div>
                            <div class="bs_banner_title" ></div>
                            <div class="bs_nav">
                                <div class="bs_navleft" >
                                    <li>
                                        <span id="username"></span>您好，今天是
                                        <script>
                                            var weekDayLabels = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
                                            var now = new Date();
                                            var year = now.getFullYear();
                                            var month = now.getMonth() + 1;
                                            var day = now.getDate()
                                            var currentime = year + "年" + month + "月" + day + "日 " + weekDayLabels[now.getDay()]
                                            document.write(currentime)
                                        </script>
                                    </li>
                                    <div class="clear"> </div>
                                </div>
                                <div class="bs_navright">
                                    <span class="icon_no hand" onclick='top.Dialog.confirm("确定要退出系统吗",function(){window.location="login.jsp"});'>退出系统</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
			<div>
				<table  width="1015" height="320" border="1" align="center" style="margin-top:35px">
    				<div align="center" style="margin-top:10px;font-size:32px;">
    					<span>用户注册 (带<i class="red"> * </i>号的为必填项,信息为以后使用,请认真填写.)</span></div>
						<tr>
	  						<th width="50" scope="col"><div align="left"><span>详细信息</span></div></th>
	  						<td width="313" scope="col">
	  							<p>机构全称：<input name="user.username" type="text" id="username" onblur="checkUserName();">
	  								<i class="red"> *</i></p>
	  								<a id="a1" style="display:none">用户名已存在！</a>
	    						<p>机构属性：
	    							<select name="user.InstSx" id="InstSx">
              							<option value="企业">企业</option>
              							<option value="高等院校">高等院校 </option>
              							<option value="研究机构">研究机构</option>
              							<option value="究发展与成果应用">研究发展与成果应用</option>
              							<option value="其他">其他</option>
            						</select><i class="red">*</i></p>
	    						<p>登录密码：<input name="user.password" type="password" id="password" />
            						<i class="red">*</i> <em id="_userid">(6到20位字母和数字组成)</em></p>
	    						<p>确认密码：<input name="surepsw" type="password" id="surepsw">
            						<i class="red">*</i></p>
	    						<p>机构代码 ：<input name="user.id" type="text" id="ID" />
            						<i class="red">*</i></p>
	    						<p>通讯地址：<input name="user.postalAdds" type="text" id="postalAdds" />
            						<i class="red">*</i></p>
	    						<p>网&nbsp;&nbsp;&nbsp;&nbsp;址：<input name="user.webAdds" type="text" id="webAdds" />
        						</p>
        					</td>
							<th width="50" scope="col"><div align="left"><span>联系方式</span></div></th>
	  						<td width="313" scope="col">
	  							<p>法人代表：<input name="user.lawPeople" type="text" id="lawPeople" />
          							<i class="red">*</i></p>	  
	    						<p>联系人姓名：<input name="user.contacts" type="text" id="contacts" />
            						<i class="red">*</i></p>
	    						<p>电子邮箱：<input name="user.email" type="text" id="email">
            						<i class="red">*</i></p>
	    						<p>邮政编码：<input name="user.postNum" type="text" id="postNum" onchange="isNum(postNum)"/></p>
	    						<p>手机号码：<input name="user.cellphone" type="text" id="cellphone" onchange="isNum(cellphone)">
	      							<i class="red">*</i></p>
	    						<p>座机号码：<input name="user.telephone" type="text" id="telephone" /></p>
	    						<p>传真号码：<input name="user.faxAds" type="text" id="faxAds" /></p></td>
	  					</tr>
						<tr>
	    					<th height="50" colspan="4" scope="col">
        						<div align="center">
          							<input type="submit" name="submit" value="注册" 
          								style="margin-top:20px; margin-right:70px;color:#cc3300 " />
          							<input name="reset" type="reset" style="margin-top:20px;margin-right:60px; color:#ff0000" value="重置" />
        						</div>
      						</th>
     					</tr>
				</table>
			</div>
			<div id="fbox">
                <div id="bs_footcenter">
                    <div id="bs_footleft">
                        <div id="bs_footright">
                            业务咨询电话：0311-85813216     技术服务电话：13028644840 18330107787
                        </div>
                    </div>
                </div>
            </div>
		</div>
</form>
</body>
</html>