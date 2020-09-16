/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
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

package system.net.sockets;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Net.Sockets.ProtocolType, System.Net.Sockets, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.ProtocolType" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Net.Sockets.ProtocolType</a>
 */
public class ProtocolType extends NetObject  {
    /**
     * Fully assembly qualified name: System.Net.Sockets, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Net.Sockets, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Net.Sockets
     */
    public static final String assemblyShortName = "System.Net.Sockets";
    /**
     * Qualified class name: System.Net.Sockets.ProtocolType
     */
    public static final String className = "System.Net.Sockets.ProtocolType";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumReflected = createEnum();
    JCEnum classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    static JCEnum createEnum() {
        try {
            return bridge.GetEnum(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
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

    public ProtocolType(Object instance) {
        super(instance);
        if (instance instanceof JCObject) {
            try {
                String enumName = NetEnum.GetName(classType, (JCObject)instance);
                classInstance = enumReflected.fromValue(enumName);
            } catch (Throwable t) {
                if (JCOBridgeInstance.getDebug())
                    t.printStackTrace();
                classInstance = enumReflected;
            }
        } else if (instance instanceof JCEnum) {
            classInstance = (JCEnum)instance;
        }
    }

    public ProtocolType() {
        super();
        // add reference to assemblyName.dll file
        try {
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
        } catch (Throwable jcne) {
            if (JCOBridgeInstance.getDebug())
                jcne.printStackTrace();
        }
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static ProtocolType getFrom(JCEnum object, String value) {
        try {
            return new ProtocolType(object.fromValue(value));
        } catch (JCException e) {
            return new ProtocolType(object);
        }
    }

    // Enum fields section
    
    public static ProtocolType IPv6HopByHopOptions = getFrom(enumReflected, "IPv6HopByHopOptions");
    public static ProtocolType IP = getFrom(enumReflected, "IP");
    public static ProtocolType Unspecified = getFrom(enumReflected, "Unspecified");
    public static ProtocolType Icmp = getFrom(enumReflected, "Icmp");
    public static ProtocolType Igmp = getFrom(enumReflected, "Igmp");
    public static ProtocolType Ggp = getFrom(enumReflected, "Ggp");
    public static ProtocolType IPv4 = getFrom(enumReflected, "IPv4");
    public static ProtocolType Tcp = getFrom(enumReflected, "Tcp");
    public static ProtocolType Pup = getFrom(enumReflected, "Pup");
    public static ProtocolType Udp = getFrom(enumReflected, "Udp");
    public static ProtocolType Idp = getFrom(enumReflected, "Idp");
    public static ProtocolType IPv6 = getFrom(enumReflected, "IPv6");
    public static ProtocolType IPv6RoutingHeader = getFrom(enumReflected, "IPv6RoutingHeader");
    public static ProtocolType IPv6FragmentHeader = getFrom(enumReflected, "IPv6FragmentHeader");
    public static ProtocolType IPSecEncapsulatingSecurityPayload = getFrom(enumReflected, "IPSecEncapsulatingSecurityPayload");
    public static ProtocolType IPSecAuthenticationHeader = getFrom(enumReflected, "IPSecAuthenticationHeader");
    public static ProtocolType IcmpV6 = getFrom(enumReflected, "IcmpV6");
    public static ProtocolType IPv6NoNextHeader = getFrom(enumReflected, "IPv6NoNextHeader");
    public static ProtocolType IPv6DestinationOptions = getFrom(enumReflected, "IPv6DestinationOptions");
    public static ProtocolType ND = getFrom(enumReflected, "ND");
    public static ProtocolType Raw = getFrom(enumReflected, "Raw");
    public static ProtocolType Ipx = getFrom(enumReflected, "Ipx");
    public static ProtocolType Spx = getFrom(enumReflected, "Spx");
    public static ProtocolType SpxII = getFrom(enumReflected, "SpxII");
    public static ProtocolType Unknown = getFrom(enumReflected, "Unknown");


    // Flags management section


}