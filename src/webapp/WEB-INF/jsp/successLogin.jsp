<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Страница успешного входа в систему</title>
    </head>

    <body>
        <br>
        <h1>Вход посетителя в систему прошел успешно</h1>

    <!--связь с компонентом JavaBean user осуществляется с помощью действия <jsp:useBean>
    с соответствующими атрибутами:-->

       <jsp:useBean id="user" class="servlets.User" scope="application"/>
       Пользователь: <%= user.getUser()%><br>
       Email: <%= user.getEmail()%><br>
       Адрес: <%= user.getAddress()%><br>
       Телефон: <%= user.getPhone()%><br>
    </body>

</html>