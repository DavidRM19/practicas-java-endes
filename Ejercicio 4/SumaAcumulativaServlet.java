package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SumaAcumulativaServlet
 */
public class SumaAcumulativaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumaAcumulativaServlet() {
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
			
			Integer sumaAcumulativa = Integer.parseInt(request.getParameter("suma_acumulativa"));
			
			int sumaAcumulativa2= sumaAcumulativa;
			
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset='UTF-8'>");
			out.print("<title>Mayor de 3</title>");
			out.print("</head>");
			out.print("<body>");
			
			
		for (int i=0 ; i<=sumaAcumulativa ; i++) {
			
			sumaAcumulativa2=sumaAcumulativa2+i;
			
		}
		
		out.print("Suma acumulativa: " + sumaAcumulativa2);
			
			
			out.print("</body>");
			out.print("</html>");
			
		}catch(Exception error) {
			System.out.println(error.toString());	
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
