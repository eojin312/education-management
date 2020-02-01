package hachi.education_management.school;

import hachi.education_management.grade_class.vo.GradeClassWithStudent;
import hachi.education_management.school.repository.SchoolRepository;
import hachi.education_management.school.model.School;
import hachi.education_management.school.vo.GradeClassWithSchool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:mvc-config.xml"})
public class SchoolRepositoryTest {

    @Autowired private SchoolRepository schoolRepository;

    @Test
    public void 학교를map으로여러조건넣어서가지고오기() {
        Map<String, Object> resultMap = schoolRepository.findByNoToMap(1);
        String schoolName = (String) resultMap.get("school_name");
        long schoolNo = (long) resultMap.get("school_no");

        Assert.assertEquals("부림중", schoolName);
        Assert.assertEquals(1, schoolNo);
    }

    @Test
    public void 학교번호로학교상세정보가지오기() {
        School school = schoolRepository.findBySchoolNo(1);
        Assert.assertTrue(school != null);
    }

    @Test
    public void 학교저장하기() {
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

    @Test
    public void 반일련번호로_해당반의_학생리스트를_가지고오기() {
        List<GradeClassWithStudent> gradeClassWithStudentList = schoolRepository.findStudentByGradeClassAndSchoolNo(1);
        Assert.assertTrue(gradeClassWithStudentList.size() >= 1);
        Assert.assertEquals(1, gradeClassWithStudentList.get(0).getStudentClassNumber());
        System.out.println(gradeClassWithStudentList);
    }

    @Test
    public void 특정학교의학년반리스트가지고오기() {
        List<GradeClassWithSchool> gradeClassWithSchools = schoolRepository.findGradeClassWithSchoolBySchoolNo(1);
        System.out.println(gradeClassWithSchools);
        Assert.assertTrue(gradeClassWithSchools.size() > 0);
    }
}

