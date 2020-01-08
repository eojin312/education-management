package hachi.education_management.exam.service;


import hachi.education_management.exam.vo.Exam;
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
public class ExamServiceTest {

    @Autowired
    private ExamService examService;

    @Test
    public void findByExamApplyAndStudent() {
        List<ExamStudentApply> examStudentApplyList = examService.findByExamApplyAndStudent(1);
        for (ExamStudentApply examStudentApply : examStudentApplyList) {
            System.out.println(examStudentApplyList);
        }
        Assert.assertTrue(examStudentApplyList.size() >= 1);
    }

    @Test
    public void findByExam() {
        List<Exam> examList = examService.findByExam(1);
        for (Exam exam : examList) {
            System.out.println(exam);
        }
        Assert.assertTrue(examList.size() >= 1);
    }
}
