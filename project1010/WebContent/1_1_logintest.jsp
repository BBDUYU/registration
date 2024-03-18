<%@page import="java.net.URLEncoder" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
   String id=request.getParameter("id");
   String password=request.getParameter("password");
   String loginCheck=request.getParameter("loginCheck");

   if(loginCheck.equals("student")){
   %>
      <% session.setAttribute("StudentNum", request.getParameter("id"));%>
      <jsp:forward page="2_main.jsp"/>
      

   <%}else if(loginCheck.equals("professor")){%>
      <% session.setAttribute("ProfessorNum", request.getParameter("id"));%>
      <jsp:forward page="13_my_info.jsp"/>
         

   <%}else if(loginCheck.equals("admin")){%>
      <% session.setAttribute("AdminId", request.getParameter("id"));%>
      <jsp:forward page="22_1_enrollmentApproval.jsp"/>
         

   <%}%>