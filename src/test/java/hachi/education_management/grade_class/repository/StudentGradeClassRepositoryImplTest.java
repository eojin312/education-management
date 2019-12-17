package hachi.education_management.grade_class.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class StudentGradeClassRepositoryImplTest {

    @Autowired
    private StudentGradeClassRepository repository;

    @Test
    public void 학생과학년반_관계설정테이블_insret테스트() {
        int rows = repository.insert(1, 2);
        Assert.assertTrue(rows == 1);
    }
}