package hachi.education_management.school.repository;

import hachi.education_management.grade_class.repository.StudentGradeClassRepository;
import hachi.education_management.grade_class.vo.GradeClass;
import hachi.education_management.school.vo.GradeClassWithSchool;
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
public class SelectByGradeClassWithStudentRepositoryImplTest {

    @Autowired
    private SelectByGradeClassWithSchoolRepository selectByGradeClassWithSchoolRepository;

    @Test
    public void selectByGradeClassWithSchool() {
        List<GradeClassWithSchool> gradeClassWithSchools = selectByGradeClassWithSchoolRepository.selectByGradeClassWithSchool(1);
        System.out.println(gradeClassWithSchools);
        Assert.assertTrue(gradeClassWithSchools.size() > 0);
    }
}