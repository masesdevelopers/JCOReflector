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

package system.diagnostics.eventing.reader;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.eventing.reader.EventLogSession;
import system.globalization.CultureInfo;
import system.Guid;
import system.Uri;


/**
 * The base .NET class managing System.Diagnostics.Eventing.Reader.ProviderMetadata, System.Diagnostics.EventLog, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.Reader.ProviderMetadata" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Eventing.Reader.ProviderMetadata</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ProviderMetadata extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: System.Diagnostics.EventLog, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Diagnostics.EventLog, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Diagnostics.EventLog
     */
    public static final String assemblyShortName = "System.Diagnostics.EventLog";
    /**
     * Qualified class name: System.Diagnostics.Eventing.Reader.ProviderMetadata
     */
    public static final String className = "System.Diagnostics.Eventing.Reader.ProviderMetadata";
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
    public ProviderMetadata(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ProviderMetadata}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ProviderMetadata} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ProviderMetadata cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ProviderMetadata(from.getJCOInstance());
    }

    // Constructors section
    
    public ProviderMetadata() throws Throwable {
    }

    public ProviderMetadata(java.lang.String providerName, EventLogSession session, CultureInfo targetCultureInfo) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(providerName, session == null ? null : session.getJCOInstance(), targetCultureInfo == null ? null : targetCultureInfo.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ProviderMetadata(java.lang.String providerName) throws Throwable, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(providerName));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public void Dispose() throws Throwable, system.ObjectDisposedException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public Guid getId() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.AccessViolationException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Id");
            return new Guid(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayName() throws Throwable, system.NotSupportedException, system.ArgumentException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.AccessViolationException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DisplayName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getMessageFilePath() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.AccessViolationException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("MessageFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getParameterFilePath() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.AccessViolationException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ParameterFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getResourceFilePath() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.AccessViolationException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ResourceFilePath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Uri getHelpLink() throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.diagnostics.eventing.reader.EventLogNotFoundException, system.diagnostics.eventing.reader.EventLogInvalidDataException, system.OperationCanceledException, system.diagnostics.eventing.reader.EventLogProviderDisabledException, system.UnauthorizedAccessException, system.diagnostics.eventing.reader.EventLogReadingException, system.diagnostics.eventing.reader.EventLogException, system.OutOfMemoryException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException, system.AccessViolationException, system.ArgumentNullException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.OverflowException, system.runtime.interopservices.ExternalException, system.globalization.CultureNotFoundException, system.diagnostics.UnreachableException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("HelpLink");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}