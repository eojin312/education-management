package hachi.education_management.grade_class.repository;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class SelectByGradeClassWithStudentNoForListRepositoryImplTest {


    @Autowired
    private SelectByGradeClassWithStudentNoForListRepository selectByGradeClassWithStudentNoForListRepository;

    @Test
    public void selectByGradeClassWithSchoolNo() {
        List<GradeClassWithStudent> gradeClassWithStudents = selectByGradeClassWithStudentNoForListRepository.selectByGradeClassWithSchoolNo(1, 1);
        System.out.println(gradeClassWithStudents);
        Assert.assertTrue(gradeClassWithStudents.size() > 0);
    }
}