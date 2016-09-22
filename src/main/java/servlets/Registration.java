package servlets;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by ustenko on 22.09.16.
 */

//Класс Registration, расширяющий класс Dispatcher, проверяет, какой вид деятельности выбрал
// пользователь (вход в систему или регистрацию), и перенаправляет запрос:
//
//     □  на сервлет CheckUser.java, если выбран вход в систему ("login");
//     □  на страницу registration.html,  если выбрана регистрация ("registration"),


public class Registration extends Dispatcher{

        public String getServletInfo(){
            return "Registration servlet";
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            ServletContext ctx = getServletContext();
            if (request.getParameter("login")!=null){
                this.forward("/CheckUser", request, response);
            } else if (request.getParameter("registration")!=null) {
                this.forward("/registration.html", request, response);
            }
        }
    }