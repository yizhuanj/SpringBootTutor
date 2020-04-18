package com.example.demo.controller;

import com.example.demo.modal.Course;
import com.example.demo.modal.dto.CourseDto;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// single function interface
@RestController
@RequestMapping
public class CourseController {

    @Autowired //1、Autowired 既实现了 IOC=inverse of control=控制反转，并由spring bean来管理lifecycle(什么时候产生，什么时候销毁) 2、还实现了 依赖注入=Dependency Injection，依赖于courseService
    CourseService courseService; // Singleton


    @GetMapping(path = "/", produces = "application/json") //如果你用get方法 call我这个地址
    public HttpEntity findAllCourses(){
        List<Course> allCourses = courseService.findAllCourses(); //我就帮你用这个方法来处理这个请求

        return new ResponseEntity<>(allCourses,HttpStatus.OK); // 我返回结果给你
    }

//    @GetMapping(path = "/api/course/findAllCourses", produces = "application/json")
//    public HttpEntity<List<CourseDto>> findAllCourses(){
//        List<CourseDto> allCourses = courseService.findAllCourses();
//
//        return new ResponseEntity<>(allCourses, HttpStatus.OK);
//    }

    @GetMapping(path = "/look-up/{inputString}", produces = "application/json")
    public HttpEntity<Course> searchCourse(@PathVariable("inputString") String inputString) {

        List<Course> findedCourse = courseService.searchByCourseName(inputString);

        return new ResponseEntity(findedCourse, HttpStatus.OK);
    }

//    @PostMapping()
//    @DeleteMapping()
//    @
}

// 增加一个课程/删除一个课程/更新一个课程信息
