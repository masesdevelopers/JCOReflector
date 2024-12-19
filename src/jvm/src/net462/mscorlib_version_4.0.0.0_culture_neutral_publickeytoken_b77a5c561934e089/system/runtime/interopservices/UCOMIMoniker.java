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

// Import section
import system.runtime.interopservices.UCOMIBindCtx;
import system.runtime.interopservices.UCOMIBindCtxImplementation;
import system.runtime.interopservices.UCOMIMoniker;
import system.runtime.interopservices.UCOMIMonikerImplementation;
import system.Guid;
import system.runtime.interopservices.UCOMIEnumMoniker;
import system.runtime.interopservices.UCOMIEnumMonikerImplementation;
import system.runtime.interopservices.FILETIME;
import system.runtime.interopservices.UCOMIStream;
import system.runtime.interopservices.UCOMIStreamImplementation;


/**
 * The base .NET class managing System.Runtime.InteropServices.UCOMIMoniker, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.UCOMIMoniker" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.InteropServices.UCOMIMoniker</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public interface UCOMIMoniker extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.InteropServices.UCOMIMoniker
     */
    public static final String className = "System.Runtime.InteropServices.UCOMIMoniker";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link UCOMIMoniker}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link UCOMIMoniker} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static UCOMIMoniker ToUCOMIMoniker(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new UCOMIMonikerImplementation(from.getJCOInstance());
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
    
    public int IsDirty() throws Throwable;

    public void BindToObject(UCOMIBindCtx pbc, UCOMIMoniker pmkToLeft, JCORefOut<Guid> riidResult, JCORefOut<NetObject> ppvResult) throws Throwable;

    public void BindToStorage(UCOMIBindCtx pbc, UCOMIMoniker pmkToLeft, JCORefOut<Guid> riid, JCORefOut<NetObject> ppvObj) throws Throwable;

    public void CommonPrefixWith(UCOMIMoniker pmkOther, JCORefOut<UCOMIMoniker> ppmkPrefix) throws Throwable;

    public void ComposeWith(UCOMIMoniker pmkRight, boolean fOnlyIfNotGeneric, JCORefOut<UCOMIMoniker> ppmkComposite) throws Throwable;

    public void Enum(boolean fForward, JCORefOut<UCOMIEnumMoniker> ppenumMoniker) throws Throwable;

    public void GetClassID(JCORefOut<Guid> pClassID) throws Throwable;

    public void GetDisplayName(UCOMIBindCtx pbc, UCOMIMoniker pmkToLeft, JCORefOut ppszDisplayName) throws Throwable;

    public void GetSizeMax(JCORefOut<java.util.concurrent.atomic.AtomicLong> pcbSize) throws Throwable;

    public void GetTimeOfLastChange(UCOMIBindCtx pbc, UCOMIMoniker pmkToLeft, JCORefOut<FILETIME> pFileTime) throws Throwable;

    public void Hash(JCORefOut<java.util.concurrent.atomic.AtomicInteger> pdwHash) throws Throwable;

    public void Inverse(JCORefOut<UCOMIMoniker> ppmk) throws Throwable;

    public void IsEqual(UCOMIMoniker pmkOtherMoniker) throws Throwable;

    public void IsRunning(UCOMIBindCtx pbc, UCOMIMoniker pmkToLeft, UCOMIMoniker pmkNewlyRunning) throws Throwable;

    public void IsSystemMoniker(JCORefOut<java.util.concurrent.atomic.AtomicInteger> pdwMksys) throws Throwable;

    public void Load(UCOMIStream pStm) throws Throwable;

    public void ParseDisplayName(UCOMIBindCtx pbc, UCOMIMoniker pmkToLeft, java.lang.String pszDisplayName, JCORefOut<java.util.concurrent.atomic.AtomicInteger> pchEaten, JCORefOut<UCOMIMoniker> ppmkOut) throws Throwable;

    public void Reduce(UCOMIBindCtx pbc, int dwReduceHowFar, JCORefOut<UCOMIMoniker> ppmkToLeft, JCORefOut<UCOMIMoniker> ppmkReduced) throws Throwable;

    public void RelativePathTo(UCOMIMoniker pmkOther, JCORefOut<UCOMIMoniker> ppmkRelPath) throws Throwable;

    public void Save(UCOMIStream pStm, boolean fClearDirty) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}