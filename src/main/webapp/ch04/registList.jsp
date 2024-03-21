<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>고객 목록</h2>
	<hr>
	<table border="1">
		<tr>
			<th>아이디</th>			
			<th>이름</th>
			<th>전화번호</th>
			<th>고객등급</th>
		</tr>
		
		<c:forEach var="c" varStatus="i" items="${customers}">
			<tr>
				<td>${i.count}</td> <!-- 인덱스 번호 + 1을 해서 순서대로 출력 -->
				<td>
					<a href="/jsp_quiz/rcontrol?action=info&id=${c.id}">${c.name}</a>
				</td>
				<td>${c.phone}</td>
				<td>${c.grade}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>