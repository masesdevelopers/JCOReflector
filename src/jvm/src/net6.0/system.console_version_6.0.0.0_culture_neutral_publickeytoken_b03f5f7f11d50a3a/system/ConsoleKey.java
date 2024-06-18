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
 *      This code was generated from a template using JCOReflector v. 1.14.2.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.ConsoleKey, System.Console, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ConsoleKey" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ConsoleKey</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class ConsoleKey extends NetObject  {
    /**
     * Fully assembly qualified name: System.Console, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Console, Version=6.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Console
     */
    public static final String assemblyShortName = "System.Console";
    /**
     * Qualified class name: System.ConsoleKey
     */
    public static final String className = "System.ConsoleKey";
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
    public ConsoleKey(java.lang.Object instance) {
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

    public ConsoleKey() {
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

    final static ConsoleKey getFrom(JCEnum object, String value) {
        try {
            return new ConsoleKey(object.fromValue(value));
        } catch (JCException e) {
            return new ConsoleKey(object);
        }
    }

    // Enum fields section
    
    public static ConsoleKey Backspace = getFrom(enumReflected, "Backspace");
    public static ConsoleKey Tab = getFrom(enumReflected, "Tab");
    public static ConsoleKey Clear = getFrom(enumReflected, "Clear");
    public static ConsoleKey Enter = getFrom(enumReflected, "Enter");
    public static ConsoleKey Pause = getFrom(enumReflected, "Pause");
    public static ConsoleKey Escape = getFrom(enumReflected, "Escape");
    public static ConsoleKey Spacebar = getFrom(enumReflected, "Spacebar");
    public static ConsoleKey PageUp = getFrom(enumReflected, "PageUp");
    public static ConsoleKey PageDown = getFrom(enumReflected, "PageDown");
    public static ConsoleKey End = getFrom(enumReflected, "End");
    public static ConsoleKey Home = getFrom(enumReflected, "Home");
    public static ConsoleKey LeftArrow = getFrom(enumReflected, "LeftArrow");
    public static ConsoleKey UpArrow = getFrom(enumReflected, "UpArrow");
    public static ConsoleKey RightArrow = getFrom(enumReflected, "RightArrow");
    public static ConsoleKey DownArrow = getFrom(enumReflected, "DownArrow");
    public static ConsoleKey Select = getFrom(enumReflected, "Select");
    public static ConsoleKey Print = getFrom(enumReflected, "Print");
    public static ConsoleKey Execute = getFrom(enumReflected, "Execute");
    public static ConsoleKey PrintScreen = getFrom(enumReflected, "PrintScreen");
    public static ConsoleKey Insert = getFrom(enumReflected, "Insert");
    public static ConsoleKey Delete = getFrom(enumReflected, "Delete");
    public static ConsoleKey Help = getFrom(enumReflected, "Help");
    public static ConsoleKey D0 = getFrom(enumReflected, "D0");
    public static ConsoleKey D1 = getFrom(enumReflected, "D1");
    public static ConsoleKey D2 = getFrom(enumReflected, "D2");
    public static ConsoleKey D3 = getFrom(enumReflected, "D3");
    public static ConsoleKey D4 = getFrom(enumReflected, "D4");
    public static ConsoleKey D5 = getFrom(enumReflected, "D5");
    public static ConsoleKey D6 = getFrom(enumReflected, "D6");
    public static ConsoleKey D7 = getFrom(enumReflected, "D7");
    public static ConsoleKey D8 = getFrom(enumReflected, "D8");
    public static ConsoleKey D9 = getFrom(enumReflected, "D9");
    public static ConsoleKey A = getFrom(enumReflected, "A");
    public static ConsoleKey B = getFrom(enumReflected, "B");
    public static ConsoleKey C = getFrom(enumReflected, "C");
    public static ConsoleKey D = getFrom(enumReflected, "D");
    public static ConsoleKey E = getFrom(enumReflected, "E");
    public static ConsoleKey F = getFrom(enumReflected, "F");
    public static ConsoleKey G = getFrom(enumReflected, "G");
    public static ConsoleKey H = getFrom(enumReflected, "H");
    public static ConsoleKey I = getFrom(enumReflected, "I");
    public static ConsoleKey J = getFrom(enumReflected, "J");
    public static ConsoleKey K = getFrom(enumReflected, "K");
    public static ConsoleKey L = getFrom(enumReflected, "L");
    public static ConsoleKey M = getFrom(enumReflected, "M");
    public static ConsoleKey N = getFrom(enumReflected, "N");
    public static ConsoleKey O = getFrom(enumReflected, "O");
    public static ConsoleKey P = getFrom(enumReflected, "P");
    public static ConsoleKey Q = getFrom(enumReflected, "Q");
    public static ConsoleKey R = getFrom(enumReflected, "R");
    public static ConsoleKey S = getFrom(enumReflected, "S");
    public static ConsoleKey T = getFrom(enumReflected, "T");
    public static ConsoleKey U = getFrom(enumReflected, "U");
    public static ConsoleKey V = getFrom(enumReflected, "V");
    public static ConsoleKey W = getFrom(enumReflected, "W");
    public static ConsoleKey X = getFrom(enumReflected, "X");
    public static ConsoleKey Y = getFrom(enumReflected, "Y");
    public static ConsoleKey Z = getFrom(enumReflected, "Z");
    public static ConsoleKey LeftWindows = getFrom(enumReflected, "LeftWindows");
    public static ConsoleKey RightWindows = getFrom(enumReflected, "RightWindows");
    public static ConsoleKey Applications = getFrom(enumReflected, "Applications");
    public static ConsoleKey Sleep = getFrom(enumReflected, "Sleep");
    public static ConsoleKey NumPad0 = getFrom(enumReflected, "NumPad0");
    public static ConsoleKey NumPad1 = getFrom(enumReflected, "NumPad1");
    public static ConsoleKey NumPad2 = getFrom(enumReflected, "NumPad2");
    public static ConsoleKey NumPad3 = getFrom(enumReflected, "NumPad3");
    public static ConsoleKey NumPad4 = getFrom(enumReflected, "NumPad4");
    public static ConsoleKey NumPad5 = getFrom(enumReflected, "NumPad5");
    public static ConsoleKey NumPad6 = getFrom(enumReflected, "NumPad6");
    public static ConsoleKey NumPad7 = getFrom(enumReflected, "NumPad7");
    public static ConsoleKey NumPad8 = getFrom(enumReflected, "NumPad8");
    public static ConsoleKey NumPad9 = getFrom(enumReflected, "NumPad9");
    public static ConsoleKey Multiply = getFrom(enumReflected, "Multiply");
    public static ConsoleKey Add = getFrom(enumReflected, "Add");
    public static ConsoleKey Separator = getFrom(enumReflected, "Separator");
    public static ConsoleKey Subtract = getFrom(enumReflected, "Subtract");
    public static ConsoleKey Decimal = getFrom(enumReflected, "Decimal");
    public static ConsoleKey Divide = getFrom(enumReflected, "Divide");
    public static ConsoleKey F1 = getFrom(enumReflected, "F1");
    public static ConsoleKey F2 = getFrom(enumReflected, "F2");
    public static ConsoleKey F3 = getFrom(enumReflected, "F3");
    public static ConsoleKey F4 = getFrom(enumReflected, "F4");
    public static ConsoleKey F5 = getFrom(enumReflected, "F5");
    public static ConsoleKey F6 = getFrom(enumReflected, "F6");
    public static ConsoleKey F7 = getFrom(enumReflected, "F7");
    public static ConsoleKey F8 = getFrom(enumReflected, "F8");
    public static ConsoleKey F9 = getFrom(enumReflected, "F9");
    public static ConsoleKey F10 = getFrom(enumReflected, "F10");
    public static ConsoleKey F11 = getFrom(enumReflected, "F11");
    public static ConsoleKey F12 = getFrom(enumReflected, "F12");
    public static ConsoleKey F13 = getFrom(enumReflected, "F13");
    public static ConsoleKey F14 = getFrom(enumReflected, "F14");
    public static ConsoleKey F15 = getFrom(enumReflected, "F15");
    public static ConsoleKey F16 = getFrom(enumReflected, "F16");
    public static ConsoleKey F17 = getFrom(enumReflected, "F17");
    public static ConsoleKey F18 = getFrom(enumReflected, "F18");
    public static ConsoleKey F19 = getFrom(enumReflected, "F19");
    public static ConsoleKey F20 = getFrom(enumReflected, "F20");
    public static ConsoleKey F21 = getFrom(enumReflected, "F21");
    public static ConsoleKey F22 = getFrom(enumReflected, "F22");
    public static ConsoleKey F23 = getFrom(enumReflected, "F23");
    public static ConsoleKey F24 = getFrom(enumReflected, "F24");
    public static ConsoleKey BrowserBack = getFrom(enumReflected, "BrowserBack");
    public static ConsoleKey BrowserForward = getFrom(enumReflected, "BrowserForward");
    public static ConsoleKey BrowserRefresh = getFrom(enumReflected, "BrowserRefresh");
    public static ConsoleKey BrowserStop = getFrom(enumReflected, "BrowserStop");
    public static ConsoleKey BrowserSearch = getFrom(enumReflected, "BrowserSearch");
    public static ConsoleKey BrowserFavorites = getFrom(enumReflected, "BrowserFavorites");
    public static ConsoleKey BrowserHome = getFrom(enumReflected, "BrowserHome");
    public static ConsoleKey VolumeMute = getFrom(enumReflected, "VolumeMute");
    public static ConsoleKey VolumeDown = getFrom(enumReflected, "VolumeDown");
    public static ConsoleKey VolumeUp = getFrom(enumReflected, "VolumeUp");
    public static ConsoleKey MediaNext = getFrom(enumReflected, "MediaNext");
    public static ConsoleKey MediaPrevious = getFrom(enumReflected, "MediaPrevious");
    public static ConsoleKey MediaStop = getFrom(enumReflected, "MediaStop");
    public static ConsoleKey MediaPlay = getFrom(enumReflected, "MediaPlay");
    public static ConsoleKey LaunchMail = getFrom(enumReflected, "LaunchMail");
    public static ConsoleKey LaunchMediaSelect = getFrom(enumReflected, "LaunchMediaSelect");
    public static ConsoleKey LaunchApp1 = getFrom(enumReflected, "LaunchApp1");
    public static ConsoleKey LaunchApp2 = getFrom(enumReflected, "LaunchApp2");
    public static ConsoleKey Oem1 = getFrom(enumReflected, "Oem1");
    public static ConsoleKey OemPlus = getFrom(enumReflected, "OemPlus");
    public static ConsoleKey OemComma = getFrom(enumReflected, "OemComma");
    public static ConsoleKey OemMinus = getFrom(enumReflected, "OemMinus");
    public static ConsoleKey OemPeriod = getFrom(enumReflected, "OemPeriod");
    public static ConsoleKey Oem2 = getFrom(enumReflected, "Oem2");
    public static ConsoleKey Oem3 = getFrom(enumReflected, "Oem3");
    public static ConsoleKey Oem4 = getFrom(enumReflected, "Oem4");
    public static ConsoleKey Oem5 = getFrom(enumReflected, "Oem5");
    public static ConsoleKey Oem6 = getFrom(enumReflected, "Oem6");
    public static ConsoleKey Oem7 = getFrom(enumReflected, "Oem7");
    public static ConsoleKey Oem8 = getFrom(enumReflected, "Oem8");
    public static ConsoleKey Oem102 = getFrom(enumReflected, "Oem102");
    public static ConsoleKey Process = getFrom(enumReflected, "Process");
    public static ConsoleKey Packet = getFrom(enumReflected, "Packet");
    public static ConsoleKey Attention = getFrom(enumReflected, "Attention");
    public static ConsoleKey CrSel = getFrom(enumReflected, "CrSel");
    public static ConsoleKey ExSel = getFrom(enumReflected, "ExSel");
    public static ConsoleKey EraseEndOfFile = getFrom(enumReflected, "EraseEndOfFile");
    public static ConsoleKey Play = getFrom(enumReflected, "Play");
    public static ConsoleKey Zoom = getFrom(enumReflected, "Zoom");
    public static ConsoleKey NoName = getFrom(enumReflected, "NoName");
    public static ConsoleKey Pa1 = getFrom(enumReflected, "Pa1");
    public static ConsoleKey OemClear = getFrom(enumReflected, "OemClear");


    // Flags management section


}