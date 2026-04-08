package com.exchange.allin.utils.p025qr;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Hashtable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/utils/qr/QrCoder;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class QrCoder {
    /* JADX INFO: renamed from: a */
    public static Bitmap m14236a(String str) {
        if (str.length() == 0) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        BitMatrix bitMatrixEncode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, hashtable);
        Intrinsics.m18596d(bitMatrixEncode);
        int[] enclosingRectangle = bitMatrixEncode.getEnclosingRectangle();
        int i = enclosingRectangle[2];
        int i2 = (int) (i * 0.05f);
        int i3 = i2 * 2;
        BitMatrix bitMatrix = new BitMatrix(i + i3, enclosingRectangle[3] + i3);
        int i4 = enclosingRectangle[2];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = enclosingRectangle[3];
            for (int i7 = 0; i7 < i6; i7++) {
                if (bitMatrixEncode.get(enclosingRectangle[0] + i5, enclosingRectangle[1] + i7)) {
                    bitMatrix.set(i5 + i2, i7 + i2);
                }
            }
        }
        int[] iArr = new int[bitMatrix.getHeight() * bitMatrix.getWidth()];
        int height = bitMatrix.getHeight();
        for (int i8 = 0; i8 < height; i8++) {
            int width = bitMatrix.getWidth();
            for (int i9 = 0; i9 < width; i9++) {
                iArr[(bitMatrix.getWidth() * i8) + i9] = bitMatrix.get(i9, i8) ? -16777216 : -1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitMatrix.getWidth(), bitMatrix.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, bitMatrix.getWidth(), 0, 0, bitMatrix.getWidth(), bitMatrix.getHeight());
        return bitmapCreateBitmap;
    }
}
