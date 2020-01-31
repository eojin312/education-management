package hachi.education_management.common.request;

/**
 * 로그인 데이터를 담기위한 모델
 */
public class LoginUser {
    private String userId;
    private String userPwd;
    private String userType;

    /**
     * @param userId 유저가 작성한 id 파라미터
     * @param userPwd 유저가 작성한 pwd 파라미터
     * @param userType 유저가 학생인지 선생님인지 판단하는 파라미터
     */
    public LoginUser(String userId, String userPwd, String userType) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
