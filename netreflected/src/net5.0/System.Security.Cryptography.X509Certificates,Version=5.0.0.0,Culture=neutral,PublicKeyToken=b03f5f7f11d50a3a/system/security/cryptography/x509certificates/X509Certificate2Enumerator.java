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

package system.security.cryptography.x509certificates;

import java.util.Iterator;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.security.cryptography.x509certificates.X509Certificate2;


/**
 * The base .NET class managing System.Security.Cryptography.X509Certificates.X509Certificate2Enumerator, System.Security.Cryptography.X509Certificates, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}. 
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.X509Certificates.X509Certificate2Enumerator" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.Cryptography.X509Certificates.X509Certificate2Enumerator</a>
 */
public class X509Certificate2Enumerator extends NetObject implements Iterator<X509Certificate2> {
    /**
     * Fully assembly qualified name: System.Security.Cryptography.X509Certificates, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.Cryptography.X509Certificates, Version=5.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.Cryptography.X509Certificates
     */
    public static final String assemblyShortName = "System.Security.Cryptography.X509Certificates";
    /**
     * Qualified class name: System.Security.Cryptography.X509Certificates.X509Certificate2Enumerator
     */
    public static final String className = "System.Security.Cryptography.X509Certificates.X509Certificate2Enumerator";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    static JCType classType = createType();
    static JCEnum enumInstance = null;
    Iterator<JCObject> classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException jce) {
            if (JCOBridgeInstance.getDebug())
                jce.printStackTrace();
            return null;
        }
    }

    protected final void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public X509Certificate2Enumerator(JCObject instance) {
        classInstance = instance.iterator();
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

	public final boolean hasNext() {
		return classInstance.hasNext();
	}

	public final X509Certificate2 next() {
		try {
			return new X509Certificate2(classInstance.next());
		} catch (Throwable jce) {
			throw new java.util.NoSuchElementException(jce.getMessage());
		}
	}

}