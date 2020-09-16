/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.diagnostics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.diagnostics.CorrelationManager;
import system.diagnostics.TraceListenerCollection;


/**
 * The base .NET class managing System.Diagnostics.Trace, System.Diagnostics.TraceSource, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Trace" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Diagnostics.Trace</a>
 */
public class Trace extends NetObject  {
    /**
     * Fully assembly qualified name: System.Diagnostics.TraceSource, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Diagnostics.TraceSource, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Diagnostics.TraceSource
     */
    public static final String assemblyShortName = "System.Diagnostics.TraceSource";
    /**
     * Qualified class name: System.Diagnostics.Trace
     */
    public static final String className = "System.Diagnostics.Trace";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
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

    public Trace(Object instance) throws Throwable {
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
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Trace}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Trace} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Trace cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Trace(from.getJCOInstance());
    }

    // Constructors section
    
    public Trace() throws Throwable {
    }



    
    // Methods section
    
    public static void Assert(boolean condition, java.lang.String message, java.lang.String detailMessage) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assert", condition, message, detailMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Assert(boolean condition, java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assert", condition, message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Assert(boolean condition) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Assert", condition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Close() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Close");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Fail(java.lang.String message, java.lang.String detailMessage) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Fail", message, detailMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Fail(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Fail", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Flush() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Flush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Indent() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Indent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Refresh() throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Refresh");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void TraceError(java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("TraceError", format, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void TraceError(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("TraceError", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void TraceInformation(java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("TraceInformation", format, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void TraceInformation(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("TraceInformation", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void TraceWarning(java.lang.String format, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("TraceWarning", format, toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void TraceWarning(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException, system.FormatException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("TraceWarning", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Unindent() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Unindent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Write(NetObject value, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Write", value == null ? null : value.getJCOInstance(), category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Write(NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Write", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Write(java.lang.String message, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Write", message, category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void Write(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("Write", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteIf(boolean condition, NetObject value, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteIf", condition, value == null ? null : value.getJCOInstance(), category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteIf(boolean condition, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteIf", condition, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteIf(boolean condition, java.lang.String message, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteIf", condition, message, category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteIf(boolean condition, java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteIf", condition, message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLine(NetObject value, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLine", value == null ? null : value.getJCOInstance(), category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLine(NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLine", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLine(java.lang.String message, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLine", message, category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLine(java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLine", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLineIf(boolean condition, NetObject value, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLineIf", condition, value == null ? null : value.getJCOInstance(), category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLineIf(boolean condition, NetObject value) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLineIf", condition, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLineIf(boolean condition, java.lang.String message, java.lang.String category) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLineIf", condition, message, category);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void WriteLineIf(boolean condition, java.lang.String message) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("WriteLineIf", condition, message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static boolean getAutoFlush() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("AutoFlush");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setAutoFlush(boolean AutoFlush) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("AutoFlush", AutoFlush);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static boolean getUseGlobalLock() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Get("UseGlobalLock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setUseGlobalLock(boolean UseGlobalLock) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("UseGlobalLock", UseGlobalLock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getIndentLevel() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("IndentLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setIndentLevel(int IndentLevel) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("IndentLevel", IndentLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getIndentSize() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("IndentSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void setIndentSize(int IndentSize) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Set("IndentSize", IndentSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static CorrelationManager getCorrelationManager() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("CorrelationManager");
            return new CorrelationManager(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static TraceListenerCollection getListeners() throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Listeners");
            return new TraceListenerCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}