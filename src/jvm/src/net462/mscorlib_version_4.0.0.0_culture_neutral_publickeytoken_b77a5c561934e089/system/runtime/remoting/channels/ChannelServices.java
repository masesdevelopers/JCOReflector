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

package system.runtime.remoting.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.runtime.remoting.channels.IChannel;
import system.runtime.remoting.channels.IChannelImplementation;
import system.runtime.remoting.channels.IServerChannelSink;
import system.runtime.remoting.channels.IServerChannelSinkImplementation;
import system.runtime.remoting.channels.IServerChannelSinkProvider;
import system.runtime.remoting.channels.IServerChannelSinkProviderImplementation;
import system.runtime.remoting.channels.IChannelReceiver;
import system.runtime.remoting.channels.IChannelReceiverImplementation;
import system.runtime.remoting.channels.ServerProcessing;
import system.runtime.remoting.channels.IServerChannelSinkStack;
import system.runtime.remoting.channels.IServerChannelSinkStackImplementation;
import system.runtime.remoting.messaging.IMessage;
import system.runtime.remoting.messaging.IMessageImplementation;
import system.runtime.remoting.messaging.IMessageCtrl;
import system.runtime.remoting.messaging.IMessageCtrlImplementation;
import system.runtime.remoting.messaging.IMessageSink;
import system.runtime.remoting.messaging.IMessageSinkImplementation;
import system.MarshalByRefObject;


/**
 * The base .NET class managing System.Runtime.Remoting.Channels.ChannelServices, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Channels.ChannelServices" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Channels.ChannelServices</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ChannelServices extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Runtime.Remoting.Channels.ChannelServices
     */
    public static final String className = "System.Runtime.Remoting.Channels.ChannelServices";
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
    public ChannelServices(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ChannelServices}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ChannelServices} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ChannelServices cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ChannelServices(from.getJCOInstance());
    }

    // Constructors section
    
    public ChannelServices() throws Throwable {
    }



    
    // Methods section
    
    public static IDictionary GetChannelSinkProperties(NetObject obj) throws Throwable, system.ArgumentOutOfRangeException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetChannelSinkProperties = (JCObject)classType.Invoke("GetChannelSinkProperties", obj == null ? null : obj.getJCOInstance());
            return new IDictionaryImplementation(objGetChannelSinkProperties);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IChannel GetChannel(java.lang.String name) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetChannel = (JCObject)classType.Invoke("GetChannel", name);
            return new IChannelImplementation(objGetChannel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IServerChannelSink CreateServerChannelSinkChain(IServerChannelSinkProvider provider, IChannelReceiver channel) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateServerChannelSinkChain = (JCObject)classType.Invoke("CreateServerChannelSinkChain", provider == null ? null : provider.getJCOInstance(), channel == null ? null : channel.getJCOInstance());
            return new IServerChannelSinkImplementation(objCreateServerChannelSinkChain);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ServerProcessing DispatchMessage(IServerChannelSinkStack sinkStack, IMessage msg, JCORefOut<IMessage> replyMsg) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.runtime.remoting.RemotingException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDispatchMessage = (JCObject)classType.Invoke("DispatchMessage", sinkStack == null ? null : sinkStack.getJCOInstance(), msg == null ? null : msg.getJCOInstance(), replyMsg.getJCRefOut());
            return new ServerProcessing(objDispatchMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMessage SyncDispatchMessage(IMessage msg) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.runtime.remoting.RemotingException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSyncDispatchMessage = (JCObject)classType.Invoke("SyncDispatchMessage", msg == null ? null : msg.getJCOInstance());
            return new IMessageImplementation(objSyncDispatchMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IMessageCtrl AsyncDispatchMessage(IMessage msg, IMessageSink replySink) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.runtime.remoting.RemotingException, system.globalization.CultureNotFoundException, system.security.SecurityException, system.InvalidOperationException, system.NotImplementedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.NullReferenceException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAsyncDispatchMessage = (JCObject)classType.Invoke("AsyncDispatchMessage", msg == null ? null : msg.getJCOInstance(), replySink == null ? null : replySink.getJCOInstance());
            return new IMessageCtrlImplementation(objAsyncDispatchMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String[] GetUrlsForObject(MarshalByRefObject obj) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("GetUrlsForObject", obj == null ? null : obj.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexGetUrlsForObject = 0; indexGetUrlsForObject < resultingArrayList.size(); indexGetUrlsForObject++ ) {
				resultingArray[indexGetUrlsForObject] = (java.lang.String)resultingArrayList.get(indexGetUrlsForObject);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterChannel(IChannel chnl) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RegisterChannel", chnl == null ? null : chnl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void RegisterChannel(IChannel chnl, boolean ensureSecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("RegisterChannel", chnl == null ? null : chnl.getJCOInstance(), ensureSecurity);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void UnregisterChannel(IChannel chnl) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.runtime.remoting.RemotingException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("UnregisterChannel", chnl == null ? null : chnl.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public final static IChannel[] getRegisteredChannels() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<IChannel> resultingArrayList = new ArrayList<IChannel>();
            JCObject resultingObjects = (JCObject)classType.Get("RegisteredChannels");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IChannelImplementation(resultingObject));
            }
            IChannel[] resultingArray = new IChannel[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}