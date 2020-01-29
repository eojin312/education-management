package hachi.education_management.exam.service;


import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamStudentApply;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class ExamListServiceTest {

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
        List<ExamList> examList = examService.findByExam(1);
        for (ExamList exam : examList) {
            System.out.println(exam);
        }
        Assert.assertTrue(examList.size() >= 1);
    }

    @Test
    public void insertExam() {
        long schoolNo = 1L;
        long teacherNo = 3L;
        String area = "경기";
        int grade = 2;
        int semester = 1;
        String examType = "FINAL";
        Date startDate = new Date();
        Date endDate = new Date();
        int subjectNo = 3;

        Exam exam = new Exam("2020", schoolNo, grade, semester, examType, startDate, endDate, 3, 3, 3);
        assertTrue(exam.getExamNo() == 0);

        int insertedRows = examService.insert(exam);
        assertTrue(insertedRows == 1);
        assertTrue(exam.getExamNo() > 0);
    }
}
