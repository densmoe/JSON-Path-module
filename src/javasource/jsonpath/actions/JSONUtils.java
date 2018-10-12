package jsonpath.actions;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

public final class JSONUtils {
	@SuppressWarnings("unchecked")
	static final <T extends Object> T getValueFromJSONStringByPath(String json, String path, Class<T> valueClass) {
		final Object readResult = JsonPath
				.parse(json)
				.read(path);
		
		if(valueClass.isInstance(readResult)) {
			return ((T) readResult);
		} else if (readResult instanceof JSONArray) {
			JSONArray jsonArray = (JSONArray) readResult;
			if (jsonArray.isEmpty()) { return null; };
			final Object firstValue = ((JSONArray) readResult).get(0);
			return (valueClass.isInstance(firstValue) ? ((T) firstValue) : null);
		} else {
			return null;
		}
	}
}
