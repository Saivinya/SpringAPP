package com.basiccrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.basiccrud.entity.Employee;

@EnableJpaRepositories
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
