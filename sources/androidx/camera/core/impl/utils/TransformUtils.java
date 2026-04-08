package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.Locale;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class TransformUtils {

    /* JADX INFO: renamed from: a */
    public static final RectF f2896a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static Matrix m1609a(int i, boolean z2, RectF rectF, RectF rectF2) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f2896a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z2) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1610b(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1611c(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid rotation degrees: "));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1612d(Size size, boolean z2, Size size2) {
        float width;
        float width2;
        if (z2) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    /* JADX INFO: renamed from: e */
    public static String m1613e(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    /* JADX INFO: renamed from: f */
    public static Size m1614f(Size size, int i) {
        Preconditions.m7695b(i % 90 == 0, "Invalid rotation degrees: " + i);
        return m1611c(((i % 360) + 360) % 360) ? new Size(size.getHeight(), size.getWidth()) : size;
    }
}
