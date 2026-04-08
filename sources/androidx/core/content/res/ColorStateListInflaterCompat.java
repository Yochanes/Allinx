package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.math.MathUtils;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class ColorStateListInflaterCompat {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f23153a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m7533a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m7534b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m7534b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int[] iArr;
        int i;
        int iM7530a;
        float f;
        int i2;
        float fCbrt;
        float f2;
        float f3;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = R.styleable.f22938a;
                ?? ObtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i3, i3);
                int resourceId = ObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f23153a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, r4);
                    int i5 = typedValue.type;
                    if (i5 < 28 || i5 > 31) {
                        try {
                            color = m7533a(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i3, -65281);
                    }
                    float f4 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    ?? r16 = r4;
                    float f5 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i6 = i3;
                    int i7 = i6;
                    while (i6 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != com.exchange.allin.R.attr.alpha && attributeNameResource != com.exchange.allin.R.attr.lStar) {
                            int i8 = i7 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i6, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i7] = attributeNameResource;
                            i7 = i8;
                        }
                        i6++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i7);
                    float f6 = 0.0f;
                    boolean z2 = (f5 < 0.0f || f5 > 100.0f) ? false : r16 == true ? 1 : 0;
                    if (f4 != 1.0f || z2) {
                        int iM7630b = MathUtils.m7630b((int) ((Color.alpha(color) * f4) + 0.5f), 0, 255);
                        if (z2) {
                            CamColor camColorM7527a = CamColor.m7527a(color);
                            ViewingConditions viewingConditions = ViewingConditions.f23182k;
                            float f7 = camColorM7527a.f23144b;
                            if (f7 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i = depth2;
                                iM7530a = CamUtils.m7530a(f5);
                            } else {
                                float f8 = camColorM7527a.f23143a;
                                float fMin = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
                                float fM1B = f7;
                                boolean z3 = r16 == true ? 1 : 0;
                                CamColor camColor = null;
                                while (true) {
                                    if (Math.abs(f6 - f7) >= 0.4f) {
                                        float f9 = 1000.0f;
                                        iArr = iArrTrimStateSet;
                                        float f10 = 0.0f;
                                        float f11 = 100.0f;
                                        float f12 = 1000.0f;
                                        CamColor camColor2 = null;
                                        while (true) {
                                            if (Math.abs(f10 - f11) <= 0.01f) {
                                                i = depth2;
                                                f = f5;
                                                break;
                                            }
                                            float fM1B2 = AbstractC0000a.m1B(f11, f10, 2.0f, f10);
                                            float f13 = f11;
                                            int iM7529c = CamColor.m7528b(fM1B2, fM1B, fMin).m7529c(ViewingConditions.f23182k);
                                            float fM7531b = CamUtils.m7531b(Color.red(iM7529c));
                                            float fM7531b2 = CamUtils.m7531b(Color.green(iM7529c));
                                            float fM7531b3 = CamUtils.m7531b(Color.blue(iM7529c));
                                            float[] fArr = CamUtils.f23152d[r16 == true ? 1 : 0];
                                            float f14 = ((fM7531b3 * fArr[2]) + ((fM7531b2 * fArr[r16 == true ? 1 : 0]) + (fM7531b * fArr[0]))) / 100.0f;
                                            if (f14 <= 0.008856452f) {
                                                fCbrt = f14 * 903.2963f;
                                                i2 = iM7529c;
                                            } else {
                                                i2 = iM7529c;
                                                fCbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f5 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                CamColor camColorM7527a2 = CamColor.m7527a(i2);
                                                f2 = fCbrt;
                                                f3 = fM1B2;
                                                CamColor camColorM7528b = CamColor.m7528b(camColorM7527a2.f23145c, camColorM7527a2.f23144b, fMin);
                                                float f15 = camColorM7527a2.f23146d - camColorM7528b.f23146d;
                                                float f16 = camColorM7527a2.f23147e - camColorM7528b.f23147e;
                                                float f17 = camColorM7527a2.f23148f - camColorM7528b.f23148f;
                                                i = depth2;
                                                f = f5;
                                                float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    camColor2 = camColorM7527a2;
                                                    f12 = fPow;
                                                    f9 = fAbs;
                                                }
                                            } else {
                                                f2 = fCbrt;
                                                f3 = fM1B2;
                                                i = depth2;
                                                f = f5;
                                            }
                                            if (f9 == 0.0f && f12 == 0.0f) {
                                                break;
                                            }
                                            if (f2 < f) {
                                                f11 = f13;
                                                f10 = f3;
                                            } else {
                                                f11 = f3;
                                            }
                                            depth2 = i;
                                            f5 = f;
                                        }
                                        CamColor camColor3 = camColor2;
                                        if (!z3) {
                                            if (camColor3 == null) {
                                                f7 = fM1B;
                                            } else {
                                                camColor = camColor3;
                                                f6 = fM1B;
                                            }
                                            fM1B = AbstractC0000a.m1B(f7, f6, 2.0f, f6);
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                            f5 = f;
                                        } else {
                                            if (camColor3 != null) {
                                                iM7530a = camColor3.m7529c(viewingConditions);
                                                break;
                                            }
                                            fM1B = AbstractC0000a.m1B(f7, f6, 2.0f, f6);
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                            f5 = f;
                                            z3 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i = depth2;
                                        iM7530a = camColor == null ? CamUtils.m7530a(f5) : camColor.m7529c(viewingConditions);
                                    }
                                }
                            }
                            color = iM7530a;
                        } else {
                            iArr = iArrTrimStateSet;
                            i = depth2;
                        }
                        color = (16777215 & color) | (iM7630b << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i = depth2;
                    }
                    int i9 = i4 + 1;
                    if (i9 > iArr2.length) {
                        int[] iArr5 = new int[i4 <= 4 ? 8 : i4 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i4);
                        iArr2 = iArr5;
                    }
                    iArr2[i4] = color;
                    if (i9 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4 > 4 ? i4 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i4);
                        objArr = objArr2;
                    }
                    objArr[i4] = iArr;
                    objArr = (int[][]) objArr;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i4 = i9;
                    r4 = r16 == true ? 1 : 0;
                    depth2 = i;
                    i3 = 0;
                    r0 = resources;
                }
            } else {
                int i10 = depth2;
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                depth2 = i10;
                i3 = 0;
            }
        }
        int[] iArr6 = new int[i4];
        int[][] iArr7 = new int[i4][];
        System.arraycopy(iArr2, 0, iArr6, 0, i4);
        System.arraycopy(objArr, 0, iArr7, 0, i4);
        return new ColorStateList(iArr7, iArr6);
    }
}
