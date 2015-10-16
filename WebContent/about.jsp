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
<h2>About Us</h2>
<div id="section">



<p><b>Creative It Solutions</b> Started with the team 5 members,London as Headquarters in the 
year 1985.</p>
<p>Now we have 20000 employees around the globe.Currently we monitor our operations from 
sillicon valley.
We acuired various startups like <b>Tinder,Twitter Inc.</b>We always looking for expand our business into
new regions.So That we can serve more people.</p>
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