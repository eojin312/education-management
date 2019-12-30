package hachi.education_management.exam.vo;

import java.util.Date;

public class ExamStudentApply {
    private long examNo;
    private long studentNo;
    private long examStudentApplyNo;
    private String name;
    private int year;
    private int grade;
    private int semester;
    private Date createDate;
    private String teacherName;
    private Date updateDate;

    public long getExamNo() {
        return examNo;
    }

    public void setExamNo(long examNo) {
        this.examNo = examNo;
    }

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public long getExamStudentApplyNo() {
        return examStudentApplyNo;
    }

    public void setExamStudentApplyNo(long examStudentApplyNo) {
        this.examStudentApplyNo = examStudentApplyNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    @Override
    public String toString() {
        return "ExamStudentApply{" +
                "examNo=" + examNo +
                ", studentNo=" + studentNo +
                ", examStudentApplyNo=" + examStudentApplyNo +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                ", semester=" + semester +
                ", createDate=" + createDate +
                ", teacherName='" + teacherName + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
