package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    /**
    * 新增员工
    * */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 分页查询
     * @param startOrStop
     * @return
     */
    void startOrStop(Integer status, long id);

    /**
     * 根据id查询员工
     * @param getById
     * @return
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param update
     * @return
     */
    void update(EmployeeDTO employeeDTO);
}
