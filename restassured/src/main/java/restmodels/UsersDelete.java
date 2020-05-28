package restmodels;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersDelete {
	@JsonProperty("_meta")
	_Meta _meta;
	@JsonIgnore
	Result result;

	public UsersDelete() {}

	public UsersDelete(_Meta _meta, Result result) {
		this._meta = _meta;
		this.result = result;
	}

	public _Meta getMeta() {
		return _meta;
	}

	public void setMeta(_Meta _meta) {
		this._meta = _meta;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	

}
