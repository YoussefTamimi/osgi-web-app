<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>OSGI Web-app</h2>
	
	<jsp:useBean id="pb" class="presentation.ProjectBean" scope="session"/>
	<hr color="blue"/>
	<jsp:getProperty property="name" name="pb">
	<jsp:getProperty property="info" name="pb">
	<hr color="blue"/>
</body>
</html>