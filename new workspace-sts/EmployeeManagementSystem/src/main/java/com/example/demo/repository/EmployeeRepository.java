package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	@Query("SELECT e FROM EmployeeEntity e WHERE e.emailId=:email AND e.password=:pass")
	public EmployeeEntity findByEmailIdAndPassword(@Param("email") String emailId,@Param("pass") String password);
    
}
