package hachi.education_management.school.controller.request;

public class SchoolSearchParameter {

    public static final int DEFAULT_COUNT = 100; // 한번에 가지고올 학교의 개수


    private String area;
    private String schoolName;
    private Integer count;

    public SchoolSearchParameter(String area, String schoolName, Integer count) {
        this.area = area;
        this.schoolName = schoolName;
        if (count == null) {
            this.count = DEFAULT_COUNT;
        } else {
            this.count = count;
        }
    }

    public int getCount() {
        if (count == null || count == 0) {
            return DEFAULT_COUNT;
        }
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
