package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TypedBundle {

    /* JADX INFO: renamed from: a */
    public int[] f21515a = new int[10];

    /* JADX INFO: renamed from: b */
    public int[] f21516b = new int[10];

    /* JADX INFO: renamed from: c */
    public int f21517c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f21518d = new int[10];

    /* JADX INFO: renamed from: e */
    public float[] f21519e = new float[10];

    /* JADX INFO: renamed from: f */
    public int f21520f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f21521g = new int[5];

    /* JADX INFO: renamed from: h */
    public String[] f21522h = new String[5];

    /* JADX INFO: renamed from: i */
    public int f21523i = 0;

    /* JADX INFO: renamed from: j */
    public int[] f21524j = new int[4];

    /* JADX INFO: renamed from: k */
    public boolean[] f21525k = new boolean[4];

    /* JADX INFO: renamed from: l */
    public int f21526l = 0;

    /* JADX INFO: renamed from: a */
    public final void m6931a(float f, int i) {
        int i2 = this.f21520f;
        int[] iArr = this.f21518d;
        if (i2 >= iArr.length) {
            this.f21518d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f21519e;
            this.f21519e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f21518d;
        int i3 = this.f21520f;
        iArr2[i3] = i;
        float[] fArr2 = this.f21519e;
        this.f21520f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m6932b(int i, int i2) {
        int i3 = this.f21517c;
        int[] iArr = this.f21515a;
        if (i3 >= iArr.length) {
            this.f21515a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f21516b;
            this.f21516b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f21515a;
        int i4 = this.f21517c;
        iArr3[i4] = i;
        int[] iArr4 = this.f21516b;
        this.f21517c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m6933c(int i, String str) {
        int i2 = this.f21523i;
        int[] iArr = this.f21521g;
        if (i2 >= iArr.length) {
            this.f21521g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f21522h;
            this.f21522h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f21521g;
        int i3 = this.f21523i;
        iArr2[i3] = i;
        String[] strArr2 = this.f21522h;
        this.f21523i = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m6934d(TypedValues typedValues) {
        for (int i = 0; i < this.f21517c; i++) {
            typedValues.mo6857a(this.f21515a[i], this.f21516b[i]);
        }
        for (int i2 = 0; i2 < this.f21520f; i2++) {
            typedValues.mo6860d(this.f21519e[i2], this.f21518d[i2]);
        }
        for (int i3 = 0; i3 < this.f21523i; i3++) {
            typedValues.mo6858b(this.f21521g[i3], this.f21522h[i3]);
        }
        for (int i4 = 0; i4 < this.f21526l; i4++) {
            typedValues.mo6859c(this.f21524j[i4], this.f21525k[i4]);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypedBundle{mCountInt=");
        sb.append(this.f21517c);
        sb.append(", mCountFloat=");
        sb.append(this.f21520f);
        sb.append(", mCountString=");
        sb.append(this.f21523i);
        sb.append(", mCountBoolean=");
        return AbstractC0000a.m17n(sb, this.f21526l, '}');
    }
}
