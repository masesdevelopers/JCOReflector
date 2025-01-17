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
 *      This code was generated from a template using JCOReflector v. 1.14.4.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.reflection.portableexecutable;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.reflection.portableexecutable.Machine;
import system.UInt64;
import system.UInt16;
import system.reflection.portableexecutable.Subsystem;
import system.reflection.portableexecutable.DllCharacteristics;
import system.reflection.portableexecutable.Characteristics;
import system.reflection.portableexecutable.PEHeaderBuilder;


/**
 * The base .NET class managing System.Reflection.PortableExecutable.PEHeaderBuilder, System.Reflection.Metadata, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.PortableExecutable.PEHeaderBuilder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Reflection.PortableExecutable.PEHeaderBuilder</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.4.0
 */
public class PEHeaderBuilder extends NetObject  {
    /**
     * Fully assembly qualified name: System.Reflection.Metadata, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Reflection.Metadata, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Reflection.Metadata
     */
    public static final String assemblyShortName = "System.Reflection.Metadata";
    /**
     * Qualified class name: System.Reflection.PortableExecutable.PEHeaderBuilder
     */
    public static final String className = "System.Reflection.PortableExecutable.PEHeaderBuilder";
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
    public PEHeaderBuilder(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link PEHeaderBuilder}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link PEHeaderBuilder} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static PEHeaderBuilder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new PEHeaderBuilder(from.getJCOInstance());
    }

    // Constructors section
    
    public PEHeaderBuilder() throws Throwable {
    }

    public PEHeaderBuilder(Machine machine, int sectionAlignment, int fileAlignment, UInt64 imageBase, byte majorLinkerVersion, byte minorLinkerVersion, UInt16 majorOperatingSystemVersion, UInt16 minorOperatingSystemVersion, UInt16 majorImageVersion, UInt16 minorImageVersion, UInt16 majorSubsystemVersion, UInt16 minorSubsystemVersion, Subsystem subsystem, DllCharacteristics dllCharacteristics, Characteristics imageCharacteristics, UInt64 sizeOfStackReserve, UInt64 sizeOfStackCommit, UInt64 sizeOfHeapReserve, UInt64 sizeOfHeapCommit) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.ArrayTypeMismatchException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(machine == null ? null : machine.getJCOInstance(), sectionAlignment, fileAlignment, imageBase == null ? null : imageBase.getJCOInstance(), majorLinkerVersion, minorLinkerVersion, majorOperatingSystemVersion == null ? null : majorOperatingSystemVersion.getJCOInstance(), minorOperatingSystemVersion == null ? null : minorOperatingSystemVersion.getJCOInstance(), majorImageVersion == null ? null : majorImageVersion.getJCOInstance(), minorImageVersion == null ? null : minorImageVersion.getJCOInstance(), majorSubsystemVersion == null ? null : majorSubsystemVersion.getJCOInstance(), minorSubsystemVersion == null ? null : minorSubsystemVersion.getJCOInstance(), subsystem == null ? null : subsystem.getJCOInstance(), dllCharacteristics == null ? null : dllCharacteristics.getJCOInstance(), imageCharacteristics == null ? null : imageCharacteristics.getJCOInstance(), sizeOfStackReserve == null ? null : sizeOfStackReserve.getJCOInstance(), sizeOfStackCommit == null ? null : sizeOfStackCommit.getJCOInstance(), sizeOfHeapReserve == null ? null : sizeOfHeapReserve.getJCOInstance(), sizeOfHeapCommit == null ? null : sizeOfHeapCommit.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public static PEHeaderBuilder CreateExecutableHeader() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateExecutableHeader = (JCObject)classType.Invoke("CreateExecutableHeader");
            return new PEHeaderBuilder(objCreateExecutableHeader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static PEHeaderBuilder CreateLibraryHeader() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.NotSupportedException, system.ArgumentNullException, system.ObjectDisposedException, system.InvalidOperationException, system.RankException, system.ArrayTypeMismatchException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateLibraryHeader = (JCObject)classType.Invoke("CreateLibraryHeader");
            return new PEHeaderBuilder(objCreateLibraryHeader);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public byte getMajorLinkerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("MajorLinkerVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getMinorLinkerVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("MinorLinkerVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getFileAlignment() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("FileAlignment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSectionAlignment() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SectionAlignment");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Characteristics getImageCharacteristics() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImageCharacteristics");
            return new Characteristics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DllCharacteristics getDllCharacteristics() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DllCharacteristics");
            return new DllCharacteristics(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Machine getMachine() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Machine");
            return new Machine(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Subsystem getSubsystem() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Subsystem");
            return new Subsystem(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorImageVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MajorImageVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorOperatingSystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MajorOperatingSystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMajorSubsystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MajorSubsystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorImageVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinorImageVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorOperatingSystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinorOperatingSystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt16 getMinorSubsystemVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("MinorSubsystemVersion");
            return new UInt16(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getImageBase() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImageBase");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfHeapCommit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfHeapCommit");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfHeapReserve() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfHeapReserve");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfStackCommit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfStackCommit");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public UInt64 getSizeOfStackReserve() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SizeOfStackReserve");
            return new UInt64(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}