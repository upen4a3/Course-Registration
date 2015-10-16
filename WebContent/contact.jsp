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
<h2>Contact Us</h2>
       <form action="./contact" method="POST" enctype="multipart/form-data">
    <input name="action" value="submit" type="hidden"> Name:<br>
    <input name="name" size="30" type="text"><br>Phone:<br>
 <input name="name" size="30" type="text"><br>Email:<br>
    <input name="email" size="30" type="text"><br> Your message:<br>
    <textarea name="message" rows="7" cols="30">
    </textarea><br>
    <input value="Contact" type="submit">
    </form>








<%@ include file="footer.jsp" %>



</body>
</html>