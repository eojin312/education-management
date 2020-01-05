package hachi.education_management.grade_class.vo;

public class GradeClassWithStudent {
    private long studentGradeClassNo;
    private int gradeClassNo;
    private long studentNo;
    private long schoolNo;
    private String name;
    private String sex;
    private String schoolName;
    private int grade;
    private int gradeClass;
    private int studentClassNumber;

    public long getStudentGradeClassNo() {
        return studentGradeClassNo;
    }

    public void setStudentGradeClassNo(long studentGradeClassNo) {
        this.studentGradeClassNo = studentGradeClassNo;
    }

    public long getGradeClassNo() {
        return gradeClassNo;
    }

    public void setGradeClassNo(int gradeClassNo) {
        this.gradeClassNo = gradeClassNo;
    }

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public long getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(long schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(int gradeClass) {
        this.gradeClass = gradeClass;
    }

    public int getStudentClassNumber() {
        return studentClassNumber;
    }

    public void setStudentClassNumber(int studentClassNumber) {
        this.studentClassNumber = studentClassNumber;
    }
}
