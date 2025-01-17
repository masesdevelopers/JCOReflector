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

package accessibility;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import accessibility._RemotableHandle;
import system.UInt32;
import system.Guid;
import accessibility.IAccPropServer;
import accessibility.IAccPropServerImplementation;
import accessibility.AnnoScope;


/**
 * The base .NET class managing Accessibility.IAccPropServices, Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Accessibility.IAccPropServices" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Accessibility.IAccPropServices</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public interface IAccPropServices extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: Accessibility
     */
    public static final String assemblyShortName = "Accessibility";
    /**
     * Qualified class name: Accessibility.IAccPropServices
     */
    public static final String className = "Accessibility.IAccPropServices";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IAccPropServices}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IAccPropServices} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IAccPropServices ToIAccPropServices(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Accessibility, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IAccPropServicesImplementation(from.getJCOInstance());
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
    
    public void ClearHmenuProps(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, JCORefOut<Guid> paProps, int cProps) throws Throwable;

    public void ClearHwndProps(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, JCORefOut<Guid> paProps, int cProps) throws Throwable;

    public void ClearProps(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Byte>> pIDString, UInt32 dwIDStringLen, JCORefOut<Guid> paProps, int cProps) throws Throwable;

    public void SetHmenuProp(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, Guid idProp, NetObject var) throws Throwable;

    public void SetHmenuPropServer(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, JCORefOut<Guid> paProps, int cProps, IAccPropServer pServer, AnnoScope AnnoScope) throws Throwable;

    public void SetHmenuPropStr(JCORefOut<_RemotableHandle> hmenu, UInt32 idChild, Guid idProp, java.lang.String str) throws Throwable;

    public void SetHwndProp(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, Guid idProp, NetObject var) throws Throwable;

    public void SetHwndPropServer(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, JCORefOut<Guid> paProps, int cProps, IAccPropServer pServer, AnnoScope AnnoScope) throws Throwable;

    public void SetHwndPropStr(JCORefOut<_RemotableHandle> hwnd, UInt32 idObject, UInt32 idChild, Guid idProp, java.lang.String str) throws Throwable;

    public void SetPropServer(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Byte>> pIDString, UInt32 dwIDStringLen, JCORefOut<Guid> paProps, int cProps, IAccPropServer pServer, AnnoScope AnnoScope) throws Throwable;

    public void SetPropValue(JCORefOut<java.util.concurrent.atomic.AtomicReference<java.lang.Byte>> pIDString, UInt32 dwIDStringLen, Guid idProp, NetObject var) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}