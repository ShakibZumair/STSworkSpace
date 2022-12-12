//package com.example.demo.service;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.entity.AddressEntity;
//import com.example.demo.entity.EmployeeEntity;
//import com.example.demo.model.Address;
//import com.example.demo.repository.AddressRepository;
//
//@Service
//public class AddressServiceImpl implements AddressService {
//
//	@Autowired
//	AddressRepository addressRepository;
//	@Override
//	public Address createEmployee(Address address) {
//		// TODO Auto-generated method stub
//		AddressEntity aEntity=new AddressEntity();
//		BeanUtils.copyProperties(address, aEntity);
//		addressRepository.save(aEntity);
//		return address;
//		
//	
//	}
//
//}
