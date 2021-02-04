<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
   <meta name="viewport" content="width=device-width, initial-scale=1.0">

           <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
           <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
              <link rel="stylesheet" href="${pageContext.request.contextPath}/css/home.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Student Mask Form</title>
     <link rel = "icon" href =
            "https://www.nwmissouri.edu/layout/v2019/images/svg/logo-n.svg"
                    type = "image/x-icon">
</head>
<body>
<h1>Mask PickUp</h1>
<!-- img class="resize" src="${pageContext.request.contextPath}/img/VirtualSample.png" /> -->
<br/>
<br/>
<img class="resize" src ="https://www.nwmissouri.edu/police/images/modules/Mask-Up-Bearcats.png" />
<img class="img" width="100px" height="100px" src="https://www.nwmissouri.edu/layout/v2019/images/svg/logo-n.svg" />
<br/>
<br/>
<br/>
<br/>
<form:form method="post" action="addStudent" modelAttribute="students">


    <p>
    				<label>Enter Student Id</label>
    				<form:input path="ID" required="required" autocomplete="off" pattern="[0-9]{9}" title="Nine digit 919 number" autofocus="autofocus"/>
    				<form:errors path="ID" cssClass="error"/><br>
    			</p>
    			<p>
    				<label>PickedUp Location</label>
    				<form:select path="pickedPlace" required="required" >
    				<option value="">Select from list</option>
    				<c:forEach var="location" items="${locations}">
    				<option value="${location.getName()}">${location.getName()}</option>
    				</c:forEach>
    				</form:select>


    			</p>
    			<input type="SUBMIT" value="Submit" />
</form:form>

</body>
</html>
