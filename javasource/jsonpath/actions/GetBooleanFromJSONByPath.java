// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package jsonpath.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import jsonpath.proxies.BooleanValue;
import jsonpath.implementation.Utils;

/**
 * GetBooleanFromJSONByPath
 * * Returns first Boolean* value from a JSON input matching JSONPath expression
 * * Returns empty if not found or result is not Boolean
 * 
 * *Does not actually return a Boolean, but an enumeration with _true & _ false values as Mendix does not support empty booleans
 */
public class GetBooleanFromJSONByPath extends CustomJavaAction<java.lang.String>
{
	private java.lang.String json;
	private java.lang.String path;

	public GetBooleanFromJSONByPath(IContext context, java.lang.String json, java.lang.String path)
	{
		super(context);
		this.json = json;
		this.path = path;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		final Boolean booleanValue = Utils.queryJSONStringForBoolean(json, path);
		if (booleanValue == null) { return null; }
		if (booleanValue) { return BooleanValue._true.toString(); }
		else { return BooleanValue._false.toString(); }
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetBooleanFromJSONByPath";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
