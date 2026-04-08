package androidx.constraintlayout.core.motion;

import androidx.compose.animation.AbstractC0455a;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CustomVariable {

    /* JADX INFO: renamed from: a */
    public final String f21265a;

    /* JADX INFO: renamed from: b */
    public final int f21266b;

    /* JADX INFO: renamed from: c */
    public int f21267c;

    /* JADX INFO: renamed from: d */
    public float f21268d;

    /* JADX INFO: renamed from: e */
    public String f21269e;

    /* JADX INFO: renamed from: f */
    public final boolean f21270f;

    public CustomVariable(CustomVariable customVariable) {
        this.f21267c = Integer.MIN_VALUE;
        this.f21268d = Float.NaN;
        this.f21269e = null;
        this.f21265a = customVariable.f21265a;
        this.f21266b = customVariable.f21266b;
        this.f21267c = customVariable.f21267c;
        this.f21268d = customVariable.f21268d;
        this.f21269e = customVariable.f21269e;
        this.f21270f = customVariable.f21270f;
    }

    /* JADX INFO: renamed from: a */
    public static int m6851a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: b */
    public static String m6852b(int i) {
        return "#" + ("00000000" + Integer.toHexString(i)).substring(r2.length() - 8);
    }

    /* JADX INFO: renamed from: c */
    public final float m6853c() {
        switch (this.f21266b) {
            case 900:
                return this.f21267c;
            case 901:
                return this.f21268d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6854d(float[] fArr) {
        switch (this.f21266b) {
            case 900:
                fArr[0] = this.f21267c;
                return;
            case 901:
                fArr[0] = this.f21268d;
                return;
            case 902:
                int i = (this.f21267c >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m6855e() {
        return this.f21266b != 902 ? 1 : 4;
    }

    /* JADX INFO: renamed from: f */
    public final void m6856f(MotionWidget motionWidget, float[] fArr) {
        String str = this.f21265a;
        int i = this.f21266b;
        switch (i) {
            case 900:
                motionWidget.f21332a.m7021f(i, (int) fArr[0], str);
                return;
            case 901:
                motionWidget.f21332a.m7022g(str, i, fArr[0]);
                return;
            case 902:
                motionWidget.f21332a.m7021f(i, (m6851a((int) (fArr[3] * 255.0f)) << 24) | (m6851a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m6851a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m6851a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)), str);
                return;
            case 903:
                throw new RuntimeException(AbstractC0000a.m13j("unable to interpolate ", str));
            default:
                return;
        }
    }

    public final String toString() {
        String strM2241p = AbstractC0455a.m2241p(new StringBuilder(), this.f21265a, ':');
        switch (this.f21266b) {
            case 900:
                StringBuilder sbM2244s = AbstractC0455a.m2244s(strM2241p);
                sbM2244s.append(this.f21267c);
                return sbM2244s.toString();
            case 901:
                StringBuilder sbM2244s2 = AbstractC0455a.m2244s(strM2241p);
                sbM2244s2.append(this.f21268d);
                return sbM2244s2.toString();
            case 902:
                StringBuilder sbM2244s3 = AbstractC0455a.m2244s(strM2241p);
                sbM2244s3.append(m6852b(this.f21267c));
                return sbM2244s3.toString();
            case 903:
                StringBuilder sbM2244s4 = AbstractC0455a.m2244s(strM2241p);
                sbM2244s4.append(this.f21269e);
                return sbM2244s4.toString();
            default:
                return AbstractC0000a.m2C(strM2241p, "????");
        }
    }

    public CustomVariable(String str, int i, int i2) {
        this.f21267c = Integer.MIN_VALUE;
        this.f21268d = Float.NaN;
        this.f21269e = null;
        this.f21265a = str;
        this.f21266b = i;
        if (i == 901) {
            this.f21268d = i2;
        } else {
            this.f21267c = i2;
        }
    }

    public CustomVariable(String str, int i, float f) {
        this.f21267c = Integer.MIN_VALUE;
        this.f21269e = null;
        this.f21265a = str;
        this.f21266b = i;
        this.f21268d = f;
    }
}
