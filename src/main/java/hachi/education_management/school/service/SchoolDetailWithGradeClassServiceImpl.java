package hachi.education_management.school.service;

import hachi.education_management.school.repository.SchoolDetailWithGradeClassRepository;
import hachi.education_management.school.vo.GradeClassWithSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolDetailWithGradeClassServiceImpl implements SchoolDetailWithGradeClassService {

    @Autowired
    private SchoolDetailWithGradeClassRepository schoolDetailWithGradeClassRepository;

    @Override
    public List<GradeClassWithSchool> findByGradeClass(long schoolNo) {
        return schoolDetailWithGradeClassRepository.selectByGradeClassWithSchool(schoolNo);
    }
}
