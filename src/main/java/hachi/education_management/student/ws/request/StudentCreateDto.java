package hachi.education_management.student.ws.request;

public class StudentCreateDto {
    private String name;
    private String juminNo;
    private String sex;
    private String id;
    private String pwd;
    private Long gradeClassNo;

    public StudentCreateDto(String name, String juminNo, String sex, String id, String pwd, Long gradeClassNo) {
        this.name = name;
        this.juminNo = juminNo;
        this.sex = sex;
        this.id = id;
        this.pwd = pwd;
        this.gradeClassNo = gradeClassNo;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getGradeClassNo() {
        return gradeClassNo;
    }

    public void setGradeClassNo(Long gradeClassNo) {
        this.gradeClassNo = gradeClassNo;
    }

    @Override
    public String toString() {
        return "StudentCreateDto{" +
                "name='" + name + '\'' +
                ", juminNo='" + juminNo + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", gradeClassNo=" + gradeClassNo +
                '}';
    }
}
