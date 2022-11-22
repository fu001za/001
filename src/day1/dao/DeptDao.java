package day1.dao;

import day1.bean.DeptBean;
import day1.utils.BaseDao;
import day1.utils.PageInfo;

import java.util.List;

//继承的是jdbc的工具类
public class DeptDao extends BaseDao {
//    分页
//    查看所有的部门
    /**
     * 查询所有的部门
     * @return
     */
    public PageInfo<DeptBean> seletctAll(Integer pageNum, Integer pageSize){
        //sql的列的别名和实体类的属性名对应
        String sql="select dept_id deptId, dept_name deptName, dept_remark  deptRemark from dept";
        return executeQueryPage(sql,pageNum,pageSize,DeptBean.class);
    }

    /**
     * 返回所有的部门，不分页
     * @return
     */
    public List<DeptBean>  selectAllDeptNoPage(){
        String sql="select dept_id deptId, dept_name deptName, dept_remark  deptRemark from dept";
        return  executeQueryList(sql,DeptBean.class);
    }

    /**
     * 根据主键id查询部门
     * @param did
     * @return
     */
    public DeptBean selectDeptById(Integer did){
        String sql="select dept_id deptId, dept_name deptName, dept_remark  deptRemark from dept where dept_id=?";
        return executeQueryOne(sql,DeptBean.class,did);
    }
}
