package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CustomSupport {

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C13961 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22158a;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f22158a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22158a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22158a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22158a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22158a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22158a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22158a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7199a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: b */
    public static void m7200b(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.f22599b;
        try {
            int iOrdinal = constraintAttribute.f22600c.ordinal();
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z2 = true;
            switch (iOrdinal) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((m7199a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m7199a((int) (fArr[3] * 255.0f)) << 24) | (m7199a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m7199a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM7199a = (m7199a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m7199a((int) (fArr[3] * 255.0f)) << 24) | (m7199a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m7199a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM7199a);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.f22599b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z2 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z2));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sbM23t = AbstractC0000a.m23t("Cannot access method ", str, " on View \"");
            sbM23t.append(Debug.m7212d(view));
            sbM23t.append("\"");
            Log.e("CustomSupport", sbM23t.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder sbM23t2 = AbstractC0000a.m23t("No method ", str, " on View \"");
            sbM23t2.append(Debug.m7212d(view));
            sbM23t2.append("\"");
            Log.e("CustomSupport", sbM23t2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbM23t3 = AbstractC0000a.m23t("Cannot invoke method ", str, " on View \"");
            sbM23t3.append(Debug.m7212d(view));
            sbM23t3.append("\"");
            Log.e("CustomSupport", sbM23t3.toString(), e3);
        }
    }
}
