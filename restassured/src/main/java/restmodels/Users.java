package restmodels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
	@JsonProperty("_meta")
	_Meta _meta;
	@JsonProperty("result")
	List<Result> result;

	public Users() {}

	public Users(_Meta _meta, List<Result> result) {
		this._meta = _meta;
		this.result = result;
	}

	public _Meta getMeta() {
		return _meta;
	}

	public void setMeta(_Meta _meta) {
		this._meta = _meta;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}
	
	

}
