package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.repository.TwoSumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class TwoSumService {

    @Autowired
    TwoSumRepository twoSumRepository;

    public List<Course> findAllCourses(){

        return twoSumRepository.findAllClasses();
    }

    public List<Course> searchByCourseName(String input){

        return twoSumRepository.findCourseByName(input);
    }

}
