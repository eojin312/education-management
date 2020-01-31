package hachi.education_management.teacher.repository;


import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;

import java.util.List;

/**
 * 선생님 repository
 */
public interface TeacherRepository {

    //선생님 등록을 위한 메소드
    int add(Teacher teacher);

    //선생님 상세 페이지를 위한 메소드
    Teacher findByTeacherNo(int teacherNo);

    //선생님과 과목 리스트
    List<TeacherSubject> findTeacherListWithSubject();

    //선생님 리스트
    List<Teacher> findAll();

    //선생님 id 와 비밀번호 메소드
    Teacher findByIdAndPwd(String id, String pwd);
}
