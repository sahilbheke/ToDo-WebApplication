package com.sahilbheke.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	public String message = "Hello! Prashant got internship";
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return message;
	}
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML page - Changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first HTML page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
