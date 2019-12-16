package hachi.education_management.teacher.service;

import hachi.education_management.teacher.model.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class TeacherServiceImplTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void add() {
    }

    @Test
    public void findByTeacherNo() {
    }

    @Test
    public void getTeacherListWithSubject() {
    }

    @Test
    public void checkTeacherAndGet() {
    }

    @Test
    public void findTeacherListWithSubjectAggregation() {
        List<Teacher> teacherList = teacherService.findTeacherListWithSubjectAggregation();
        System.out.println(teacherList);
        Assert.assertTrue(teacherList.size() > 0);
    }

    @Test
    public void findTeacherListWithSubjectAggregationEnhanced() {
        List<Teacher> teacherList = teacherService.findTeacherListWithSubjectAggregationEnhanced();
        System.out.println(teacherList);
        Assert.assertTrue(teacherList.size() > 0);
    }
}