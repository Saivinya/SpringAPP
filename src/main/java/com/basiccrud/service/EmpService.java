package com.basiccrud.service;

import com.basiccrud.entity.Employee;

public interface EmpService {
	
	Employee addEmp(Employee e);

	Employee updateEmp(Employee e, int id) throws Exception;

	Employee getEmp(int id);

	Boolean deleteEmp(int id);

}
