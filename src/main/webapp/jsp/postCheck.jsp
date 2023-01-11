<%@ page language = "java" contentType="text/html; charset=UTF-8"
	pageEncoding = "UTF-8" %>

<%
request.setCharacterEncoding("UTF-8");
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang = "ja">
	<head>
	<meta charset="UTF-8">
		<title>入力内容の確認</title>
	</head>
	<body>
	<h1>※投稿はまだ完了していません</h1>
	<h2>入力内容は以下の通りでよろしいでしょうか。よろしければ、画面下部の「確認」ボタンを押してください。修正箇所がある場合は画面下部の「戻る」ボタンを押してください。</h2>
	<form action="/CovidBulletinBoard/postcomplete" method="post">
	<ul>
	<li>年齢：<c:out value="${p.age}" /></li>
	<li>性別：<c:out value ="${p.gender}" /></li>
	<li>療養地域：<c:out value="${p.prefId}" /></li>
	<li>ワクチン接種回数：<c:out value="${p.vaccineCount}" /></li>
	<li>感染経路：<c:out value="${p.infectionRoute}" /></li>
	<li>療養形態：<c:out value="${p.recuperationForm}" /></li>
	<li>療養日数：<c:out value="${p.recuperationDays}" /></li>
	</ul>
	<ol>
	<li>感染～発症までの状況:<c:out value="${p.situation}" /></li>
	<li>濃厚接触者との隔離（同居者がいる場合）:<c:out value="${p.contactperson}" /></li>
	<li>症状（後遺症もあれば）:<c:out value="${p.symptoms}" /></li>
	<li>受けた行政・医療サービス:<c:out value ="${p.service}" /></li>
	<li>療養のために行ったこと（なんの薬を飲んだか、など）:<c:out value ="${p.tocure}"/></li>
	<li>その他（療養証明書の取得方法など、自由に）:<c:out value="${p.other}" /></li>
	</ol>
	
	<input type="hidden" name="age" value =<c:out value="${p.age}" /> />
	<input type="hidden" name="gender" value=<c:out value="${p.gender}" /> />
	<input type="hidden" name="prefId" value=<c:out value ="${p.prefId}" /> />
	<input type="hidden" name="vaccineCount" value=<c:out value="${p.vaccineCount}" /> />
	<input type="hidden" name="infectionRoute" value=<c:out value="${p.infectionRoute}" /> />
	<input type="hidden" name="recuperationForm" value=<c:out value="${p.recuperationForm}" /> />
	<input type="hidden" name="recuperationDays" value=<c:out value="${p.recuperationDays}" /> />
	<input type="hidden" name="situation" value=<c:out value="${p.situation}" /> />
	<input type="hidden" name="contactperson" value=<c:out value="${p.contactperson}" /> />
	<input type="hidden" name="symptoms" value=<c:out value="${p.symptoms}" /> />
	<input type="hidden" name="service" value=<c:out value="${p.service}" /> />
	<input type="hidden" name="tocure" value=<c:out value="${p.tocure}" /> />
	<input type="hidden" name="other" value="${p.other}" />
	<input type="submit" value="送信">
	<a href="javascript:history.back();">戻る</a>
	</form>
	</body>
</html>