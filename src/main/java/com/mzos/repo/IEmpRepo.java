package com.mzos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mzos.bean.Employee;

public interface IEmpRepo extends JpaRepository<Employee, Integer> {

}
