package day1.servlet;

import cn.hutool.core.util.StrUtil;
import day1.bean.EmpBean;
import day1.bean.EmpQuery;
import day1.service.EmpService;
import day1.service.impl.EmpServiceImpl;
import day1.utils.BaseServlet;
import day1.utils.ResponseUtil;
import day1.utils.Result;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Repeatable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/emp")
////继承BaseServlet 不用一直写请求和响应的编码
public class EmpServlet extends BaseServlet {
//    创建service层的链接
    private EmpService service=new EmpServiceImpl();

    public void getAll(HttpServletRequest req, HttpServletResponse resp){
        //        从响应中获取分页的数量
        String pageNum=req.getParameter("pageNum");
        String pageSize=req.getParameter("pageSize");
//        判断有没有给分页的数量 如果没给就赋默认值
        if (StrUtil.isEmpty(pageNum)) {
//            糊涂工具包中判断字符串是不是为空
            pageNum = "1";
        }
        if (StrUtil.isEmpty(pageSize)) {
            pageSize = "5";
        }
        String name = req.getParameter("empName");
        String deptId = req.getParameter("deptId");
        String sex = req.getParameter("sex");
        EmpQuery emp=new EmpQuery(Integer.parseInt(pageNum),Integer.parseInt(pageSize),
                name,sex,deptId);
        Result r = service.findAllEmp(emp);
        ResponseUtil.write(r, resp);
    }
    public void addEmp(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        String name = req.getParameter("empName");
        String deptId = req.getParameter("deptId");
        String empAddress = req.getParameter("empAddress");
        String empBirth = req.getParameter("empBirth");
        String empSalary = req.getParameter("empSalary");
        String empSex = req.getParameter("empSex");
//        用糊涂工具包把字符串变成日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = simpleDateFormat.parse(empBirth);
        EmpBean emp=new EmpBean(null,name,Integer.parseInt(empSex),empAddress,
                Float.parseFloat(empSalary), birth,Integer.parseInt(deptId));
        Result result = service.addEmp(emp);
        ResponseUtil.write(result, resp);

    }
}
