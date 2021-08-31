/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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

package microsoft.visualbasic.compilerservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.runtime.compilerservices.CallSite;
import microsoft.visualbasic.compilerservices.ISiteDelegate5;
/**
 * The base .NET class managing Microsoft.VisualBasic.CompilerServices.SiteDelegate5, Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link JCDelegate}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.SiteDelegate5" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.VisualBasic.CompilerServices.SiteDelegate5</a>
 */
public class SiteDelegate5 extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.VisualBasic.Core, Version=10.0.5.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.VisualBasic.Core
     */
    public static final String assemblyShortName = "Microsoft.VisualBasic.Core";
    /**
     * Qualified class name: Microsoft.VisualBasic.CompilerServices.SiteDelegate5
     */
    public static final String className = "Microsoft.VisualBasic.CompilerServices.SiteDelegate5";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    ISiteDelegate5 callerInstance = null;

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
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final java.lang.Object EventRaised(java.lang.Object... argsFromJCOBridge) {
        try
        {
            CallSite site = argsFromJCOBridge[0] == null ? null : new CallSite(argsFromJCOBridge[0]);
            NetObject instance = argsFromJCOBridge[1] == null ? null : new NetObject(argsFromJCOBridge[1]);
            NetObject arg0 = argsFromJCOBridge[2] == null ? null : new NetObject(argsFromJCOBridge[2]);
            NetObject arg1 = argsFromJCOBridge[3] == null ? null : new NetObject(argsFromJCOBridge[3]);
            NetObject arg2 = argsFromJCOBridge[4] == null ? null : new NetObject(argsFromJCOBridge[4]);
            NetObject arg3 = argsFromJCOBridge[5] == null ? null : new NetObject(argsFromJCOBridge[5]);
            NetObject arg4 = argsFromJCOBridge[6] == null ? null : new NetObject(argsFromJCOBridge[6]);


            NetObject retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(site, instance, arg0, arg1, arg2, arg3, arg4);
            } else {
                retVal = Invoke(site, instance, arg0, arg1, arg2, arg3, arg4);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public final java.lang.Object DelegateInvoked(java.lang.Object... argsFromJCOBridge) {
        try
        {
            CallSite site = argsFromJCOBridge[0] == null ? null : new CallSite(argsFromJCOBridge[0]);
            NetObject instance = argsFromJCOBridge[1] == null ? null : new NetObject(argsFromJCOBridge[1]);
            NetObject arg0 = argsFromJCOBridge[2] == null ? null : new NetObject(argsFromJCOBridge[2]);
            NetObject arg1 = argsFromJCOBridge[3] == null ? null : new NetObject(argsFromJCOBridge[3]);
            NetObject arg2 = argsFromJCOBridge[4] == null ? null : new NetObject(argsFromJCOBridge[4]);
            NetObject arg3 = argsFromJCOBridge[5] == null ? null : new NetObject(argsFromJCOBridge[5]);
            NetObject arg4 = argsFromJCOBridge[6] == null ? null : new NetObject(argsFromJCOBridge[6]);


            NetObject retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(site, instance, arg0, arg1, arg2, arg3, arg4);
            } else {
                retVal = Invoke(site, instance, arg0, arg1, arg2, arg3, arg4);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public SiteDelegate5() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public SiteDelegate5(ISiteDelegate5 instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }
    /**
     * Internal constructor. Use with caution 
     */
    public SiteDelegate5(java.lang.Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof ISiteDelegate5) {
            callerInstance = (ISiteDelegate5) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> java.lang.Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public NetObject DynamicInvoke(CallSite site, NetObject instance, NetObject arg0, NetObject arg1, NetObject arg2, NetObject arg3, NetObject arg4) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDynamicInvoke = (JCObject)classInstance.Invoke("DynamicInvoke", site == null ? null : site.getJCOInstance(), instance == null ? null : instance.getJCOInstance(), arg0 == null ? null : arg0.getJCOInstance(), arg1 == null ? null : arg1.getJCOInstance(), arg2 == null ? null : arg2.getJCOInstance(), arg3 == null ? null : arg3.getJCOInstance(), arg4 == null ? null : arg4.getJCOInstance());
            return new NetObject(objDynamicInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public NetObject Invoke(CallSite site, NetObject instance, NetObject arg0, NetObject arg1, NetObject arg2, NetObject arg3, NetObject arg4) {
        return null;
    }
}