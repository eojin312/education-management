package hachi.education_management.school.service;

import hachi.education_management.school.repository.SchoolRepository;
import hachi.education_management.school.vo.GradeClassWithSchool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class SchoolServiceTest {

    @Autowired
    private SchoolRepository schoolRepository;

    @Test
    public void findByGradeClass() {
        List<GradeClassWithSchool> gradeClassWithSchools = schoolRepository.findByGradeClass(1);
        System.out.println(gradeClassWithSchools);
        Assert.assertTrue(gradeClassWithSchools.size() > 0);

    }
}