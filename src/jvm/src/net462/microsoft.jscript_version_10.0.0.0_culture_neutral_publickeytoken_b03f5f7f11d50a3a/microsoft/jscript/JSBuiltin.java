/*
 *  MIT License
 *
 *  Copyright (c) 2024 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector v. 1.15.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing Microsoft.JScript.JSBuiltin, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.JSBuiltin" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.JSBuiltin</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class JSBuiltin extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.JSBuiltin
     */
    public static final String className = "Microsoft.JScript.JSBuiltin";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }
    /**
     * Internal constructor. Use with caution 
     */
    public JSBuiltin(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public JSBuiltin() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public java.lang.Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static JSBuiltin getFrom(JCEnum object, String value) {
        try {
            return new JSBuiltin(object.fromValue(value));
        } catch (JCException e) {
            return new JSBuiltin(object);
        }
    }

    // Enum fields section
    
    public static JSBuiltin None = getFrom(enumReflected, "None");
    public static JSBuiltin Array_concat = getFrom(enumReflected, "Array_concat");
    public static JSBuiltin Array_join = getFrom(enumReflected, "Array_join");
    public static JSBuiltin Array_pop = getFrom(enumReflected, "Array_pop");
    public static JSBuiltin Array_push = getFrom(enumReflected, "Array_push");
    public static JSBuiltin Array_reverse = getFrom(enumReflected, "Array_reverse");
    public static JSBuiltin Array_shift = getFrom(enumReflected, "Array_shift");
    public static JSBuiltin Array_slice = getFrom(enumReflected, "Array_slice");
    public static JSBuiltin Array_sort = getFrom(enumReflected, "Array_sort");
    public static JSBuiltin Array_splice = getFrom(enumReflected, "Array_splice");
    public static JSBuiltin Array_toLocaleString = getFrom(enumReflected, "Array_toLocaleString");
    public static JSBuiltin Array_toString = getFrom(enumReflected, "Array_toString");
    public static JSBuiltin Array_unshift = getFrom(enumReflected, "Array_unshift");
    public static JSBuiltin Boolean_toString = getFrom(enumReflected, "Boolean_toString");
    public static JSBuiltin Boolean_valueOf = getFrom(enumReflected, "Boolean_valueOf");
    public static JSBuiltin Date_getDate = getFrom(enumReflected, "Date_getDate");
    public static JSBuiltin Date_getDay = getFrom(enumReflected, "Date_getDay");
    public static JSBuiltin Date_getFullYear = getFrom(enumReflected, "Date_getFullYear");
    public static JSBuiltin Date_getHours = getFrom(enumReflected, "Date_getHours");
    public static JSBuiltin Date_getMilliseconds = getFrom(enumReflected, "Date_getMilliseconds");
    public static JSBuiltin Date_getMinutes = getFrom(enumReflected, "Date_getMinutes");
    public static JSBuiltin Date_getMonth = getFrom(enumReflected, "Date_getMonth");
    public static JSBuiltin Date_getSeconds = getFrom(enumReflected, "Date_getSeconds");
    public static JSBuiltin Date_getTime = getFrom(enumReflected, "Date_getTime");
    public static JSBuiltin Date_getTimezoneOffset = getFrom(enumReflected, "Date_getTimezoneOffset");
    public static JSBuiltin Date_getUTCDate = getFrom(enumReflected, "Date_getUTCDate");
    public static JSBuiltin Date_getUTCDay = getFrom(enumReflected, "Date_getUTCDay");
    public static JSBuiltin Date_getUTCFullYear = getFrom(enumReflected, "Date_getUTCFullYear");
    public static JSBuiltin Date_getUTCHours = getFrom(enumReflected, "Date_getUTCHours");
    public static JSBuiltin Date_getUTCMilliseconds = getFrom(enumReflected, "Date_getUTCMilliseconds");
    public static JSBuiltin Date_getUTCMinutes = getFrom(enumReflected, "Date_getUTCMinutes");
    public static JSBuiltin Date_getUTCMonth = getFrom(enumReflected, "Date_getUTCMonth");
    public static JSBuiltin Date_getUTCSeconds = getFrom(enumReflected, "Date_getUTCSeconds");
    public static JSBuiltin Date_getVarDate = getFrom(enumReflected, "Date_getVarDate");
    public static JSBuiltin Date_getYear = getFrom(enumReflected, "Date_getYear");
    public static JSBuiltin Date_parse = getFrom(enumReflected, "Date_parse");
    public static JSBuiltin Date_setDate = getFrom(enumReflected, "Date_setDate");
    public static JSBuiltin Date_setFullYear = getFrom(enumReflected, "Date_setFullYear");
    public static JSBuiltin Date_setHours = getFrom(enumReflected, "Date_setHours");
    public static JSBuiltin Date_setMinutes = getFrom(enumReflected, "Date_setMinutes");
    public static JSBuiltin Date_setMilliseconds = getFrom(enumReflected, "Date_setMilliseconds");
    public static JSBuiltin Date_setMonth = getFrom(enumReflected, "Date_setMonth");
    public static JSBuiltin Date_setSeconds = getFrom(enumReflected, "Date_setSeconds");
    public static JSBuiltin Date_setTime = getFrom(enumReflected, "Date_setTime");
    public static JSBuiltin Date_setUTCDate = getFrom(enumReflected, "Date_setUTCDate");
    public static JSBuiltin Date_setUTCFullYear = getFrom(enumReflected, "Date_setUTCFullYear");
    public static JSBuiltin Date_setUTCHours = getFrom(enumReflected, "Date_setUTCHours");
    public static JSBuiltin Date_setUTCMinutes = getFrom(enumReflected, "Date_setUTCMinutes");
    public static JSBuiltin Date_setUTCMilliseconds = getFrom(enumReflected, "Date_setUTCMilliseconds");
    public static JSBuiltin Date_setUTCMonth = getFrom(enumReflected, "Date_setUTCMonth");
    public static JSBuiltin Date_setUTCSeconds = getFrom(enumReflected, "Date_setUTCSeconds");
    public static JSBuiltin Date_setYear = getFrom(enumReflected, "Date_setYear");
    public static JSBuiltin Date_toDateString = getFrom(enumReflected, "Date_toDateString");
    public static JSBuiltin Date_toGMTString = getFrom(enumReflected, "Date_toGMTString");
    public static JSBuiltin Date_toLocaleDateString = getFrom(enumReflected, "Date_toLocaleDateString");
    public static JSBuiltin Date_toLocaleString = getFrom(enumReflected, "Date_toLocaleString");
    public static JSBuiltin Date_toLocaleTimeString = getFrom(enumReflected, "Date_toLocaleTimeString");
    public static JSBuiltin Date_toString = getFrom(enumReflected, "Date_toString");
    public static JSBuiltin Date_toTimeString = getFrom(enumReflected, "Date_toTimeString");
    public static JSBuiltin Date_toUTCString = getFrom(enumReflected, "Date_toUTCString");
    public static JSBuiltin Date_UTC = getFrom(enumReflected, "Date_UTC");
    public static JSBuiltin Date_valueOf = getFrom(enumReflected, "Date_valueOf");
    public static JSBuiltin Enumerator_atEnd = getFrom(enumReflected, "Enumerator_atEnd");
    public static JSBuiltin Enumerator_item = getFrom(enumReflected, "Enumerator_item");
    public static JSBuiltin Enumerator_moveFirst = getFrom(enumReflected, "Enumerator_moveFirst");
    public static JSBuiltin Enumerator_moveNext = getFrom(enumReflected, "Enumerator_moveNext");
    public static JSBuiltin Error_toString = getFrom(enumReflected, "Error_toString");
    public static JSBuiltin Function_apply = getFrom(enumReflected, "Function_apply");
    public static JSBuiltin Function_call = getFrom(enumReflected, "Function_call");
    public static JSBuiltin Function_toString = getFrom(enumReflected, "Function_toString");
    public static JSBuiltin Global_CollectGarbage = getFrom(enumReflected, "Global_CollectGarbage");
    public static JSBuiltin Global_decodeURI = getFrom(enumReflected, "Global_decodeURI");
    public static JSBuiltin Global_decodeURIComponent = getFrom(enumReflected, "Global_decodeURIComponent");
    public static JSBuiltin Global_encodeURI = getFrom(enumReflected, "Global_encodeURI");
    public static JSBuiltin Global_encodeURIComponent = getFrom(enumReflected, "Global_encodeURIComponent");
    public static JSBuiltin Global_escape = getFrom(enumReflected, "Global_escape");
    public static JSBuiltin Global_eval = getFrom(enumReflected, "Global_eval");
    public static JSBuiltin Global_GetObject = getFrom(enumReflected, "Global_GetObject");
    public static JSBuiltin Global_isNaN = getFrom(enumReflected, "Global_isNaN");
    public static JSBuiltin Global_isFinite = getFrom(enumReflected, "Global_isFinite");
    public static JSBuiltin Global_parseFloat = getFrom(enumReflected, "Global_parseFloat");
    public static JSBuiltin Global_parseInt = getFrom(enumReflected, "Global_parseInt");
    public static JSBuiltin Global_ScriptEngine = getFrom(enumReflected, "Global_ScriptEngine");
    public static JSBuiltin Global_ScriptEngineBuildVersion = getFrom(enumReflected, "Global_ScriptEngineBuildVersion");
    public static JSBuiltin Global_ScriptEngineMajorVersion = getFrom(enumReflected, "Global_ScriptEngineMajorVersion");
    public static JSBuiltin Global_ScriptEngineMinorVersion = getFrom(enumReflected, "Global_ScriptEngineMinorVersion");
    public static JSBuiltin Global_unescape = getFrom(enumReflected, "Global_unescape");
    public static JSBuiltin Math_abs = getFrom(enumReflected, "Math_abs");
    public static JSBuiltin Math_acos = getFrom(enumReflected, "Math_acos");
    public static JSBuiltin Math_asin = getFrom(enumReflected, "Math_asin");
    public static JSBuiltin Math_atan = getFrom(enumReflected, "Math_atan");
    public static JSBuiltin Math_atan2 = getFrom(enumReflected, "Math_atan2");
    public static JSBuiltin Math_ceil = getFrom(enumReflected, "Math_ceil");
    public static JSBuiltin Math_cos = getFrom(enumReflected, "Math_cos");
    public static JSBuiltin Math_exp = getFrom(enumReflected, "Math_exp");
    public static JSBuiltin Math_floor = getFrom(enumReflected, "Math_floor");
    public static JSBuiltin Math_log = getFrom(enumReflected, "Math_log");
    public static JSBuiltin Math_max = getFrom(enumReflected, "Math_max");
    public static JSBuiltin Math_min = getFrom(enumReflected, "Math_min");
    public static JSBuiltin Math_pow = getFrom(enumReflected, "Math_pow");
    public static JSBuiltin Math_random = getFrom(enumReflected, "Math_random");
    public static JSBuiltin Math_round = getFrom(enumReflected, "Math_round");
    public static JSBuiltin Math_sin = getFrom(enumReflected, "Math_sin");
    public static JSBuiltin Math_sqrt = getFrom(enumReflected, "Math_sqrt");
    public static JSBuiltin Math_tan = getFrom(enumReflected, "Math_tan");
    public static JSBuiltin Number_toExponential = getFrom(enumReflected, "Number_toExponential");
    public static JSBuiltin Number_toFixed = getFrom(enumReflected, "Number_toFixed");
    public static JSBuiltin Number_toLocaleString = getFrom(enumReflected, "Number_toLocaleString");
    public static JSBuiltin Number_toPrecision = getFrom(enumReflected, "Number_toPrecision");
    public static JSBuiltin Number_toString = getFrom(enumReflected, "Number_toString");
    public static JSBuiltin Number_valueOf = getFrom(enumReflected, "Number_valueOf");
    public static JSBuiltin Object_hasOwnProperty = getFrom(enumReflected, "Object_hasOwnProperty");
    public static JSBuiltin Object_isPrototypeOf = getFrom(enumReflected, "Object_isPrototypeOf");
    public static JSBuiltin Object_propertyIsEnumerable = getFrom(enumReflected, "Object_propertyIsEnumerable");
    public static JSBuiltin Object_toLocaleString = getFrom(enumReflected, "Object_toLocaleString");
    public static JSBuiltin Object_toString = getFrom(enumReflected, "Object_toString");
    public static JSBuiltin Object_valueOf = getFrom(enumReflected, "Object_valueOf");
    public static JSBuiltin RegExp_compile = getFrom(enumReflected, "RegExp_compile");
    public static JSBuiltin RegExp_exec = getFrom(enumReflected, "RegExp_exec");
    public static JSBuiltin RegExp_test = getFrom(enumReflected, "RegExp_test");
    public static JSBuiltin RegExp_toString = getFrom(enumReflected, "RegExp_toString");
    public static JSBuiltin String_anchor = getFrom(enumReflected, "String_anchor");
    public static JSBuiltin String_big = getFrom(enumReflected, "String_big");
    public static JSBuiltin String_blink = getFrom(enumReflected, "String_blink");
    public static JSBuiltin String_bold = getFrom(enumReflected, "String_bold");
    public static JSBuiltin String_charAt = getFrom(enumReflected, "String_charAt");
    public static JSBuiltin String_charCodeAt = getFrom(enumReflected, "String_charCodeAt");
    public static JSBuiltin String_concat = getFrom(enumReflected, "String_concat");
    public static JSBuiltin String_fixed = getFrom(enumReflected, "String_fixed");
    public static JSBuiltin String_fontcolor = getFrom(enumReflected, "String_fontcolor");
    public static JSBuiltin String_fontsize = getFrom(enumReflected, "String_fontsize");
    public static JSBuiltin String_fromCharCode = getFrom(enumReflected, "String_fromCharCode");
    public static JSBuiltin String_indexOf = getFrom(enumReflected, "String_indexOf");
    public static JSBuiltin String_italics = getFrom(enumReflected, "String_italics");
    public static JSBuiltin String_lastIndexOf = getFrom(enumReflected, "String_lastIndexOf");
    public static JSBuiltin String_link = getFrom(enumReflected, "String_link");
    public static JSBuiltin String_localeCompare = getFrom(enumReflected, "String_localeCompare");
    public static JSBuiltin String_match = getFrom(enumReflected, "String_match");
    public static JSBuiltin String_replace = getFrom(enumReflected, "String_replace");
    public static JSBuiltin String_search = getFrom(enumReflected, "String_search");
    public static JSBuiltin String_slice = getFrom(enumReflected, "String_slice");
    public static JSBuiltin String_small = getFrom(enumReflected, "String_small");
    public static JSBuiltin String_split = getFrom(enumReflected, "String_split");
    public static JSBuiltin String_strike = getFrom(enumReflected, "String_strike");
    public static JSBuiltin String_sub = getFrom(enumReflected, "String_sub");
    public static JSBuiltin String_substr = getFrom(enumReflected, "String_substr");
    public static JSBuiltin String_substring = getFrom(enumReflected, "String_substring");
    public static JSBuiltin String_sup = getFrom(enumReflected, "String_sup");
    public static JSBuiltin String_toLocaleLowerCase = getFrom(enumReflected, "String_toLocaleLowerCase");
    public static JSBuiltin String_toLocaleUpperCase = getFrom(enumReflected, "String_toLocaleUpperCase");
    public static JSBuiltin String_toLowerCase = getFrom(enumReflected, "String_toLowerCase");
    public static JSBuiltin String_toString = getFrom(enumReflected, "String_toString");
    public static JSBuiltin String_toUpperCase = getFrom(enumReflected, "String_toUpperCase");
    public static JSBuiltin String_valueOf = getFrom(enumReflected, "String_valueOf");
    public static JSBuiltin VBArray_dimensions = getFrom(enumReflected, "VBArray_dimensions");
    public static JSBuiltin VBArray_getItem = getFrom(enumReflected, "VBArray_getItem");
    public static JSBuiltin VBArray_lbound = getFrom(enumReflected, "VBArray_lbound");
    public static JSBuiltin VBArray_toArray = getFrom(enumReflected, "VBArray_toArray");
    public static JSBuiltin VBArray_ubound = getFrom(enumReflected, "VBArray_ubound");


    // Flags management section


}