package hachi.education_management.grade_class.vo;

public class GradeClass {
    private Long gradeClassNo;
    private Long schoolNo;
    private int year;
    private int grade;
    private int gradeClass;

    public GradeClass(Long gradeClassNo, Long schoolNo, int year, int grade, int gradeClass) {
        this.gradeClassNo = gradeClassNo;
        this.schoolNo = schoolNo;
        this.year = year;
        this.grade = grade;
        this.gradeClass = gradeClass;
    }

    public Long getGradeClassNo() {
        return gradeClassNo;
    }

    public void setGradeClassNo(Long gradeClassNo) {
        this.gradeClassNo = gradeClassNo;
    }

    public Long getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(Long schoolNo) {
        this.schoolNo = schoolNo;
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
        return "GradeClass{" +
                "gradeClassNo=" + gradeClassNo +
                ", schoolNo=" + schoolNo +
                ", year=" + year +
                ", grade=" + grade +
                ", gradeClass=" + gradeClass +
                '}';
    }
}
