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

package system.drawing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Drawing.KnownColor, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.KnownColor" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Drawing.KnownColor</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.15.0.0
 */
public class KnownColor extends NetObject  {
    /**
     * Fully assembly qualified name: System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Drawing
     */
    public static final String assemblyShortName = "System.Drawing";
    /**
     * Qualified class name: System.Drawing.KnownColor
     */
    public static final String className = "System.Drawing.KnownColor";
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
    public KnownColor(java.lang.Object instance) {
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

    public KnownColor() {
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

    final static KnownColor getFrom(JCEnum object, String value) {
        try {
            return new KnownColor(object.fromValue(value));
        } catch (JCException e) {
            return new KnownColor(object);
        }
    }

    // Enum fields section
    
    public static KnownColor ActiveBorder = getFrom(enumReflected, "ActiveBorder");
    public static KnownColor ActiveCaption = getFrom(enumReflected, "ActiveCaption");
    public static KnownColor ActiveCaptionText = getFrom(enumReflected, "ActiveCaptionText");
    public static KnownColor AppWorkspace = getFrom(enumReflected, "AppWorkspace");
    public static KnownColor Control = getFrom(enumReflected, "Control");
    public static KnownColor ControlDark = getFrom(enumReflected, "ControlDark");
    public static KnownColor ControlDarkDark = getFrom(enumReflected, "ControlDarkDark");
    public static KnownColor ControlLight = getFrom(enumReflected, "ControlLight");
    public static KnownColor ControlLightLight = getFrom(enumReflected, "ControlLightLight");
    public static KnownColor ControlText = getFrom(enumReflected, "ControlText");
    public static KnownColor Desktop = getFrom(enumReflected, "Desktop");
    public static KnownColor GrayText = getFrom(enumReflected, "GrayText");
    public static KnownColor Highlight = getFrom(enumReflected, "Highlight");
    public static KnownColor HighlightText = getFrom(enumReflected, "HighlightText");
    public static KnownColor HotTrack = getFrom(enumReflected, "HotTrack");
    public static KnownColor InactiveBorder = getFrom(enumReflected, "InactiveBorder");
    public static KnownColor InactiveCaption = getFrom(enumReflected, "InactiveCaption");
    public static KnownColor InactiveCaptionText = getFrom(enumReflected, "InactiveCaptionText");
    public static KnownColor Info = getFrom(enumReflected, "Info");
    public static KnownColor InfoText = getFrom(enumReflected, "InfoText");
    public static KnownColor Menu = getFrom(enumReflected, "Menu");
    public static KnownColor MenuText = getFrom(enumReflected, "MenuText");
    public static KnownColor ScrollBar = getFrom(enumReflected, "ScrollBar");
    public static KnownColor Window = getFrom(enumReflected, "Window");
    public static KnownColor WindowFrame = getFrom(enumReflected, "WindowFrame");
    public static KnownColor WindowText = getFrom(enumReflected, "WindowText");
    public static KnownColor Transparent = getFrom(enumReflected, "Transparent");
    public static KnownColor AliceBlue = getFrom(enumReflected, "AliceBlue");
    public static KnownColor AntiqueWhite = getFrom(enumReflected, "AntiqueWhite");
    public static KnownColor Aqua = getFrom(enumReflected, "Aqua");
    public static KnownColor Aquamarine = getFrom(enumReflected, "Aquamarine");
    public static KnownColor Azure = getFrom(enumReflected, "Azure");
    public static KnownColor Beige = getFrom(enumReflected, "Beige");
    public static KnownColor Bisque = getFrom(enumReflected, "Bisque");
    public static KnownColor Black = getFrom(enumReflected, "Black");
    public static KnownColor BlanchedAlmond = getFrom(enumReflected, "BlanchedAlmond");
    public static KnownColor Blue = getFrom(enumReflected, "Blue");
    public static KnownColor BlueViolet = getFrom(enumReflected, "BlueViolet");
    public static KnownColor Brown = getFrom(enumReflected, "Brown");
    public static KnownColor BurlyWood = getFrom(enumReflected, "BurlyWood");
    public static KnownColor CadetBlue = getFrom(enumReflected, "CadetBlue");
    public static KnownColor Chartreuse = getFrom(enumReflected, "Chartreuse");
    public static KnownColor Chocolate = getFrom(enumReflected, "Chocolate");
    public static KnownColor Coral = getFrom(enumReflected, "Coral");
    public static KnownColor CornflowerBlue = getFrom(enumReflected, "CornflowerBlue");
    public static KnownColor Cornsilk = getFrom(enumReflected, "Cornsilk");
    public static KnownColor Crimson = getFrom(enumReflected, "Crimson");
    public static KnownColor Cyan = getFrom(enumReflected, "Cyan");
    public static KnownColor DarkBlue = getFrom(enumReflected, "DarkBlue");
    public static KnownColor DarkCyan = getFrom(enumReflected, "DarkCyan");
    public static KnownColor DarkGoldenrod = getFrom(enumReflected, "DarkGoldenrod");
    public static KnownColor DarkGray = getFrom(enumReflected, "DarkGray");
    public static KnownColor DarkGreen = getFrom(enumReflected, "DarkGreen");
    public static KnownColor DarkKhaki = getFrom(enumReflected, "DarkKhaki");
    public static KnownColor DarkMagenta = getFrom(enumReflected, "DarkMagenta");
    public static KnownColor DarkOliveGreen = getFrom(enumReflected, "DarkOliveGreen");
    public static KnownColor DarkOrange = getFrom(enumReflected, "DarkOrange");
    public static KnownColor DarkOrchid = getFrom(enumReflected, "DarkOrchid");
    public static KnownColor DarkRed = getFrom(enumReflected, "DarkRed");
    public static KnownColor DarkSalmon = getFrom(enumReflected, "DarkSalmon");
    public static KnownColor DarkSeaGreen = getFrom(enumReflected, "DarkSeaGreen");
    public static KnownColor DarkSlateBlue = getFrom(enumReflected, "DarkSlateBlue");
    public static KnownColor DarkSlateGray = getFrom(enumReflected, "DarkSlateGray");
    public static KnownColor DarkTurquoise = getFrom(enumReflected, "DarkTurquoise");
    public static KnownColor DarkViolet = getFrom(enumReflected, "DarkViolet");
    public static KnownColor DeepPink = getFrom(enumReflected, "DeepPink");
    public static KnownColor DeepSkyBlue = getFrom(enumReflected, "DeepSkyBlue");
    public static KnownColor DimGray = getFrom(enumReflected, "DimGray");
    public static KnownColor DodgerBlue = getFrom(enumReflected, "DodgerBlue");
    public static KnownColor Firebrick = getFrom(enumReflected, "Firebrick");
    public static KnownColor FloralWhite = getFrom(enumReflected, "FloralWhite");
    public static KnownColor ForestGreen = getFrom(enumReflected, "ForestGreen");
    public static KnownColor Fuchsia = getFrom(enumReflected, "Fuchsia");
    public static KnownColor Gainsboro = getFrom(enumReflected, "Gainsboro");
    public static KnownColor GhostWhite = getFrom(enumReflected, "GhostWhite");
    public static KnownColor Gold = getFrom(enumReflected, "Gold");
    public static KnownColor Goldenrod = getFrom(enumReflected, "Goldenrod");
    public static KnownColor Gray = getFrom(enumReflected, "Gray");
    public static KnownColor Green = getFrom(enumReflected, "Green");
    public static KnownColor GreenYellow = getFrom(enumReflected, "GreenYellow");
    public static KnownColor Honeydew = getFrom(enumReflected, "Honeydew");
    public static KnownColor HotPink = getFrom(enumReflected, "HotPink");
    public static KnownColor IndianRed = getFrom(enumReflected, "IndianRed");
    public static KnownColor Indigo = getFrom(enumReflected, "Indigo");
    public static KnownColor Ivory = getFrom(enumReflected, "Ivory");
    public static KnownColor Khaki = getFrom(enumReflected, "Khaki");
    public static KnownColor Lavender = getFrom(enumReflected, "Lavender");
    public static KnownColor LavenderBlush = getFrom(enumReflected, "LavenderBlush");
    public static KnownColor LawnGreen = getFrom(enumReflected, "LawnGreen");
    public static KnownColor LemonChiffon = getFrom(enumReflected, "LemonChiffon");
    public static KnownColor LightBlue = getFrom(enumReflected, "LightBlue");
    public static KnownColor LightCoral = getFrom(enumReflected, "LightCoral");
    public static KnownColor LightCyan = getFrom(enumReflected, "LightCyan");
    public static KnownColor LightGoldenrodYellow = getFrom(enumReflected, "LightGoldenrodYellow");
    public static KnownColor LightGray = getFrom(enumReflected, "LightGray");
    public static KnownColor LightGreen = getFrom(enumReflected, "LightGreen");
    public static KnownColor LightPink = getFrom(enumReflected, "LightPink");
    public static KnownColor LightSalmon = getFrom(enumReflected, "LightSalmon");
    public static KnownColor LightSeaGreen = getFrom(enumReflected, "LightSeaGreen");
    public static KnownColor LightSkyBlue = getFrom(enumReflected, "LightSkyBlue");
    public static KnownColor LightSlateGray = getFrom(enumReflected, "LightSlateGray");
    public static KnownColor LightSteelBlue = getFrom(enumReflected, "LightSteelBlue");
    public static KnownColor LightYellow = getFrom(enumReflected, "LightYellow");
    public static KnownColor Lime = getFrom(enumReflected, "Lime");
    public static KnownColor LimeGreen = getFrom(enumReflected, "LimeGreen");
    public static KnownColor Linen = getFrom(enumReflected, "Linen");
    public static KnownColor Magenta = getFrom(enumReflected, "Magenta");
    public static KnownColor Maroon = getFrom(enumReflected, "Maroon");
    public static KnownColor MediumAquamarine = getFrom(enumReflected, "MediumAquamarine");
    public static KnownColor MediumBlue = getFrom(enumReflected, "MediumBlue");
    public static KnownColor MediumOrchid = getFrom(enumReflected, "MediumOrchid");
    public static KnownColor MediumPurple = getFrom(enumReflected, "MediumPurple");
    public static KnownColor MediumSeaGreen = getFrom(enumReflected, "MediumSeaGreen");
    public static KnownColor MediumSlateBlue = getFrom(enumReflected, "MediumSlateBlue");
    public static KnownColor MediumSpringGreen = getFrom(enumReflected, "MediumSpringGreen");
    public static KnownColor MediumTurquoise = getFrom(enumReflected, "MediumTurquoise");
    public static KnownColor MediumVioletRed = getFrom(enumReflected, "MediumVioletRed");
    public static KnownColor MidnightBlue = getFrom(enumReflected, "MidnightBlue");
    public static KnownColor MintCream = getFrom(enumReflected, "MintCream");
    public static KnownColor MistyRose = getFrom(enumReflected, "MistyRose");
    public static KnownColor Moccasin = getFrom(enumReflected, "Moccasin");
    public static KnownColor NavajoWhite = getFrom(enumReflected, "NavajoWhite");
    public static KnownColor Navy = getFrom(enumReflected, "Navy");
    public static KnownColor OldLace = getFrom(enumReflected, "OldLace");
    public static KnownColor Olive = getFrom(enumReflected, "Olive");
    public static KnownColor OliveDrab = getFrom(enumReflected, "OliveDrab");
    public static KnownColor Orange = getFrom(enumReflected, "Orange");
    public static KnownColor OrangeRed = getFrom(enumReflected, "OrangeRed");
    public static KnownColor Orchid = getFrom(enumReflected, "Orchid");
    public static KnownColor PaleGoldenrod = getFrom(enumReflected, "PaleGoldenrod");
    public static KnownColor PaleGreen = getFrom(enumReflected, "PaleGreen");
    public static KnownColor PaleTurquoise = getFrom(enumReflected, "PaleTurquoise");
    public static KnownColor PaleVioletRed = getFrom(enumReflected, "PaleVioletRed");
    public static KnownColor PapayaWhip = getFrom(enumReflected, "PapayaWhip");
    public static KnownColor PeachPuff = getFrom(enumReflected, "PeachPuff");
    public static KnownColor Peru = getFrom(enumReflected, "Peru");
    public static KnownColor Pink = getFrom(enumReflected, "Pink");
    public static KnownColor Plum = getFrom(enumReflected, "Plum");
    public static KnownColor PowderBlue = getFrom(enumReflected, "PowderBlue");
    public static KnownColor Purple = getFrom(enumReflected, "Purple");
    public static KnownColor Red = getFrom(enumReflected, "Red");
    public static KnownColor RosyBrown = getFrom(enumReflected, "RosyBrown");
    public static KnownColor RoyalBlue = getFrom(enumReflected, "RoyalBlue");
    public static KnownColor SaddleBrown = getFrom(enumReflected, "SaddleBrown");
    public static KnownColor Salmon = getFrom(enumReflected, "Salmon");
    public static KnownColor SandyBrown = getFrom(enumReflected, "SandyBrown");
    public static KnownColor SeaGreen = getFrom(enumReflected, "SeaGreen");
    public static KnownColor SeaShell = getFrom(enumReflected, "SeaShell");
    public static KnownColor Sienna = getFrom(enumReflected, "Sienna");
    public static KnownColor Silver = getFrom(enumReflected, "Silver");
    public static KnownColor SkyBlue = getFrom(enumReflected, "SkyBlue");
    public static KnownColor SlateBlue = getFrom(enumReflected, "SlateBlue");
    public static KnownColor SlateGray = getFrom(enumReflected, "SlateGray");
    public static KnownColor Snow = getFrom(enumReflected, "Snow");
    public static KnownColor SpringGreen = getFrom(enumReflected, "SpringGreen");
    public static KnownColor SteelBlue = getFrom(enumReflected, "SteelBlue");
    public static KnownColor Tan = getFrom(enumReflected, "Tan");
    public static KnownColor Teal = getFrom(enumReflected, "Teal");
    public static KnownColor Thistle = getFrom(enumReflected, "Thistle");
    public static KnownColor Tomato = getFrom(enumReflected, "Tomato");
    public static KnownColor Turquoise = getFrom(enumReflected, "Turquoise");
    public static KnownColor Violet = getFrom(enumReflected, "Violet");
    public static KnownColor Wheat = getFrom(enumReflected, "Wheat");
    public static KnownColor White = getFrom(enumReflected, "White");
    public static KnownColor WhiteSmoke = getFrom(enumReflected, "WhiteSmoke");
    public static KnownColor Yellow = getFrom(enumReflected, "Yellow");
    public static KnownColor YellowGreen = getFrom(enumReflected, "YellowGreen");
    public static KnownColor ButtonFace = getFrom(enumReflected, "ButtonFace");
    public static KnownColor ButtonHighlight = getFrom(enumReflected, "ButtonHighlight");
    public static KnownColor ButtonShadow = getFrom(enumReflected, "ButtonShadow");
    public static KnownColor GradientActiveCaption = getFrom(enumReflected, "GradientActiveCaption");
    public static KnownColor GradientInactiveCaption = getFrom(enumReflected, "GradientInactiveCaption");
    public static KnownColor MenuBar = getFrom(enumReflected, "MenuBar");
    public static KnownColor MenuHighlight = getFrom(enumReflected, "MenuHighlight");


    // Flags management section


}