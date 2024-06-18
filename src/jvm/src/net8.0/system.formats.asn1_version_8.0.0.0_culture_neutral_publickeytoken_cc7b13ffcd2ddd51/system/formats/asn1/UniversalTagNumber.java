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

package system.formats.asn1;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
// PACKAGE_IMPORT_SECTION

/**
 * The base .NET class managing System.Formats.Asn1.UniversalTagNumber, System.Formats.Asn1, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51.
 * <p>
 * 
 * .NET documentation at <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Formats.Asn1.UniversalTagNumber" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Formats.Asn1.UniversalTagNumber</a>
 * <p>
 *
 * Powered by JCOBridge: more info at <a href="https://www.jcobridge.com" target="_top">https://www.jcobridge.com</a>
 *
 * @author  MASES s.r.l https://masesgroup.com
 * @version 1.14.2.0
 */
public class UniversalTagNumber extends NetObject  {
    /**
     * Fully assembly qualified name: System.Formats.Asn1, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51
     */
    public static final String assemblyFullName = "System.Formats.Asn1, Version=8.0.0.0, Culture=neutral, PublicKeyToken=cc7b13ffcd2ddd51";
    /**
     * Assembly name: System.Formats.Asn1
     */
    public static final String assemblyShortName = "System.Formats.Asn1";
    /**
     * Qualified class name: System.Formats.Asn1.UniversalTagNumber
     */
    public static final String className = "System.Formats.Asn1.UniversalTagNumber";
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
    public UniversalTagNumber(java.lang.Object instance) {
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

    public UniversalTagNumber() {
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

    final static UniversalTagNumber getFrom(JCEnum object, String value) {
        try {
            return new UniversalTagNumber(object.fromValue(value));
        } catch (JCException e) {
            return new UniversalTagNumber(object);
        }
    }

    // Enum fields section
    
    public static UniversalTagNumber EndOfContents = getFrom(enumReflected, "EndOfContents");
    public static UniversalTagNumber Boolean = getFrom(enumReflected, "Boolean");
    public static UniversalTagNumber Integer = getFrom(enumReflected, "Integer");
    public static UniversalTagNumber BitString = getFrom(enumReflected, "BitString");
    public static UniversalTagNumber OctetString = getFrom(enumReflected, "OctetString");
    public static UniversalTagNumber Null = getFrom(enumReflected, "Null");
    public static UniversalTagNumber ObjectIdentifier = getFrom(enumReflected, "ObjectIdentifier");
    public static UniversalTagNumber ObjectDescriptor = getFrom(enumReflected, "ObjectDescriptor");
    public static UniversalTagNumber External = getFrom(enumReflected, "External");
    public static UniversalTagNumber InstanceOf = getFrom(enumReflected, "InstanceOf");
    public static UniversalTagNumber Real = getFrom(enumReflected, "Real");
    public static UniversalTagNumber Enumerated = getFrom(enumReflected, "Enumerated");
    public static UniversalTagNumber Embedded = getFrom(enumReflected, "Embedded");
    public static UniversalTagNumber UTF8String = getFrom(enumReflected, "UTF8String");
    public static UniversalTagNumber RelativeObjectIdentifier = getFrom(enumReflected, "RelativeObjectIdentifier");
    public static UniversalTagNumber Time = getFrom(enumReflected, "Time");
    public static UniversalTagNumber Sequence = getFrom(enumReflected, "Sequence");
    public static UniversalTagNumber SequenceOf = getFrom(enumReflected, "SequenceOf");
    public static UniversalTagNumber Set = getFrom(enumReflected, "Set");
    public static UniversalTagNumber SetOf = getFrom(enumReflected, "SetOf");
    public static UniversalTagNumber NumericString = getFrom(enumReflected, "NumericString");
    public static UniversalTagNumber PrintableString = getFrom(enumReflected, "PrintableString");
    public static UniversalTagNumber TeletexString = getFrom(enumReflected, "TeletexString");
    public static UniversalTagNumber T61String = getFrom(enumReflected, "T61String");
    public static UniversalTagNumber VideotexString = getFrom(enumReflected, "VideotexString");
    public static UniversalTagNumber IA5String = getFrom(enumReflected, "IA5String");
    public static UniversalTagNumber UtcTime = getFrom(enumReflected, "UtcTime");
    public static UniversalTagNumber GeneralizedTime = getFrom(enumReflected, "GeneralizedTime");
    public static UniversalTagNumber GraphicString = getFrom(enumReflected, "GraphicString");
    public static UniversalTagNumber VisibleString = getFrom(enumReflected, "VisibleString");
    public static UniversalTagNumber ISO646String = getFrom(enumReflected, "ISO646String");
    public static UniversalTagNumber GeneralString = getFrom(enumReflected, "GeneralString");
    public static UniversalTagNumber UniversalString = getFrom(enumReflected, "UniversalString");
    public static UniversalTagNumber UnrestrictedCharacterString = getFrom(enumReflected, "UnrestrictedCharacterString");
    public static UniversalTagNumber BMPString = getFrom(enumReflected, "BMPString");
    public static UniversalTagNumber Date = getFrom(enumReflected, "Date");
    public static UniversalTagNumber TimeOfDay = getFrom(enumReflected, "TimeOfDay");
    public static UniversalTagNumber DateTime = getFrom(enumReflected, "DateTime");
    public static UniversalTagNumber Duration = getFrom(enumReflected, "Duration");
    public static UniversalTagNumber ObjectIdentifierIRI = getFrom(enumReflected, "ObjectIdentifierIRI");
    public static UniversalTagNumber RelativeObjectIdentifierIRI = getFrom(enumReflected, "RelativeObjectIdentifierIRI");


    // Flags management section


}