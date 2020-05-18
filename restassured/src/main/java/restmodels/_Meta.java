package restmodels;


public class _Meta {
	 public boolean success;
     public  long code;
     public  String message;
     public  long totalCount;
     public  long pageCount;
     public  long currentPage;
     public  long perPage;
     public  RateLimit rateLimit;
     
     public _Meta() {}

     public _Meta(boolean success, long code, String message, long totalCount, long pageCount, long currentPage, long perPage, RateLimit rateLimit){
         this.success = success;
         this.code = code;
         this.message = message;
         this.totalCount = totalCount;
         this.pageCount = pageCount;
         this.currentPage = currentPage;
         this.perPage = perPage;
         this.rateLimit = rateLimit;
     }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}

	public long getPerPage() {
		return perPage;
	}

	public void setPerPage(long perPage) {
		this.perPage = perPage;
	}

	public RateLimit getRateLimit() {
		return rateLimit;
	}

	public void setRateLimit(RateLimit rateLimit) {
		this.rateLimit = rateLimit;
	}
     
}
