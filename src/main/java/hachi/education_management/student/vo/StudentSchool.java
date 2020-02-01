package hachi.education_management.student.vo;

public class StudentSchool {

    private String area;
    private String schoolName;
    private String schoolNickname;
    private String year;
    private int grade;
    private int gradeClass;
    private String studentName;
    private String sex;
    private Long studentNumber;

    public StudentSchool(String area, String schoolName, String schoolNickname, String year, int grade, int gradeClass, String studentName, String sex, Long studentNumber) {
        this.area = area;
        this.schoolName = schoolName;
        this.schoolNickname = schoolNickname;
        this.year = year;
        this.grade = grade;
        this.gradeClass = gradeClass;
        this.studentName = studentName;
        this.sex = sex;
        this.studentNumber = studentNumber;
    }

    public String getArea() {
        return area;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolNickname() {
        return schoolNickname;
    }

    public String getYear() {
        return year;
    }

    public int getGrade() {
        return grade;
    }

    public int getGradeClass() {
        return gradeClass;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSex() {
        return sex;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "StudentSchool{" +
                "area='" + area + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolNickname='" + schoolNickname + '\'' +
                ", year='" + year + '\'' +
                ", grade=" + grade +
                ", gradeClass=" + gradeClass +
                ", studentName='" + studentName + '\'' +
                ", sex='" + sex + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
