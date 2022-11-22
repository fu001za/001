package day1.servlet;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.server.HttpServerRequest;
import day1.service.DeptService;
import day1.service.impl.DeptServiceimpl;
import day1.utils.BaseServlet;
import day1.utils.ResponseUtil;
import day1.utils.Result;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/dept")
//继承BaseServlet 不用一直写请求和响应的编码
public class DeptServlet extends BaseServlet {
//    创建service层的链接
    private DeptService service=new DeptServiceimpl();

    //    查看所有的部门
    public void getAll(HttpServletRequest request,HttpServletResponse response) {
//        从响应中获取分页的数量
        String pageNum=request.getParameter("pageNum");
        String pageSize=request.getParameter("pageSize");
//        判断有没有给分页的数量 如果没给就赋默认值
        if (StrUtil.isEmpty(pageNum)) {
//            糊涂工具包中判断字符串是不是为空
            pageNum = "1";
        }
        if (StrUtil.isEmpty(pageSize)) {
            pageSize = "5";
        }
//        把上一层的方法拿来 把字符串给为数字
        Result result = service.findAllDept(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
//        响应出去
        ResponseUtil.write(result, response);
    }
//    不分页
public void getAllDeptNoPage(HttpServletRequest request,HttpServletResponse response) throws IOException {
    Result result = service.findAllDeptNoPage();
    ResponseUtil.write(result,response);
}

}
