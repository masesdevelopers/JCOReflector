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

package system.printing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Printing.PageMediaSizeName, ReachFramework, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Printing.PageMediaSizeName" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Printing.PageMediaSizeName</a>
 */
public class PageMediaSizeName extends NetObject  {
    /**
     * Fully assembly qualified name: ReachFramework, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "ReachFramework, Version=5.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: ReachFramework
     */
    public static final String assemblyShortName = "ReachFramework";
    /**
     * Qualified class name: System.Printing.PageMediaSizeName
     */
    public static final String className = "System.Printing.PageMediaSizeName";
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

    public PageMediaSizeName(Object instance) {
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

    public PageMediaSizeName() {
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

    final static PageMediaSizeName getFrom(JCEnum object, String value) {
        try {
            return new PageMediaSizeName(object.fromValue(value));
        } catch (JCException e) {
            return new PageMediaSizeName(object);
        }
    }

    // Enum fields section
    
    public static PageMediaSizeName Unknown = getFrom(enumReflected, "Unknown");
    public static PageMediaSizeName ISOA0 = getFrom(enumReflected, "ISOA0");
    public static PageMediaSizeName ISOA1 = getFrom(enumReflected, "ISOA1");
    public static PageMediaSizeName ISOA10 = getFrom(enumReflected, "ISOA10");
    public static PageMediaSizeName ISOA2 = getFrom(enumReflected, "ISOA2");
    public static PageMediaSizeName ISOA3 = getFrom(enumReflected, "ISOA3");
    public static PageMediaSizeName ISOA3Rotated = getFrom(enumReflected, "ISOA3Rotated");
    public static PageMediaSizeName ISOA3Extra = getFrom(enumReflected, "ISOA3Extra");
    public static PageMediaSizeName ISOA4 = getFrom(enumReflected, "ISOA4");
    public static PageMediaSizeName ISOA4Rotated = getFrom(enumReflected, "ISOA4Rotated");
    public static PageMediaSizeName ISOA4Extra = getFrom(enumReflected, "ISOA4Extra");
    public static PageMediaSizeName ISOA5 = getFrom(enumReflected, "ISOA5");
    public static PageMediaSizeName ISOA5Rotated = getFrom(enumReflected, "ISOA5Rotated");
    public static PageMediaSizeName ISOA5Extra = getFrom(enumReflected, "ISOA5Extra");
    public static PageMediaSizeName ISOA6 = getFrom(enumReflected, "ISOA6");
    public static PageMediaSizeName ISOA6Rotated = getFrom(enumReflected, "ISOA6Rotated");
    public static PageMediaSizeName ISOA7 = getFrom(enumReflected, "ISOA7");
    public static PageMediaSizeName ISOA8 = getFrom(enumReflected, "ISOA8");
    public static PageMediaSizeName ISOA9 = getFrom(enumReflected, "ISOA9");
    public static PageMediaSizeName ISOB0 = getFrom(enumReflected, "ISOB0");
    public static PageMediaSizeName ISOB1 = getFrom(enumReflected, "ISOB1");
    public static PageMediaSizeName ISOB10 = getFrom(enumReflected, "ISOB10");
    public static PageMediaSizeName ISOB2 = getFrom(enumReflected, "ISOB2");
    public static PageMediaSizeName ISOB3 = getFrom(enumReflected, "ISOB3");
    public static PageMediaSizeName ISOB4 = getFrom(enumReflected, "ISOB4");
    public static PageMediaSizeName ISOB4Envelope = getFrom(enumReflected, "ISOB4Envelope");
    public static PageMediaSizeName ISOB5Envelope = getFrom(enumReflected, "ISOB5Envelope");
    public static PageMediaSizeName ISOB5Extra = getFrom(enumReflected, "ISOB5Extra");
    public static PageMediaSizeName ISOB7 = getFrom(enumReflected, "ISOB7");
    public static PageMediaSizeName ISOB8 = getFrom(enumReflected, "ISOB8");
    public static PageMediaSizeName ISOB9 = getFrom(enumReflected, "ISOB9");
    public static PageMediaSizeName ISOC0 = getFrom(enumReflected, "ISOC0");
    public static PageMediaSizeName ISOC1 = getFrom(enumReflected, "ISOC1");
    public static PageMediaSizeName ISOC10 = getFrom(enumReflected, "ISOC10");
    public static PageMediaSizeName ISOC2 = getFrom(enumReflected, "ISOC2");
    public static PageMediaSizeName ISOC3 = getFrom(enumReflected, "ISOC3");
    public static PageMediaSizeName ISOC3Envelope = getFrom(enumReflected, "ISOC3Envelope");
    public static PageMediaSizeName ISOC4 = getFrom(enumReflected, "ISOC4");
    public static PageMediaSizeName ISOC4Envelope = getFrom(enumReflected, "ISOC4Envelope");
    public static PageMediaSizeName ISOC5 = getFrom(enumReflected, "ISOC5");
    public static PageMediaSizeName ISOC5Envelope = getFrom(enumReflected, "ISOC5Envelope");
    public static PageMediaSizeName ISOC6 = getFrom(enumReflected, "ISOC6");
    public static PageMediaSizeName ISOC6Envelope = getFrom(enumReflected, "ISOC6Envelope");
    public static PageMediaSizeName ISOC6C5Envelope = getFrom(enumReflected, "ISOC6C5Envelope");
    public static PageMediaSizeName ISOC7 = getFrom(enumReflected, "ISOC7");
    public static PageMediaSizeName ISOC8 = getFrom(enumReflected, "ISOC8");
    public static PageMediaSizeName ISOC9 = getFrom(enumReflected, "ISOC9");
    public static PageMediaSizeName ISODLEnvelope = getFrom(enumReflected, "ISODLEnvelope");
    public static PageMediaSizeName ISODLEnvelopeRotated = getFrom(enumReflected, "ISODLEnvelopeRotated");
    public static PageMediaSizeName ISOSRA3 = getFrom(enumReflected, "ISOSRA3");
    public static PageMediaSizeName JapanQuadrupleHagakiPostcard = getFrom(enumReflected, "JapanQuadrupleHagakiPostcard");
    public static PageMediaSizeName JISB0 = getFrom(enumReflected, "JISB0");
    public static PageMediaSizeName JISB1 = getFrom(enumReflected, "JISB1");
    public static PageMediaSizeName JISB10 = getFrom(enumReflected, "JISB10");
    public static PageMediaSizeName JISB2 = getFrom(enumReflected, "JISB2");
    public static PageMediaSizeName JISB3 = getFrom(enumReflected, "JISB3");
    public static PageMediaSizeName JISB4 = getFrom(enumReflected, "JISB4");
    public static PageMediaSizeName JISB4Rotated = getFrom(enumReflected, "JISB4Rotated");
    public static PageMediaSizeName JISB5 = getFrom(enumReflected, "JISB5");
    public static PageMediaSizeName JISB5Rotated = getFrom(enumReflected, "JISB5Rotated");
    public static PageMediaSizeName JISB6 = getFrom(enumReflected, "JISB6");
    public static PageMediaSizeName JISB6Rotated = getFrom(enumReflected, "JISB6Rotated");
    public static PageMediaSizeName JISB7 = getFrom(enumReflected, "JISB7");
    public static PageMediaSizeName JISB8 = getFrom(enumReflected, "JISB8");
    public static PageMediaSizeName JISB9 = getFrom(enumReflected, "JISB9");
    public static PageMediaSizeName JapanChou3Envelope = getFrom(enumReflected, "JapanChou3Envelope");
    public static PageMediaSizeName JapanChou3EnvelopeRotated = getFrom(enumReflected, "JapanChou3EnvelopeRotated");
    public static PageMediaSizeName JapanChou4Envelope = getFrom(enumReflected, "JapanChou4Envelope");
    public static PageMediaSizeName JapanChou4EnvelopeRotated = getFrom(enumReflected, "JapanChou4EnvelopeRotated");
    public static PageMediaSizeName JapanHagakiPostcard = getFrom(enumReflected, "JapanHagakiPostcard");
    public static PageMediaSizeName JapanHagakiPostcardRotated = getFrom(enumReflected, "JapanHagakiPostcardRotated");
    public static PageMediaSizeName JapanKaku2Envelope = getFrom(enumReflected, "JapanKaku2Envelope");
    public static PageMediaSizeName JapanKaku2EnvelopeRotated = getFrom(enumReflected, "JapanKaku2EnvelopeRotated");
    public static PageMediaSizeName JapanKaku3Envelope = getFrom(enumReflected, "JapanKaku3Envelope");
    public static PageMediaSizeName JapanKaku3EnvelopeRotated = getFrom(enumReflected, "JapanKaku3EnvelopeRotated");
    public static PageMediaSizeName JapanYou4Envelope = getFrom(enumReflected, "JapanYou4Envelope");
    public static PageMediaSizeName NorthAmerica10x11 = getFrom(enumReflected, "NorthAmerica10x11");
    public static PageMediaSizeName NorthAmerica10x14 = getFrom(enumReflected, "NorthAmerica10x14");
    public static PageMediaSizeName NorthAmerica11x17 = getFrom(enumReflected, "NorthAmerica11x17");
    public static PageMediaSizeName NorthAmerica9x11 = getFrom(enumReflected, "NorthAmerica9x11");
    public static PageMediaSizeName NorthAmericaArchitectureASheet = getFrom(enumReflected, "NorthAmericaArchitectureASheet");
    public static PageMediaSizeName NorthAmericaArchitectureBSheet = getFrom(enumReflected, "NorthAmericaArchitectureBSheet");
    public static PageMediaSizeName NorthAmericaArchitectureCSheet = getFrom(enumReflected, "NorthAmericaArchitectureCSheet");
    public static PageMediaSizeName NorthAmericaArchitectureDSheet = getFrom(enumReflected, "NorthAmericaArchitectureDSheet");
    public static PageMediaSizeName NorthAmericaArchitectureESheet = getFrom(enumReflected, "NorthAmericaArchitectureESheet");
    public static PageMediaSizeName NorthAmericaCSheet = getFrom(enumReflected, "NorthAmericaCSheet");
    public static PageMediaSizeName NorthAmericaDSheet = getFrom(enumReflected, "NorthAmericaDSheet");
    public static PageMediaSizeName NorthAmericaESheet = getFrom(enumReflected, "NorthAmericaESheet");
    public static PageMediaSizeName NorthAmericaExecutive = getFrom(enumReflected, "NorthAmericaExecutive");
    public static PageMediaSizeName NorthAmericaGermanLegalFanfold = getFrom(enumReflected, "NorthAmericaGermanLegalFanfold");
    public static PageMediaSizeName NorthAmericaGermanStandardFanfold = getFrom(enumReflected, "NorthAmericaGermanStandardFanfold");
    public static PageMediaSizeName NorthAmericaLegal = getFrom(enumReflected, "NorthAmericaLegal");
    public static PageMediaSizeName NorthAmericaLegalExtra = getFrom(enumReflected, "NorthAmericaLegalExtra");
    public static PageMediaSizeName NorthAmericaLetter = getFrom(enumReflected, "NorthAmericaLetter");
    public static PageMediaSizeName NorthAmericaLetterRotated = getFrom(enumReflected, "NorthAmericaLetterRotated");
    public static PageMediaSizeName NorthAmericaLetterExtra = getFrom(enumReflected, "NorthAmericaLetterExtra");
    public static PageMediaSizeName NorthAmericaLetterPlus = getFrom(enumReflected, "NorthAmericaLetterPlus");
    public static PageMediaSizeName NorthAmericaMonarchEnvelope = getFrom(enumReflected, "NorthAmericaMonarchEnvelope");
    public static PageMediaSizeName NorthAmericaNote = getFrom(enumReflected, "NorthAmericaNote");
    public static PageMediaSizeName NorthAmericaNumber10Envelope = getFrom(enumReflected, "NorthAmericaNumber10Envelope");
    public static PageMediaSizeName NorthAmericaNumber10EnvelopeRotated = getFrom(enumReflected, "NorthAmericaNumber10EnvelopeRotated");
    public static PageMediaSizeName NorthAmericaNumber9Envelope = getFrom(enumReflected, "NorthAmericaNumber9Envelope");
    public static PageMediaSizeName NorthAmericaNumber11Envelope = getFrom(enumReflected, "NorthAmericaNumber11Envelope");
    public static PageMediaSizeName NorthAmericaNumber12Envelope = getFrom(enumReflected, "NorthAmericaNumber12Envelope");
    public static PageMediaSizeName NorthAmericaNumber14Envelope = getFrom(enumReflected, "NorthAmericaNumber14Envelope");
    public static PageMediaSizeName NorthAmericaPersonalEnvelope = getFrom(enumReflected, "NorthAmericaPersonalEnvelope");
    public static PageMediaSizeName NorthAmericaQuarto = getFrom(enumReflected, "NorthAmericaQuarto");
    public static PageMediaSizeName NorthAmericaStatement = getFrom(enumReflected, "NorthAmericaStatement");
    public static PageMediaSizeName NorthAmericaSuperA = getFrom(enumReflected, "NorthAmericaSuperA");
    public static PageMediaSizeName NorthAmericaSuperB = getFrom(enumReflected, "NorthAmericaSuperB");
    public static PageMediaSizeName NorthAmericaTabloid = getFrom(enumReflected, "NorthAmericaTabloid");
    public static PageMediaSizeName NorthAmericaTabloidExtra = getFrom(enumReflected, "NorthAmericaTabloidExtra");
    public static PageMediaSizeName OtherMetricA4Plus = getFrom(enumReflected, "OtherMetricA4Plus");
    public static PageMediaSizeName OtherMetricA3Plus = getFrom(enumReflected, "OtherMetricA3Plus");
    public static PageMediaSizeName OtherMetricFolio = getFrom(enumReflected, "OtherMetricFolio");
    public static PageMediaSizeName OtherMetricInviteEnvelope = getFrom(enumReflected, "OtherMetricInviteEnvelope");
    public static PageMediaSizeName OtherMetricItalianEnvelope = getFrom(enumReflected, "OtherMetricItalianEnvelope");
    public static PageMediaSizeName PRC1Envelope = getFrom(enumReflected, "PRC1Envelope");
    public static PageMediaSizeName PRC1EnvelopeRotated = getFrom(enumReflected, "PRC1EnvelopeRotated");
    public static PageMediaSizeName PRC10Envelope = getFrom(enumReflected, "PRC10Envelope");
    public static PageMediaSizeName PRC10EnvelopeRotated = getFrom(enumReflected, "PRC10EnvelopeRotated");
    public static PageMediaSizeName PRC16K = getFrom(enumReflected, "PRC16K");
    public static PageMediaSizeName PRC16KRotated = getFrom(enumReflected, "PRC16KRotated");
    public static PageMediaSizeName PRC2Envelope = getFrom(enumReflected, "PRC2Envelope");
    public static PageMediaSizeName PRC2EnvelopeRotated = getFrom(enumReflected, "PRC2EnvelopeRotated");
    public static PageMediaSizeName PRC32K = getFrom(enumReflected, "PRC32K");
    public static PageMediaSizeName PRC32KRotated = getFrom(enumReflected, "PRC32KRotated");
    public static PageMediaSizeName PRC32KBig = getFrom(enumReflected, "PRC32KBig");
    public static PageMediaSizeName PRC3Envelope = getFrom(enumReflected, "PRC3Envelope");
    public static PageMediaSizeName PRC3EnvelopeRotated = getFrom(enumReflected, "PRC3EnvelopeRotated");
    public static PageMediaSizeName PRC4Envelope = getFrom(enumReflected, "PRC4Envelope");
    public static PageMediaSizeName PRC4EnvelopeRotated = getFrom(enumReflected, "PRC4EnvelopeRotated");
    public static PageMediaSizeName PRC5Envelope = getFrom(enumReflected, "PRC5Envelope");
    public static PageMediaSizeName PRC5EnvelopeRotated = getFrom(enumReflected, "PRC5EnvelopeRotated");
    public static PageMediaSizeName PRC6Envelope = getFrom(enumReflected, "PRC6Envelope");
    public static PageMediaSizeName PRC6EnvelopeRotated = getFrom(enumReflected, "PRC6EnvelopeRotated");
    public static PageMediaSizeName PRC7Envelope = getFrom(enumReflected, "PRC7Envelope");
    public static PageMediaSizeName PRC7EnvelopeRotated = getFrom(enumReflected, "PRC7EnvelopeRotated");
    public static PageMediaSizeName PRC8Envelope = getFrom(enumReflected, "PRC8Envelope");
    public static PageMediaSizeName PRC8EnvelopeRotated = getFrom(enumReflected, "PRC8EnvelopeRotated");
    public static PageMediaSizeName PRC9Envelope = getFrom(enumReflected, "PRC9Envelope");
    public static PageMediaSizeName PRC9EnvelopeRotated = getFrom(enumReflected, "PRC9EnvelopeRotated");
    public static PageMediaSizeName Roll04Inch = getFrom(enumReflected, "Roll04Inch");
    public static PageMediaSizeName Roll06Inch = getFrom(enumReflected, "Roll06Inch");
    public static PageMediaSizeName Roll08Inch = getFrom(enumReflected, "Roll08Inch");
    public static PageMediaSizeName Roll12Inch = getFrom(enumReflected, "Roll12Inch");
    public static PageMediaSizeName Roll15Inch = getFrom(enumReflected, "Roll15Inch");
    public static PageMediaSizeName Roll18Inch = getFrom(enumReflected, "Roll18Inch");
    public static PageMediaSizeName Roll22Inch = getFrom(enumReflected, "Roll22Inch");
    public static PageMediaSizeName Roll24Inch = getFrom(enumReflected, "Roll24Inch");
    public static PageMediaSizeName Roll30Inch = getFrom(enumReflected, "Roll30Inch");
    public static PageMediaSizeName Roll36Inch = getFrom(enumReflected, "Roll36Inch");
    public static PageMediaSizeName Roll54Inch = getFrom(enumReflected, "Roll54Inch");
    public static PageMediaSizeName JapanDoubleHagakiPostcard = getFrom(enumReflected, "JapanDoubleHagakiPostcard");
    public static PageMediaSizeName JapanDoubleHagakiPostcardRotated = getFrom(enumReflected, "JapanDoubleHagakiPostcardRotated");
    public static PageMediaSizeName JapanLPhoto = getFrom(enumReflected, "JapanLPhoto");
    public static PageMediaSizeName Japan2LPhoto = getFrom(enumReflected, "Japan2LPhoto");
    public static PageMediaSizeName JapanYou1Envelope = getFrom(enumReflected, "JapanYou1Envelope");
    public static PageMediaSizeName JapanYou2Envelope = getFrom(enumReflected, "JapanYou2Envelope");
    public static PageMediaSizeName JapanYou3Envelope = getFrom(enumReflected, "JapanYou3Envelope");
    public static PageMediaSizeName JapanYou4EnvelopeRotated = getFrom(enumReflected, "JapanYou4EnvelopeRotated");
    public static PageMediaSizeName JapanYou6Envelope = getFrom(enumReflected, "JapanYou6Envelope");
    public static PageMediaSizeName JapanYou6EnvelopeRotated = getFrom(enumReflected, "JapanYou6EnvelopeRotated");
    public static PageMediaSizeName NorthAmerica4x6 = getFrom(enumReflected, "NorthAmerica4x6");
    public static PageMediaSizeName NorthAmerica4x8 = getFrom(enumReflected, "NorthAmerica4x8");
    public static PageMediaSizeName NorthAmerica5x7 = getFrom(enumReflected, "NorthAmerica5x7");
    public static PageMediaSizeName NorthAmerica8x10 = getFrom(enumReflected, "NorthAmerica8x10");
    public static PageMediaSizeName NorthAmerica10x12 = getFrom(enumReflected, "NorthAmerica10x12");
    public static PageMediaSizeName NorthAmerica14x17 = getFrom(enumReflected, "NorthAmerica14x17");
    public static PageMediaSizeName BusinessCard = getFrom(enumReflected, "BusinessCard");
    public static PageMediaSizeName CreditCard = getFrom(enumReflected, "CreditCard");


    // Flags management section


}