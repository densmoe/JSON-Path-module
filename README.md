# JSON-Path-module

## Description

A JSONPath implementation based on the Jayway JsonPath java library (https://github.com/json-path/JsonPath).

## Typical usage scenario

When JSON structures are nested it is not always convenient to use import mappings, because each level of nesting means that unnecessary entities and associations need to be added to the domain model. This module contains java actions for retrieving single values from a json structure as well as nested json objects and arrays that can be used in a import mappings.

* Retrieving / Finding simple values from a (nested) JSON structure.
  * Strings, Integers, Decimals, Booleans
* Retrieving JSON structures in a nested JSON structure
  * JSON Objects & Arrays (returned as Strings)
* Using the JSONPath Syntax for filter results (e.g. filtering json before applying an import mapping)
  * Features and limitations

## Available Microflow actions:

GetStringFromJSONByPath
* Returns first String value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not a String

GetBooleanFromJSONByPath
* Returns first Boolean* value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not a Boolean

GetIntegerFromJSONByPath
* Returns first Integer value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not a Integer

GetDecimalFromJSONByPath
* Returns first Decimal value from a JSON input matching JSONPath expression
* Returns empty if not found or result is not numeric (Integer, Decimal,..)

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


## Frequently Asked Questions

Q: What is JSONPath?
A: It's like XPath for JSON
