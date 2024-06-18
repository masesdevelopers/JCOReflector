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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.build.utilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.MarshalByRefObject;
import microsoft.build.framework.IBuildEngine;
import microsoft.build.framework.IBuildEngineImplementation;
import microsoft.build.framework.ITask;
import microsoft.build.framework.ITaskImplementation;
import microsoft.build.framework.MessageImportance;
import system.io.TextReader;
import system.resources.ResourceManager;


/**
 * The base .NET class managing Microsoft.Build.Utilities.TaskLoggingHelper, Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Utilities.TaskLoggingHelper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Utilities.TaskLoggingHelper</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class TaskLoggingHelper extends MarshalByRefObject  {
    /**
     * Fully assembly qualified name: Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Utilities.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Utilities.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Utilities.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Utilities.TaskLoggingHelper
     */
    public static final String className = "Microsoft.Build.Utilities.TaskLoggingHelper";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

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
    public TaskLoggingHelper(java.lang.Object instance) throws Throwable {
        super(instance);
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TaskLoggingHelper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TaskLoggingHelper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TaskLoggingHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TaskLoggingHelper(from.getJCOInstance());
    }

    // Constructors section
    
    public TaskLoggingHelper() throws Throwable {
    }

    public TaskLoggingHelper(IBuildEngine buildEngine, java.lang.String taskName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(buildEngine == null ? null : buildEngine.getJCOInstance(), taskName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TaskLoggingHelper(ITask taskInstance) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(taskInstance == null ? null : taskInstance.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean LogMessageFromText(java.lang.String lineOfText, MessageImportance messageImportance) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.OverflowException, system.text.regularexpressions.RegexMatchTimeoutException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("LogMessageFromText", lineOfText, messageImportance == null ? null : messageImportance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean LogMessagesFromFile(java.lang.String fileName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.ArgumentException, system.io.PathTooLongException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("LogMessagesFromFile", fileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean LogMessagesFromFile(java.lang.String fileName, MessageImportance messageImportance) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.security.SecurityException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("LogMessagesFromFile", fileName, messageImportance == null ? null : messageImportance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean LogMessagesFromStream(TextReader stream, MessageImportance messageImportance) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.globalization.CultureNotFoundException, system.text.regularexpressions.RegexMatchTimeoutException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("LogMessagesFromStream", stream == null ? null : stream.getJCOInstance(), messageImportance == null ? null : messageImportance.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.runtime.remoting.RemotingException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.TypeInitializationException, system.InvalidOperationException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ExtractMessageCode(java.lang.String message, JCORefOut messageWithoutCodePrefix) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ExtractMessageCode", message, messageWithoutCodePrefix.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String FormatResourceString(java.lang.String resourceName, NetObject... args) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("FormatResourceString", resourceName, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String FormatString(java.lang.String unformatted, NetObject... args) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("FormatString", unformatted, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String GetResourceMessage(java.lang.String resourceName) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("GetResourceMessage", resourceName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogCommandLine(MessageImportance importance, java.lang.String commandLine) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogCommandLine", importance == null ? null : importance.getJCOInstance(), commandLine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogCommandLine(java.lang.String commandLine) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogCommandLine", commandLine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogCriticalMessage(java.lang.String subcategory, java.lang.String code, java.lang.String helpKeyword, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogCriticalMessage", subcategory, code, helpKeyword, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogError(java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogError", message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogError(java.lang.String subcategory, java.lang.String errorCode, java.lang.String helpKeyword, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogError", subcategory, errorCode, helpKeyword, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorFromException(NetException exception) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.NotSupportedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorFromException", exception == null ? null : exception.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorFromException(NetException exception, boolean showStackTrace) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.security.SecurityException, system.NotSupportedException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorFromException", exception == null ? null : exception.getJCOInstance(), showStackTrace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorFromException(NetException exception, boolean showStackTrace, boolean showDetail, java.lang.String file) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.NotSupportedException, system.OutOfMemoryException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorFromException", exception == null ? null : exception.getJCOInstance(), showStackTrace, showDetail, file);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorFromResources(java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorFromResources", messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorFromResources(java.lang.String subcategoryResourceName, java.lang.String errorCode, java.lang.String helpKeyword, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorFromResources", subcategoryResourceName, errorCode, helpKeyword, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorWithCodeFromResources(java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorWithCodeFromResources", messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogErrorWithCodeFromResources(java.lang.String subcategoryResourceName, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogErrorWithCodeFromResources", subcategoryResourceName, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogExternalProjectFinished(java.lang.String message, java.lang.String helpKeyword, java.lang.String projectFile, boolean succeeded) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogExternalProjectFinished", message, helpKeyword, projectFile, succeeded);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogExternalProjectStarted(java.lang.String message, java.lang.String helpKeyword, java.lang.String projectFile, java.lang.String targetNames) throws Throwable, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogExternalProjectStarted", message, helpKeyword, projectFile, targetNames);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogMessage(MessageImportance importance, java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogMessage", importance == null ? null : importance.getJCOInstance(), message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogMessage(java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogMessage", message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogMessage(java.lang.String subcategory, java.lang.String code, java.lang.String helpKeyword, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, MessageImportance importance, java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogMessage", subcategory, code, helpKeyword, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, importance == null ? null : importance.getJCOInstance(), message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogMessageFromResources(MessageImportance importance, java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogMessageFromResources", importance == null ? null : importance.getJCOInstance(), messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogMessageFromResources(java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogMessageFromResources", messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarning(java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarning", message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarning(java.lang.String subcategory, java.lang.String warningCode, java.lang.String helpKeyword, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String message, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarning", subcategory, warningCode, helpKeyword, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, message, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarningFromException(NetException exception) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.NotSupportedException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarningFromException", exception == null ? null : exception.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarningFromException(NetException exception, boolean showStackTrace) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.security.SecurityException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarningFromException", exception == null ? null : exception.getJCOInstance(), showStackTrace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarningFromResources(java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarningFromResources", messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarningFromResources(java.lang.String subcategoryResourceName, java.lang.String warningCode, java.lang.String helpKeyword, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarningFromResources", subcategoryResourceName, warningCode, helpKeyword, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarningWithCodeFromResources(java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarningWithCodeFromResources", messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void LogWarningWithCodeFromResources(java.lang.String subcategoryResourceName, java.lang.String file, int lineNumber, int columnNumber, int endLineNumber, int endColumnNumber, java.lang.String messageResourceName, NetObject... messageArgs) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("LogWarningWithCodeFromResources", subcategoryResourceName, file, lineNumber, columnNumber, endLineNumber, endColumnNumber, messageResourceName, toObjectFromArray(messageArgs));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MarkAsInactive() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ObjectDisposedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MarkAsInactive");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHasLoggedErrors() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasLoggedErrors");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ResourceManager getTaskResources() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TaskResources");
            return new ResourceManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTaskResources(ResourceManager TaskResources) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TaskResources", TaskResources == null ? null : TaskResources.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getHelpKeywordPrefix() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("HelpKeywordPrefix");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHelpKeywordPrefix(java.lang.String HelpKeywordPrefix) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HelpKeywordPrefix", HelpKeywordPrefix);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}