package com.proj.empsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.empsystem.entity.emp;
import com.proj.empsystem.repository.emprepo;

@Service
public class empservice {
	@Autowired
	private emprepo repo;
	
	public void addemp(emp e)
	{
		repo.save(e);
	}
	
	public List<emp> getAllEmp()
	{
		return repo.findAll();
	}
	
	public emp getEmpById(int id)
	{
		Optional<emp> e=repo.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
}
