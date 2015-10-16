<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
fieldset{height:150px;width:400px}
select{width:200px;}
a{margin-left:600px;}


</style>
</head>
<body>

<br>

<fieldset>
<legend>Courses Offered</legend>
<br>
<form action="./course" method="post">

Semester:      <select>
  				<option value="spring">Spring-2016</option>
  				<option value="summer">Summer-2016</option>
  				<option value="fall">Fall-2016</option>
				</select>
<br><br>
Department:<select id="dept" name="department">
										<option value="-1">Select a department</option>
										<option value="ACC">Accounting</option>
										<option value="AST">Astronomy</option>
										<option value="ATH">Athletics</option>
										<option value="BIOL">Biology</option>
										<option value="CIV">Civil Engineering</option>
										<option value="CS">Computer Science</option>
										<option value="ENG">English</option>
										<option value="EE">Electrical Engineering</option>
										<option value="FIN">Finance</option>
										<option value="HIST">History</option>
										<option value="MATH">Mathematics</option>
										<option value="PHY">Physics</option>
									</select><br><br>
<input type="submit" value="View Subjects"/>
  </form>
</fieldset>

<a href="grades.jsp">Check your grades Here..</a><br>
<a href="trans.jsp">View Your Transcrpts..</a><br>
<a href="holds.jsp">View Your Holds..</a><br>
<a href="fee.jsp">Pay Your Tution Fee Here..........</a>

<br><br><br><br><br><br><br><br><br>



<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>