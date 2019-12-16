package hachi.education_management.subject.repository;

import hachi.education_management.subject.model.Subject;

import java.util.List;

public interface SubjectRepository {
    Subject findBySubjectNo(int subjectNo);

    List<Subject> findListBySubjectNoList(List subjectNoSet);
}
