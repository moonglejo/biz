package com.mg.biz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//�� �������� Servlet�� ��� �����ϴ��� Ȯ���ϱ� ���� ������ �Դϴ�.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		System.out.println("===> HelloServlet ��ü ����");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() �޼ҵ� ȣ��");
	}

}
