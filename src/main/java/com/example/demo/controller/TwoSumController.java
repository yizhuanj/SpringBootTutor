package com.example.demo.controller;

import com.example.demo.modal.Course;
import com.example.demo.service.TwoSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// single function interface
@RestController
@RequestMapping
public class TwoSumController {

    @Autowired // IOC 控制反转
    TwoSumService twoSumService; // Singleton
    //依赖注入 Dependency Injection
    @GetMapping(path = "/twosum/{target}", produces = "application/json")
    public HttpEntity twoSum(@PathVariable("target") int target) {
        int[] result = twoSumService.twoSum(target);
        return new ResponseEntity(result, HttpStatus.OK);
    }
//    @GetMapping(path = "/", produces = "application/json") //如果你用get方法 call我这个地址
//    public HttpEntity findAllCourses(){
//        List<Course> allCourses = twoSumService.findAllCourses(); //我就帮你用这个方法来处理这个请求
//
//        return new ResponseEntity<>(allCourses,HttpStatus.OK); // 我返回结果给你
//    }


//    @GetMapping(path = "/twosum/{inputtarget}", produces = "application/json")
//    public HttpEntity<Course> searchCourse(@PathVariable("inputtarget") int inputtarget) {
//
//        List<Course> findedCourse = twoSumService.searchByCourseName(inputtarget);
//
//        return new ResponseEntity(findedCourse, HttpStatus.OK);
//    }
}


