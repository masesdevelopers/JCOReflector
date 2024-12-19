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

package system.activities.presentation.model;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.activities.presentation.model.ModelEditingScope;
import system.activities.presentation.model.ModelItem;
import system.activities.presentation.model.ModelProperty;
import system.activities.presentation.model.ModelPropertyCollection;
import system.componentmodel.AttributeCollection;
import system.windows.DependencyObject;
import system.componentmodel.PropertyChangedEventHandler;


/**
 * The base .NET class managing System.Activities.Presentation.Model.ModelItem, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.Model.ModelItem" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.Model.ModelItem</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ModelItem extends NetObject  {
    /**
     * Fully assembly qualified name: System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Activities.Presentation
     */
    public static final String assemblyShortName = "System.Activities.Presentation";
    /**
     * Qualified class name: System.Activities.Presentation.Model.ModelItem
     */
    public static final String className = "System.Activities.Presentation.Model.ModelItem";
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
    public ModelItem(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ModelItem}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ModelItem} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ModelItem cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ModelItem(from.getJCOInstance());
    }

    // Constructors section
    
    public ModelItem() throws Throwable {
    }

    
    // Methods section
    
    public ModelEditingScope BeginEdit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginEdit = (JCObject)classInstance.Invoke("BeginEdit");
            return new ModelEditingScope(objBeginEdit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelEditingScope BeginEdit(boolean shouldApplyChangesImmediately) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginEdit = (JCObject)classInstance.Invoke("BeginEdit", shouldApplyChangesImmediately);
            return new ModelEditingScope(objBeginEdit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelEditingScope BeginEdit(java.lang.String description) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginEdit = (JCObject)classInstance.Invoke("BeginEdit", description);
            return new ModelEditingScope(objBeginEdit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelEditingScope BeginEdit(java.lang.String description, boolean shouldApplyChangesImmediately) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objBeginEdit = (JCObject)classInstance.Invoke("BeginEdit", description, shouldApplyChangesImmediately);
            return new ModelEditingScope(objBeginEdit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetCurrentValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCurrentValue = (JCObject)classInstance.Invoke("GetCurrentValue");
            return new NetObject(objGetCurrentValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public ModelItem getParent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Parent");
            return new ModelItem(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelItem getRoot() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Root");
            return new ModelItem(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelProperty getContent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Content");
            return new ModelProperty(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelProperty getSource() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Source");
            return new ModelProperty(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ModelPropertyCollection getProperties() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Properties");
            return new ModelPropertyCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AttributeCollection getAttributes() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Attributes");
            return new AttributeCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Name", Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetType getItemType() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ItemType");
            return new NetType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject getView() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("View");
            return new DependencyObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addPropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removePropertyChanged(PropertyChangedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("PropertyChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}