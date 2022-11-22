package day1.service;

import day1.utils.Result;

public interface DeptService {
    Result findAllDept(Integer pageNum, Integer pageSize);
//    不分叶
    Result findAllDeptNoPage();
}
