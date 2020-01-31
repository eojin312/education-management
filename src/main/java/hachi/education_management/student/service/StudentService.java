package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentDetailAndList;

import java.util.List;

public interface StudentService {

    StudentDetailAndList findStudentDetailByStudentNo(long studentNo);

    List<StudentDetailAndList> findStudentListByGradeClass();

    Student checkStudentAndGet(String id, String pwd);

    long createStudent(Student student, long gradeClassNo);
}




