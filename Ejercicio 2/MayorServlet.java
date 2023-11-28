package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MayorServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
			
			Integer numero1 = Integer.parseInt(request.getParameter("numero1"));
			Integer numero2 = Integer.parseInt(request.getParameter("numero2"));
			Integer numero3 = Integer.parseInt(request.getParameter("numero3"));
			
			
			
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset='UTF-8'>");
			out.print("<title>Mayor de 3</title>");
			out.print("</head>");
			out.print("<body>");
			
			
			
			if (numero1>numero2 && numero1>numero3) {
				
				
				out.print("El primer número es el mayor");
				
			}
			
			else if (numero2>numero1 && numero2>numero3) {
				
				out.print("El segundo número es el mayor");
				
			}
			
			else {
				
				out.print("El tercer número es el mayor");
				
			}
			out.print("</body>");
			out.print("</html>");
			
		}catch(Exception error) {
			System.out.println(error.toString());		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
