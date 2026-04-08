package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0000¨\u0006\u0012"}, m18302d2 = {"drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "defaultWidth", "", "defaultHeight", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "determineBitmapRotation", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "bitmap", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BitmapUtilsKt {
    public static final int calculateInSampleSize(@NotNull BitmapFactory.Options options, int i, int i2) {
        Intrinsics.m18599g(options, "options");
        Integer numValueOf = Integer.valueOf(options.outHeight);
        Integer numValueOf2 = Integer.valueOf(options.outWidth);
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        int i3 = 1;
        if (iIntValue <= i2 && iIntValue2 <= i) {
            return 1;
        }
        int i4 = iIntValue / 2;
        int i5 = iIntValue2 / 2;
        while (i4 / i3 >= i2 && i5 / i3 >= i) {
            i3 *= 2;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap determineBitmapRotation(@NotNull Context context, @NotNull Uri uri, @NotNull Bitmap bitmap) throws IOException {
        Bitmap bitmap2;
        Bitmap bitmap3;
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(uri, "uri");
        Intrinsics.m18599g(bitmap, "bitmap");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            int iM8858e = new ExifInterface(inputStreamOpenInputStream).m8858e(0, "Orientation");
            Matrix matrix = new Matrix();
            if (iM8858e == 3) {
                matrix.postRotate(180.0f);
            } else if (iM8858e == 6) {
                matrix.postRotate(90.0f);
            } else if (iM8858e == 8) {
                matrix.postRotate(270.0f);
            }
            bitmap2 = bitmap;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmapCreateBitmap != null) {
                bitmap3 = bitmapCreateBitmap;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            return bitmap3;
        }
        bitmap2 = bitmap;
        bitmap3 = bitmap2;
        if (inputStreamOpenInputStream != null) {
        }
        return bitmap3;
    }

    @NotNull
    public static final Bitmap drawableToBitmap(@NotNull Drawable drawable, int i, int i2) {
        Bitmap bitmapCreateBitmap;
        Intrinsics.m18599g(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.m18598f(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.m18596d(bitmapCreateBitmap);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.m18596d(bitmapCreateBitmap);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
