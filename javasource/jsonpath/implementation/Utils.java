package jsonpath.implementation;

import java.math.BigDecimal;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;


public final class Utils {
	
	private static final Configuration config = Configuration.defaultConfiguration()
			.addOptions(Option.ALWAYS_RETURN_LIST);
	
	private static final JSONArray queryJSONString(String json, String path) {
		JSONArray results = JsonPath.using(Utils.config)
				.parse(json)
				.read(path, JSONArray.class);
		return results;
	}
	
	public static final Boolean queryJSONStringForBoolean(String json, String path) {
		JSONArray results = Utils.queryJSONString(json, path);
		if (!results.isEmpty()) {
			Boolean firstResult = (Boolean) results.get(0);
			return firstResult;	
		} else {
			return null;
		}
	}
	
	public static final String queryJSONStringForString(String json, String path) {
		JSONArray results = Utils.queryJSONString(json, path);
		if (!results.isEmpty()) { 
			String firstResult = (String) results.get(0);
			return firstResult;	
		} else {
			return null;
		}
	}
	
	public static final Number queryJSONStringForInteger(String json, String path) {
		JSONArray results = Utils.queryJSONString(json, path);
		if (!results.isEmpty()) { 
			Number firstResult = (Number) results.get(0);
			return firstResult;	
		} else {
			return null;
		}
	}
	
	public static final BigDecimal queryJSONStringForDecimal(String json, String path) {
		JSONArray results = Utils.queryJSONString(json, path);
		if (!results.isEmpty()) { 
			Double firstResult = (Double) results.get(0);
			return BigDecimal.valueOf(firstResult);	
		} else {
			return null;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static final String queryJSONStringForObject(String json, String path) {
		Object results = JsonPath.using(Utils.config)
				.parse(json)
				.read(path, JSONObject.class);
		final List<JSONObject> objList = (List<JSONObject>)(List<?>) results;
		if (!objList.isEmpty()) {
			return objList.get(0).toJSONString();
		} else {
			return null;
		}
	}
	
	public static final String queryJSONStringForArray(String json, String path) {
		JSONArray results = Utils.queryJSONString(json, path);
		return results.toJSONString();
	}
}
