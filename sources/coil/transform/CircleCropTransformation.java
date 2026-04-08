package coil.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/transform/CircleCropTransformation;", "Lcoil/transform/Transformation;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CircleCropTransformation implements Transformation {

    /* JADX INFO: renamed from: a */
    public final String f33967a = CircleCropTransformation.class.getName();

    public final boolean equals(Object obj) {
        return obj instanceof CircleCropTransformation;
    }

    @Override // coil.transform.Transformation
    /* JADX INFO: renamed from: getCacheKey, reason: from getter */
    public final String getF33967a() {
        return this.f33967a;
    }

    public final int hashCode() {
        return CircleCropTransformation.class.hashCode();
    }

    @Override // coil.transform.Transformation
    public final Object transform(Bitmap bitmap, Size size, Continuation continuation) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = iMin / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }
}
