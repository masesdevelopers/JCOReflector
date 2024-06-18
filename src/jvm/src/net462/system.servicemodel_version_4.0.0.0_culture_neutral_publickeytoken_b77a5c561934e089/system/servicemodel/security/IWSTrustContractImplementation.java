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

package system.servicemodel.security;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.servicemodel.channels.Message;
import system.AsyncCallback;


/**
 * The base .NET class managing System.ServiceModel.Security.IWSTrustContract, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.IWSTrustContract" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Security.IWSTrustContract</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class IWSTrustContractImplementation extends NetObject implements IWSTrustContract {
    /**
     * Fully assembly qualified name: System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.ServiceModel
     */
    public static final String assemblyShortName = "System.ServiceModel";
    /**
     * Qualified class name: System.ServiceModel.Security.IWSTrustContract
     */
    public static final String className = "System.ServiceModel.Security.IWSTrustContract";
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
    public IWSTrustContractImplementation(java.lang.Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IWSTrustContract}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IWSTrustContract} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IWSTrustContract ToIWSTrustContract(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IWSTrustContractImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public IAsyncResult BeginCancel(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginCancel = (JCObject)classInstance.Invoke("BeginCancel", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginIssue(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginIssue = (JCObject)classInstance.Invoke("BeginIssue", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginRenew(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginRenew = (JCObject)classInstance.Invoke("BeginRenew", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IAsyncResult BeginValidate(Message message, AsyncCallback callback, NetObject asyncState) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginValidate = (JCObject)classInstance.Invoke("BeginValidate", message == null ? null : message.getJCOInstance(), callback, asyncState == null ? null : asyncState.getJCOInstance());
            return new IAsyncResultImplementation(objBeginValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Cancel(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCancel = (JCObject)classInstance.Invoke("Cancel", message == null ? null : message.getJCOInstance());
            return new Message(objCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndCancel(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndCancel = (JCObject)classInstance.Invoke("EndCancel", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndCancel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndIssue(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndIssue = (JCObject)classInstance.Invoke("EndIssue", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndRenew(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndRenew = (JCObject)classInstance.Invoke("EndRenew", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message EndValidate(IAsyncResult asyncResult) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objEndValidate = (JCObject)classInstance.Invoke("EndValidate", asyncResult == null ? null : asyncResult.getJCOInstance());
            return new Message(objEndValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Issue(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIssue = (JCObject)classInstance.Invoke("Issue", message == null ? null : message.getJCOInstance());
            return new Message(objIssue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Renew(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objRenew = (JCObject)classInstance.Invoke("Renew", message == null ? null : message.getJCOInstance());
            return new Message(objRenew);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Message Validate(Message message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objValidate = (JCObject)classInstance.Invoke("Validate", message == null ? null : message.getJCOInstance());
            return new Message(objValidate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}