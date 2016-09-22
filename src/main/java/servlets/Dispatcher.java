package servlets;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by ustenko on 22.09.16.
 */

//Класс Dispatcher, расширяющий интерфейс HttpServlet, — базовый сервлет,
// который имеет только один метод forward, перенаправляющий запрос клиента на другую страницу.
// Остальные сервлеты наследуют базовому сервлету Dispatcher.

public class Dispatcher extends HttpServlet{

        protected void forward(String address, HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException{

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address);
            dispatcher.forward(request, response);
        }
    }

