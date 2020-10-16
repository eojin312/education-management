package hachi.education_management.common.response;

/**
 * 응답할 때 로그인성공 혹은 에러메시지를 던져주는 클래스
 */
public class ProcessResponse {
    private boolean success;
    private String errorMessage;

    public ProcessResponse(boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
