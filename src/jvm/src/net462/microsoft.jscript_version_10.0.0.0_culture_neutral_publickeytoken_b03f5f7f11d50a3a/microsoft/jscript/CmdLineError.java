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
 * The base .NET class managing Microsoft.JScript.CmdLineError, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.CmdLineError" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.CmdLineError</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class CmdLineError extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.CmdLineError
     */
    public static final String className = "Microsoft.JScript.CmdLineError";
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
    public CmdLineError(java.lang.Object instance) {
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

    public CmdLineError() {
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

    final static CmdLineError getFrom(JCEnum object, String value) {
        try {
            return new CmdLineError(object.fromValue(value));
        } catch (JCException e) {
            return new CmdLineError(object);
        }
    }

    // Enum fields section
    
    public static CmdLineError NoError = getFrom(enumReflected, "NoError");
    public static CmdLineError AssemblyNotFound = getFrom(enumReflected, "AssemblyNotFound");
    public static CmdLineError CannotCreateEngine = getFrom(enumReflected, "CannotCreateEngine");
    public static CmdLineError CompilerConstant = getFrom(enumReflected, "CompilerConstant");
    public static CmdLineError DuplicateFileAsSourceAndAssembly = getFrom(enumReflected, "DuplicateFileAsSourceAndAssembly");
    public static CmdLineError DuplicateResourceFile = getFrom(enumReflected, "DuplicateResourceFile");
    public static CmdLineError DuplicateResourceName = getFrom(enumReflected, "DuplicateResourceName");
    public static CmdLineError DuplicateSourceFile = getFrom(enumReflected, "DuplicateSourceFile");
    public static CmdLineError ErrorSavingCompiledState = getFrom(enumReflected, "ErrorSavingCompiledState");
    public static CmdLineError InvalidAssembly = getFrom(enumReflected, "InvalidAssembly");
    public static CmdLineError InvalidCodePage = getFrom(enumReflected, "InvalidCodePage");
    public static CmdLineError InvalidDefinition = getFrom(enumReflected, "InvalidDefinition");
    public static CmdLineError InvalidLocaleID = getFrom(enumReflected, "InvalidLocaleID");
    public static CmdLineError InvalidTarget = getFrom(enumReflected, "InvalidTarget");
    public static CmdLineError InvalidSourceFile = getFrom(enumReflected, "InvalidSourceFile");
    public static CmdLineError InvalidWarningLevel = getFrom(enumReflected, "InvalidWarningLevel");
    public static CmdLineError MultipleOutputNames = getFrom(enumReflected, "MultipleOutputNames");
    public static CmdLineError MultipleTargets = getFrom(enumReflected, "MultipleTargets");
    public static CmdLineError MissingDefineArgument = getFrom(enumReflected, "MissingDefineArgument");
    public static CmdLineError MissingExtension = getFrom(enumReflected, "MissingExtension");
    public static CmdLineError MissingLibArgument = getFrom(enumReflected, "MissingLibArgument");
    public static CmdLineError MissingVersionInfo = getFrom(enumReflected, "MissingVersionInfo");
    public static CmdLineError ManagedResourceNotFound = getFrom(enumReflected, "ManagedResourceNotFound");
    public static CmdLineError NestedResponseFiles = getFrom(enumReflected, "NestedResponseFiles");
    public static CmdLineError NoCodePage = getFrom(enumReflected, "NoCodePage");
    public static CmdLineError NoFileName = getFrom(enumReflected, "NoFileName");
    public static CmdLineError NoInputSourcesSpecified = getFrom(enumReflected, "NoInputSourcesSpecified");
    public static CmdLineError NoLocaleID = getFrom(enumReflected, "NoLocaleID");
    public static CmdLineError NoWarningLevel = getFrom(enumReflected, "NoWarningLevel");
    public static CmdLineError ResourceNotFound = getFrom(enumReflected, "ResourceNotFound");
    public static CmdLineError UnknownOption = getFrom(enumReflected, "UnknownOption");
    public static CmdLineError InvalidVersion = getFrom(enumReflected, "InvalidVersion");
    public static CmdLineError SourceFileTooBig = getFrom(enumReflected, "SourceFileTooBig");
    public static CmdLineError MultipleWin32Resources = getFrom(enumReflected, "MultipleWin32Resources");
    public static CmdLineError MissingReference = getFrom(enumReflected, "MissingReference");
    public static CmdLineError SourceNotFound = getFrom(enumReflected, "SourceNotFound");
    public static CmdLineError InvalidCharacters = getFrom(enumReflected, "InvalidCharacters");
    public static CmdLineError InvalidForCompilerOptions = getFrom(enumReflected, "InvalidForCompilerOptions");
    public static CmdLineError IncompatibleTargets = getFrom(enumReflected, "IncompatibleTargets");
    public static CmdLineError InvalidPlatform = getFrom(enumReflected, "InvalidPlatform");
    public static CmdLineError LAST = getFrom(enumReflected, "LAST");
    public static CmdLineError Unspecified = getFrom(enumReflected, "Unspecified");


    // Flags management section


}