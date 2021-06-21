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

package system.windows.media.textformatting;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.textformatting.CharacterHit;
import system.windows.media.textformatting.TextLine;
import system.windows.media.textformatting.TextCollapsingProperties;
import system.windows.media.textformatting.TextLineBreak;
import system.windows.media.DrawingContext;
import system.windows.Point;
import system.windows.media.textformatting.InvertAxes;


/**
 * The base .NET class managing System.Windows.Media.TextFormatting.TextLine, PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.TextFormatting.TextLine" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.TextFormatting.TextLine</a>
 */
public class TextLine extends NetObject implements AutoCloseable {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.5.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.TextFormatting.TextLine
     */
    public static final String className = "System.Windows.Media.TextFormatting.TextLine";
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

    public TextLine(Object instance) throws Throwable {
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

    public Object getJCOInstance() {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link TextLine}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link TextLine} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static TextLine cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new TextLine(from.getJCOInstance());
    }

    // Constructors section
    
    public TextLine() throws Throwable {
    }

    
    // Methods section
    
    public double GetDistanceFromCharacterHit(CharacterHit characterHit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Invoke("GetDistanceFromCharacterHit", characterHit == null ? null : characterHit.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CharacterHit GetBackspaceCaretCharacterHit(CharacterHit characterHit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetBackspaceCaretCharacterHit = (JCObject)classInstance.Invoke("GetBackspaceCaretCharacterHit", characterHit == null ? null : characterHit.getJCOInstance());
            return new CharacterHit(objGetBackspaceCaretCharacterHit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CharacterHit GetCharacterHitFromDistance(double distance) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetCharacterHitFromDistance = (JCObject)classInstance.Invoke("GetCharacterHitFromDistance", distance);
            return new CharacterHit(objGetCharacterHitFromDistance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CharacterHit GetNextCaretCharacterHit(CharacterHit characterHit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetNextCaretCharacterHit = (JCObject)classInstance.Invoke("GetNextCaretCharacterHit", characterHit == null ? null : characterHit.getJCOInstance());
            return new CharacterHit(objGetNextCaretCharacterHit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public CharacterHit GetPreviousCaretCharacterHit(CharacterHit characterHit) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPreviousCaretCharacterHit = (JCObject)classInstance.Invoke("GetPreviousCaretCharacterHit", characterHit == null ? null : characterHit.getJCOInstance());
            return new CharacterHit(objGetPreviousCaretCharacterHit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextLine Collapse(TextCollapsingProperties... collapsingPropertiesList) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objCollapse = (JCObject)classInstance.Invoke("Collapse", (Object)toObjectFromArray(collapsingPropertiesList));
            return new TextLine(objCollapse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextLineBreak GetTextLineBreak() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetTextLineBreak = (JCObject)classInstance.Invoke("GetTextLineBreak");
            return new TextLineBreak(objGetTextLineBreak);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Dispose() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Dispose");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Draw(DrawingContext drawingContext, Point origin, InvertAxes inversion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Draw", drawingContext == null ? null : drawingContext.getJCOInstance(), origin == null ? null : origin.getJCOInstance(), inversion == null ? null : inversion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void close() throws Exception {
        try {
            if (classInstance == null)
                throw new UnsupportedOperationException("classInstance is null.");
            try {
                classInstance.Invoke("Dispose");
            }
            catch (JCNativeException jcne) {
                throw translateException(jcne);
            }
        } catch (Throwable t) {
            throw new Exception(t);
        }
    }
    
    // Properties section
    
    public boolean getHasCollapsed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasCollapsed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getHasOverflowed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasOverflowed");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsTruncated() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsTruncated");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getBaseline() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Baseline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getExtent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Extent");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Height");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getMarkerBaseline() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("MarkerBaseline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getMarkerHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("MarkerHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOverhangAfter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("OverhangAfter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOverhangLeading() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("OverhangLeading");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getOverhangTrailing() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("OverhangTrailing");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getPixelsPerDip() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("PixelsPerDip");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPixelsPerDip(double PixelsPerDip) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PixelsPerDip", PixelsPerDip);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getStart() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Start");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTextBaseline() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TextBaseline");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getTextHeight() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("TextHeight");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getWidth() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("Width");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public double getWidthIncludingTrailingWhitespace() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (double)classInstance.Get("WidthIncludingTrailingWhitespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getDependentLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("DependentLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Length");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getNewlineLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("NewlineLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getTrailingWhitespaceLength() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("TrailingWhitespaceLength");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}