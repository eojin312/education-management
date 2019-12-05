package hachi.education_management.teacher.repository;

import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class TeacherRepositoryImplTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    @Rollback(value = true)
    public void add() {

        UUID uuid = UUID.randomUUID();
        String testId = uuid.toString().substring(0,29);
        System.out.println(testId);

        Teacher teacher = new Teacher(0, "이희진"
                , "F"
                , 4356
                , 4
                , testId
                , "1234"
                , "Y"
                , 10
        );
        int lastInsertedTeacherNo = teacherRepository.add(teacher);
        Assert.assertTrue(lastInsertedTeacherNo > 0);
    }

    @Test
    public void findByTeacherNo() {
        Teacher teacher = teacherRepository.findByTeacherNo(5);
        Assert.assertEquals("김미술", teacher.getTeacherName());
        Assert.assertEquals("M", teacher.getSex());
    }

    @Test
    public void findTeacherListWithSubject() {
        List<TeacherSubject> teacherList = teacherRepository.findTeacherListWithSubject();
        for (TeacherSubject teacherSubject : teacherList) {
            System.out.println(teacherSubject);
        }
        Assert.assertTrue(teacherList.size() > 0);
        Assert.assertTrue(teacherList.get(0) != null);
    }

    @Test
    public void findByIdAndPwd() {
        Teacher teacher = teacherRepository.findByIdAndPwd("eojin312", "dldjwls02");
        Assert.assertEquals("이어진", teacher.getTeacherName());
    }
}