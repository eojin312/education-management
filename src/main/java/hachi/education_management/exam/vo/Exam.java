package hachi.education_management.exam.vo;

import java.util.Date;

public class Exam {
    private int examNo;
    private long teacherNo;
    private String teacherNane;
    private String year;
    private long studentNo;
    private int grade;
    private int semester;
    private String examType;
    private Date startDate;
    private Date endDate;

    public int getExamNo() {
        return examNo;
    }

    public void setExamNo(int examNo) {
        this.examNo = examNo;
    }

    public long getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(long teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherNane() {
        return teacherNane;
    }

    public void setTeacherNane(String teacherNane) {
        this.teacherNane = teacherNane;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
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

    @Override
    public String toString() {
        return "Exam{" +
                "examNo=" + examNo +
                ", teacherNo=" + teacherNo +
                ", teacherNane='" + teacherNane + '\'' +
                ", year='" + year + '\'' +
                ", studentNo=" + studentNo +
                ", grade=" + grade +
                ", semester=" + semester +
                ", examType='" + examType + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
