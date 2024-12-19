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

package system.io;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.io.FileSystemInfo;
import system.io.DirectoryInfo;
import system.security.accesscontrol.DirectorySecurity;
import system.io.SearchOption;
import system.io.FileInfo;
import system.security.accesscontrol.AccessControlSections;


/**
 * The base .NET class managing System.IO.DirectoryInfo, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.IO.DirectoryInfo" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.IO.DirectoryInfo</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class DirectoryInfo extends FileSystemInfo  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.IO.DirectoryInfo
     */
    public static final String className = "System.IO.DirectoryInfo";
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
    public DirectoryInfo(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DirectoryInfo}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DirectoryInfo} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DirectoryInfo cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DirectoryInfo(from.getJCOInstance());
    }

    // Constructors section
    
    public DirectoryInfo() throws Throwable {
    }

    public DirectoryInfo(java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(path));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public DirectoryInfo CreateSubdirectory(java.lang.String path) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.io.IOException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubdirectory = (JCObject)classInstance.Invoke("CreateSubdirectory", path);
            return new DirectoryInfo(objCreateSubdirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryInfo CreateSubdirectory(java.lang.String path, DirectorySecurity directorySecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCreateSubdirectory = (JCObject)classInstance.Invoke("CreateSubdirectory", path, directorySecurity == null ? null : directorySecurity.getJCOInstance());
            return new DirectoryInfo(objCreateSubdirectory);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryInfo[] GetDirectories() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<DirectoryInfo> resultingArrayList = new ArrayList<DirectoryInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDirectories");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DirectoryInfo(resultingObject));
            }
            DirectoryInfo[] resultingArray = new DirectoryInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryInfo[] GetDirectories(java.lang.String searchPattern) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<DirectoryInfo> resultingArrayList = new ArrayList<DirectoryInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDirectories", searchPattern);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DirectoryInfo(resultingObject));
            }
            DirectoryInfo[] resultingArray = new DirectoryInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryInfo[] GetDirectories(java.lang.String searchPattern, SearchOption searchOption) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<DirectoryInfo> resultingArrayList = new ArrayList<DirectoryInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetDirectories", searchPattern, searchOption == null ? null : searchOption.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new DirectoryInfo(resultingObject));
            }
            DirectoryInfo[] resultingArray = new DirectoryInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileInfo[] GetFiles() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileInfo> resultingArrayList = new ArrayList<FileInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileInfo(resultingObject));
            }
            FileInfo[] resultingArray = new FileInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileInfo[] GetFiles(java.lang.String searchPattern) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileInfo> resultingArrayList = new ArrayList<FileInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles", searchPattern);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileInfo(resultingObject));
            }
            FileInfo[] resultingArray = new FileInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileInfo[] GetFiles(java.lang.String searchPattern, SearchOption searchOption) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileInfo> resultingArrayList = new ArrayList<FileInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFiles", searchPattern, searchOption == null ? null : searchOption.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileInfo(resultingObject));
            }
            FileInfo[] resultingArray = new FileInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileSystemInfo[] GetFileSystemInfos() throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileSystemInfo> resultingArrayList = new ArrayList<FileSystemInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFileSystemInfos");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileSystemInfo(resultingObject));
            }
            FileSystemInfo[] resultingArray = new FileSystemInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileSystemInfo[] GetFileSystemInfos(java.lang.String searchPattern) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileSystemInfo> resultingArrayList = new ArrayList<FileSystemInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFileSystemInfos", searchPattern);
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileSystemInfo(resultingObject));
            }
            FileSystemInfo[] resultingArray = new FileSystemInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileSystemInfo[] GetFileSystemInfos(java.lang.String searchPattern, SearchOption searchOption) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.NullReferenceException, system.globalization.CultureNotFoundException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileSystemInfo> resultingArrayList = new ArrayList<FileSystemInfo>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("GetFileSystemInfos", searchPattern, searchOption == null ? null : searchOption.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileSystemInfo(resultingObject));
            }
            FileSystemInfo[] resultingArray = new FileSystemInfo[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySecurity GetAccessControl() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.InvalidOperationException, system.security.accesscontrol.PrivilegeNotHeldException, system.SystemException, system.ArgumentOutOfRangeException, system.OverflowException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classInstance.Invoke("GetAccessControl");
            return new DirectorySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySecurity GetAccessControl(AccessControlSections includeSections) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.OutOfMemoryException, system.UnauthorizedAccessException, system.InvalidOperationException, system.security.accesscontrol.PrivilegeNotHeldException, system.SystemException, system.ArgumentOutOfRangeException, system.OverflowException, system.io.PathTooLongException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAccessControl = (JCObject)classInstance.Invoke("GetAccessControl", includeSections == null ? null : includeSections.getJCOInstance());
            return new DirectorySecurity(objGetAccessControl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Create() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.io.IOException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Create");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Create(DirectorySecurity directorySecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.io.IOException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Create", directorySecurity == null ? null : directorySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete() throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Delete(boolean recursive) throws Throwable, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Delete", recursive);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void MoveTo(java.lang.String destDirName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.io.IOException, system.io.PathTooLongException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("MoveTo", destDirName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetAccessControl(DirectorySecurity directorySecurity) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.ArgumentOutOfRangeException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.security.accesscontrol.PrivilegeNotHeldException, system.InvalidProgramException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetAccessControl", directorySecurity == null ? null : directorySecurity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public DirectoryInfo getParent() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.io.PathTooLongException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new DirectoryInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryInfo getRoot() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Root");
            return new DirectoryInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}