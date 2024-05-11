package com.spring.session.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.session.model.Employee;
import com.spring.session.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService empserv;
	
	@Autowired(required = true)
	@Qualifier("empserv")
	public void setEmployeeService(EmployeeService empser)
	{
		this.empserv=empser;
	}
	
	@RequestMapping(value ="/",method = RequestMethod.GET)
	public String home(Model model)
	{
		return "Home-Page";
	}
	
	@RequestMapping(value="/List",method=RequestMethod.GET)
	public String listEmployees(Model model)
	{
		model.addAttribute("employee",new Employee());
		model.addAttribute("listEmployee",this.empserv.listEmployee());
		return "Employees";
	}
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public String newEmployee(Model model)
	{
		model.addAttribute("employee",new Employee());
		model.addAttribute("listEmployee",this.empserv.listEmployee());
		return "AddEmployee";
	}
	
	@RequestMapping(value="/jspToController",method=RequestMethod.POST)
	public String jspToController(@ModelAttribute("employee") Employee emp)
	{
		if(emp.getEmpId()==0)
		{
			this.empserv.addEmployee(emp);
		}
		else
		{
			this.empserv.updateEmployee(emp);
		}
		
		return "redirect:/List";
	}
	
	@RequestMapping(value="/remove/{id}",method=RequestMethod.GET)
	public String removeEmployee(@PathVariable("id") int id)
	{
		this.empserv.removeEmployee(id);
		return "redirect:/List";
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editEmployee(@PathVariable("id") int id,Model model)
	{
		model.addAttribute("employee",this.empserv.getEmployeeById(id));
//		model.addAttribute("listEmployee",this.empserv.listEmployee());
		return "updateEmployee";
	}
	
	@RequestMapping(value="/updateRec",method=RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee") Employee emp)
	{
		this.empserv.updateEmployee(emp);
		return "redirect:/List";
	}

}
