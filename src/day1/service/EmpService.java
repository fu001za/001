package day1.service;

import day1.bean.EmpBean;
import day1.bean.EmpQuery;
import day1.utils.Result;

public interface EmpService {
    Result findAllEmp(EmpQuery emp);

    Result addEmp(EmpBean emp);
}
