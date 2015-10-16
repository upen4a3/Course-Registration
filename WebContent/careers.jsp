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
<h2>Careers</h2>
<div id="section">



<h4>Be an innovator</h4>
Whether you're fresh out of college, or an experienced professional, <b>CIS</b> is a company where you can cultivate your expertise, use your knowledge to the fullest extent, or re-invent yourself while working on society's most pressing issues.
<h4>Work in the company of experts</h4>
Collaborate with like-minded people in an environment that embraces individual differences, and rewards your best work. Deepen your expertise and learn from a network of 20,000 CISers that use our collective intelligence to make the world work better. Be part of a team that encourages constant learning and provides the situations, projects, training, and interactions that will help develop your expertise.
<h4>Build the career you want</h4>
At CIS, we put more emphasis on career development and give you more resources than anywhere else that serve you well here, and for long afterward. CIS offers competitive benefits, as well as an industry-leading practice of performance-based bonuses for all employees. CIS gives you the power to design your workday, and your life, according to your unique styles and needs.
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
<div class="ibm-youTube-container">
					<object width="340" height="250">
					<param name="movie" value="http://www.youtube.com/v/eFiIsqDaESs&amp;hl=en_US&amp;fs=1"></param>
					<param name="allowFullScreen" value="true"></param>
					<param name="allowscriptaccess" value="always"></param>
					<param name="wmode" value="transparent"></param>
					<embed src="http://www.youtube.com/v/eFiIsqDaESs&amp;hl=en_US&amp;fs=1" width="340" height="250" type="application/x-shockwave-flash"></embed>
					
					</object>
				</div>




<%@ include file="footer.jsp" %>



</body>
</html>