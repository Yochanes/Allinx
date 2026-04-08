package com.airbnb.lottie.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Utils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f34879a = new C24291();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f34880b = new C24302();

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f34881c = new C24313();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f34882d = new C24324();

    /* JADX INFO: renamed from: e */
    public static final float f34883e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C24291 extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C24302 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C24313 extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.utils.Utils$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C24324 extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12749a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f34879a.get();
        Path path2 = (Path) f34880b.get();
        Path path3 = (Path) f34881c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = MiscUtils.m12747c(fMin, length);
                fMax = MiscUtils.m12747c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = MiscUtils.m12747c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = MiscUtils.m12747c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12750b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m12751c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public static float m12752d(Matrix matrix) {
        float[] fArr = (float[]) f34882d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f34883e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m12753e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
