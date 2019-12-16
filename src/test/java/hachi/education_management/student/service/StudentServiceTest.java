package hachi.education_management.student.service;

import hachi.education_management.student.repository.StudentRepository;
import hachi.education_management.student_grade_class.vo.StudentGradeClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class StudentServiceTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void insert() {
    }

    @Test
    public void detail() {
        StudentGradeClass studentDetail = studentRepository.detail(4);
        Assert.assertTrue(studentDetail != null);
        Assert.assertTrue(studentDetail.getStudentNo() != null);
        Assert.assertTrue(studentDetail.getSchoolNo() != null);
        System.out.println(studentDetail);
    }

    @Test
    public void checkStudentAndGet() {
    }

    @Test
    public void findByStudentNoWithGradeClass() {
        List<StudentGradeClass> studentGradeClasses = studentRepository.findByStudentNoWithGradeClass();
        for (StudentGradeClass studentGradeClass : studentGradeClasses) {
            System.out.println(studentGradeClass);
        }
        Assert.assertTrue(studentGradeClasses.size() > 0);
        Assert.assertTrue(studentGradeClasses.get(0).getStudentNo() != null);
    }
}