package day1.dao;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import day1.bean.EmpBean;
import day1.bean.EmpQuery;
import day1.utils.BaseDao;
import day1.utils.PageInfo;

//继承jdbc工具类
public class EmpDao extends BaseDao {
// 分页查询所有的员工
    public PageInfo<EmpBean> selectByPage(EmpQuery query) {
        String sql = "select emp_id empId, emp_name empName, emp_sex empSex, emp_address empAddress, " +
                "       emp_salary empSalary, emp_birth empBirth, dept_id deptId from emp where 1=1 ";
//        如果传的姓名，按照姓名模糊查询
        if (StrUtil.isNotEmpty(query.getEmpName())){
            sql+=" and emp_name like '%"+query.getEmpName()+"%'";
        }
        //前端传递了部门id，再加上部门id的条件
        if (ObjectUtil.isNotNull(query.getDeptId())){
            sql+=" and dept_id="+query.getDeptId();
        }
        //又传了性别
        if (ObjectUtil.isNotNull(query.getSex())) {
            sql += " and  emp_sex=" + query.getSex();
        }
        return executeQueryPage(sql, query.getPageNum(),query.getPageSize(), EmpBean.class);
        //如果传递了姓名，按照姓名模糊查询
    }
//    添加员工
    public int insertEmp(EmpBean emp){
        String sql = "insert into emp (emp_name, emp_sex, emp_address, emp_salary, emp_birth, dept_id)values (?,?,?,?,?,?)";
        return executeUpdate(sql,emp.getEmpName(),emp.getEmpSex(),emp.getEmpAddress(),emp.getEmpSalary(),
                emp.getEmpBirth(),emp.getDeptId());
    }
}