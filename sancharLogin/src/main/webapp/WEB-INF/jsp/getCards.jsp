<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Card Balances</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	
	<h2 style="color: red;">List of Card and All Card Balance :</h2>
	<ul>
		<c:forEach var="listValue" items="${cards}">
		    <h3 style="color: green;">RFID:</h3>
			<div>${listValue.rfid}</div>
		    <h3 style="color: green;">Card Balance:</h3>
			<div>${listValue.balance}</div>
		</c:forEach>
	</ul>
</body>
</html>