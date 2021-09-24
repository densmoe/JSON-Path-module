package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(jsonpath.actions.GetBooleanFromJSONByPath.class);
    registrator.registerUserAction(jsonpath.actions.GetDecimalFromJSONByPath.class);
    registrator.registerUserAction(jsonpath.actions.GetIntegerFromJSONByPath.class);
    registrator.registerUserAction(jsonpath.actions.GetJSONArrayFromJSONByPath.class);
    registrator.registerUserAction(jsonpath.actions.GetJSONObjectFromJSONByPath.class);
    registrator.registerUserAction(jsonpath.actions.GetStringFromJSONByPath.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
