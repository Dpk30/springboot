package com.example.SpringBootDemo.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBootDemo.Entity.Studentbean;
import com.example.SpringBootDemo.service.apiService;

@RestController
//@RequestMapping("/student")
public class simpleController {

	@Autowired
	apiService service;

	public simpleController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/addStudent")
	public ModelAndView add(Studentbean studentBean) {
		ModelAndView mv = new ModelAndView();
		mv.addObject(studentBean);
		mv.setViewName("add");
		System.out.println(studentBean.toString());
		// repo.save(studentBean);
		return mv;
	}

	@RequestMapping("/")
	public String gethome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		return "add";
	}

	@GetMapping("/")
	public ResponseEntity<List<Studentbean>> getAllStudent() {
		List<Studentbean> list = service.getAllStudent();

		return new ResponseEntity<List<Studentbean>>(list, HttpStatus.OK);

	}

	@GetMapping("/test/")
	public ResponseEntity<String> test(@RequestParam("id") int id ) {
		return new ResponseEntity<>("welcome "+id+" "+" ", HttpStatus.OK);
	}

	@PostMapping("/saveStudent")
	public ResponseEntity<Studentbean> saveOrUpdateStudent(@RequestBody Studentbean studentbean) {

		//Studentbean stu = service.saveOrUpdateStudent(studentbean);
		return new ResponseEntity<Studentbean>(service.saveOrUpdateStudent(studentbean),HttpStatus.OK);
	}

	
	 @DeleteMapping("/student/{id}")
	    public String deleteStudentById(@PathVariable("id") Integer id) 
	                                                 {
	        service.deleteStudentById(id);
	        return "Deleted";
	    }
	
	 @PutMapping("/student")
	 public ResponseEntity<Studentbean> updateStudent(@RequestBody  Studentbean studentbean ){
		 
		 return new ResponseEntity<Studentbean>(service.updateStudent(studentbean),HttpStatus.OK);
	 }
	 
	 @PatchMapping("/student/{id}")
 public ResponseEntity<Studentbean> updatepStudent(@RequestBody  Studentbean studentbean ,@PathVariable("id") Integer id ){
		 
		 return new ResponseEntity<Studentbean>(service.updatepStudent(studentbean, id),HttpStatus.OK);
	 }
	 
}
