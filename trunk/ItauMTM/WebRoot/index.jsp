<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
  <form action="/ItauMTM/servlet/ConsumirWS" >
    <P>Invocar WS Suma 1 Dia:</P> 
	    <input type="hidden" name="metodo" value="Suma1Dia">
	    <P> 	<input type="text" name="Fecha"> (DD/MM/AAAA) Ej = 02/03/2010 </P>  
	    <P> 	<input type="submit" value="Consumir"> </P>
	 <%String c =  (String)request.getAttribute("resul3"); %>
	 Resultado : <%=c %>
	</form> 
	 <hr>

  <form action="/ItauMTM/servlet/ConsumirWS" >
    <P>Invocar WS Calcular MTM NDF:</P> 
	    <input type="hidden" name="metodo" value="NDF">
	    <P> 	<input type="text" name="Fecha"> (DD/MM/AAAA) Ej = 02/03/2010 </P>  
	    <P> 	<input type="submit" value="Consumir"> </P>
	 <%String a =  (String)request.getAttribute("resul"); %>
	 Resultado : <%=a %>
	</form> 
	 <hr>
	<form action="/ItauMTM/servlet/ConsumirWS" >
	 <P>Invocar WS Calcular MTM SWAP:</P>
	 	<input type="hidden" name="metodo" value="SWAP"> 
        <P> 	<input type="text" name="Fecha"> (DD/MM/AAAA) Ej = 02/03/2010 </P>  
	    <P> 	<input type="submit" value="Consumir"> </P>
	 <%String b =  (String)request.getAttribute("resul2"); %>
	 Resultado : <%=b %>
	</form>	 
	
	<hr>
	<form action="/ItauMTM/servlet/ConsumirWS" >
	 <P>Cargar Base De Datos:</P>
	 	<input type="hidden" name="metodo" value="ResetBBDD"> 
	    <P> 	<input type="submit" value="Cargar BBDD"> </P>
	 <%String d =  (String)request.getAttribute("resul4"); %>
	 Resultado : <%=d %>
	</form>	 
	
  </body>
</html>
