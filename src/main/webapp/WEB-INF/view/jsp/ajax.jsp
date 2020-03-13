<%@ page language="java" import="java.net.http.HttpClient"
	import="java.net.http.HttpRequest" import="java.net.http.HttpResponse"
	import="java.net.http.HttpResponse.BodyHandlers" import="java.net.URI"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AJAX Example</title>
<script>
</script>
</head>
<body>
	<div id="demo">
		<h2>Let AJAX change do the calculations</h2>
		<form action="getsum" method="post">
			<label for="Num01">Number 01:</label> <input type="number" id="num01"
				name="num01"><br> <br> <label for="Num02">Number
				02:</label> <input type="number" id="num02" name="num02"><br> <br>
			<input type="submit" value="Calc" onclick="loadDoc()">
		</form>
</body>
<!-- <button type="button" onclick="loadDoc()">Change Content</button> -->
<%
  HttpClient client = HttpClient.newHttpClient();
  
  HttpRequest req = HttpRequest.newBuilder()
          .uri(URI.create("http://subbu-demospringbootapp.herokuapp.com/"))
          .build();
  
  HttpResponse<String> res = client.send(req, BodyHandlers.ofString());
  System.out.println(res.statusCode());
  System.out.println(res.body());  
  int statusCode = res.statusCode();
  String resBody = res.body();
  %>
</div>
<div id="code">
	<%
	out.println("The status code of response is"+statusCode);
	%>
</div>
<div id="body">
	<%
	out.println("The status code of response is"+resBody);
	%>
</div>
</body>
</html>