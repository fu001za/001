package day1.service.impl;

import day1.bean.DeptBean;
import day1.bean.EmpBean;
import day1.bean.EmpQuery;
import day1.dao.DeptDao;
import day1.dao.EmpDao;
import day1.service.EmpService;
import day1.utils.PageInfo;
import day1.utils.Result;

import java.util.List;

//实现接口
public class EmpServiceImpl implements EmpService {
//    创建dao层链接
    private EmpDao dao=new EmpDao();
    private DeptDao deptDao=new DeptDao();

//   查询所有员工信息
    @Override
    public Result findAllEmp(EmpQuery empQuery) {
        PageInfo<EmpBean> info = dao.selectByPage(empQuery);
        Result result = new Result(info);
        List<EmpBean> emps= info.getData();//所有的员工
        for(EmpBean emp:emps){
            Integer deptId = emp.getDeptId();//每个员工的部门id
            DeptBean dept = deptDao.selectDeptById(deptId);//根据部门id查询部门
            emp.setDept(dept);//再把部门放在emp中dept部门属性中
        }
        return new Result(info);
    }

    @Override
    public Result addEmp(EmpBean emp) {
        int i = dao.insertEmp(emp);
//        判断是非添加成功
        if (i>0) {
            return new Result("添加成功", 200, null);
        }
        return new Result("添加失败",-1,null);
    }
}
