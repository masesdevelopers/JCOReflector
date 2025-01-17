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

package microsoft.build.tasks.deployment.manifestutilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.security.PermissionSet;
import system.xml.XmlElement;
import system.security.cryptography.x509certificates.X509Certificate2;
import system.Uri;
import system.security.SecureString;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.ManifestUtilities.SecurityUtilities, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Deployment.ManifestUtilities.SecurityUtilities" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Deployment.ManifestUtilities.SecurityUtilities</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class SecurityUtilities extends NetObject  {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Deployment.ManifestUtilities.SecurityUtilities
     */
    public static final String className = "Microsoft.Build.Tasks.Deployment.ManifestUtilities.SecurityUtilities";
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
    public SecurityUtilities(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link SecurityUtilities}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link SecurityUtilities} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static SecurityUtilities cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SecurityUtilities(from.getJCOInstance());
    }

    // Constructors section
    
    public SecurityUtilities() throws Throwable {
    }

    
    // Methods section
    
    public static PermissionSet ComputeZonePermissionSet(java.lang.String targetZone, PermissionSet includedPermissionSet, java.lang.String[] excludedPermissions) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.xml.XmlException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objComputeZonePermissionSet = (JCObject)classType.Invoke("ComputeZonePermissionSet", targetZone, includedPermissionSet == null ? null : includedPermissionSet.getJCOInstance(), excludedPermissions);
            return new PermissionSet(objComputeZonePermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet ComputeZonePermissionSet(java.lang.String dupParam0, PermissionSet dupParam1, JCORefOut dupParam2) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.xml.XmlException, system.NullReferenceException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objComputeZonePermissionSet = (JCObject)classType.Invoke("ComputeZonePermissionSet", dupParam0, dupParam1 == null ? null : dupParam1.getJCOInstance(), dupParam2.getJCRefOut());
            return new PermissionSet(objComputeZonePermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet IdentityListToPermissionSet(java.lang.String[] ids) throws Throwable, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.RankException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objIdentityListToPermissionSet = (JCObject)classType.Invoke("IdentityListToPermissionSet", (java.lang.Object)ids);
            return new PermissionSet(objIdentityListToPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet IdentityListToPermissionSet(JCORefOut dupParam0) throws Throwable, system.ArgumentOutOfRangeException, system.NullReferenceException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.xml.XmlException, system.RankException, system.security.SecurityException, system.reflection.TargetParameterCountException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objIdentityListToPermissionSet = (JCObject)classType.Invoke("IdentityListToPermissionSet", (java.lang.Object)dupParam0.getJCRefOut());
            return new PermissionSet(objIdentityListToPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PermissionSet XmlToPermissionSet(XmlElement element) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.NullReferenceException, system.security.SecurityException, system.NotSupportedException, system.MemberAccessException, system.reflection.TargetException, system.reflection.TargetParameterCountException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objXmlToPermissionSet = (JCObject)classType.Invoke("XmlToPermissionSet", element == null ? null : element.getJCOInstance());
            return new PermissionSet(objXmlToPermissionSet);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String[] PermissionSetToIdentityList(PermissionSet permissionSet) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.NotSupportedException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.NullReferenceException, system.xml.xpath.XPathException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classType.Invoke("PermissionSetToIdentityList", permissionSet == null ? null : permissionSet.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            java.lang.String[] resultingArray = new java.lang.String[resultingArrayList.size()];
            for(int indexPermissionSetToIdentityList = 0; indexPermissionSetToIdentityList < resultingArrayList.size(); indexPermissionSetToIdentityList++ ) {
				resultingArray[indexPermissionSetToIdentityList] = (java.lang.String)resultingArrayList.get(indexPermissionSetToIdentityList);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SignFile(X509Certificate2 cert, Uri timestampUrl, java.lang.String path) throws Throwable, system.NotImplementedException, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.resources.MissingManifestResourceException, system.io.FileNotFoundException, system.security.cryptography.CryptographicException, system.NullReferenceException, system.io.IOException, system.AccessViolationException, system.RankException, system.OverflowException, system.PlatformNotSupportedException, system.ApplicationException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException, system.componentmodel.WarningException, system.threading.ThreadAbortException, system.UnauthorizedAccessException, system.security.accesscontrol.PrivilegeNotHeldException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.xml.xpath.XPathException, system.security.cryptography.CryptographicUnexpectedOperationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SignFile", cert == null ? null : cert.getJCOInstance(), timestampUrl == null ? null : timestampUrl.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SignFile(java.lang.String certPath, SecureString certPassword, Uri timestampUrl, java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.OutOfMemoryException, system.ObjectDisposedException, system.security.cryptography.CryptographicException, system.InvalidOperationException, system.AccessViolationException, system.NotImplementedException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.FormatException, system.NullReferenceException, system.security.SecurityException, system.RankException, system.ApplicationException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException, system.IndexOutOfRangeException, system.componentmodel.WarningException, system.threading.ThreadAbortException, system.security.accesscontrol.PrivilegeNotHeldException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.xml.xpath.XPathException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicUnexpectedOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SignFile", certPath, certPassword == null ? null : certPassword.getJCOInstance(), timestampUrl == null ? null : timestampUrl.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SignFile(java.lang.String certThumbprint, Uri timestampUrl, java.lang.String path) throws Throwable, system.NotImplementedException, system.ArgumentNullException, system.ArgumentException, system.TypeLoadException, system.InvalidOperationException, system.security.SecurityException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.security.cryptography.CryptographicException, system.AccessViolationException, system.RankException, system.OverflowException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.ApplicationException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException, system.componentmodel.WarningException, system.threading.ThreadAbortException, system.security.accesscontrol.PrivilegeNotHeldException, system.xml.XmlException, system.xml.schema.XmlSchemaException, system.xml.xpath.XPathException, system.PlatformNotSupportedException, system.security.cryptography.CryptographicUnexpectedOperationException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SignFile", certThumbprint, timestampUrl == null ? null : timestampUrl.getJCOInstance(), path);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}