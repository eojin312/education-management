package hachi.education_management.student.repository;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentSchool;
import hachi.education_management.student.vo.StudentWithGradeClassForStudentDetailAndList;

import java.util.List;

public interface StudentRepository {
    int insertIntoStudent(Student student);

    List<StudentSchool> findStudentSchool();

    List<StudentWithGradeClassForStudentDetailAndList> findByStudentNoWithGradeClass();

    StudentWithGradeClassForStudentDetailAndList detail(long studentNo);

    Student findByIdAndPwd(String id, String pwd);


}
