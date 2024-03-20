<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="func" class="ch03.GuGuDan" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>구구단 출력하기</h4>
	<%
		int arr[] = func.process(5);
		for (int i = 0; i < arr.length; i++) {
			out.println(5 + " * " + (i+1) + " = " + arr[i] + "<br />");
		}
	%>
</body>
</html>