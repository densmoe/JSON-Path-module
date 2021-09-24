# JSON-Path-module

## Description

A JSONPath implementation based on the Jayway JsonPath java library (https://github.com/json-path/JsonPath).

## Typical usage scenario

When JSON structures are nested it is not always convenient to use import mappings, because each level of nesting means that unnecessary entities and associations need to be added to the domain model. This module contains java actions for retrieving single values from a json structure as well as nested json objects and arrays that can be used in a import mappings.

* Retrieving / Finding simple values from a (nested) JSON structure.
  * Strings, Integers, Decimals, Booleans
* Retrieving JSON structures in a nested JSON structure
  * JSON Objects & Arrays (returned as Strings)
* Using the JSONPath Syntax for filter results (e.g. filtering json before applying a import mapping)
  * Features and limitations

## Available Microflow actions:

GetStringFromJSONByPath
* Returns first String value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not String

GetBooleanFromJSONByPath
* Returns first Boolean* value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not Boolean

GetIntegerFromJSONByPath
* Returns first Integer value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not Integer/Long

GetDecimalFromJSONByPath
* Returns first Decimal value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not numeric (Integer, Decimal, etc.)

GetJSONObjectFromJSONByPath
* Returns JSON Object String from a JSON input matching JSONPath expression
* Returns empty if not found or result is not a JSON Object

GetJSONArrayFromJSONByPath
* Returns JSON Array String from a JSON input matching JSONPath expression
* Returns empty if not found or result is not a JSON Array

*Does not actually return a Boolean, but an enumeration with _true & _ false values as Mendix does not support empty booleans

## Resources

JSON Path Online Evaluator (for testing JSON Path expressions)
http://jsonpath.com
JSONPath Java Library Github
https://github.com/json-path/JsonPath

## Upgrading to a higher version

When upgrading to a higher version, delete the .jar and .JSONPath.RequiredLib in your project's userlib folder linked to any older versions of the module. 

Note: Starting with version 2.0.0 .JSONPath.RequiredLib files will include the version number of the module, for example: `json-smart-2.4.7.jar.JSONPath-2.0.0.RequiredLib`

## Frequently Asked Questions

Q: What is JSONPath?
A: It's like XPath for JSON

