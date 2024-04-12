<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payment Management</title>
</head>
<body>
    <h1>Payment Management</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Booking ID</th>
            <th>Amount</th>
            <th>Status</th>
            <th>Date</th>
            <th>Action</th>
        </tr>
        <c:forEach var="payment" items="${payments}">
            <tr>
                <td>${payment.id}</td>
                <td>${payment.bookingId}</td>
                <td>${payment.amount}</td>
                <td>${payment.status}</td>
                <td>${payment.paymentDate}</td>
                <td>
                    <a href="editPayment?id=${payment.id}">Edit</a>
                    <a href="deletePayment?id=${payment.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="createPayment">Create Payment</a>
</body>
</html>
