package com.courses.techcourses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.techcourses.dao.CourseDao;
import com.courses.techcourses.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getAllCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long id) {
		return courseDao.getReferenceById(id);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long id) {
		Course entity = courseDao.getReferenceById(id);
		courseDao.delete(entity);		
	}
}