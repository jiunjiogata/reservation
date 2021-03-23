<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Complete Reservation</h2>
Departure City: ${flight.departurecity}
Arrival City: ${flight.arrivalcity}

<form action="completeReservation" method="post">
<pre>
<h2>Passenger Details</h2>
First Name: <input type="text" name="passengerFirstName"/>
Last Name: <input type="text" name="passengerLastName"/>
Email: <input type="text" name="passengerEmail"/>
Phone: <input type="text" name="passengerPhone"/>

<h2>Card Details</h2>
Name On the Card: <input type="text" name="nameOnTheCard"/>
Card Number: <input type="text" name="cardNumber"/>
Expirate Date: <input type="text" name="expirateDate"/>
Three Digit Secure Code: <input type="text" name="secure Code"/>

<input type="hidden" name="flightId" value="${flight.Id}"/>
<input type="submit" value="confirm"/>
</pre>
</form>

</body>
</html>