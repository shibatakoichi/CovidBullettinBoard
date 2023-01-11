<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<th scope="col">感染～発症までの状況:</th>
			<th scope="col">濃厚接触者との隔離（同居者がいる場合）:</th>
			<th scope="col">症状（後遺症もあれば）:</th>
			<th scope="col">受けた行政・医療サービス:</th>
			<th scope="col">療養のために行ったこと（なんの薬を飲んだか、など）:</th>
			<th scope="col">その他（療養証明書の取得方法など、自由に）:</th>
		</tr>
<% for(PostBean p : post){ %>
		<tr>
			<td><%=  %>
		</tr>
	</tbody>
</table>
</body>
</html>