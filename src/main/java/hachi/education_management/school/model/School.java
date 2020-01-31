package hachi.education_management.school.model;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 학교 정보 데이터를 담기 위한 모델
 */
public class School {
    private Long schoolNo;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 10)
    private String schoolName;
    private String schoolNickname;
    private String grade;
    private String ownerType;
    private String eduType;
    private String useYn;
    private String area;

    public School(Long schoolNo, String schoolName, String schoolNickname, String grade, String ownerType, String eduType, String useYn, String area) {
        this.schoolNo = schoolNo;
        this.schoolName = schoolName;
        this.schoolNickname = schoolNickname;
        this.grade = grade;
        this.ownerType = ownerType;
        this.eduType = eduType;
        this.useYn = useYn;
        this.area = area;
    }

    public School(String schoolName, String schoolNickname, String grade, String ownerType, String eduType, String area) {
        this.schoolName = schoolName;
        this.schoolNickname = schoolNickname;
        this.grade = grade;
        this.ownerType = ownerType;
        this.eduType = eduType;
        this.area = area;
    }

    public School() {
    }

    public Long getSchoolNo() {
        return schoolNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolNickname() {
        return schoolNickname;
    }

    public String getGrade() {
        return grade;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public String getEduType() {
        return eduType;
    }

    public String getUseYn() {
        return useYn;
    }

    public String getArea() {
        return area;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolNickname(String schoolNickname) {
        this.schoolNickname = schoolNickname;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public void setEduType(String eduType) {
        this.eduType = eduType;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public void setSchoolNo(Long schoolNo) {
        this.schoolNo = schoolNo;
    }

    public String getGradeName() {
        if (this.grade.equals("E")) return "초등학교";
        if (this.grade.equals("M")) return "중학교";
        if (this.grade.equals("H")) return "고등학교";
        else {
            return "-";
        }
    }

    public String getOwnerTypeName() {
        if (this.ownerType.equals("P")) return "사립";
        if (this.ownerType.equals("N")) return "공립";
        else {
            return "-";
        }
    }
}
