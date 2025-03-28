// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the MyFirstModule module
	public static void aCT_GetBoolean(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_GetBoolean").withParams(params).execute(context);
	}
	public static void aCT_GetDecimal(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_GetDecimal").withParams(params).execute(context);
	}
	public static void aCT_GetInteger(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_GetInteger").withParams(params).execute(context);
	}
	public static void aCT_GetJSONArray(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_GetJSONArray").withParams(params).execute(context);
	}
	public static void aCT_GetJSONObject(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_GetJSONObject").withParams(params).execute(context);
	}
	public static void aCT_GetString(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ACT_GetString").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.JSONPathEvaluator dS_JSONPathEvaluator(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_JSONPathEvaluator").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.JSONPathEvaluator.initialize(context, result);
	}
	public static void oN_ChangeJSON(IContext context, myfirstmodule.proxies.JSONPathEvaluator _jSONPathEvaluator)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("JSONPathEvaluator", _jSONPathEvaluator == null ? null : _jSONPathEvaluator.getMendixObject());
		Core.microflowCall("MyFirstModule.ON_ChangeJSON").withParams(params).execute(context);
	}
	public static void testBoolean(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.TestBoolean").withParams(params).execute(context);
	}
	public static void testDecimal(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.TestDecimal").withParams(params).execute(context);
	}
	public static void testInteger(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.TestInteger").withParams(params).execute(context);
	}
	public static void testSurveyAnswers(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.TestSurveyAnswers").withParams(params).execute(context);
	}
}
