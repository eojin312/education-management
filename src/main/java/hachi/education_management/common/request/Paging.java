package hachi.education_management.common.request;

/**
 * 첫 페이징(사용하지않는다)
 */
public class Paging {
    private int pageCountPerBlock; // 페이지 구간 내 페이지 개수
    private long totalCount; // 전체 리스트 개수
    private int listCountPerPage; // 페이지 당 리스트 개수

    public Paging(int pageCountPerBlock, long totalCount, int listCountPerPage) {
        this.pageCountPerBlock = pageCountPerBlock;
        this.totalCount = totalCount;
        this.listCountPerPage = listCountPerPage;
    }

    // 블록당 페이지 갯수
    public int getBlockNo(int pageNo) {
        return (int) Math.floor((pageNo - 1) / pageCountPerBlock);
    }

    public int getStartPageNoByPageNo(int pageNo) {
        return ((this.getBlockNo(pageNo)) * this.pageCountPerBlock) + 1;
    }

    public int getLastPageNo() {
        double temp = (double) this.totalCount / (double) this.pageCountPerBlock;
        return (int) Math.ceil(temp);
    }

    public int getStartLimit(int pageNo) {
        return ((pageNo - 1) * this.listCountPerPage);
    }

    public void print(int pageNo) {
        int startPageNo = this.getStartPageNoByPageNo(pageNo);
        int lastPageNo = this.getLastPageNo();

        for (int i = 0, j = startPageNo; i < pageCountPerBlock && j <= lastPageNo; i++, j++) {
            System.out.println(j + "");
        }

        System.out.println();
    }
}
