package hachi.education_management.teacher.repository;

import hachi.education_management.teacher.model.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository repository;

    @Test
    public void findByIdAndPwd() throws NoSuchAlgorithmException {
        final String id = "eojin312";
        final String pwd = "dldjwls02";
        Teacher teacher = repository.findByIdAndPwd(id, pwd);
        Assert.assertEquals("이어진", teacher.getTeacherName());
    }
}