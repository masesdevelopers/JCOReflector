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

package system.security.accesscontrol;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.accesscontrol.GenericAcl;
import system.security.principal.SecurityIdentifier;
import system.security.accesscontrol.GenericAce;


/**
 * The base .NET class managing System.Security.AccessControl.CommonAcl, System.Security.AccessControl, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.CommonAcl" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Security.AccessControl.CommonAcl</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class CommonAcl extends GenericAcl  {
    /**
     * Fully assembly qualified name: System.Security.AccessControl, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Security.AccessControl, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Security.AccessControl
     */
    public static final String assemblyShortName = "System.Security.AccessControl";
    /**
     * Qualified class name: System.Security.AccessControl.CommonAcl
     */
    public static final String className = "System.Security.AccessControl.CommonAcl";
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
    public CommonAcl(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link CommonAcl}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link CommonAcl} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static CommonAcl cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new CommonAcl(from.getJCOInstance());
    }

    // Constructors section
    
    public CommonAcl() throws Throwable {
    }

    
    // Methods section
    
    public void GetBinaryForm(byte[] binaryForm, int offset) throws Throwable, system.ArrayTypeMismatchException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetBinaryForm", binaryForm, offset);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void GetBinaryForm(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArrayTypeMismatchException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.RankException, system.IndexOutOfRangeException, system.ArgumentException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("GetBinaryForm", dupParam0.getJCRefOut(), dupParam1);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Purge(SecurityIdentifier sid) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Purge", sid == null ? null : sid.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveInheritedAces() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ObjectDisposedException, system.RankException, system.IndexOutOfRangeException, system.ArrayTypeMismatchException, system.InvalidCastException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveInheritedAces");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsCanonical() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsCanonical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsContainer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsContainer");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDS() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDS");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}