

/*import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

@WebServlet("/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet() {
		System.out.print("HER I AM");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, ServletRequest session) throws ServletException, IOException {
		String phone=request.getParameter("phone");
		HttpSession session1=request.getSession();
		session1.setAttribute("phone",phone); 
		Random rand = new Random();
        int otp = rand.nextInt(1000);
	    session1.setAttribute("otp",otp);
	    JOptionPane.showMessageDialog(null, "your OTP is:" +otp);
	    response.sendRedirect("otp.jsp");  

	}
}*/





import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

@WebServlet("/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		
		String phone=request.getParameter("phone");
		HttpSession session1=request.getSession();
		session1.setAttribute("phone",phone); 
		Random rand = new Random();
        int otp = rand.nextInt(1000);
	    session1.setAttribute("otp",otp);
	    JOptionPane.showMessageDialog(null, "your OTP is:" +otp);
	    response.sendRedirect("otp.jsp"); 
	}	
}

