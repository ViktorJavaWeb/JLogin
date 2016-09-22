package javaClass;
//package servlets;

import JavaBean.User;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by ustenko on 22.09.16.
 */

// Класс userList — вспомогательный класс для временного хранения списка пользователей.
// Информация в этом файле сохраняется до перезагрузки сервера. Так как настоящий пример носит
// сугубо учебный характер и центральным моментом является иллюстрация взаимодействия сервлетов
// и JSP, мы пока не останавливаемся на вопросах хранения данных и поддержания их целостности,
// а используем простейший вариант для их временного хранения.


public class UserList {

        public static User findUser(String user){
            return (User)users.get(user);
        }

        public static boolean addUser(User user){
            boolean result = false;
            if ((!users.containsKey(user.getUser()))&&(user.getPassword()!=null)&&(!"".equals(user.getPassword()))){
                users.put(user.getUser(),user);
                result = true;
            }
            return result;
        }

        private static Map users = new HashMap();
}

