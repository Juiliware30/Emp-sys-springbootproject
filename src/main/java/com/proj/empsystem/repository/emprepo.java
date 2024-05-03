package com.proj.empsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.empsystem.entity.emp;

@Repository
public interface emprepo extends JpaRepository<emp,Integer> {

}
