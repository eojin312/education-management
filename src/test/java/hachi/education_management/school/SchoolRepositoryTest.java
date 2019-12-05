package hachi.education_management.school;

import hachi.education_management.school.repository.SchoolRepository;
import hachi.education_management.school.model.School;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class SchoolRepositoryTest {

    @Autowired private SchoolRepository schoolRepository;

    @Test
    public void findByNoToMapTest() {
        Map<String, Object> resultMap = schoolRepository.findByNoToMap(1);
        String schoolName = (String) resultMap.get("school_name");
        long schoolNo = (long) resultMap.get("school_no");

        Assert.assertEquals("신안중", schoolName);
        Assert.assertEquals(1, schoolNo);
    }

    @Test
    public void selectByNoTest() {
        School school = schoolRepository.selectByNo(1);
        Assert.assertEquals("신안중", school.getSchoolName());
    }

    @Test
    public void inserTest() {
        Long schooNo = 0L;
        String schoolName = UUID.randomUUID().toString().substring(0,10);
        String schoolNickname = UUID.randomUUID().toString().substring(0,10);
        String grade = "S";
        String ownerType = "M";
        String useYn = "Y";
        String area = "경기";
        School mockSchool = new School(schooNo,  schoolName, schoolNickname, grade, ownerType, "", useYn, area);

        int insertedCount = schoolRepository.insert(mockSchool);
        System.out.println(mockSchool.getSchoolNo());
        System.out.println(insertedCount);

        Assert.assertTrue(insertedCount == 1);
        Assert.assertTrue(mockSchool.getSchoolNo() > 1);
    }
}

