<%@page session="false"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<title>Welcome</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	
	<h3 style="color: red;">Hello User, Your Trip List </h3>

	<ul>
		<c:forEach var="listValue" items="${trips}">
		    <h3 style="color: green;">RFID:</h3>
			<div>${listValue.rfid}</div>
		    <h3 style="color: green;">Starting Location:</h3>
			<div>${listValue.boardingLocId}</div>
                    <h3 style="color: green;">Destination Location:</h3>
			<div>${listValue.deBoardingLocId}</div>
		</c:forEach>
	</ul>
</body>
</html>