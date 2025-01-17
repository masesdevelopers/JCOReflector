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

package microsoft.visualbasic.compilerservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Array;
import system.globalization.CultureInfo;
import system.reflection.MethodBase;


/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.Utils, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.Utils" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.Utils</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class Utils extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic";
    /**
     * Qualified class name: Microsoft.VisualBasic.CompilerServices.Utils
     */
    public static final String className = "Microsoft.VisualBasic.CompilerServices.Utils";
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
    public Utils(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Utils}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Utils} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Utils cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Utils(from.getJCOInstance());
    }

    // Constructors section
    
    public Utils() throws Throwable {
    }



    
    // Methods section
    
    public static Array CopyArray(Array arySrc, Array aryDest) throws Throwable, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCopyArray = (JCObject)classType.Invoke("CopyArray", arySrc == null ? null : arySrc.getJCOInstance(), aryDest == null ? null : aryDest.getJCOInstance());
            return new Array(objCopyArray);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject SetCultureInfo(CultureInfo Culture) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.ArgumentException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSetCultureInfo = (JCObject)classType.Invoke("SetCultureInfo", Culture == null ? null : Culture.getJCOInstance());
            return new NetObject(objSetCultureInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetResourceString(java.lang.String ResourceKey, java.lang.String... Args) throws Throwable, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetResourceString", ResourceKey, Args);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String GetResourceString(java.lang.String dupParam0, JCORefOut dupParam1) throws Throwable, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("GetResourceString", dupParam0, dupParam1.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String MethodToString(MethodBase Method) throws Throwable, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NullReferenceException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.OverflowException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("MethodToString", Method == null ? null : Method.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ThrowException(int hr) throws Throwable, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.FormatException, system.globalization.CultureNotFoundException, system.ArgumentException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ThrowException", hr);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}