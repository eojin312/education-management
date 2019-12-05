package hachi.education_management.common.response;

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
