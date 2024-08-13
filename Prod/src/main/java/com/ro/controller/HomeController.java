package com.ro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.ro.Dao.Dao;
import com.ro.Dao.DaoAg;
//import com.ro.Dao.Daoimpl;
import com.ro.model.Emp;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private DaoAg empDao;
	
	@RequestMapping(path = "/home")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(path = "/empget")
	public String show() {
		return "add_emp";
	}
	
	@RequestMapping(path = "/Lists")
	public  String getEmployees(Model m) {
		// Fetch the list of employees from the DAO
		List<Emp> employeeList = empDao.getAllEmp();
		System.out.println(employeeList);
		
		// Add the list to the model
	m.addAttribute("employees", employeeList);
		
		// Return the view name (JSP page)
		return "list";
	}
	
//	@RequestMapping(path = "/createe",method = RequestMethod.POST)
//	public String create(@ModelAttribute Emp emp,HttpSession session) {
//		System.out.println(emp);
//		int i = empDao.saveEmp(emp);
//		session.setAttribute("msg", "sussec");
//		return "redirect:/empget";
//	}
	
	 @RequestMapping(path = "/createe", method = RequestMethod.POST)
	    public String create(@ModelAttribute Emp emp, HttpSession session, Model model) {
	        // Validate on the backend
	        if (emp.getId() == null || emp.getId() <= 0 || emp.getName().isEmpty() || 
	            emp.getEmail().isEmpty() || emp.getNumber().isEmpty() || emp.getProduct().isEmpty()) {
	            model.addAttribute("error", "All fields are required and must be valid.");
	            model.addAttribute("emp", emp);
	            return "add_emp";
	        }
	        
	        int i = empDao.saveEmp(emp);
	        session.setAttribute("msg", "success");
	        return "redirect:/empget";
	    }
	
	
	@RequestMapping(path = "/edit/{id}")
    public String edit(@PathVariable("id") int id, Model m) {
        Emp emp = empDao.getEmpById(id);
        m.addAttribute("emp", emp);
        return "edit";
    }
	
	
	@RequestMapping(path = "/updateEmp", method= RequestMethod.POST)
	public String updateEmp(@ModelAttribute Emp emp) {
		empDao.update(emp);
		return "redirect:/Lists";
	}
	
	@RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model m) {
       empDao.deleteEmp(id);
        return "redirect:/Lists";
    }
	
	

}
