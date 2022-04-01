package org.o7planning.struts2namespace.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace(value = "/web/info")
@Action(value = "aboutUs", //
        results = { //
                @Result(name = "success", location = "/WEB-INF/pages/aboutUs.jsp") //
        } //
)
public class AboutUsAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Override
    public String execute() {

        return "success";
    }

}