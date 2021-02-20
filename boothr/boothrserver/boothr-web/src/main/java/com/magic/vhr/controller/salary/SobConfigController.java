package com.magic.vhr.controller.salary;

import com.magic.vhr.model.RespBean;
import com.magic.vhr.model.RespPageBean;
import com.magic.vhr.model.Salary;
import com.magic.vhr.service.EmployeeService;
import com.magic.vhr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author laoma
 * @create 2020-10-19 11:22
 */
@RestController
@RequestMapping("/salary/sobcfg/")
public class SobConfigController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    SalaryService salaryService;

    @GetMapping("/")
    public RespPageBean getEmployeeByPageWithSalary(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        return employeeService.getEmployeeByPageWithSalary(page,size);
    }
    @GetMapping("/salaries")
    public List<Salary> getAllSalaries(){
        return salaryService.getAllSalaries();
    }

    @PutMapping("/")
    public RespBean updateEmployeeSalaryById(Integer eid,Integer sid){
        Integer result = employeeService.updateEmployeeSalaryById(eid, sid);
        if(result==2||result == 1){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
