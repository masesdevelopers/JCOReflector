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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Windows.Forms.AccessibleRole, System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.AccessibleRole" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.AccessibleRole</a>
 */
public class AccessibleRole extends NetObject  {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.5.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.AccessibleRole
     */
    public static final String className = "System.Windows.Forms.AccessibleRole";
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

    public AccessibleRole(Object instance) {
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

    public AccessibleRole() {
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

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    final static AccessibleRole getFrom(JCEnum object, String value) {
        try {
            return new AccessibleRole(object.fromValue(value));
        } catch (JCException e) {
            return new AccessibleRole(object);
        }
    }

    // Enum fields section
    
    public static AccessibleRole None = getFrom(enumReflected, "None");
    public static AccessibleRole TitleBar = getFrom(enumReflected, "TitleBar");
    public static AccessibleRole MenuBar = getFrom(enumReflected, "MenuBar");
    public static AccessibleRole ScrollBar = getFrom(enumReflected, "ScrollBar");
    public static AccessibleRole Grip = getFrom(enumReflected, "Grip");
    public static AccessibleRole Sound = getFrom(enumReflected, "Sound");
    public static AccessibleRole Cursor = getFrom(enumReflected, "Cursor");
    public static AccessibleRole Caret = getFrom(enumReflected, "Caret");
    public static AccessibleRole Alert = getFrom(enumReflected, "Alert");
    public static AccessibleRole Window = getFrom(enumReflected, "Window");
    public static AccessibleRole Client = getFrom(enumReflected, "Client");
    public static AccessibleRole MenuPopup = getFrom(enumReflected, "MenuPopup");
    public static AccessibleRole MenuItem = getFrom(enumReflected, "MenuItem");
    public static AccessibleRole ToolTip = getFrom(enumReflected, "ToolTip");
    public static AccessibleRole Application = getFrom(enumReflected, "Application");
    public static AccessibleRole Document = getFrom(enumReflected, "Document");
    public static AccessibleRole Pane = getFrom(enumReflected, "Pane");
    public static AccessibleRole Chart = getFrom(enumReflected, "Chart");
    public static AccessibleRole Dialog = getFrom(enumReflected, "Dialog");
    public static AccessibleRole Border = getFrom(enumReflected, "Border");
    public static AccessibleRole Grouping = getFrom(enumReflected, "Grouping");
    public static AccessibleRole Separator = getFrom(enumReflected, "Separator");
    public static AccessibleRole ToolBar = getFrom(enumReflected, "ToolBar");
    public static AccessibleRole StatusBar = getFrom(enumReflected, "StatusBar");
    public static AccessibleRole Table = getFrom(enumReflected, "Table");
    public static AccessibleRole ColumnHeader = getFrom(enumReflected, "ColumnHeader");
    public static AccessibleRole RowHeader = getFrom(enumReflected, "RowHeader");
    public static AccessibleRole Column = getFrom(enumReflected, "Column");
    public static AccessibleRole Row = getFrom(enumReflected, "Row");
    public static AccessibleRole Cell = getFrom(enumReflected, "Cell");
    public static AccessibleRole Link = getFrom(enumReflected, "Link");
    public static AccessibleRole HelpBalloon = getFrom(enumReflected, "HelpBalloon");
    public static AccessibleRole Character = getFrom(enumReflected, "Character");
    public static AccessibleRole List = getFrom(enumReflected, "List");
    public static AccessibleRole ListItem = getFrom(enumReflected, "ListItem");
    public static AccessibleRole Outline = getFrom(enumReflected, "Outline");
    public static AccessibleRole OutlineItem = getFrom(enumReflected, "OutlineItem");
    public static AccessibleRole PageTab = getFrom(enumReflected, "PageTab");
    public static AccessibleRole PropertyPage = getFrom(enumReflected, "PropertyPage");
    public static AccessibleRole Indicator = getFrom(enumReflected, "Indicator");
    public static AccessibleRole Graphic = getFrom(enumReflected, "Graphic");
    public static AccessibleRole StaticText = getFrom(enumReflected, "StaticText");
    public static AccessibleRole Text = getFrom(enumReflected, "Text");
    public static AccessibleRole PushButton = getFrom(enumReflected, "PushButton");
    public static AccessibleRole CheckButton = getFrom(enumReflected, "CheckButton");
    public static AccessibleRole RadioButton = getFrom(enumReflected, "RadioButton");
    public static AccessibleRole ComboBox = getFrom(enumReflected, "ComboBox");
    public static AccessibleRole DropList = getFrom(enumReflected, "DropList");
    public static AccessibleRole ProgressBar = getFrom(enumReflected, "ProgressBar");
    public static AccessibleRole Dial = getFrom(enumReflected, "Dial");
    public static AccessibleRole HotkeyField = getFrom(enumReflected, "HotkeyField");
    public static AccessibleRole Slider = getFrom(enumReflected, "Slider");
    public static AccessibleRole SpinButton = getFrom(enumReflected, "SpinButton");
    public static AccessibleRole Diagram = getFrom(enumReflected, "Diagram");
    public static AccessibleRole Animation = getFrom(enumReflected, "Animation");
    public static AccessibleRole Equation = getFrom(enumReflected, "Equation");
    public static AccessibleRole ButtonDropDown = getFrom(enumReflected, "ButtonDropDown");
    public static AccessibleRole ButtonMenu = getFrom(enumReflected, "ButtonMenu");
    public static AccessibleRole ButtonDropDownGrid = getFrom(enumReflected, "ButtonDropDownGrid");
    public static AccessibleRole WhiteSpace = getFrom(enumReflected, "WhiteSpace");
    public static AccessibleRole PageTabList = getFrom(enumReflected, "PageTabList");
    public static AccessibleRole Clock = getFrom(enumReflected, "Clock");
    public static AccessibleRole SplitButton = getFrom(enumReflected, "SplitButton");
    public static AccessibleRole IpAddress = getFrom(enumReflected, "IpAddress");
    public static AccessibleRole OutlineButton = getFrom(enumReflected, "OutlineButton");
    public static AccessibleRole Default = getFrom(enumReflected, "Default");


    // Flags management section


}