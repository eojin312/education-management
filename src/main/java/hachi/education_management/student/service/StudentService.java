package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;
import hachi.education_management.student_grade_class.vo.StudentGradeClass;

import java.util.List;

public interface StudentService {
    long insert(Student student);

    StudentGradeClass detail(long studentNo);

    List<StudentGradeClass> findByStudentNoWithGradeClass();

    Student checkStudentAndGet(String id, String pwd);

}
