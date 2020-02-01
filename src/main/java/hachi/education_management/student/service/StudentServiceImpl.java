package hachi.education_management.student.service;

import hachi.education_management.grade_class.repository.StudentGradeClassRepository;
import hachi.education_management.student.model.Student;
import hachi.education_management.student.repository.StudentRepository;
import hachi.education_management.student.vo.StudentDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentGradeClassRepository stduentGradeClassRepository;


    @Override
    public StudentDetail findStudentDetailByStudentNo(long studentNo) {
        return studentRepository.findStudentDetailByStudentNo(studentNo);
    }

    @Override
    public List<StudentDetail> getStudentDetailList() {
        return studentRepository.findStudentDetailList();
    }

    @Override
    public Student checkStudentAndGet(String id, String pwd) {
        Student student = studentRepository.findByIdAndPwd(id, pwd);
        return student ;
    }

    @Override
    @Transactional
    public long createStudent(Student student, long gradeClassNo) {
        studentRepository.insertIntoStudent(student);
        final long studentNo = student.getStudentNo();
        stduentGradeClassRepository.insert(studentNo, gradeClassNo);
        return studentNo;
    }
}