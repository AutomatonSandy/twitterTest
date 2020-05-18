package restmodels;

public class RateLimit {
	 public long limit;
     public long remaining;
     public long reset;

     public RateLimit() {}
     public RateLimit(long limit, long remaining, long reset){
         this.limit = limit;
         this.remaining = remaining;
         this.reset = reset;
     }
	public long getLimit() {
		return limit;
	}
	public void setLimit(long limit) {
		this.limit = limit;
	}
	public long getRemaining() {
		return remaining;
	}
	public void setRemaining(long remaining) {
		this.remaining = remaining;
	}
	public long getReset() {
		return reset;
	}
	public void setReset(long reset) {
		this.reset = reset;
	}
     
     
}
