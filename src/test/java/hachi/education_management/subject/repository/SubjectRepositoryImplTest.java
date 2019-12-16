package hachi.education_management.subject.repository;

import hachi.education_management.subject.model.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class SubjectRepositoryImplTest {

    @Autowired
    private SubjectRepository subjectRepository;

    @Test
    public void findBySubjectNo() {
        Subject subject = subjectRepository.findBySubjectNo(1);
        Assert.assertEquals("국어", subject.getSubjectName());
    }

    @Test
    public void findListBySubjectNoList() {
        Set<Integer> subjectNoSet = new HashSet<>();
        subjectNoSet.add(1);
        subjectNoSet.add(3);
        subjectNoSet.add(5);

        List<Integer> subjectNoList = new ArrayList<>(subjectNoSet);

        List<Subject> subjectList = subjectRepository.findListBySubjectNoList(subjectNoList);
        for (Subject subject : subjectList) {
            System.out.println(subject);
        }
        Assert.assertTrue(subjectList.size() > 0);
    }
}