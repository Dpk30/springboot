package com.example.SpringBootDemo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Studentbean {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="ID")
	Integer id;
	@Column(name="NAME")
	String name;
	@Column(name="COURSE")
	String course;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	

	
}
