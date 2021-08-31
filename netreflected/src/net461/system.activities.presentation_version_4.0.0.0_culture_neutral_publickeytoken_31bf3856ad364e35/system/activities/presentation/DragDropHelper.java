/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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

package system.activities.presentation;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.IDataObject;
import system.windows.IDataObjectImplementation;
import system.activities.presentation.EditingContext;
import system.activities.presentation.ICompositeView;
import system.activities.presentation.ICompositeViewImplementation;
import system.windows.DragEventArgs;
import system.activities.presentation.model.ModelItem;
import system.windows.DependencyObject;
import system.windows.DragDropEffects;
import system.activities.presentation.WorkflowViewElement;
import system.windows.Point;
import system.windows.DataObject;
import system.windows.UIElement;


/**
 * The base .NET class managing System.Activities.Presentation.DragDropHelper, System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.DragDropHelper" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Activities.Presentation.DragDropHelper</a>
 */
public class DragDropHelper extends NetObject  {
    /**
     * Fully assembly qualified name: System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.Activities.Presentation, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.Activities.Presentation
     */
    public static final String assemblyShortName = "System.Activities.Presentation";
    /**
     * Qualified class name: System.Activities.Presentation.DragDropHelper
     */
    public static final String className = "System.Activities.Presentation.DragDropHelper";
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
    public DragDropHelper(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DragDropHelper}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DragDropHelper} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DragDropHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DragDropHelper(from.getJCOInstance());
    }

    // Constructors section
    
    public DragDropHelper() throws Throwable {
    }

    
    // Methods section
    
    public static boolean AllowDrop(IDataObject draggedDataObject, EditingContext context, NetType... allowedItemTypes) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.TypeLoadException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (boolean)classType.Invoke("AllowDrop", draggedDataObject == null ? null : draggedDataObject.getJCOInstance(), context == null ? null : context.getJCOInstance(), toObjectFromArray(allowedItemTypes));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ICompositeView GetCompositeView(DragEventArgs e) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompositeView = (JCObject)classType.Invoke("GetCompositeView", e == null ? null : e.getJCOInstance());
            return new ICompositeViewImplementation(objGetCompositeView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ModelItem GetDraggedModelItem(DragEventArgs e) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDraggedModelItem = (JCObject)classType.Invoke("GetDraggedModelItem", e == null ? null : e.getJCOInstance());
            return new ModelItem(objGetDraggedModelItem);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject GetDroppedObject(DependencyObject dropTarget, DragEventArgs e, EditingContext context) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.TypeLoadException, system.InvalidOperationException, system.NotSupportedException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NullReferenceException, system.OverflowException, system.io.IOException, system.NotImplementedException, system.RankException, system.componentmodel.Win32Exception, system.collections.generic.KeyNotFoundException, system.FormatException, system.OutOfMemoryException, system.configuration.ConfigurationException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDroppedObject = (JCObject)classType.Invoke("GetDroppedObject", dropTarget == null ? null : dropTarget.getJCOInstance(), e == null ? null : e.getJCOInstance(), context == null ? null : context.getJCOInstance());
            return new NetObject(objGetDroppedObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DragDropEffects DoDragMove(WorkflowViewElement draggedViewElement, Point referencePoint) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.NotImplementedException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.RankException, system.OutOfMemoryException, system.threading.ThreadStateException, system.SystemException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDoDragMove = (JCObject)classType.Invoke("DoDragMove", draggedViewElement == null ? null : draggedViewElement.getJCOInstance(), referencePoint == null ? null : referencePoint.getJCOInstance());
            return new DragDropEffects(objDoDragMove);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DragDropEffects GetDragDropCompletedEffects(DataObject data) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDragDropCompletedEffects = (JCObject)classType.Invoke("GetDragDropCompletedEffects", data == null ? null : data.getJCOInstance());
            return new DragDropEffects(objGetDragDropCompletedEffects);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Point GetDragDropAnchorPoint(DragEventArgs e) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetDragDropAnchorPoint = (JCObject)classType.Invoke("GetDragDropAnchorPoint", e == null ? null : e.getJCOInstance());
            return new Point(objGetDragDropAnchorPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UIElement GetCompositeView(WorkflowViewElement workflowViewElement) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetCompositeView = (JCObject)classType.Invoke("GetCompositeView", workflowViewElement == null ? null : workflowViewElement.getJCOInstance());
            return new UIElement(objGetCompositeView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetCompositeView(WorkflowViewElement workflowViewElement, UIElement dragSource) throws Throwable, system.IndexOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetCompositeView", workflowViewElement == null ? null : workflowViewElement.getJCOInstance(), dragSource == null ? null : dragSource.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void SetDragDropCompletedEffects(DragEventArgs e, DragDropEffects completedEffects) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.configuration.ConfigurationException, system.ArgumentOutOfRangeException, system.configuration.ConfigurationErrorsException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("SetDragDropCompletedEffects", e == null ? null : e.getJCOInstance(), completedEffects == null ? null : completedEffects.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}