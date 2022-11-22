package day1.service;

import com.sun.net.httpserver.HttpsServer;
import day1.utils.Result;

import javax.servlet.http.HttpSession;

public interface UserService {

    Result login(String uname, String psw, String code, HttpSession session);

}