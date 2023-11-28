package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServlet
 */
public class DiaSemanaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		try {
			
			Integer Semana = Integer.parseInt(request.getParameter("semana"));
			
			
			
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<meta charset='UTF-8'>");
			out.print("<title>Mayor de 3</title>");
			out.print("</head>");
			out.print("<body>");
			
			
			switch (Semana) {

			case 1:
				
				out.print("Lunes");
				break;

			case 2:	
				
				out.print("Martes");
				break;
			
			case 3:	
				
				out.print("Miercoles");
				break;
				
			case 4:	
				
				out.print("Jueves");
				break;
			case 5:	
				
				out.print("Viernes");
				break;
				
			case 6:	
				
				out.print("Sabado");
				break;
								
			case 7:	
	
				out.print("Domingo");
				break;
				
				
			default:
				break;
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
