package hachi.education_management.exam.model;

import java.util.Date;

/**
 * 시험 정보 모델
 */
public class Exam {
    private int examNo;
    private String year; // 시험연도
    private long schoolNo;
    private int grade;
    private int semester;
    private String examType;
    private Date startDate;
    private Date endDate;
    private int createTeacherNo;
    private int updateTeacherNo;
    private int subjectNo;

    public Exam(String year, long schoolNo, int grade, int semester, String examType, Date startDate, Date endDate, int createTeacherNo, int updateTeacherNo, int subjectNo) {
        this.year = year;
        this.schoolNo = schoolNo;
        this.grade = grade;
        this.semester = semester;
        this.examType = examType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createTeacherNo = createTeacherNo;
        this.updateTeacherNo = updateTeacherNo;
        this.subjectNo = subjectNo;
    }

    public int getExamNo() {
        return examNo;
    }

    public void setExamNo(int examNo) {
        this.examNo = examNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(long schoolNo) {
        this.schoolNo = schoolNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getCreateTeacherNo() {
        return createTeacherNo;
    }

    public void setCreateTeacherNo(int createTeacherNo) {
        this.createTeacherNo = createTeacherNo;
    }

    public int getUpdateTeacherNo() {
        return updateTeacherNo;
    }

    public void setUpdateTeacherNo(int updateTeacherNo) {
        this.updateTeacherNo = updateTeacherNo;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }
}