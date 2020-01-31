package hachi.education_management.teacher.model;

/**
 * 선생님정보와 과목정보를 담은 VO
 */
public class TeacherSubject {
    private long teacherNo;
    private String teacherName;
    private String sex;
    private String classType;
    private String classroom;
    private String subjectName;
    private int subjectNo;

    public TeacherSubject(long teacherNo, String teacherName, String sex, String classroom, String subjectName, String classType, int subjectNo) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.sex = sex;
        this.classroom = classroom;
        this.subjectName = subjectName;
        this.classType = classType;
        this.subjectNo = subjectNo;
    }

    public long getTeacherNo() {
        return teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSex() {
        return sex;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getClassType() {
        return classType;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    @Override
    public String toString() {
        return "TeacherSubject{" +
                "teacherNo=" + teacherNo +
                ", teacherName='" + teacherName + '\'' +
                ", sex='" + sex + '\'' +
                ", classType='" + classType + '\'' +
                ", classroom='" + classroom + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectNo=" + subjectNo +
                '}';
    }
}
