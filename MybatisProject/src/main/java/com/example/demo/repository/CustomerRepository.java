package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Customer;

@Mapper
public interface CustomerRepository {
    Customer selectById(@Param("id") Integer id);
	
	@Select("SELECT * FROM customers")
    List<Customer> selectAll();
}