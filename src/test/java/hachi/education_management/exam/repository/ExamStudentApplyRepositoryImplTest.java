package hachi.education_management.exam.repository;

import hachi.education_management.exam.vo.ExamStudentApply;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class ExamStudentApplyRepositoryImplTest {

    @Autowired
    private ExamStudentApplyRepository examStudentApplyRepository;

    @Test
    public void findByExamNoWithStudentNo() {
        List<ExamStudentApply> examStudentApplies = examStudentApplyRepository.findByExamNoWithStudentNo();
        for (ExamStudentApply studentApply : examStudentApplies) {
            System.out.println(studentApply);
        }
        Assert.assertTrue(examStudentApplies.size() > 0);
    }
}