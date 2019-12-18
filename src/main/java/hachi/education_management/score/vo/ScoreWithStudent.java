package hachi.education_management.score.vo;

public class ScoreWithStudent {
    private long scoreNo;
    private long studentNo;
    private long subjectNo;
    private String name;
    private String juminNo;
    private String sex;
    private int grade;
    private int gradeClass;
    private int semester;
    private String exam;
    private int perfectStandard;
    private String subjectName;
    private int score;

    public long getScoreNo() {
        return scoreNo;
    }

    public void setScoreNo(long scoreNo) {
        this.scoreNo = scoreNo;
    }

    public long getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public long getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(long subjectNo) {
        this.subjectNo = subjectNo;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public int getPerfectStandard() {
        return perfectStandard;
    }

    public void setPerfectStandard(int perfectStandard) {
        this.perfectStandard = perfectStandard;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreWithStudent{" +
                "scoreNo=" + scoreNo +
                ", studentNo=" + studentNo +
                ", subjectNo=" + subjectNo +
                ", name='" + name + '\'' +
                ", juminNo='" + juminNo + '\'' +
                ", sex='" + sex + '\'' +
                ", grade=" + grade +
                ", gradeClass=" + gradeClass +
                ", semester=" + semester +
                ", exam='" + exam + '\'' +
                ", perfectStandard=" + perfectStandard +
                ", subjectName='" + subjectName + '\'' +
                ", score=" + score +
                '}';
    }
}
