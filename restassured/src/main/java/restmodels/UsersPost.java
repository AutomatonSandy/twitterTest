package restmodels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsersPost {
	@JsonProperty("_meta")
	_Meta _meta;
	@JsonProperty("result")
	Result result;

	public UsersPost() {}

	public UsersPost(_Meta _meta, Result result) {
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
