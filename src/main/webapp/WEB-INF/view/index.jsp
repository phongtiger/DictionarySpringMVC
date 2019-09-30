<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="/result">
  <label>Rate: </label><br/>
  <input type="text" name = "word" placeholder="word" /><br/>
  <input type = "submit" value = "Converter"/>
</form>
<p>Result: ${ketqua}</p>
</body>
</html>
