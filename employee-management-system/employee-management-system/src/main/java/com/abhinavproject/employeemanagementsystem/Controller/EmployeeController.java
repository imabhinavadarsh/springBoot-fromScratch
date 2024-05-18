package com.abhinavproject.employeemanagementsystem.Controller;

import com.abhinavproject.employeemanagementsystem.Entity.Employees;
import com.abhinavproject.employeemanagementsystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String viewHomePage1(Model model) {
        return "welcome_page";
    }

    @GetMapping("/viewProjectDetails")
    public String viewProjectDetails(Model model) {
        return "project_details";
    }

    @GetMapping("/getAllEmployees")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "allEmployees";
    }


    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employees employee = new Employees();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employees employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees/getAllEmployees";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
        // get employee from the service
        Employees employee = employeeService.getEmployeeById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/employees/getAllEmployees"; // Redirect to getAllEmployees after deletion
    }




}
