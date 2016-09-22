<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Страница подтверждения успешной регистрации посетителя</title>
    </head>

    <body>
        <h1>Регистрация посетителя успешно завершена</h1>
       <jsp:useBean id="user" class="servlets.User" scope="application"/>
       Пользователь: <%= user.getUser()%><br>
       Email: <%= user.getEmail()%><br>
       Адрес: <%= user.getAddress()%><br>
       Телефон: <%= user.getPhone()%><br>
       Зарегистрирован.<br><br>
       <a href="login.html">Войти в систему</a>
    </body>

</html>