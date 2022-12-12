package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AddressEntity;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;
    
	@Autowired
	ModelMapper mapper;

	
	
//	@Override
//	public Employee loginEmployee( Employee employee)  {
//		EmployeeEntity employeeEntity = null;
//		BeanUtils.copyProperties(employee, employeeEntity);
//		
//		String temailId = employee.getEmailId();
//		
//		String tpassword = employee.getPassword();
//
//		if (temailId != null && tpassword != null) {
//
//	         employeeEntity = employeerepository.findByEmailIdAndPassword(temailId, tpassword);
//
//			
//		}
	@Override
	public EmployeeEntity loginEmployee( EmployeeEntity employee)  {
		EmployeeEntity employeeEntity = null;
		//BeanUtils.copyProperties(employee, employeeEntity);
		
		String temailId = employee.getEmailId();
		
		String tpassword = employee.getPassword();

		if (temailId != null && tpassword != null) {

	         employeeEntity = employeerepository.findByEmailIdAndPassword(temailId, tpassword);

			
		}
		return employee;
	}
//		if (employeeEntity == null) {
//
//			throw new Exception("Invalide Credentials");
//			// ResponseEntity.badRequest();
//		}
//
//		return employee;
//
//	}

//	public Employee registerNewEmployee(@RequestBody Employee employee) throws Exception {
//
//		String tempEmailId = employee.getEmailId();
//		
//
//		if (tempEmailId != null && !"".equals(tempEmailId)) {
//
//			Employee empobj = employeeRepository.findByEmailId(tempEmailId);
//
//			if (empobj != null) {
//				try {
//					throw new Exception("User with" + tempEmailId + "is already Exists");
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		Employee empobj = null;
//		
////		employee.setPassword(this.bCryptPasswordEncoder.encode(employee.getPassword()));
//
//		empobj = saveEmployee(employee);
//		return empobj;
//	}
	
	@Override
	
	public Employee createEmployee(Employee employee) {
	//	this.mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
//System.out.println(employee);
		// TODO Auto-generated method stub
//		EmployeeEntity employeeEntity = new EmployeeEntity();
//		BeanUtils.copyProperties(employee, employeeEntity);
					//EmployeeEntity entity = mapper.map(employee, EmployeeEntity.class);
		EmployeeEntity entity=mapper.map(employee, EmployeeEntity.class);
		AddressEntity addentity=mapper.map(employee.getAddress(), AddressEntity.class);
		entity.setAddress(addentity);
		
		
		//entity.getAddress(employee.getAddress().getCorrespondingAddress());
//		System.out.println(entity);
	//	AddressEntity addressEntity = mapper.map(employee, AddressEntity.class);
	//	entity.setAddress(addressEntity);
		EmployeeEntity employeeEntity = employeerepository.save(entity);
		Employee employee2 = mapper.map(employeeEntity,Employee.class);
		System.out.println(employee2);

		return employee2;
	}

//	@Override
//	public List<Employee> getAllEmployee() {
//		// TODO Auto-generated method stub
//		List<EmployeeEntity> employeeEntities=employeerepository.findAll();
//		List<Employee> employees=employeeEntities.stream().map(emp->new Employee(
//				emp.getId(),
//				emp.getFirstName(),
//				emp.getLastName(),
//				emp.getMiddleName(),
//				emp.getEmailId(),
//				emp.getMobileNumber(),
//				emp.getPassword(),
////				emp.getPermanentAddress(),
////				emp.getCorrespondingAddress(),
////				emp.getCity(),
////				emp.getPincode(),
////				emp.getState(),
////				emp.getCountry(),
//				emp.getCurrentRole(),
//				emp.getLastOrganization(),
//				emp.getEmergencyContactNumber(),
//				emp.getCurrentCTC(),
//				emp.getYearOfExperience(),
//				emp.getSalary()
//			//	emp.getAddress()
//				)).collect(Collectors.toList());
//		
//		return employees;
//	
//	
//	}
//	
//	@Override
//	public List<EmployeeEntity> getAllEmployee() {
//		// TODO Auto-generated method stub
//		List<EmployeeEntity> employeeEntities=employeerepository.findAll();
////		List<EmployeeEntity> employees=employeeEntities.stream().map(emp->new EmployeeEntity(
////				emp.getId(),
////				emp.getFirstName(),
////				emp.getLastName(),
////				emp.getMiddleName(),
////				emp.getEmailId(),
////				emp.getMobileNumber(),
////				emp.getPassword(),
//////				emp.getPermanentAddress(),
//////				emp.getCorrespondingAddress(),
//////				emp.getCity(),
//////				emp.getPincode(),
//////				emp.getState(),
//////				emp.getCountry(),
////				emp.getCurrentRole(),
////				emp.getLastOrganization(),
////				emp.getEmergencyContactNumber(),
////				emp.getCurrentCTC(),
////				emp.getYearOfExperience(),
////				emp.getSalary(),emp.getAddress()
////				)).collect(Collectors.toList());
//		
//		return employeeEntities;
//	
//	
//	}
	
	
	@Override
	public List<Employee> getAllEmployee() {
		
		
		this.mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		// TODO Auto-generated method stub
		List<EmployeeEntity> employeeEntities=employeerepository.findAll();
		return employeeEntities.stream().map(c->this.mapper.map(c, Employee.class)).collect(Collectors.toList());
	
//		List<Employee> list=new ArrayList<>();
//		Employee e=new Employee();
//		for (EmployeeEntity employeeEntity : employeeEntities) {
//			
////			e.setId(employeeEntity.getId());
////			e.setFirstName(employeeEntity.getFirstName());
////			e.setLastName(employeeEntity.getLastName());
////			e.setMiddleName(employeeEntity.getMiddleName());
////			e.setEmailId(employeeEntity.getEmailId());
////			e.setMobileNumber(employeeEntity.getMobileNumber());
////			e.setPassword(employeeEntity.getPassword());
////			e.setCurrentRole(employeeEntity.getCurrentRole());
////			e.setLastOrganization(employeeEntity.getLastOrganization());
////			e.setEmergencyContactNumber(employeeEntity.getEmergencyContactNumber());
////			e.setCurrentCTC(employeeEntity.getCurrentCTC());
////			e.setYearOfExperience(employeeEntity.getYearOfExperience());
////			e.setSalary(employeeEntity.getSalary());
////			e.setAddress(employeeEntity.getAddress());
//			Employee employee = mapper.map(employeeEntity, Employee.class);
//		
//		Address address = mapper.map(employeeEntity, Address.class);
//		employee.setAddress(address);
//			list.add(e);
//		}
//		return list;
	}


//	emp.getCurrentRole(),
//	emp.getLastOrganization(),
//	emp.getEmergencyContactNumber(),
//	emp.getCurrentCTC(),
//	emp.getYearOfExperience(),
//	emp.getSalary()
	@Override
	public boolean deleteEmployee(long id) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity=employeerepository.findById(id).get();
		employeerepository.delete(employeeEntity);
		
		return true;
	}

	@Override
	public EmployeeEntity getEmployeeById(long id) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity=employeerepository.findById(id).get();
//		Employee employee=new Employee();
//		BeanUtils.copyProperties(employeeEntity, employee);
		return employeeEntity;
	}

	@Override
	public Employee updateEmployee(long id, Employee employee ) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity=employeerepository.findById(id).get();
		employeeEntity.setFirstName(employee.getFirstName());
		employeeEntity.setLastName(employee.getLastName());
		employeeEntity.setMiddleName(employee.getMiddleName());
		employeeEntity.setEmailId(employee.getEmailId());
		employeeEntity.setMobileNumber(employee.getMobileNumber());
		employeeEntity.setPassword(employee.getPassword());
//		employeeEntity.setPermanentAddress(employee.getPermanentAddress());
//		employeeEntity.setCorrespondingAddress(employee.getCorrespondingAddress());
//		employeeEntity.setCity(employee.getCity());
//		employeeEntity.setPincode(employee.getPincode());
//		employeeEntity.setState(employee.getState());
//		employeeEntity.setCountry(employee.getCountry());
		employeeEntity.setCurrentRole(employee.getCurrentRole());
		employeeEntity.setLastOrganization(employee.getLastOrganization());
		employeeEntity.setEmergencyContactNumber(employee.getEmergencyContactNumber());
		employeeEntity.setCurrentCTC(employee.getCurrentCTC());
		employeeEntity.setYearOfExperience(employee.getYearOfExperience());
		employeeEntity.setSalary(employee.getSalary());
		AddressEntity addressEntity=new AddressEntity();
		addressEntity.setAddressId(id);
		addressEntity.setCity(employee.getAddress().getCity());
		addressEntity.setCorrespondingAddress(employee.getAddress().getCorrespondingAddress());
		addressEntity.setCountry(employee.getAddress().getCountry());
		addressEntity.setPermanentAddress(employee.getAddress().getPermanentAddress());
		addressEntity.setState(employee.getAddress().getState());
		addressEntity.setPincode(employee.getAddress().getPincode());
		employeeEntity.setAddress(addressEntity);
//		
//		employeeEntity.getAddress().setAddressId(id);;
//		employeeEntity.getAddress().setCorrespondingAddress(employee.getAddress().getCorrespondingAddress());
//		employeeEntity.getAddress().setPermanentAddress(employee.getAddress().getPermanentAddress());
//		employeeEntity.getAddress().setCity(employee.getAddress().getCity());
//		employeeEntity.getAddress().setPincode(employee.getAddress().getPincode());
//		employeeEntity.getAddress().setState(employee.getAddress().getState());
//		employeeEntity.getAddress().setCountry(employee.getAddress().getCountry());
		EmployeeEntity entity = employeerepository.save(employeeEntity);
		
	System.out.println(entity);
	
		return employee;
		
	}




}
