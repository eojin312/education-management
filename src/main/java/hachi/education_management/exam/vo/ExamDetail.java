package hachi.education_management.exam.vo;

import java.util.Date;

public class ExamDetail {
    private int examStudentDetailNo;
    private int examNo;
    private long studentNo;
    private int subjectNo;
    private int gradeNo;
    private int semester;
    private String name;
    private Date startDate;
    private Date endDate;
    private String subjectName;
    private int score;
    private int perfect;

    public int getExamStudentDetailNo() {
        return examStudentDetailNo;
    }

    public void setExamStudentDetailNo(int examStudentDetailNo) {
        this.examStudentDetailNo = examStudentDetailNo;
    }

    public int getExamNo() {
        return examNo;
    }

    public void setExamNo(int examNo) {
        this.examNo = examNo;
    }

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPerfect() {
        return perfect;
    }

    public void setPerfect(int perfect) {
        this.perfect = perfect;
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

    @Override
    public String toString() {
        return "ExamDetail{" +
                "examStudentDetailNo=" + examStudentDetailNo +
                ", examNo=" + examNo +
                ", studentNo=" + studentNo +
                ", subjectNo=" + subjectNo +
                ", gradeNo=" + gradeNo +
                ", semester=" + semester +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", subjectName='" + subjectName + '\'' +
                ", score=" + score +
                ", perfect=" + perfect +
                '}';
    }
}
