package com.basiccrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basiccrud.entity.Employee;
import com.basiccrud.repo.EmpRepo;

@Service
public class EmpSeviceImpl implements EmpService {

	@Autowired
	private EmpRepo  empRepoo;
	
	@Override
	public Employee addEmp(Employee e) {
		// TODO Auto-generated method stub
		Employee e1 = empRepoo.save(e);

		return empRepoo.save(e);
	}

	@Override
	public Employee updateEmp(Employee e, int id) throws Exception {
		Employee e1 = empRepoo.findById(id).get();
		if(e1==null)
		{
			throw new Exception("Employee doesn not exist by id :"+id);
			
		}
		return empRepoo.save(e);
	}

	@Override
	public Employee getEmp(int id) {
		// TODO Auto-generated method stub
		return empRepoo.findById(id).get();
	}

	@Override
	public Boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
	 empRepoo.deleteById(id);
	 return true;
	}

}
