package servlets;

import JavaBean.User;
import javaClass.UserList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ustenko on 22.09.16.
 */


// Класс Adduser, расширяющий класс Dispatcher, добавляет нового пользователя.
// Этот сервлет инициализирует экземпляр объекта User и присваивает значения,
// полученные из запроса пользователя, его свойствам. Если такой пользователь
// уже присутствует в списке пользователей UserList, вызывается Страница errorRegistration.html,
// если добавление пользователя в список прошло успешно, — страница successRegistration.jsp.


public class AddUser extends Dispatcher{

        public String getServletInfo(){
            return "Add user servlet";
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            ServletContext ctx = getServletContext();
            if (request.getParameter("save")!=null){
                String user = request.getParameter("user");
                String password = request.getParameter("password");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                User newUser = new User();
                newUser.setUser(user);
                newUser.setPassword(password);
                newUser.setEmail(email);
                newUser.setAddress(address);
                newUser.setPhone(phone);
                ctx.setAttribute("user", newUser);
                boolean res = UserList.addUser(newUser);
                if (res) {
                    this.forward("/successRegistration.jsp", request, response);
                } else {
                    this.forward("/errorRegistration.html", request, response);
                }
            } else if (request.getParameter("cancel")!=null){
                this.forward("/login.html", request, response);
            }
        }
}
