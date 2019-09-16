<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/09/2019
  Time: 9:07 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate">
    <fieldset>
        <legend> Calculator</legend>
        <table>
            <tr>
                <td> First Operand:</td>
                <td><input type="text" name="firstOperand" value="${firstOperand}"></td>
            </tr>

            <tr>
                <td></td>
                <td>
                    <select name="operator">
                        <option value="addition"> Addition</option>
                        <option value="subtraction">Subtraction</option>
                        <option value="multiplication">Multiplication</option>
                        <option value="division">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second Operand:</td>
                <td><input type="text" name="secondOperand" value="${secondOperand}"></td>
            </tr>
            <tr>
                <td><button type="submit">Calculate</button></td>
                <td>${result}</td>


            </tr>
        </table>
    </fieldset>


</form>

</body>
</html>
