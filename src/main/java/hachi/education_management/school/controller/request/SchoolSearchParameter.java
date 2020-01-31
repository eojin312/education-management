package hachi.education_management.school.controller.request;

/**
 * 학교 검색하기 위한 클래스
 */
public class SchoolSearchParameter {

    public static final int DEFAULT_COUNT = 100; // 한번에 가지고올 학교의 개수


    private String area;
    private String schoolName;
    private Integer count;

    /**
     * 학교 검색 메소드
     *
     * @param area       지역으로 검색하면 특정 지역에 맞게 결과가 리스트
     * @param schoolName 학교이름으로 검색하면 특정 학교이름에 맞게 리스트
     * @param count      한번에 가지고 올 개수
     */
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
