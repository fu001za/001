package day1.bean;

public class DeptBean {
//    这是一个部门信息的对应类
    private Integer deptId;
    private String deptName;
    private String deptRemark;

    public DeptBean(Integer deptId, String deptName, String deptRemark) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptRemark = deptRemark;
    }

    public DeptBean() {
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptRemark() {
        return deptRemark;
    }

    public void setDeptRemark(String deptRemark) {
        this.deptRemark = deptRemark;
    }

    @Override
    public String toString() {
        return "DeptBean{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptRemark='" + deptRemark + '\'' +
                '}';
    }
}
