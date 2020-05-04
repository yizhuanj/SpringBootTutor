package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.repository.TwoSumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
public class TwoSumService {

    @Autowired
    TwoSumRepository twoSumRepository;
    public int[] twoSum(int target) {
        int[] nums = twoSumRepository.getNums();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{nums[i], target - nums[i]};
            }
            map.put(nums[i], i);
        }
        return null;
    }

//    public List<Course> findAllCourses(){
//
//        return twoSumRepository.findAllClasses();
//    }
//
//    public List<Course> searchByCourseName(String input){
//
//        return twoSumRepository.findCourseByName(input);
//    }

}
