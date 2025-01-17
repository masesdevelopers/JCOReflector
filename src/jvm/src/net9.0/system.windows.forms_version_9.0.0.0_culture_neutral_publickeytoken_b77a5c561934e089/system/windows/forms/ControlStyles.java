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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Windows.Forms.ControlStyles, System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ControlStyles" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.ControlStyles</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class ControlStyles extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=9.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.ControlStyles
     */
    public static final String className = "System.Windows.Forms.ControlStyles";
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
    public ControlStyles(java.lang.Object instance) {
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

    public ControlStyles() {
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

    final static ControlStyles getFrom(JCEnum object, String value) {
        try {
            return new ControlStyles(object.fromValue(value));
        } catch (JCException e) {
            return new ControlStyles(object);
        }
    }

    // Enum fields section
    
    public static ControlStyles ContainerControl = getFrom(enumReflected, "ContainerControl");
    public static ControlStyles UserPaint = getFrom(enumReflected, "UserPaint");
    public static ControlStyles Opaque = getFrom(enumReflected, "Opaque");
    public static ControlStyles ResizeRedraw = getFrom(enumReflected, "ResizeRedraw");
    public static ControlStyles FixedWidth = getFrom(enumReflected, "FixedWidth");
    public static ControlStyles FixedHeight = getFrom(enumReflected, "FixedHeight");
    public static ControlStyles StandardClick = getFrom(enumReflected, "StandardClick");
    public static ControlStyles Selectable = getFrom(enumReflected, "Selectable");
    public static ControlStyles UserMouse = getFrom(enumReflected, "UserMouse");
    public static ControlStyles SupportsTransparentBackColor = getFrom(enumReflected, "SupportsTransparentBackColor");
    public static ControlStyles StandardDoubleClick = getFrom(enumReflected, "StandardDoubleClick");
    public static ControlStyles AllPaintingInWmPaint = getFrom(enumReflected, "AllPaintingInWmPaint");
    public static ControlStyles CacheText = getFrom(enumReflected, "CacheText");
    public static ControlStyles EnableNotifyMessage = getFrom(enumReflected, "EnableNotifyMessage");
    public static ControlStyles DoubleBuffer = getFrom(enumReflected, "DoubleBuffer");
    public static ControlStyles OptimizedDoubleBuffer = getFrom(enumReflected, "OptimizedDoubleBuffer");
    public static ControlStyles UseTextForAccessibility = getFrom(enumReflected, "UseTextForAccessibility");
    public static ControlStyles ApplyThemingImplicitly = getFrom(enumReflected, "ApplyThemingImplicitly");


    // Flags management section

    public final ControlStyles add(ControlStyles val) throws Throwable {
        return new ControlStyles(NetEnum.add(classInstance, val.classInstance));
    }

    public final ControlStyles remove(ControlStyles val) throws Throwable {
        return new ControlStyles(NetEnum.remove(classInstance, val.classInstance));
    }

    public final boolean is(ControlStyles val) throws Throwable {
        return NetEnum.is(classInstance, val.classInstance);
    }

    public final boolean has(ControlStyles val) throws Throwable {
        return NetEnum.has(classInstance, val.classInstance);
    }
}