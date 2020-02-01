package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentDetail;

import java.util.List;

public interface StudentService {

    StudentDetail findStudentDetailByStudentNo(long studentNo);

    List<StudentDetail> getStudentDetailList();

    Student checkStudentAndGet(String id, String pwd);

    long createStudent(Student student, long gradeClassNo);
}




