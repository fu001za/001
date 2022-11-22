package day1.dao;

import day1.bean.UserBean;
import day1.utils.BaseDao;

public class UserDao extends BaseDao {
    //    dao层写sql语句
    public UserBean selectUsernameAndPsw(String uname, String psw) {
        String sql="select id, username, password, realname from user where username=? and password=?";
        return executeQueryOne(sql,UserBean.class,uname,psw);
    }

}
