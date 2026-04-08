package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class PreviewTransformation {

    /* JADX INFO: renamed from: a */
    public Size f3509a;

    /* JADX INFO: renamed from: b */
    public Rect f3510b;

    /* JADX INFO: renamed from: c */
    public int f3511c;

    /* JADX INFO: renamed from: d */
    public Matrix f3512d;

    /* JADX INFO: renamed from: e */
    public int f3513e;

    /* JADX INFO: renamed from: f */
    public boolean f3514f;

    /* JADX INFO: renamed from: g */
    public boolean f3515g;

    /* JADX INFO: renamed from: h */
    public PreviewView.ScaleType f3516h;

    /* JADX INFO: renamed from: androidx.camera.view.PreviewTransformation$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C04011 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3517a;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            f3517a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3517a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3517a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3517a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3517a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3517a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final Matrix m1929a(Size size, int i) {
        if (!m1934f()) {
            return null;
        }
        Matrix matrix = new Matrix();
        m1931c(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f3509a.getWidth(), this.f3509a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public final Size m1930b() {
        return TransformUtils.m1611c(this.f3511c) ? new Size(this.f3510b.height(), this.f3510b.width()) : new Size(this.f3510b.width(), this.f3510b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Matrix m1931c(Size size, int i) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        Preconditions.m7699f(m1934f(), null);
        if (TransformUtils.m1612d(size, true, m1930b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeM1930b = m1930b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeM1930b.getWidth(), sizeM1930b.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.ScaleType scaleType = this.f3516h;
            int iOrdinal = scaleType.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
                if (scaleType != PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
                    matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                } else {
                    matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                    matrix.invert(matrix);
                }
                matrix.mapRect(rectF3);
                if (i != 1) {
                    float width = size.getWidth() / 2.0f;
                    float f = width + width;
                    rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
                } else {
                    rectF = rectF3;
                }
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
                if (scaleType != PreviewView.ScaleType.FIT_CENTER) {
                    matrix.setRectToRect(rectF3, rectF2, scaleToFit);
                    matrix.mapRect(rectF3);
                    if (i != 1) {
                    }
                }
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
                if (scaleType != PreviewView.ScaleType.FIT_CENTER) {
                }
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            Logger.m1282c("PreviewTransform", "Unexpected crop rect: " + scaleType);
                            scaleToFit = Matrix.ScaleToFit.FILL;
                        }
                    }
                }
                if (scaleType != PreviewView.ScaleType.FIT_CENTER) {
                }
            }
        }
        Matrix matrixM1609a = TransformUtils.m1609a(this.f3511c, false, new RectF(this.f3510b), rectF);
        if (this.f3514f && this.f3515g) {
            if (TransformUtils.m1611c(this.f3511c)) {
                matrixM1609a.preScale(1.0f, -1.0f, this.f3510b.centerX(), this.f3510b.centerY());
                return matrixM1609a;
            }
            matrixM1609a.preScale(-1.0f, 1.0f, this.f3510b.centerX(), this.f3510b.centerY());
        }
        return matrixM1609a;
    }

    /* JADX INFO: renamed from: d */
    public final Matrix m1932d() {
        Preconditions.m7699f(m1934f(), null);
        RectF rectF = new RectF(0.0f, 0.0f, this.f3509a.getWidth(), this.f3509a.getHeight());
        return TransformUtils.m1609a(!this.f3515g ? this.f3511c : -CameraOrientationUtil.m1586b(this.f3513e), false, rectF, rectF);
    }

    /* JADX INFO: renamed from: e */
    public final RectF m1933e(Size size, int i) {
        Preconditions.m7699f(m1934f(), null);
        Matrix matrixM1931c = m1931c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f3509a.getWidth(), this.f3509a.getHeight());
        matrixM1931c.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1934f() {
        return (this.f3510b == null || this.f3509a == null || !(!this.f3515g || this.f3513e != -1)) ? false : true;
    }
}
