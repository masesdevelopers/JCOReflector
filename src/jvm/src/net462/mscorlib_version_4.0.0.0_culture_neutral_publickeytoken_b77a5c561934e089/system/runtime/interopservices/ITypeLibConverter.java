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

package system.runtime.interopservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

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
 * The base .NET class managing System.Runtime.InteropServices.ITypeLibConverter, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.ITypeLibConverter" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.ITypeLibConverter</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public interface ITypeLibConverter extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.InteropServices.ITypeLibConverter
     */
    public static final String className = "System.Runtime.InteropServices.ITypeLibConverter";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ITypeLibConverter}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ITypeLibConverter} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ITypeLibConverter ToITypeLibConverter(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new ITypeLibConverterImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link java.lang.Object} representing the instance of the instantiated Class
     */
    public java.lang.Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public boolean GetPrimaryInteropAssembly(Guid g, int major, int minor, int lcid, JCORefOut asmName, JCORefOut asmCodeBase) throws Throwable;

    public NetObject ConvertAssemblyToTypeLib(Assembly assembly, java.lang.String typeLibName, TypeLibExporterFlags flags, ITypeLibExporterNotifySink notifySink) throws Throwable;

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject typeLib, java.lang.String asmFileName, int flags, ITypeLibImporterNotifySink notifySink, byte[] publicKey, StrongNameKeyPair keyPair, boolean unsafeInterfaces) throws Throwable;

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject dupParam0, java.lang.String dupParam1, int dupParam2, ITypeLibImporterNotifySink dupParam3, JCORefOut dupParam4, StrongNameKeyPair dupParam5, boolean dupParam6) throws Throwable;

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject typeLib, java.lang.String asmFileName, TypeLibImporterFlags flags, ITypeLibImporterNotifySink notifySink, byte[] publicKey, StrongNameKeyPair keyPair, java.lang.String asmNamespace, Version asmVersion) throws Throwable;

    public AssemblyBuilder ConvertTypeLibToAssembly(NetObject dupParam0, java.lang.String dupParam1, TypeLibImporterFlags dupParam2, ITypeLibImporterNotifySink dupParam3, JCORefOut dupParam4, StrongNameKeyPair dupParam5, java.lang.String dupParam6, Version dupParam7) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}