package com.king.zxing.analyze;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import com.king.logx.LogX;
import com.king.zxing.DecodeFormatManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MultiFormatAnalyzer extends AreaRectAnalyzer {

    /* JADX INFO: renamed from: f */
    public final MultiFormatReader f43301f;

    public MultiFormatAnalyzer() {
        this.f43297d = true;
        this.f43298e = 0.8f;
        this.f43296c = DecodeFormatManager.f43295a;
        this.f43301f = new MultiFormatReader();
    }

    @Override // com.king.zxing.analyze.AreaRectAnalyzer
    /* JADX INFO: renamed from: c */
    public final Result mo15398c(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Result resultM15399d = null;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f43301f.setHints(this.f43296c);
            resultM15399d = m15399d(new PlanarYUVLuminanceSource(bArr, i, i2, i3, i4, i5, i6, false), this.f43297d);
            if (resultM15399d != null) {
                LogX.m15342d("Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms", new Object[0]);
            }
            return resultM15399d;
        } catch (Exception unused) {
            return resultM15399d;
        } finally {
            this.f43301f.reset();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Result m15399d(PlanarYUVLuminanceSource planarYUVLuminanceSource, boolean z2) {
        Result resultDecodeWithState;
        try {
            resultDecodeWithState = this.f43301f.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSource)));
        } catch (Exception unused) {
            resultDecodeWithState = null;
        }
        if (!z2 || resultDecodeWithState != null) {
            return resultDecodeWithState;
        }
        try {
            return this.f43301f.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(planarYUVLuminanceSource)));
        } catch (Exception unused2) {
            return resultDecodeWithState;
        }
    }
}
