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

package system.windows.media;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.HitTestFilterBehavior;
import system.windows.DependencyObject;
import system.windows.media.IHitTestFilterCallback;
/**
 * The base .NET class managing System.Windows.Media.HitTestFilterCallback, PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link JCDelegate}. Implements {@link IJCEventEmit}, {@link IJCOBridgeReflected}
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.HitTestFilterCallback" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.HitTestFilterCallback</a>
 */
public class HitTestFilterCallback extends JCDelegate implements IJCEventEmit, IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.HitTestFilterCallback
     */
    public static final String className = "System.Windows.Media.HitTestFilterCallback";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    JCObject classInstance = null;
    IHitTestFilterCallback callerInstance = null;

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

    public Object getJCOInstance() {
        return this;
    }

    public JCType getJCOType() {
        return classType;
    }

    public final Object EventRaised(Object... argsFromJCOBridge) {
        try
        {
            DependencyObject potentialHitTestTarget = argsFromJCOBridge[0] == null ? null : new DependencyObject(argsFromJCOBridge[0]);


            HitTestFilterBehavior retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(potentialHitTestTarget);
            } else {
                retVal = Invoke(potentialHitTestTarget);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public final Object DelegateInvoked(Object... argsFromJCOBridge) {
        try
        {
            DependencyObject potentialHitTestTarget = argsFromJCOBridge[0] == null ? null : new DependencyObject(argsFromJCOBridge[0]);


            HitTestFilterBehavior retVal;
            if (callerInstance != null)	{
                retVal = callerInstance.Invoke(potentialHitTestTarget);
            } else {
                retVal = Invoke(potentialHitTestTarget);
            }
            return (retVal == null) ? null : retVal.getJCOInstance();
        }
        catch (Throwable throwableFromJCEvent)
        {
            JCOReflector.writeLog(throwableFromJCEvent);
			return null;
        }
    }

    public HitTestFilterCallback() {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
    }

    public HitTestFilterCallback(IHitTestFilterCallback instance) {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        callerInstance = instance;
    }

    public HitTestFilterCallback(Object instance) throws Throwable {
        super(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        if (instance == null) throw new IllegalArgumentException("Instance cannot be null");
        if (instance instanceof IHitTestFilterCallback) {
            callerInstance = (IHitTestFilterCallback) instance;
        } else if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new UnsupportedOperationException(
                    String.format("Class %s is not supported.", instance.getClass().getTypeName()));
    }

    protected final static <T extends IJCOBridgeReflected> Object toObjectFromArray(T[] input) {
        return JCOBridgeInstance.toObjectFromArray(input);
    }

    static protected Throwable translateException(JCNativeException ne) throws Throwable {
        return JCOBridgeInstance.translateException(ne);
    }

    public HitTestFilterBehavior DynamicInvoke(DependencyObject potentialHitTestTarget) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDynamicInvoke = (JCObject)classInstance.Invoke("DynamicInvoke", potentialHitTestTarget == null ? null : potentialHitTestTarget.getJCOInstance());
            return new HitTestFilterBehavior(objDynamicInvoke);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * Methods invoked in JVM when an event is raised in CLR 
     */
    public HitTestFilterBehavior Invoke(DependencyObject potentialHitTestTarget) {
        return null;
    }
}