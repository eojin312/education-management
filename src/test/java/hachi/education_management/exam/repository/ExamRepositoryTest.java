package hachi.education_management.exam.repository;

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
        Assert.assertTrue(examStudentApplyList.size() >= 1
        );
    }
}
