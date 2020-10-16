package hachi.education_management.common.response;

import java.util.List;

/**
 * 페이징 응답값을 내려주는 모델
 *
 * @param <T>
 */
public class ListResponse<T> {
    private long totalCount;
    private int lastPageNo;
    private List<T> list;

    public ListResponse(long totalCount, int lastPageNo, List<T> list) {
        this.totalCount = totalCount;
        this.lastPageNo = lastPageNo;
        this.list = list;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public int getLastPageNo() {
        return lastPageNo;
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ListResponse{" +
                "totalCount=" + totalCount +
                ", lastPageNo=" + lastPageNo +
                ", list=" + list +
                '}';
    }
}
