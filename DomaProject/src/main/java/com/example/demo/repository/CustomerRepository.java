package com.example.demo.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.Customer;

@Dao
@ConfigAutowireable
public interface CustomerRepository {

	@Select
	List<Customer> selectAll();
}