<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnlineCentral</title>
<style type="text/css">
body{background-color:	#FAEBD7;}

#header{background-color:	#A52A2A;
	color:maroon;
	text-align:center;
	padding:5px
		}
#section{width:350px;
	float:left;
	padding:20px;
	
	}



fieldset{width:300px;height:150px;margin-left:600px}
h1{text-align:center;color:white;}
b{color:orange;}
</style>
</head>
<body>
<div id="header">
<h1>OnlineCentral</h1>
</div>
<h2>Services</h2>
<div id="section">



<h4>OUR Products, OUR Designs AND OUR Promises</h4>
<p>We’re leaders in the Product Design business. Our fleet of designs is unparalleled in the business. Our employees have all the skills and experience you rely on to get the job done right. Our commitment to best product is uncompromising. Here’s our promise to you: Our products and employees will continue to provide outstanding business services to you, wherever and whatever the challenge. And we’ll continue to do so with operational standards far beyond anything required by outside agencies.</p>

</div>

<fieldset>
<legend>Login Here</legend>
<form action="./login" method="post">
<pre>
Username:<input type="text" name="uname"/>
Password:<input type="password" name="password"/>
		<input type="submit" value="Login"><br>
<a href="pwdchng.jsp">Forgot Password?Click Here</a>
<a href="newuser.jsp">New User?Click Here</a>
</pre>
</form>
</fieldset>



<%@ include file="footer.jsp" %>



</body>
</html>