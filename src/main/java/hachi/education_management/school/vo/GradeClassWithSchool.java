package hachi.education_management.school.vo;

public class GradeClassWithSchool {
    private long SchoolNo;
    private String schoolName;
    private int gradeClassNo;
    private int year;
    private int grade;
    private int gradeClass;


    public long getSchoolNo() {
        return SchoolNo;
    }

    public void setSchoolNo(long schoolNo) {
        SchoolNo = schoolNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGradeClassNo() {
        return gradeClassNo;
    }

    public void setGradeClassNo(int gradeClassNo) {
        this.gradeClassNo = gradeClassNo;
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

    public int getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(int gradeClass) {
        this.gradeClass = gradeClass;
    }

    @Override
    public String toString() {
        return "GradeClassWithStudent{" +
                "SchoolNo=" + SchoolNo +
                ", schoolName='" + schoolName + '\'' +
                ", gradeClassNo=" + gradeClassNo +
                ", year=" + year +
                ", grade=" + grade +
                ", gradeClass=" + gradeClass +
                '}';
    }
}
