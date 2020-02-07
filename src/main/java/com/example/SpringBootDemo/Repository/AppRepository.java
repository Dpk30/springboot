package com.example.SpringBootDemo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootDemo.Entity.Studentbean;

@Repository
public interface AppRepository extends JpaRepository<Studentbean,Integer>{

	
	Optional<Studentbean> findById(Integer id);

	Optional<Studentbean> deleteById(Integer id);
	
}
