package hachi.education_management.grade_class.vo;

public class GradeClassWithSchool {
    int studentGradeClassNo;
    int gradeClassNo;
    int grade;
    int gradeClass;
    long studentNo;
    String name;
    String sex;
    int schoolNo;
    String schoolName;


    public int getStudentGradeClassNo() {
        return studentGradeClassNo;
    }

    public void setStudentGradeClassNo(int studentGradeClassNo) {
        this.studentGradeClassNo = studentGradeClassNo;
    }

    public int getGradeClassNo() {
        return gradeClassNo;
    }

    public void setGradeClassNo(int gradeClassNo) {
        this.gradeClassNo = gradeClassNo;
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

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
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

    public long getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(int schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "GradeClassWithSchool{" +
                "studentGradeClassNo=" + studentGradeClassNo +
                ", gradeClassNo=" + gradeClassNo +
                ", grade=" + grade +
                ", gradeClass=" + gradeClass +
                ", studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", schoolNo=" + schoolNo +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
