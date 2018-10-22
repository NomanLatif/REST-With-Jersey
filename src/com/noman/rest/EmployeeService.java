package com.noman.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.noman.rest.internal.entity.Employee;
import com.noman.rest.internal.entity.Employees;

@Path("/employees")
public class EmployeeService
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employees getAllEmployees()
	{
		Employees list = new Employees();
		list.setEmployeeList(new ArrayList<Employee>());

		list.getEmployeeList().add(new Employee(1, "Noman Latif"));
		list.getEmployeeList().add(new Employee(2, "Anders Andersson"));
		list.getEmployeeList().add(new Employee(3, "Marai Daehne"));

		return list;
	}
}
