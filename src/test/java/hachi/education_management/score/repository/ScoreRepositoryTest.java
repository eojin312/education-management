package hachi.education_management.score.repository;

import hachi.education_management.score.vo.ScoreWithStudent;
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
public class ScoreRepositoryTest {

    @Autowired
    private ScoreRepository scoreRepository;

    @Test
    public void selectByScoreNoWithStudentNo() {
        List<ScoreWithStudent> scoreWithStudents = scoreRepository.selectByScoreNoWithStudentNo();
        Assert.assertTrue(scoreWithStudents.size() > 0);
    }
}