package day1.service.impl;

import day1.bean.DeptBean;
import day1.dao.DeptDao;
import day1.service.DeptService;
import day1.utils.PageInfo;
import day1.utils.Result;

import java.util.List;

//实现DeptService接口
public class DeptServiceimpl implements DeptService {
    //    创建dao层链接
    private DeptDao dao = new DeptDao();
//    查看所有的部门
    @Override
    public Result findAllDept(Integer pageNum, Integer pageSize) {
        PageInfo<DeptBean> list = dao.seletctAll(pageNum, pageSize);
        Result result = new Result(list);
        return result;
    }

    @Override
    public Result findAllDeptNoPage() {
        List<DeptBean> list = dao.selectAllDeptNoPage();
        Result result = new Result(list);
        return result;
    }
}
