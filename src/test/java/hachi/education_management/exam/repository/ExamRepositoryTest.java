package hachi.education_management.exam.repository;

import hachi.education_management.exam.vo.ExamList;
import hachi.education_management.exam.vo.ExamDetail;
import hachi.education_management.exam.vo.ExamStudentApply;
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
 * 시험 repository 테스트
 */
public class ExamRepositoryTest {
    @Autowired
    private ExamRepository examRepository;

    @Test
    public void 특정학생시험응시리스트테스트() {
        List<ExamStudentApply> examStudentApplyList = examRepository.findExamApplyListByStudentApplyNo(1);
        for (ExamStudentApply examStudentApply : examStudentApplyList) {
            System.out.println(examStudentApplyList);
        }
        assertTrue(examStudentApplyList.size() >= 1
        );
    }

    @Test
    public void 특정학년시험정보리스트테스트() {
        List<ExamList> examList = examRepository.findExamListByGradeNo(1);
        assertTrue(examList.size() >= 1);
    }

    @Test
    public void 특정시험상세목록테스트() {
        List<ExamDetail> examDetails = examRepository.findExamDeatilListByExamNoAndStduentNo(1, 1);
        for (ExamDetail examDetail : examDetails) {
            System.out.println(examDetail);
        }
        assertTrue(examDetails.size() >= 1);
    }

    @Test
    public void insertExam() {
        long schoolNo = 1L;
        long teacherNo = 1L;
        String area = "경기";
        int grade = 2;
        int semester = 1;
        String examType = "MIDDLE";
        Date startDate = new Date();
        Date endDate = new Date();
        int subjectNo = 1;

        hachi.education_management.exam.model.Exam exam = new hachi.education_management.exam.model.Exam("2020", schoolNo, grade, semester, examType, startDate, endDate, 1, 1, 1);
        assertTrue(exam.getExamNo() == 0);

        int insertedRows = examRepository.insert(exam);
        assertTrue(insertedRows == 1);
        assertTrue(exam.getExamNo() > 0);
    }
}
