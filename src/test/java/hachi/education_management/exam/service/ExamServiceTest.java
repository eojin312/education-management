package hachi.education_management.exam.service;


import hachi.education_management.exam.model.Exam;
import hachi.education_management.exam.vo.ExamDetail;
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
/**
 *  시험 service 테스트
 */
public class ExamServiceTest {

    @Autowired
    private ExamService examService;

    @Test
    public void 특정학생시험응시리스트테스트() {
        List<ExamStudentApply> examStudentApplyList = examService.findExamApplyListByStudentApplyNo(1);
        for (ExamStudentApply examStudentApply : examStudentApplyList) {
            System.out.println(examStudentApplyList);
        }
        Assert.assertTrue(examStudentApplyList.size() >= 1);
    }

    @Test
    public void 특정학년시험정보리스트테스트() {
        List<ExamList> examList = examService.findExamListByGradeNo(1);
        for (ExamList exam : examList) {
            System.out.println(exam);
        }
        Assert.assertTrue(examList.size() >= 1);
    }

    @Test
    public void 특정시험상세목록테스트() {
        List<ExamDetail> examDetails = examService.getExamDeatilListByExamNoAndStudentNo(1, 1);
        for (ExamDetail examDetail : examDetails) {
            System.out.println(examDetail);
        }
        assertTrue(examDetails.size() >= 1);
    }

    @Test
    public void 시험정보등록테스트() {
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
