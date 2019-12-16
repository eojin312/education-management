package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.repository.StudentRepository;
import hachi.education_management.student_grade_class.vo.StudentGradeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public long insert(Student student) {
        studentRepository.insert(student);
        return student.getStudentNo();
    }

    @Override
    public StudentGradeClass detail(long studentNo) {
        return studentRepository.detail(studentNo);
    }

    @Override
    public List<StudentGradeClass> findByStudentNoWithGradeClass() {
        return studentRepository.findByStudentNoWithGradeClass();
    }

    @Override
    public Student checkStudentAndGet(String id, String pwd) {
        Student student = studentRepository.findByIdAndPwd(id, pwd);
        return student ;
    }
}