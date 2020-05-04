package com.example.demo;

import com.example.demo.modal.Course;
import com.example.demo.repository.TwoSumRepository;
import com.example.demo.service.TwoSumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class TwoSumServiceUnitTest {
    @Mock
    private TwoSumService twoSumService;

    @Mock
    private TwoSumRepository twoSumRepository;

    @Test
    public void testCourseService(){
        List<Course> courseList = new ArrayList<>();

        given(twoSumRepository.findAllClasses()).willReturn(courseList);

        List<Course> result = twoSumService.findAllCourses();

        assertTrue(result.isEmpty());
    }

}
