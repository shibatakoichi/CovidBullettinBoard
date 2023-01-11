<%@ page language = "java" contentType="text/html; charset=UTF-8"
	pageEncoding = "UTF-8" %>

<%
request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html lang = "ja">
	<head>
	<meta charset="UTF-8">
		<title>投稿フォーム</title>
	</head>
	<body>
	<h1>投稿フォーム</h1>
	<h2>該当する項目にチェックを入れてください。</h2>
	<form action="/CovidBulletinBoard/post" method="post">
	<ul>
	<li>年齢：
	<select name="age">
	<option value="">選択してください</option>
	<option>10歳未満</option>
	<option>10-19歳</option>
	<option>20-29歳</option>
	<option>30-39歳</option>
	<option>40-49歳</option>
	<option>50-59歳</option>
	<option>60-69歳</option>
	<option>70-79歳</option>
	<option>80-89歳</option>
	<option>90-99歳</option>
	<option>100歳以上</option>
	</select></li>
	<li>性別：
	男<input type="radio" name="gender" value="男">
	女<input type="radio" name="gender" value="女">
	</li>
	<li>療養地域：
	<select name="prefId">
	<option value="">都道府県</option>
	<option>北海道</option>
	<option>青森県</option>
	<option>岩手県</option>
	<option>宮城県</option>
	<option>秋田県</option>
	<option>山形県</option>
	<option>福島県</option>
	<option>茨城県</option>
	<option>栃木県</option>
	<option>群馬県</option>
	<option>埼玉県</option>
	<option>千葉県</option>
	<option>東京都</option>
	<option>神奈川県</option>
	<option>新潟県</option>
	<option>富山県</option>
	<option>石川県</option>
	<option>福井県</option>
	<option>山梨県</option>
	<option>長野県</option>
	<option>岐阜県</option>
	<option>静岡県</option>
	<option>愛知県</option>
	<option>三重県</option>
	<option>滋賀県</option>
	<option>京都府</option>
	<option>大阪府</option>
	<option>兵庫県</option>
	<option>奈良県</option>
	<option>和歌山県</option>
	<option>鳥取県</option>
	<option>島根県</option>
	<option>岡山県</option>
	<option>広島県</option>
	<option>山口県</option>
	<option>徳島県</option>
	<option>香川県</option>
	<option>愛媛県</option>
	<option>高知県</option>
	<option>福岡県</option>
	<option>佐賀県</option>
	<option>長崎県</option>
	<option>熊本県</option>
	<option>大分県</option>
	<option>宮崎県</option>
	<option>鹿児島県</option>
	<option>沖縄県</option>
	<option>その他</option>
	</select></li>
	<li>ワクチン接種回数：
	<select name="vaccineCount">
	<option value="">選択してください</option>
	<option>0回</option>
	<option>1回</option>
	<option>2回</option>
	<option>3回</option>
	<option>4回</option>
	<option>5回以上</option>
	</select></li>
	<li>感染経路：
	<select name="infectionRoute">
	<option value="">選択してください</option>
	<option>家族</option>
	<option>職場</option>
	<option>友人</option>
	<option>医療機関</option>
	<option>社会福祉施設</option>
	<option>飲食店</option>
	<option>学校</option>
	<option>保育所</option>
	<option>その他</option>
	<option>不明</option>
	</select></li>
	<li>療養形態：
	<select name="recuperationForm">
	<option value="">選択してください</option>
	<option>自宅療養のみ</option>
	<option>自宅・ホテルでの療養</option>
	<option>自宅・入院での療養</option>
	<option>ホテル療養のみ</option>
	<option>入院療養のみ</option>
	<option>自宅・ホテル・入院での療養</option>
	<option>その他</option>
	</select>
	</li>
	<li>療養日数（※有症状の場合は発症日を、無症状の場合は検査をした日を0日目として数えてください。）：
	<select name="recuperationDays">
	<option value="">選択してください</option>
	<option>覚えていない・定かでない</option>
	<option>4日以下</option>
	<option>5日</option>
	<option>6日</option>
	<option>7日</option>
	<option>8日</option>
	<option>9日</option>
	<option>10日</option>
	<option>11日</option>
	<option>12日</option>
	<option>13日</option>
	<option>14日</option>
	<option>15日以上</option>
	</select></li>
	</ul>
	<h2>各項目について、可能な範囲で入力をお願いします。</h2>
	<ol>
	<li>感染～発症までの状況<br>
	<textarea name="situation" cols="50" rows="5"></textarea></li>
	<li>濃厚接触者との隔離（同居者がいる場合）<br>
	<textarea name="contactperson" cols="50" rows="5"></textarea></li>
	<li>症状（後遺症もあれば）<br>
	<textarea name="symptoms" cols="50" rows="5"></textarea></li>
	<li>受けた行政・医療サービス<br>
	<textarea name="service" cols="50" rows="5"></textarea></li>
	<li>療養のために行ったこと（なんの薬を飲んだか、など）<br>
	<textarea name="tocure" cols="50" rows="5"></textarea></li>
	<li>その他（療養証明書の取得方法など、自由に）<br>
	<textarea name="other" cols="50" rows="5"></textarea></li>
	</ol>
	<input type="submit" value="確認">
	<a href="/CovidBulletinBoard/jsp/home.jsp">ホームに戻る</a>
	</form>
	</body>
</html>