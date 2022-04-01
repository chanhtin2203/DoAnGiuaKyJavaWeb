package org.o7planning.tutorial.struts2xml.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 7299264265184515893L;

	private String username;
	private String password;
	
	@Override
	public String execute() {

		HttpServletRequest request = ServletActionContext.getRequest();

		if (this.username != null && this.password != null && this.username.equals("admin")
				&& this.password.equals("admin123")) {

			HttpSession session = request.getSession();
			
			// Lưu trữ userName vào trong trong session.
			session.setAttribute("loginedUsername", this.username);

			return "success";
		} else {
			addActionError(getText("error.login"));
			return "error";
		}
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
}
