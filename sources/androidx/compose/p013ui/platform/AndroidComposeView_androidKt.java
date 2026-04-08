package androidx.compose.p013ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: a */
    public static final Function1 f19233a = null;

    /* JADX INFO: renamed from: a */
    public static final float m6087a(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: b */
    public static final void m6088b(float[] fArr, float[] fArr2) {
        float fM6087a = m6087a(0, 0, fArr2, fArr);
        float fM6087a2 = m6087a(0, 1, fArr2, fArr);
        float fM6087a3 = m6087a(0, 2, fArr2, fArr);
        float fM6087a4 = m6087a(0, 3, fArr2, fArr);
        float fM6087a5 = m6087a(1, 0, fArr2, fArr);
        float fM6087a6 = m6087a(1, 1, fArr2, fArr);
        float fM6087a7 = m6087a(1, 2, fArr2, fArr);
        float fM6087a8 = m6087a(1, 3, fArr2, fArr);
        float fM6087a9 = m6087a(2, 0, fArr2, fArr);
        float fM6087a10 = m6087a(2, 1, fArr2, fArr);
        float fM6087a11 = m6087a(2, 2, fArr2, fArr);
        float fM6087a12 = m6087a(2, 3, fArr2, fArr);
        float fM6087a13 = m6087a(3, 0, fArr2, fArr);
        float fM6087a14 = m6087a(3, 1, fArr2, fArr);
        float fM6087a15 = m6087a(3, 2, fArr2, fArr);
        float fM6087a16 = m6087a(3, 3, fArr2, fArr);
        fArr[0] = fM6087a;
        fArr[1] = fM6087a2;
        fArr[2] = fM6087a3;
        fArr[3] = fM6087a4;
        fArr[4] = fM6087a5;
        fArr[5] = fM6087a6;
        fArr[6] = fM6087a7;
        fArr[7] = fM6087a8;
        fArr[8] = fM6087a9;
        fArr[9] = fM6087a10;
        fArr[10] = fM6087a11;
        fArr[11] = fM6087a12;
        fArr[12] = fM6087a13;
        fArr[13] = fM6087a14;
        fArr[14] = fM6087a15;
        fArr[15] = fM6087a16;
    }
}
