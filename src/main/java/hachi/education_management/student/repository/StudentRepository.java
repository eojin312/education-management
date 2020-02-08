package hachi.education_management.student.repository;

import hachi.education_management.student.model.Student;
import hachi.education_management.student.vo.StudentDetail;
import hachi.education_management.student.vo.StudentSchool;

import java.util.List;

/**
 * 학생 repository
 */
public interface StudentRepository {

    //학생 등록하기위한 메소드
    int insertIntoStudent(Student student);

    //학생 리스트
    List<StudentSchool> findStudentSchool();

    //학년반 기준 학생 리스트
    List<StudentDetail> findStudentDetailList();

    //학생 상세
    StudentDetail findStudentDetailByStudentNo(long studentNo);

    Student findByIdAndPwd(String id, String pwd);


    List<StudentDetail> findStudentDetailList(int start, int rows, String sord);

    long findStudentDetailListCount();
}
