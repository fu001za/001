package day1.bean;

public class EmpQuery {
    private  Integer pageNum;
    private Integer pageSize;
    private String empName;
    private String sex;
    private String deptId;

    public EmpQuery(Integer pageNum, Integer pageSize, String empName, String sex, String deptId) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.empName = empName;
        this.sex = sex;
        this.deptId = deptId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}
