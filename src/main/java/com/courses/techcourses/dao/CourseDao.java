package com.courses.techcourses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.techcourses.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long> {
	//the implementation class of this interface will be created at run time when object is created in 
	//service class
}
