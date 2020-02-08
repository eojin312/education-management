package hachi.education_management.student.repository;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentDetail;
import hachi.education_management.student.vo.StudentSchool;
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
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void insertTest() {
        String name = UUID.randomUUID().toString().substring(0,10);
        String id = UUID.randomUUID().toString().substring(0, 10);
        String juminNo = UUID.randomUUID().toString().substring(0,10);
        String sex = "M";
        Student mockStudent = new Student(name, juminNo, sex, id, "1234");

        int lastInsertedStudentNo = studentRepository.insertIntoStudent(mockStudent);
        System.out.println(lastInsertedStudentNo);

        Assert.assertTrue(lastInsertedStudentNo == 1);
    }

    @Test
    public void 학교학급등의정보를담은학생리스트가지고오기() {
        List<StudentSchool> studentSchoolList = studentRepository.findStudentSchool();
        for(StudentSchool studentSchool : studentSchoolList) {
            System.out.println(studentSchool);
        }
        Assert.assertTrue(studentSchoolList.size() > 0);
    }

    @Test
    public void 학생리스트_페이징으로_가져오기() {
        List<StudentDetail> studentDetailList = studentRepository.findStudentDetailList(10, 10, "desc");
        Assert.assertTrue(studentDetailList.size() > 0);
        for (StudentDetail studentDetail : studentDetailList) {
            System.out.println(studentDetail);
        }
    }

    @Test
    public void 학생리스트_COUNT조회() {
        long totalCount = studentRepository.findStudentDetailListCount();
        Assert.assertTrue(totalCount >= 0);
        System.out.println(totalCount);
    }
}
