package com.hsbc.customtagclass;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyClass extends TagSupport {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter jspw = pageContext.getOut(); // THIS WILL PRINT OUTPUT ON JSP PAGE
		try {
			jspw.println("Hello from custom tag class which extends Tag Support!!" + this.evaluateFactorial(Long.parseLong(this.getData())));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
	private long evaluateFactorial(long n) {
		//int n = 5;
		long res = 1;
		while(n>0) {
			res*=n;
			n-=1;
		}
		return res;
	}
}
