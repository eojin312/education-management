package hachi.education_management.teacher.service;

import hachi.education_management.teacher.exception.NoSuchTeacherException;
import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;

import java.util.List;

public interface TeacherService {

    int add(Teacher teacher);

    Teacher findByTeacherNo(int TeacherNo);

    List<TeacherSubject> getTeacherListWithSubject();

    Teacher checkTeacherAndGet(String id, String pwd) throws NoSuchTeacherException;

    List<Teacher> findTeacherListWithSubjectAggregation();

    List<Teacher> findTeacherListWithSubjectAggregationEnhanced();
}
