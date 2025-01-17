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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Guid;
import system.reflection.Assembly;
import system.runtime.interopservices.TypeLibExporterFlags;
import system.runtime.interopservices.ITypeLibExporterNotifySink;
import system.runtime.interopservices.ITypeLibExporterNotifySinkImplementation;
import system.reflection.emit.AssemblyBuilder;
import system.runtime.interopservices.ITypeLibImporterNotifySink;
import system.runtime.interopservices.ITypeLibImporterNotifySinkImplementation;
import system.reflection.StrongNameKeyPair;
import system.runtime.interopservices.TypeLibImporterFlags;
import system.Version;


/**
 * The base .NET class managing System.Runtime.InteropServices.TypeLibConverter, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.TypeLibConverter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.TypeLibConverter</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class TypeLibConverter extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.InteropServices.TypeLibConverter
     */
    public static final String className = "System.Runtime.InteropServices.TypeLibConverter";
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
    public TypeLibConverter(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TypeLibConverter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TypeLibConverter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TypeLibConverter cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TypeLibConverter(from.getJCOInstance());
    }

    // Constructors section
    
    public TypeLibConverter() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean GetPrimaryInteropAssembly(Guid g, int major, int minor, int lcid, JCORefOut asmName, JCORefOut asmCodeBase) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ObjectDisposedException, system.OutOfMemoryException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("GetPrimaryInteropAssembly", g == null ? null : g.getJCOInstance(), major, minor, lcid, asmName.getJCRefOut(), asmCodeBase.getJCRefOut());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject ConvertAssemblyToTypeLib(Assembly assembly, java.lang.String strTypeLibName, TypeLibExporterFlags flags, ITypeLibExporterNotifySink notifySink) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertAssemblyToTypeLib = (JCObject)classInstance.Invoke("ConvertAssemblyToTypeLib", assembly == null ? null : assembly.getJCOInstance(), strTypeLibName, flags == null ? null : flags.getJCOInstance(), notifySink == null ? null : notifySink.getJCOInstance());
            return new NetObject(objConvertAssemblyToTypeLib);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject typeLib, java.lang.String asmFileName, int flags, ITypeLibImporterNotifySink notifySink, byte[] publicKey, StrongNameKeyPair keyPair, boolean unsafeInterfaces) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotImplementedException, system.FormatException, system.TypeLoadException, system.security.SecurityException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertTypeLibToAssembly = (JCObject)classInstance.Invoke("ConvertTypeLibToAssembly", typeLib == null ? null : typeLib.getJCOInstance(), asmFileName, flags, notifySink == null ? null : notifySink.getJCOInstance(), publicKey, keyPair == null ? null : keyPair.getJCOInstance(), unsafeInterfaces);
            return new AssemblyBuilder(objConvertTypeLibToAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject dupParam0, java.lang.String dupParam1, int dupParam2, ITypeLibImporterNotifySink dupParam3, JCORefOut dupParam4, StrongNameKeyPair dupParam5, boolean dupParam6) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotImplementedException, system.FormatException, system.TypeLoadException, system.security.SecurityException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertTypeLibToAssembly = (JCObject)classInstance.Invoke("ConvertTypeLibToAssembly", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2, dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4.getJCRefOut(), dupParam5 == null ? null : dupParam5.getJCOInstance(), dupParam6);
            return new AssemblyBuilder(objConvertTypeLibToAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject typeLib, java.lang.String asmFileName, TypeLibImporterFlags flags, ITypeLibImporterNotifySink notifySink, byte[] publicKey, StrongNameKeyPair keyPair, java.lang.String asmNamespace, Version asmVersion) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotImplementedException, system.FormatException, system.TypeLoadException, system.security.SecurityException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertTypeLibToAssembly = (JCObject)classInstance.Invoke("ConvertTypeLibToAssembly", typeLib == null ? null : typeLib.getJCOInstance(), asmFileName, flags == null ? null : flags.getJCOInstance(), notifySink == null ? null : notifySink.getJCOInstance(), publicKey, keyPair == null ? null : keyPair.getJCOInstance(), asmNamespace, asmVersion == null ? null : asmVersion.getJCOInstance());
            return new AssemblyBuilder(objConvertTypeLibToAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject dupParam0, java.lang.String dupParam1, TypeLibImporterFlags dupParam2, ITypeLibImporterNotifySink dupParam3, JCORefOut dupParam4, StrongNameKeyPair dupParam5, java.lang.String dupParam6, Version dupParam7) throws Throwable, system.ArgumentNullException, system.NullReferenceException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotImplementedException, system.FormatException, system.TypeLoadException, system.security.SecurityException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objConvertTypeLibToAssembly = (JCObject)classInstance.Invoke("ConvertTypeLibToAssembly", dupParam0 == null ? null : dupParam0.getJCOInstance(), dupParam1, dupParam2 == null ? null : dupParam2.getJCOInstance(), dupParam3 == null ? null : dupParam3.getJCOInstance(), dupParam4.getJCRefOut(), dupParam5 == null ? null : dupParam5.getJCOInstance(), dupParam6, dupParam7 == null ? null : dupParam7.getJCOInstance());
            return new AssemblyBuilder(objConvertTypeLibToAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}