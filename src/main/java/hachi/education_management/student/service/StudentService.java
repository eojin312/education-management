package hachi.education_management.student.service;

import hachi.education_management.student.model.Student;

import java.util.List;

public interface StudentService {
    long insert(Student student);

    Student detail(long studentNo);

    List<Student> list();

    Student checkStudentAndGet(String id, String pwd);

}
