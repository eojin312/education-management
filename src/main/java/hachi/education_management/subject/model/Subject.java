package hachi.education_management.subject.model;

public class Subject {
    private int subjectNo;
    private String subjectName;

    public Subject(int subjectNo, String subjectName) {
        this.subjectNo = subjectNo;
        this.subjectName = subjectName;
    }

    public int getSubjectNo() {
        return subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectNo=" + subjectNo +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
