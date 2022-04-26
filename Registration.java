

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String e=request.getParameter("email");
		String dob=request.getParameter("dob");
		String c=request.getParameter("country");

		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql2","root","");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		ps.setString(1, fname);
		ps.setString(2, lname);
		ps.setString(3, password);
		ps.setString(4, phone);
		ps.setString(5, e);
		ps.setString(6, dob);
		ps.setString(7, c);
		int i=ps.executeUpdate();
		if(i>0){
		out.print("you are successfully registered....");
		response.sendRedirect("Login.html");
		}
		}
		catch(Exception e1){
		System.out.println(e1);
		}
	}
}
