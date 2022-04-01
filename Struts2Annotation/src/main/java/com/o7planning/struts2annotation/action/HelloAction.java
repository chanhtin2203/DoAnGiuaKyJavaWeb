package com.o7planning.struts2annotation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "hello", //
results = { //
        @Result(name = "helloPage", location = "/WEB-INF/pages/helloStruts2.jsp")
} //
)
public class HelloAction  extends ActionSupport {
 
    private static final long serialVersionUID = 1L;

    @Override
    public String execute() {
         
        return "helloPage";
    }
   
}