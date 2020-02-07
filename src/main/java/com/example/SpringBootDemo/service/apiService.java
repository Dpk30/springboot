package com.example.SpringBootDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.Entity.Studentbean;
import com.example.SpringBootDemo.Repository.AppRepository;

@Service
public class apiService {

	@Autowired
	AppRepository repo;
	
	
	
	public apiService() {
		// TODO Auto-generated constructor stub
	}

	
	public Studentbean saveOrUpdateStudent(Studentbean entity) {
		Optional<Studentbean> student=repo.findById(entity.getId());
		
		
		if(student.isPresent()) 
        {
			Studentbean newEntity = student.get();
            newEntity.setId(entity.getId());
            newEntity.setName(entity.getName());
            newEntity.setCourse(entity.getCourse());
 
            newEntity = repo.save(newEntity);
             
            return newEntity;
        } else {
            entity = repo.save(entity);
             
            return entity;
        }
		
			
	}
	
	
	
	public List<Studentbean> getAllStudent()
    {
        List<Studentbean> List = repo.findAll();
         
        if(List.size() > 0) {
            return List;
        } else {
            return new ArrayList<Studentbean>();
        }
    }


	public void deleteStudentById(Integer id) {
		 Optional<Studentbean> employee = repo.findById(id);
         
	        if(employee.isPresent()) 
	        {
	            repo.delete(id);
	        } else {
	           System.out.println("No employee record exist for given id");
	        }
	    
	       
		
	}


	public Studentbean updateStudent(Studentbean studentbean) {
		Studentbean s=repo.findOne(studentbean.getId());
		
		s.setId(studentbean.getId());
		s.setName(studentbean.getName());
		s.setCourse(studentbean.getCourse());
		repo.save(s);
		return s;
	}


	public Studentbean updatepStudent(Studentbean studentbean,Integer id) {
		Studentbean s=repo.findOne(id);
		if(studentbean.getId()!=null)
			s.setId(studentbean.getId());
		if(studentbean.getName()!=null)
			s.setName(studentbean.getName());
		if(studentbean.getCourse()!=null)
			s.setCourse(studentbean.getCourse());
		
		
		repo.save(s);
		return s;
	}
	
	
	
	
}
