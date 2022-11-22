package day1.bean;

import java.util.Date;

public class EmpBean {
    private Integer empId;
    private String empName;
    private Integer empSex;
    private String empAddress;
    private Float empSalary;
    private Date empBirth;
    private Integer deptId;
    private DeptBean dept;//员工所属的部门

    public EmpBean(Integer empId, String empName, Integer empSex, String empAddress, Float empSalary, Date empBirth, Integer deptId) {
        this.empId = empId;
        this.empName = empName;
        this.empSex = empSex;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.empBirth = empBirth;
        this.deptId = deptId;
    }

    public DeptBean getDept() {
        return dept;
    }

    public void setDept(DeptBean dept) {
        this.dept = dept;
    }

    public EmpBean() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpSex() {
        return empSex;
    }

    public void setEmpSex(Integer empSex) {
        this.empSex = empSex;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }

    public Date getEmpBirth() {
        return empBirth;
    }

    public void setEmpBirth(Date empBirth) {
        this.empBirth = empBirth;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "EmpBean{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSex=" + empSex +
                ", empAddress='" + empAddress + '\'' +
                ", empSalary=" + empSalary +
                ", empBirth=" + empBirth +
                ", deptId=" + deptId +
                ", dept=" + dept +
                '}';
    }
}
