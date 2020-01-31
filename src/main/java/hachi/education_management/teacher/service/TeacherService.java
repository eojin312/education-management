package hachi.education_management.teacher.service;

import hachi.education_management.teacher.exception.NoSuchTeacherException;
import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;

import java.util.List;

/**
 * 선생님 service
 */
public interface TeacherService {

    //선생님 등록을 위한 메소드
    int add(Teacher teacher);

    //선생님 상세 페이지를 위한 메소드
    Teacher findByTeacherNo(int TeacherNo);

    //선생님과 과목 리스트
    List<TeacherSubject> getTeacherListWithSubject();

    //id 와 pwd 의 정보를 얻는 메소드
    Teacher checkTeacherAndGet(String id, String pwd) throws NoSuchTeacherException;

    List<Teacher> findTeacherListWithSubjectAggregation();

    List<Teacher> findTeacherListWithSubjectAggregationEnhanced();
}
