package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ImageViewUtils {

    /* JADX INFO: renamed from: a */
    public static boolean f32235a = true;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m11972a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11971a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m11972a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f32235a) {
            try {
                Api29Impl.m11972a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f32235a = false;
            }
        }
    }
}
