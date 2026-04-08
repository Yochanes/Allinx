package io.intercom.android.sdk.utilities.coil;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.runtime.internal.StabilityInferred;
import coil.transform.AnimatedTransformation;
import coil.transform.PixelOpacity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/utilities/coil/RoundedCornersAnimatedTransformation;", "Lcoil/transform/AnimatedTransformation;", "radius", "", "<init>", "(F)V", "getRadius", "()F", "transform", "Lcoil/transform/PixelOpacity;", "canvas", "Landroid/graphics/Canvas;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class RoundedCornersAnimatedTransformation implements AnimatedTransformation {
    public static final int $stable = 0;
    private final float radius;

    public RoundedCornersAnimatedTransformation(float f) {
        this.radius = f;
    }

    public final float getRadius() {
        return this.radius;
    }

    @Override // coil.transform.AnimatedTransformation
    @NotNull
    public PixelOpacity transform(@NotNull Canvas canvas) {
        Intrinsics.m18599g(canvas, "canvas");
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        float f = this.radius;
        path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return PixelOpacity.f33969b;
    }
}
