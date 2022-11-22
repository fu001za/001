package day1.servlet;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/code")
public class CodeServlcet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        糊涂工具包里的生成验证码
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(80, 40, 4, 5);
//        糊涂工具包得到Code
        String code = captcha.getCode();
//        得到session
        HttpSession session = req.getSession();
//        设置session
        session.setAttribute("code", code);
//        将验证码输出到响应流中
        captcha.write(resp.getOutputStream());
    }
}
