package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.TimedValueQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class FrameRotationQueue {

    /* JADX INFO: renamed from: a */
    public final float[] f28019a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f28020b = new float[16];

    /* JADX INFO: renamed from: c */
    public final TimedValueQueue f28021c = new TimedValueQueue();

    /* JADX INFO: renamed from: d */
    public boolean f28022d;

    /* JADX INFO: renamed from: a */
    public static void m10755a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }
}
