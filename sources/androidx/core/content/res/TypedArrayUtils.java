package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class TypedArrayUtils {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m7545a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = ColorStateListInflaterCompat.f23153a;
        try {
            return ColorStateListInflaterCompat.m7533a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ComplexColorCompat m7546b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ComplexColorCompat complexColorCompatM7535a;
        if (m7547c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ComplexColorCompat(null, null, typedValue.data);
            }
            try {
                complexColorCompatM7535a = ComplexColorCompat.m7535a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                complexColorCompatM7535a = null;
            }
            if (complexColorCompatM7535a != null) {
                return complexColorCompatM7535a;
            }
        }
        return new ComplexColorCompat(null, null, 0);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7547c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: d */
    public static TypedArray m7548d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
