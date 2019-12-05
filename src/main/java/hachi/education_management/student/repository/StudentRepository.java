package hachi.education_management.student.repository;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentSchool;

import java.util.List;

public interface StudentRepository {
    int insert(Student student);


    List<StudentSchool> findStudentSchool();

    List<Student> list();

    Student detail(long studentNo);

    Student findByIdAndPwd(String id, String pwd);


}
