package hachi.education_management.exam.vo;

import java.util.Date;

public class ExamList {
    private int examNo;
    private long schoolNo;
    private long teacherNo;
    private String area;
    private int gradeNo;
    private int semester;
    private String examType;
    private String teacherName;
    private Date startDate;
    private Date endDate;
    private String schoolName;
    private int subjectNo;
    private String subjectName;
    private int year;

    public void setExamNo(int examNo) {
        this.examNo = examNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(long schoolNo) {
        this.schoolNo = schoolNo;
    }

    public long getTeacherNo() {
        return teacherNo;
    }

    public int getExamNo() {
        return examNo;
    }

    public void setTeacherNo(long teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(int gradeNo) {
        this.gradeNo = gradeNo;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getExam() {
        return examNo;
    }

    public void setExam(int examNo) {
        this.examNo = examNo;
    }


    @Override
    public String toString() {
        return "ExamList{" +
                "examNo=" + examNo +
                ", schoolNo=" + schoolNo +
                ", teacherNo=" + teacherNo +
                ", area='" + area + '\'' +
                ", gradeNo=" + gradeNo +
                ", semester=" + semester +
                ", examType='" + examType + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", schoolName='" + schoolName + '\'' +
                ", subjectNo=" + subjectNo +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
