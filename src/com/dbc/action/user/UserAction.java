package com.dbc.action.user;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONSerializer;

import org.apache.struts2.ServletActionContext;

import com.dbc.entity.SysRight;
import com.dbc.entity.SysRole;
import com.dbc.entity.SysUser;
import com.dbc.service.RightService;
import com.dbc.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	private SysUser user;
	private List<SysUser> suser;
	private UserService userService;
	private RightService rightService;
	private String message;
	private String username;
	private String password;
	private String YanZheng;

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public List<SysUser> getSuser() {
		return suser;
	}

	public void setSuser(List<SysUser> suser) {
		this.suser = suser;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public RightService getRightService() {
		return rightService;
	}

	public void setRightService(RightService rightService) {
		this.rightService = rightService;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getYanZheng() {
		return YanZheng;
	}

	public void setYanZheng(String yanZheng) {
		YanZheng = yanZheng;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("user", this.user);
		return SUCCESS;
	}
	
	public String FindAllUser() throws Exception {
		this.suser=this.userService.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("suser", this.suser);
		return "allUser";
	}
	
	//��ͬ�û���ɫ��¼
	public String login() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String sessionCode = (String)request.getSession().getAttribute("rand");
		if(!sessionCode.equals(YanZheng)){
			ActionContext.getContext().put("msg","��֤�����");
			System.out.println("��֤�����");
			return INPUT;
		}
		user = userService.getloginUser(username, password);
		if (user != null) {
			// ����user����session
			ActionContext.getContext().getSession().put("userInsession", user);
			// �ض�����ҳ
			return "success";
		}
		ActionContext.getContext().put("msg","�û������������");
		return INPUT;
	}
	
	//��¼ʧ��
	public String loginOut() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return INPUT;
	}
	public String userUpdateInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		SysUser user = (SysUser) session.getAttribute("user");
		this.user = this.userService.findByName(user.getUsername());
		return "userUpdate";
	}
	//�޸��û���Ϣ
	public String updateUser() {
		this.userService.update(user);
		message = "�޸���Ϣ�ɹ���";
		return "updateSuc";
	}
	//�û�ע��
	public String register() throws Exception {
		// ����service��صķ��������ʵ�ʵ�ҵ����
		user.getSysRole().add(new SysRole("aa"));
		this.userService.save(this.user);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("user", this.user);
		return "regSuc";
	}
	//�ж��û����Ƿ��Ѿ�ע��
	public void textajax()throws Exception{

		HttpServletRequest request=ServletActionContext.getRequest();
		String name=request.getParameter("name");
		user=userService.findByName(name);
		String msg;
		if (user==null)
		{
			msg="�û�������ʹ�ã�";
		}
		else {
			msg="�û����Ѵ��ڣ�";
		}
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(msg);		
	}
	
	//��Ȩ����ʾ������˵�
	public String menu() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		user =  (SysUser) ActionContext.getContext().getSession().get("userInsession");
		List<SysRight> list = rightService.findByLoginUserId(user.getUserId());
		for (SysRight sysRight : list) {
			System.out.println(sysRight);
		}
		String json = JSONSerializer.toJSON(list).toString();
		out.print(json);
		return null;
		}
}