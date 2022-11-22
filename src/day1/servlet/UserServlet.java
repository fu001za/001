package day1.servlet;

import com.alibaba.fastjson.JSON;
import day1.service.UserService;
import day1.service.impl.UserServiceimpl;
import day1.utils.Result;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class UserServlet extends HttpServlet {
//    创建UserServiceimpl层链接
    private UserServiceimpl service=new UserServiceimpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        给请求设置编码
        req.setCharacterEncoding("utf-8");
//        给响应设置编码
        resp.setContentType("text/json;charset=utf-8");
//        得到前端请求的用户名和密码和验证码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String code = req.getParameter("code");
        Result result = service.login(username, password, code, req.getSession());
//        把它转成json字符串
        String json = JSON.toJSONString(result);
//        获取输出流
        PrintWriter writer = resp.getWriter();
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
