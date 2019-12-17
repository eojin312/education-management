package hachi.education_management.student.vo;

/**
 * 학년 반의 데이터를 담기 위한 VO
 * 전체적으로 DB 설계부터 이상해서
 * ERD 다이어그램을 통해서 전면 수정한 후 만들었다.
 */

public class StudentWithGradeClassForStudentDetailAndList {
    private Long studentNo;
    private String name;
    private String juminNo;
    private String sex;
    private String id;
    private Long schoolNo;
    private String schoolName;
    private int year;
    private int grade;
    private int gradeClass; // class는 동일한 단어 여러 역할이 있기에 이름을 일부러 바꿨다.
    private Long gradeClassNo;


    //setter 로 한 이유는 jsp 즉 view 로 넘길때 생성자로 넘기면 순서가 조금이라도 어긋나면 에러가 발생하기 때문이다.

    public Long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJuminNo() {
        return juminNo;
    }

    public void setJuminNo(String juminNo) {
        this.juminNo = juminNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSchoolNo() {
        return schoolNo;
    }

    public void setSchoolNo(Long schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public Long getGradeClassNo() {
        return gradeClassNo;
    }

    public void setGradeClassNo(Long gradeClassNo) {
        this.gradeClassNo = gradeClassNo;
    }

    @Override
    public String toString() {
        return "StudentWithGradeClassForStudentDetailAndList{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", juminNo='" + juminNo + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                ", schoolNo=" + schoolNo +
                ", schoolName='" + schoolName + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                ", gradeClass=" + gradeClass +
                ", gradeClassNo=" + gradeClassNo +
                '}';
    }
}