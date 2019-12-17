package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentWithGradeClassForStudentDetailAndList;

import java.util.List;

public interface StudentService {

    StudentWithGradeClassForStudentDetailAndList detail(long studentNo);

    List<StudentWithGradeClassForStudentDetailAndList> findByStudentNoWithGradeClass();

    Student checkStudentAndGet(String id, String pwd);

    long createStudent(Student student, long gradeClassNo);
}
