package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NetInfoServlet
 */
@WebServlet("/Network")// ../Network 등 위치를 잘 맞춰야 함
public class NetInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("안녕하세요");
		
		out.print("<html><head><title>프로그램</title></head>");
		out.print("<body>");
		out.printf("<h3>네트워크 정보</h3><ul>");
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		out.printf("<li>Requst Scheme : %s<li>",request.getScheme());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
