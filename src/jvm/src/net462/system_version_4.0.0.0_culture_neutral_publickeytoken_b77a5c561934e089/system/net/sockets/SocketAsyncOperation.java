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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.Sockets.SocketAsyncOperation, System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.SocketAsyncOperation" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.SocketAsyncOperation</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SocketAsyncOperation extends NetObject  {
    /**
     * Fully assembly qualified name: System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System
     */
    public static final String assemblyShortName = "System";
    /**
     * Qualified class name: System.Net.Sockets.SocketAsyncOperation
     */
    public static final String className = "System.Net.Sockets.SocketAsyncOperation";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

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

    static JCEnum createEnum() {
        try {
            String enumToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating Enum %s", enumToCreate);
            JCEnum enumCreated = bridge.GetEnum(enumToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created Enum: %s",
                        (enumCreated != null) ? enumCreated.toString() : "Returned null value");
            return enumCreated;
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
    public SocketAsyncOperation(java.lang.Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                JCOReflector.writeLog(t);
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public SocketAsyncOperation() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            JCOReflector.writeLog(jcne);
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
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static SocketAsyncOperation getFrom(JCEnum object, String value) {
        try {
            return new SocketAsyncOperation(object.fromValue(value));
        } catch (JCException e) {
            return new SocketAsyncOperation(object);
        }
    }

    // Enum fields section
    
    public static SocketAsyncOperation None = getFrom(enumReflected, "None");
    public static SocketAsyncOperation Accept = getFrom(enumReflected, "Accept");
    public static SocketAsyncOperation Connect = getFrom(enumReflected, "Connect");
    public static SocketAsyncOperation Disconnect = getFrom(enumReflected, "Disconnect");
    public static SocketAsyncOperation Receive = getFrom(enumReflected, "Receive");
    public static SocketAsyncOperation ReceiveFrom = getFrom(enumReflected, "ReceiveFrom");
    public static SocketAsyncOperation ReceiveMessageFrom = getFrom(enumReflected, "ReceiveMessageFrom");
    public static SocketAsyncOperation Send = getFrom(enumReflected, "Send");
    public static SocketAsyncOperation SendPackets = getFrom(enumReflected, "SendPackets");
    public static SocketAsyncOperation SendTo = getFrom(enumReflected, "SendTo");


    // Flags management section


}