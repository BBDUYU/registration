<jsp:include page="0_base.jsp"/>
<%@page import="java.net.URLEncoder" %>
<%@ page import="javax.sql.*, java.sql.*, javax.naming.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.pj.dao.StuDAO" %>
<%@ page import="com.pj.dto.StuDTO" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List" %>

<jsp:useBean id="stu" class="com.pj.dto.StuDTO" scope="session"/>
<jsp:setProperty name="stu" property="*" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=stu.getStudentNum() %>
</body>
</html>