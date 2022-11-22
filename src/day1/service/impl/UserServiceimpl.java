package day1.service.impl;

import cn.hutool.core.util.StrUtil;
import day1.bean.UserBean;
import day1.dao.UserDao;
import day1.service.UserService;
import day1.utils.Result;

import javax.servlet.http.HttpSession;
import java.lang.invoke.VarHandle;

public class UserServiceimpl implements UserService {
//    创建dao层链接
    private UserDao dao=new UserDao();

    @Override
    public Result login(String uname, String psw, String code, HttpSession session) {
//            先从session中取出真正的验证码
        String realCode = (String) session.getAttribute("code");
        Result result=null;
//        跟前端传来的验证码进行比较
        if (!StrUtil.equals(code, realCode)) {
            result = new Result("验证码输入有误", -1, null);
        } else {
//            说明验证码没问题开始判断用户名和密码
            UserBean user = dao.selectUsernameAndPsw(uname, psw);
            if (user != null) {
                result = new Result(user);
            } else {
                result = new Result("登入失败用户名或密码有误", -1, null);
            }
        }
        return result;
    }
}
