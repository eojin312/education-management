package hachi.education_management.exam.repository;

import hachi.education_management.exam.vo.Exam;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class ExamRepositoryTest {
    @Autowired
    private ExamRepository examRepository;

    @Test
    public void findByExamApplyAndStudent() {
        List<ExamStudentApply> examStudentApplyList = examRepository.findByExamApplyAndStudent(1);
        for (ExamStudentApply examStudentApply : examStudentApplyList) {
            System.out.println(examStudentApplyList);
        }
        Assert.assertTrue(examStudentApplyList.size() >= 1
        );
    }

    @Test
    public void findByExam() {
        List<Exam> examList = examRepository.findByExam(1);
        Assert.assertTrue(examList.size() >= 1);
    }

    @Test
    public void findByExamDeatilForStudent() {
        List<ExamDetail> examDetails = examRepository.findByExamDeatilForStudent(1);
        Assert.assertTrue(examDetails.size() >= 1);
    }
}
