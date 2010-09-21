package rytsa.itau.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import client.ws.rytsa.NovedadesValuacionesRequestData;
import client.ws.rytsa.Test;
import client.ws.rytsa.TestService;

public class ConsumirWS extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ConsumirWS() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String metodo = request.getParameter("metodo");
		String fecha = request.getParameter("Fecha");
		
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		
		
		TestService.TESTSERVICE_WSDL_LOCATION = new URL(basePath + "ItauMTM?wsdl");
		TestService ts = new TestService();
		if (metodo.equalsIgnoreCase("NDF")){
			try {	
				Test t = ts.getTestPort();
				List<NovedadesValuacionesRequestData> t2 = t.calcularMTMNdf(fecha);
				StringBuffer salida = new StringBuffer();
				for (NovedadesValuacionesRequestData novedadesValuacionesRequestData : t2) {
					salida.append(novedadesValuacionesRequestData.toString());
				}
				request.setAttribute("resul", salida.toString());
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e){
				e.printStackTrace();
				request.setAttribute("resul",e.toString());
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			}
		} else { 
			if (metodo.equalsIgnoreCase("SWAP")) {
			
				try {	
					Test t = ts.getTestPort();
					List<NovedadesValuacionesRequestData> t2 = t.calcularMTMSwap(fecha);
					StringBuffer salida = new StringBuffer();
					for (NovedadesValuacionesRequestData novedadesValuacionesRequestData : t2) {
						salida.append(novedadesValuacionesRequestData.toString());
					}
					request.setAttribute("resul2", salida.toString());
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
					dispatcher.forward(request, response);
				} catch (Exception e){
					e.printStackTrace();
					request.setAttribute("resul2",e.toString());
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
					dispatcher.forward(request, response);
				}
			} else {
				try {	
					Test t = ts.getTestPort();
					
					String salida= t.testSuma1Dia(fecha);
					request.setAttribute("resul3", salida);
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
					dispatcher.forward(request, response);
				} catch (Exception e){
					e.printStackTrace();
					request.setAttribute("resul3",e.toString());
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
					dispatcher.forward(request, response);
				}
			} 
			
		}
		
	
	
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}



}
