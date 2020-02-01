package hachi.education_management.school;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import hachi.education_management.school.service.SchoolService;
import hachi.education_management.school.model.School;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class SchoolServiceImplTest {

    @Autowired
    private SchoolService schoolService;

    @Test
    public void add() {
        // School mockSchool = new School(null, "테스트");
    }

    @Test
    public void findByNo() {
        School school = schoolService.findByNo(1);
        Assert.assertTrue(school != null);
    }

    @Test
    public void findGradeClassByGradeClassNoAndSchoolNo() {
        List<GradeClassWithStudent> gradeClassWithStudentList = schoolService.findGradeClassByGradeClassNoAndSchoolNo(1);
        Assert.assertTrue(gradeClassWithStudentList.size() >= 1);
        Assert.assertEquals(1, gradeClassWithStudentList.get(0).getStudentClassNumber());
    }

}