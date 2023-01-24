<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>投稿一覧</title>
</head>
<body>
<h1>投稿一覧</h1>
<h2>投稿一覧です。</h2>
<table class="table">
	<tbody>
		<tr>
			<th scope="col">属性</th>
			<th scope="col">感染～発症までの状況:</th>
			<th scope="col">濃厚接触者との隔離（同居者がいる場合）:</th>
			<th scope="col">症状（後遺症もあれば）:</th>
			<th scope="col">受けた行政・医療サービス:</th>
			<th scope="col">療養のために行ったこと（なんの薬を飲んだか、など）:</th>
			<th scope="col">その他（療養証明書の取得方法など、自由に）:</th>
		</tr>
<c:forEach var="postBean" items="${postList}">
	<p><c:out value="${postList.id}" />
	<c:out value="${postList.age}" />
	<c:out value="${postList.gender}" />
	<c:out value="${postList.prefId}" />
	<c:out value="${postList.vaccineCount}" />
	<c:out value="${postList.infectionRoute}" />
	<c:out value="${postList.recuperationForm}" />
	<c:out value="${postList.recuperationDays}" />
	<c:out value="${postList.situation}" />
	<c:out value="${postList.contactperson}" />
	<c:out value="${postList.symptoms}" />
	<c:out value="${postList.service}" />
	<c:out value="${postList.tocure}" />
	<c:out value="${postList.other}" /></p>
</c:forEach>
	</tbody>
</table>
</body>
</html>