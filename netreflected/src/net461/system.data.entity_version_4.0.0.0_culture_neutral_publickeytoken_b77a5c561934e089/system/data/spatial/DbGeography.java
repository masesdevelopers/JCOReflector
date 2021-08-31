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

package system.data.spatial;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.spatial.DbGeography;
import system.data.spatial.DbGeographyWellKnownValue;


/**
 * The base .NET class managing System.Data.Spatial.DbGeography, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Data.Spatial.DbGeography" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Data.Spatial.DbGeography</a>
 */
public class DbGeography extends NetObject  {
    /**
     * Fully assembly qualified name: System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Data.Entity
     */
    public static final String assemblyShortName = "System.Data.Entity";
    /**
     * Qualified class name: System.Data.Spatial.DbGeography
     */
    public static final String className = "System.Data.Spatial.DbGeography";
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
    public DbGeography(java.lang.Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DbGeography}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DbGeography} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DbGeography cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DbGeography(from.getJCOInstance());
    }

    // Constructors section
    
    public DbGeography() throws Throwable {
    }



    
    // Methods section
    
    public boolean Disjoint(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Disjoint", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Intersects(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Intersects", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean SpatialEquals(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("SpatialEquals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte[] AsBinary() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<java.lang.Object> resultingArrayList = new ArrayList<java.lang.Object>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("AsBinary");
            for (java.lang.Object resultingObject : resultingObjects) {
			    resultingArrayList.add(resultingObject);
            }
            byte[] resultingArray = new byte[resultingArrayList.size()];
            for(int indexAsBinary = 0; indexAsBinary < resultingArrayList.size(); indexAsBinary++ ) {
				resultingArray[indexAsBinary] = (byte)resultingArrayList.get(indexAsBinary);
            }
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography Difference(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objDifference = (JCObject)classInstance.Invoke("Difference", other == null ? null : other.getJCOInstance());
            return new DbGeography(objDifference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography ElementAt(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objElementAt = (JCObject)classInstance.Invoke("ElementAt", index);
            return new DbGeography(objElementAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromBinary(byte[] wellKnownBinary) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", (java.lang.Object)wellKnownBinary);
            return new DbGeography(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromBinary(JCORefOut dupParam0) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", (java.lang.Object)dupParam0.getJCRefOut());
            return new DbGeography(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromBinary(byte[] wellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", wellKnownBinary, coordinateSystemId);
            return new DbGeography(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromBinary = (JCObject)classType.Invoke("FromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromGml(java.lang.String geographyMarkup) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromGml = (JCObject)classType.Invoke("FromGml", geographyMarkup);
            return new DbGeography(objFromGml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromGml(java.lang.String geographyMarkup, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromGml = (JCObject)classType.Invoke("FromGml", geographyMarkup, coordinateSystemId);
            return new DbGeography(objFromGml);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromText(java.lang.String wellKnownText) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromText = (JCObject)classType.Invoke("FromText", wellKnownText);
            return new DbGeography(objFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography FromText(java.lang.String wellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFromText = (JCObject)classType.Invoke("FromText", wellKnownText, coordinateSystemId);
            return new DbGeography(objFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography GeographyCollectionFromBinary(byte[] geographyCollectionWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGeographyCollectionFromBinary = (JCObject)classType.Invoke("GeographyCollectionFromBinary", geographyCollectionWellKnownBinary, coordinateSystemId);
            return new DbGeography(objGeographyCollectionFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography GeographyCollectionFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGeographyCollectionFromBinary = (JCObject)classType.Invoke("GeographyCollectionFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objGeographyCollectionFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography GeographyCollectionFromText(java.lang.String geographyCollectionWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGeographyCollectionFromText = (JCObject)classType.Invoke("GeographyCollectionFromText", geographyCollectionWellKnownText, coordinateSystemId);
            return new DbGeography(objGeographyCollectionFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography Intersection(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objIntersection = (JCObject)classInstance.Invoke("Intersection", other == null ? null : other.getJCOInstance());
            return new DbGeography(objIntersection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography LineFromBinary(byte[] lineWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLineFromBinary = (JCObject)classType.Invoke("LineFromBinary", lineWellKnownBinary, coordinateSystemId);
            return new DbGeography(objLineFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography LineFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLineFromBinary = (JCObject)classType.Invoke("LineFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objLineFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography LineFromText(java.lang.String lineWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLineFromText = (JCObject)classType.Invoke("LineFromText", lineWellKnownText, coordinateSystemId);
            return new DbGeography(objLineFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiLineFromBinary(byte[] multiLineWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiLineFromBinary = (JCObject)classType.Invoke("MultiLineFromBinary", multiLineWellKnownBinary, coordinateSystemId);
            return new DbGeography(objMultiLineFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiLineFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiLineFromBinary = (JCObject)classType.Invoke("MultiLineFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objMultiLineFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiLineFromText(java.lang.String multiLineWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiLineFromText = (JCObject)classType.Invoke("MultiLineFromText", multiLineWellKnownText, coordinateSystemId);
            return new DbGeography(objMultiLineFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPointFromBinary(byte[] multiPointWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiPointFromBinary = (JCObject)classType.Invoke("MultiPointFromBinary", multiPointWellKnownBinary, coordinateSystemId);
            return new DbGeography(objMultiPointFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPointFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiPointFromBinary = (JCObject)classType.Invoke("MultiPointFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objMultiPointFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPointFromText(java.lang.String multiPointWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiPointFromText = (JCObject)classType.Invoke("MultiPointFromText", multiPointWellKnownText, coordinateSystemId);
            return new DbGeography(objMultiPointFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPolygonFromBinary(byte[] multiPolygonWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiPolygonFromBinary = (JCObject)classType.Invoke("MultiPolygonFromBinary", multiPolygonWellKnownBinary, coordinateSystemId);
            return new DbGeography(objMultiPolygonFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPolygonFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiPolygonFromBinary = (JCObject)classType.Invoke("MultiPolygonFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objMultiPolygonFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography MultiPolygonFromText(java.lang.String multiPolygonWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiPolygonFromText = (JCObject)classType.Invoke("MultiPolygonFromText", multiPolygonWellKnownText, coordinateSystemId);
            return new DbGeography(objMultiPolygonFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography PointAt(int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objPointAt = (JCObject)classInstance.Invoke("PointAt", index);
            return new DbGeography(objPointAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PointFromBinary(byte[] pointWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPointFromBinary = (JCObject)classType.Invoke("PointFromBinary", pointWellKnownBinary, coordinateSystemId);
            return new DbGeography(objPointFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PointFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPointFromBinary = (JCObject)classType.Invoke("PointFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objPointFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PointFromText(java.lang.String pointWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPointFromText = (JCObject)classType.Invoke("PointFromText", pointWellKnownText, coordinateSystemId);
            return new DbGeography(objPointFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PolygonFromBinary(byte[] polygonWellKnownBinary, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPolygonFromBinary = (JCObject)classType.Invoke("PolygonFromBinary", polygonWellKnownBinary, coordinateSystemId);
            return new DbGeography(objPolygonFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PolygonFromBinary(JCORefOut dupParam0, int dupParam1) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPolygonFromBinary = (JCObject)classType.Invoke("PolygonFromBinary", dupParam0.getJCRefOut(), dupParam1);
            return new DbGeography(objPolygonFromBinary);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static DbGeography PolygonFromText(java.lang.String polygonWellKnownText, int coordinateSystemId) throws Throwable, system.ArgumentNullException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objPolygonFromText = (JCObject)classType.Invoke("PolygonFromText", polygonWellKnownText, coordinateSystemId);
            return new DbGeography(objPolygonFromText);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography SymmetricDifference(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objSymmetricDifference = (JCObject)classInstance.Invoke("SymmetricDifference", other == null ? null : other.getJCOInstance());
            return new DbGeography(objSymmetricDifference);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography Union(DbGeography other) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objUnion = (JCObject)classInstance.Invoke("Union", other == null ? null : other.getJCOInstance());
            return new DbGeography(objUnion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String AsGml() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("AsGml");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String AsText() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("AsText");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsEmpty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCoordinateSystemId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("CoordinateSystemId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int getDefaultCoordinateSystemId() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Get("DefaultCoordinateSystemId");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDimension() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Dimension");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography getEndPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("EndPoint");
            return new DbGeography(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeography getStartPoint() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("StartPoint");
            return new DbGeography(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbGeographyWellKnownValue getWellKnownValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WellKnownValue");
            return new DbGeographyWellKnownValue(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWellKnownValue(DbGeographyWellKnownValue WellKnownValue) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WellKnownValue", WellKnownValue == null ? null : WellKnownValue.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getProviderValue() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ProviderValue");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSpatialTypeName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SpatialTypeName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}