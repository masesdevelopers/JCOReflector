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
import system.io.Stream;
import system.runtime.remoting.channels.IServerResponseChannelSinkStack;
import system.runtime.remoting.channels.IServerResponseChannelSinkStackImplementation;
import system.runtime.remoting.messaging.IMessage;
import system.runtime.remoting.messaging.IMessageImplementation;
import system.runtime.remoting.channels.ITransportHeaders;
import system.runtime.remoting.channels.ITransportHeadersImplementation;
import system.runtime.remoting.channels.ServerProcessing;
import system.runtime.remoting.channels.IServerChannelSinkStack;
import system.runtime.remoting.channels.IServerChannelSinkStackImplementation;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.runtime.remoting.channels.IServerChannelSink;
import system.runtime.remoting.channels.IServerChannelSinkImplementation;
import system.runtime.serialization.formatters.TypeFilterLevel;


/**
 * The base .NET class managing System.Runtime.Remoting.Channels.SoapServerFormatterSink, System.Runtime.Remoting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Channels.SoapServerFormatterSink" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Runtime.Remoting.Channels.SoapServerFormatterSink</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SoapServerFormatterSink extends NetObject  {
    /**
     * Fully assembly qualified name: System.Runtime.Remoting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Runtime.Remoting, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Runtime.Remoting
     */
    public static final String assemblyShortName = "System.Runtime.Remoting";
    /**
     * Qualified class name: System.Runtime.Remoting.Channels.SoapServerFormatterSink
     */
    public static final String className = "System.Runtime.Remoting.Channels.SoapServerFormatterSink";
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
    public SoapServerFormatterSink(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SoapServerFormatterSink}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SoapServerFormatterSink} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SoapServerFormatterSink cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SoapServerFormatterSink(from.getJCOInstance());
    }

    // Constructors section
    
    public SoapServerFormatterSink() throws Throwable {
    }



    
    // Methods section
    
    public Stream GetResponseStream(IServerResponseChannelSinkStack sinkStack, NetObject state, IMessage msg, ITransportHeaders headers) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetResponseStream = (JCObject)classInstance.Invoke("GetResponseStream", sinkStack == null ? null : sinkStack.getJCOInstance(), state == null ? null : state.getJCOInstance(), msg == null ? null : msg.getJCOInstance(), headers == null ? null : headers.getJCOInstance());
            return new Stream(objGetResponseStream);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ServerProcessing ProcessMessage(IServerChannelSinkStack sinkStack, IMessage requestMsg, ITransportHeaders requestHeaders, Stream requestStream, JCORefOut<IMessage> responseMsg, JCORefOut<ITransportHeaders> responseHeaders, JCORefOut<Stream> responseStream) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.FormatException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.NullReferenceException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.runtime.remoting.RemotingException, system.security.SecurityException, system.runtime.serialization.SerializationException, system.MissingMemberException, system.RankException, system.runtime.remoting.ServerException, system.OverflowException, system.InvalidCastException, system.OutOfMemoryException, system.web.HttpException, system.web.HttpRequestValidationException, system.UriFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objProcessMessage = (JCObject)classInstance.Invoke("ProcessMessage", sinkStack == null ? null : sinkStack.getJCOInstance(), requestMsg == null ? null : requestMsg.getJCOInstance(), requestHeaders == null ? null : requestHeaders.getJCOInstance(), requestStream == null ? null : requestStream.getJCOInstance(), responseMsg.getJCRefOut(), responseHeaders.getJCRefOut(), responseStream.getJCRefOut());
            return new ServerProcessing(objProcessMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AsyncProcessResponse(IServerResponseChannelSinkStack sinkStack, NetObject state, IMessage msg, ITransportHeaders headers, Stream stream) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.web.HttpException, system.web.HttpRequestValidationException, system.UriFormatException, system.OutOfMemoryException, system.runtime.remoting.RemotingException, system.NullReferenceException, system.FormatException, system.runtime.serialization.SerializationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AsyncProcessResponse", sinkStack == null ? null : sinkStack.getJCOInstance(), state == null ? null : state.getJCOInstance(), msg == null ? null : msg.getJCOInstance(), headers == null ? null : headers.getJCOInstance(), stream == null ? null : stream.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IDictionary getProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new IDictionaryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IServerChannelSink getNextChannelSink() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("NextChannelSink");
            return new IServerChannelSinkImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TypeFilterLevel getTypeFilterLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TypeFilterLevel");
            return new TypeFilterLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypeFilterLevel(TypeFilterLevel TypeFilterLevel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TypeFilterLevel", TypeFilterLevel == null ? null : TypeFilterLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}