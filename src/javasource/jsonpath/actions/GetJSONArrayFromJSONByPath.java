// This file was generated by Mendix Modeler.
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
import net.minidev.json.JSONArray;

public class GetJSONArrayFromJSONByPath extends CustomJavaAction<java.lang.String>
{
	private java.lang.String json;
	private java.lang.String path;

	public GetJSONArrayFromJSONByPath(IContext context, java.lang.String json, java.lang.String path)
	{
		super(context);
		this.json = json;
		this.path = path;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		 
		final JSONArray jsonArray = JSONUtils.getValueFromJSONStringByPath(json, path, JSONArray.class);
		return jsonArray.toJSONString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetJSONArrayFromJSONByPath";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
