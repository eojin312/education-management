package hachi.education_management.common.request;

public class LoginUser {
    private String userId;
    private String userPwd;
    private String userType;

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
