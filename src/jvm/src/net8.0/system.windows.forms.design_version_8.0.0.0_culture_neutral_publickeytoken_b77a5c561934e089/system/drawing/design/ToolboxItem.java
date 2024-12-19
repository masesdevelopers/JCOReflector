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

package system.drawing.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.IComponent;
import system.componentmodel.IComponentImplementation;
import system.componentmodel.design.IDesignerHost;
import system.componentmodel.design.IDesignerHostImplementation;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import system.runtime.serialization.SerializationInfo;
import system.runtime.serialization.StreamingContext;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.drawing.Bitmap;
import system.reflection.AssemblyName;
import system.drawing.design.ToolboxComponentsCreatedEventHandler;
import system.drawing.design.ToolboxComponentsCreatingEventHandler;
import system.runtime.serialization.ISerializable;
import system.runtime.serialization.ISerializableImplementation;


/**
 * The base .NET class managing System.Drawing.Design.ToolboxItem, System.Windows.Forms.Design, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Design.ToolboxItem" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.Design.ToolboxItem</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ToolboxItem extends NetObject implements system.runtime.serialization.ISerializable {
    /**
     * Fully assembly qualified name: System.Windows.Forms.Design, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms.Design, Version=8.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms.Design
     */
    public static final String assemblyShortName = "System.Windows.Forms.Design";
    /**
     * Qualified class name: System.Drawing.Design.ToolboxItem
     */
    public static final String className = "System.Drawing.Design.ToolboxItem";
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
    public ToolboxItem(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ToolboxItem}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ToolboxItem} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ToolboxItem cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolboxItem(from.getJCOInstance());
    }

    // Constructors section
    
    public ToolboxItem() throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolboxItem(NetType toolType) throws Throwable, system.NotSupportedException, system.PlatformNotSupportedException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.security.SecurityException, system.IndexOutOfRangeException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(toolType == null ? null : toolType.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public IComponent[] CreateComponents() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException, system.TypeLoadException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.MulticastNotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.MissingMethodException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<IComponent> resultingArrayList = new ArrayList<IComponent>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CreateComponents");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IComponentImplementation(resultingObject));
            }
            IComponent[] resultingArray = new IComponent[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IComponent[] CreateComponents(IDesignerHost host, IDictionary defaultValues) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.TypeLoadException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.ObjectDisposedException, system.NotSupportedException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<IComponent> resultingArrayList = new ArrayList<IComponent>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CreateComponents", host == null ? null : host.getJCOInstance(), defaultValues == null ? null : defaultValues.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IComponentImplementation(resultingObject));
            }
            IComponent[] resultingArray = new IComponent[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IComponent[] CreateComponents(IDesignerHost host) throws Throwable, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.FormatException, system.TypeLoadException, system.globalization.CultureNotFoundException, system.MulticastNotSupportedException, system.IndexOutOfRangeException, system.MethodAccessException, system.MissingMethodException, system.MemberAccessException, system.reflection.TargetInvocationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<IComponent> resultingArrayList = new ArrayList<IComponent>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("CreateComponents", host == null ? null : host.getJCOInstance());
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new IComponentImplementation(resultingObject));
            }
            IComponent[] resultingArray = new IComponent[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType GetType(IDesignerHost host) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.io.FileLoadException, system.MulticastNotSupportedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetType = (JCObject)classInstance.Invoke("GetType", host == null ? null : host.getJCOInstance());
            return new NetType(objGetType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Initialize(NetType type) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException, system.security.SecurityException, system.IndexOutOfRangeException, system.NotSupportedException, system.RankException, system.ArrayTypeMismatchException, system.OutOfMemoryException, system.TypeLoadException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Initialize", type == null ? null : type.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Lock() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Lock");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToISerializable method available in ISerializable to obtain an object with an invocable method
     */
    @Deprecated 
    public void GetObjectData(SerializationInfo info, StreamingContext context) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToISerializable to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsTransient() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsTransient");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsTransient(boolean IsTransient) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsTransient", IsTransient);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLocked() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Locked");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ICollection getFilter() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Filter");
            return new ICollectionImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilter(ICollection Filter) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Filter", Filter == null ? null : Filter.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDictionary getProperties() throws Throwable, system.NotSupportedException, system.ArgumentException, system.ArgumentNullException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new IDictionaryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bitmap getBitmap() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Bitmap");
            return new Bitmap(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBitmap(Bitmap Bitmap) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Bitmap", Bitmap == null ? null : Bitmap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Bitmap getOriginalBitmap() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("OriginalBitmap");
            return new Bitmap(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOriginalBitmap(Bitmap OriginalBitmap) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OriginalBitmap", OriginalBitmap == null ? null : OriginalBitmap.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyName getAssemblyName() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("AssemblyName");
            return new AssemblyName(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAssemblyName(AssemblyName AssemblyName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AssemblyName", AssemblyName == null ? null : AssemblyName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final AssemblyName[] getDependentAssemblies() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<AssemblyName> resultingArrayList = new ArrayList<AssemblyName>();
            JCObject resultingObjects = (JCObject)classInstance.Get("DependentAssemblies");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new AssemblyName(resultingObject));
            }
            AssemblyName[] resultingArray = new AssemblyName[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDependentAssemblies(AssemblyName[] DependentAssemblies) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DependentAssemblies", toObjectFromArray(DependentAssemblies));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getCompany() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Company");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompany(java.lang.String Company) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Company", Company);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getComponentType() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.PlatformNotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ComponentType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDescription() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Description");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDescription(java.lang.String Description) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Description", Description);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getDisplayName() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("DisplayName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDisplayName(java.lang.String DisplayName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DisplayName", DisplayName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTypeName() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTypeName(java.lang.String TypeName) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TypeName", TypeName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVersion() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.NotSupportedException, system.IndexOutOfRangeException, system.PlatformNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addComponentsCreated(ToolboxComponentsCreatedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ComponentsCreated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeComponentsCreated(ToolboxComponentsCreatedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ComponentsCreated", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addComponentsCreating(ToolboxComponentsCreatingEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("ComponentsCreating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeComponentsCreating(ToolboxComponentsCreatingEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("ComponentsCreating", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}