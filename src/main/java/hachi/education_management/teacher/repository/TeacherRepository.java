package hachi.education_management.teacher.repository;


import hachi.education_management.teacher.model.Teacher;
import hachi.education_management.teacher.model.TeacherSubject;

import java.util.List;

public interface TeacherRepository {

    int add(Teacher teacher);


    Teacher findByTeacherNo(int teacherNo);

    List<TeacherSubject> findTeacherListWithSubject();

    List<Teacher> findAll();

    Teacher findByIdAndPwd(String id, String pwd);
}
