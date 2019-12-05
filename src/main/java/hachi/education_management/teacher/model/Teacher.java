package hachi.education_management.teacher.model;

public class Teacher {
    private int teacherNo;
    private String teacherName;
    private String sex;
    private int juminNo;
    private int subjectNo;
    private String id;
    private String pwd;
    private String classType;
    private int classroom;

    public Teacher(int teacherNo, String teacherName, String sex, int juminNo, int subjectNo, String id, String pwd, String classType, int classroom) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.sex = sex;
        this.juminNo = juminNo;
        this.subjectNo = subjectNo;
        this.id = id;
        this.pwd = pwd;
        this.classType = classType;
        this.classroom = classroom;
    }

    public Teacher() {
    }

    public int getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getJuminNo() {
        return juminNo;
    }

    public void setJuminNo(int juminNo) {
        this.juminNo = juminNo;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
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

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherNo=" + teacherNo +
                ", teacherName='" + teacherName + '\'' +
                ", sex='" + sex + '\'' +
                ", juminNo=" + juminNo +
                ", subjectNo='" + subjectNo + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", classType='" + classType + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
