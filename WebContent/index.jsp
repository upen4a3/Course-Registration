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

li{display:inline;}

fieldset{width:300px;height:150px;margin-left:600px}
h1{text-align:center;color:white;}
b{color:orange;}
</style>
</head>
<body>
<div id="header">
<h1>OnlineCentral</h1><h3><sub>Devoloped by CIS</sub></h3>
</div>
<ul>
<li><a href="../pages/about.jsp"><strong>About Us</strong></a></li>
<li><a href="../pages/services.jsp"><strong>Services</strong></a></li>
<li><a href="../pages/careers.jsp"><strong>Careers</strong></a></li>
<li><a href="../pages/contact.jsp"><strong>Contact Us</strong></a></li>
</ul>

<div id="section">

<p><b>OnlineCentral</b> is a best way to register to your course.It is devoloped by <b>Creative IT Soluton.</b> 
We are SillicanValley Based with 150 offices around the world.

</p>
<p>We Are curremtly offering Product Design,Consulting,and Staffing services around the globe.Our <b>Culture</b> is deliver what client needs on 
time with low cost.</p>
<p>We are always look for innovative approaches to incorporate.</p>
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