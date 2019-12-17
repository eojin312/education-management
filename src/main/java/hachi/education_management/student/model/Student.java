package hachi.education_management.student.model;


public class Student {
    private Long studentNo;
    private String name;
    private String juminNo;
    private String sex;
    private String id;
    private String pwd;


    public Student(Long studentNo, String name, String juminNo, String sex) {
        this.studentNo = studentNo;
        this.name = name;
        this.juminNo = juminNo;
        this.sex = sex;
    }

    public Student(String name, String juminNo, String sex) {
        this.name = name;
        this.juminNo = juminNo;
        this.sex = sex;
    }

    public Student(Long studentNo, String name, String juminNo, String sex, String id, String pwd) {
        this.studentNo = studentNo;
        this.name = name;
        this.juminNo = juminNo;
        this.sex = sex;
        this.id = id;
        this.pwd = pwd;
    }

    public Student(String name, String juminNo, String sex, String id, String pwd) {
        this.name = name;
        this.juminNo = juminNo;
        this.sex = sex;
        this.id = id;
        this.pwd = pwd;
    }

    public Student() {
    }


    public Long getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public String getJuminNo() {
        return juminNo;
    }

    public String getSex() {
        return sex;
    }


    public void setStudentNo(Long studentNo) {
        this.studentNo = studentNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJuminNo(String juminNo) {
        this.juminNo = juminNo;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", juminNo='" + juminNo + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
