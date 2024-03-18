<%@page import="java.net.URLEncoder" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
   String loginCheck=request.getParameter("loginCheck");

   if(loginCheck.equals("student")){
   %>
      <jsp:forward page="StudentServlet?command=loginStudent"/>
      
   <%}else if(loginCheck.equals("professor")){%>
      <jsp:forward page="StudentServlet?command=loginProfessor"/>
         

   <%}//else if(loginCheck.equals("admin")){%>
     <!--   <jsp:forward page="22_1_enrollmentApproval.jsp"/>-->
         

