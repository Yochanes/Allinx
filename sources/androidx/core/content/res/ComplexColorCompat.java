package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.content.res.GradientColorInflaterCompat;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class ComplexColorCompat {

    /* JADX INFO: renamed from: a */
    public final Shader f23154a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f23155b;

    /* JADX INFO: renamed from: c */
    public int f23156c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.f23154a = shader;
        this.f23155b = colorStateList;
        this.f23156c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ComplexColorCompat m7535a(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        float f3;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM7534b = ColorStateListInflaterCompat.m7534b(resources, xml, attributeSetAsAttributeSet, theme);
                return new ComplexColorCompat(null, colorStateListM7534b, colorStateListM7534b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM7548d = TypedArrayUtils.m7548d(resources, theme, attributeSetAsAttributeSet, R.styleable.f22941d);
        float f4 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayM7548d.getFloat(8, 0.0f);
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM7548d.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM7548d.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM7548d.getFloat(11, 0.0f) : 0.0f;
        float f8 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayM7548d.getFloat(3, 0.0f);
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM7548d.getFloat(4, 0.0f) : 0.0f;
        int i3 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayM7548d.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM7548d.getColor(0, 0) : 0;
        boolean z2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM7548d.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM7548d.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f4;
            i2 = typedArrayM7548d.getInt(6, 0);
        } else {
            f = f4;
            i2 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM7548d.getFloat(5, 0.0f) : 0.0f;
        typedArrayM7548d.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f5;
            if (next2 == 1) {
                f3 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM7548d2 = TypedArrayUtils.m7548d(resources, theme, attributeSetAsAttributeSet, R.styleable.f22942e);
                boolean zHasValue = typedArrayM7548d2.hasValue(0);
                boolean zHasValue2 = typedArrayM7548d2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayM7548d2.getColor(0, 0);
                float f12 = typedArrayM7548d2.getFloat(1, 0.0f);
                typedArrayM7548d2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f5 = f2;
            f6 = f3;
        }
        GradientColorInflaterCompat.ColorStops colorStops = arrayList2.size() > 0 ? new GradientColorInflaterCompat.ColorStops(arrayList2, arrayList) : null;
        if (colorStops == null) {
            colorStops = z2 ? new GradientColorInflaterCompat.ColorStops(color, color2, color3) : new GradientColorInflaterCompat.ColorStops(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                radialGradient = new LinearGradient(f, f2, f3, f7, colorStops.f23169a, colorStops.f23170b, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f8, f9, colorStops.f23169a, colorStops.f23170b);
            }
        } else {
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f8, f9, f11, colorStops.f23169a, colorStops.f23170b, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new ComplexColorCompat(radialGradient, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7536b() {
        ColorStateList colorStateList;
        return this.f23154a == null && (colorStateList = this.f23155b) != null && colorStateList.isStateful();
    }
}
