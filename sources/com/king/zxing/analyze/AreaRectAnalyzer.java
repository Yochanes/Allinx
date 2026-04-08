package com.king.zxing.analyze;

import com.google.zxing.Result;
import java.util.EnumMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AreaRectAnalyzer extends ImageAnalyzer {

    /* JADX INFO: renamed from: c */
    public EnumMap f43296c;

    /* JADX INFO: renamed from: d */
    public boolean f43297d;

    /* JADX INFO: renamed from: e */
    public float f43298e;

    @Override // com.king.zxing.analyze.ImageAnalyzer
    /* JADX INFO: renamed from: b */
    public final Result mo15397b(byte[] bArr, int i, int i2) {
        int iMin = (int) (Math.min(i, i2) * this.f43298e);
        return mo15398c(bArr, i, i2, (i - iMin) / 2, (i2 - iMin) / 2, iMin, iMin);
    }

    /* JADX INFO: renamed from: c */
    public abstract Result mo15398c(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6);
}
