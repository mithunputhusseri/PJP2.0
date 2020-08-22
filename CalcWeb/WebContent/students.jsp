
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a =0;
int b=0;
int c =0;
String name = null;

if(request.getAttribute("d1") != null){
	name = (String)request.getAttribute("d1");
}

%>
<center>
<h1>Date Calculator</h1>
<center>
<div>
<form action="AddController" method = "get">
<br>Enter Date: <input type="text" name = "s_id" value="1 2 2020"/>
<br>Enter Function: <input type="text" name = "f_id" value="tommorow"/>
<br> <input type="submit" value = "Get Info!"/>
<h2><%=name %></h2>
</form>
</div>
</center>

</body>
</html>