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

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Windows.LocalizationCategory, PresentationCore, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.LocalizationCategory" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.LocalizationCategory</a>
 */
public class LocalizationCategory extends NetObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.LocalizationCategory
     */
    public static final String className = "System.Windows.LocalizationCategory";
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

    public LocalizationCategory(Object instance) {
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

    public LocalizationCategory() {
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

    final static LocalizationCategory getFrom(JCEnum object, String value) {
        try {
            return new LocalizationCategory(object.fromValue(value));
        } catch (JCException e) {
            return new LocalizationCategory(object);
        }
    }

    // Enum fields section
    
    public static LocalizationCategory None = getFrom(enumReflected, "None");
    public static LocalizationCategory Text = getFrom(enumReflected, "Text");
    public static LocalizationCategory Title = getFrom(enumReflected, "Title");
    public static LocalizationCategory Label = getFrom(enumReflected, "Label");
    public static LocalizationCategory Button = getFrom(enumReflected, "Button");
    public static LocalizationCategory CheckBox = getFrom(enumReflected, "CheckBox");
    public static LocalizationCategory ComboBox = getFrom(enumReflected, "ComboBox");
    public static LocalizationCategory ListBox = getFrom(enumReflected, "ListBox");
    public static LocalizationCategory Menu = getFrom(enumReflected, "Menu");
    public static LocalizationCategory RadioButton = getFrom(enumReflected, "RadioButton");
    public static LocalizationCategory ToolTip = getFrom(enumReflected, "ToolTip");
    public static LocalizationCategory Hyperlink = getFrom(enumReflected, "Hyperlink");
    public static LocalizationCategory TextFlow = getFrom(enumReflected, "TextFlow");
    public static LocalizationCategory XmlData = getFrom(enumReflected, "XmlData");
    public static LocalizationCategory Font = getFrom(enumReflected, "Font");
    public static LocalizationCategory Inherit = getFrom(enumReflected, "Inherit");
    public static LocalizationCategory Ignore = getFrom(enumReflected, "Ignore");
    public static LocalizationCategory NeverLocalize = getFrom(enumReflected, "NeverLocalize");


    // Flags management section


}