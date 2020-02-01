package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.repository.StudentRepository;
import hachi.education_management.student.vo.StudentDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class StudentServiceTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Test
    public void 학생만들기테스트() {

        String name = UUID.randomUUID().toString().substring(0, 10);
        String id = UUID.randomUUID().toString().substring(0, 10);
        String juminNo = UUID.randomUUID().toString().substring(0, 10);
        String sex = "M";
        Student mockStudent = new Student(name, juminNo, sex, id, "1234");

        long studentNo = studentService.createStudent(mockStudent, 3L);

        Assert.assertTrue(studentNo > 0);
        System.out.println(studentNo);
    }

    @Test
    public void 특정학생의상세정보조회() {
        StudentDetail studentDetail = studentRepository.findStudentDetailByStudentNo(4);
        Assert.assertTrue(studentDetail != null);
        Assert.assertTrue(studentDetail.getStudentNo() != null);
        Assert.assertTrue(studentDetail.getSchoolNo() != null);
        System.out.println(studentDetail);
    }

    @Test
    public void 학생전체리스트조회() {
        List<StudentDetail> studentDetails = studentRepository.findStudentDetailList();
        for (StudentDetail studentDetail : studentDetails) {
            System.out.println(studentDetail);
        }
        Assert.assertTrue(studentDetails.size() > 0);
        Assert.assertTrue(studentDetails.get(0).getStudentNo() != null);
    }
}