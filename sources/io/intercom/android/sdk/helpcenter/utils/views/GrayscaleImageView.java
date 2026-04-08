package io.intercom.android.sdk.helpcenter.utils.views;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/utils/views/GrayscaleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "setGrayscale", "", "percentage", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GrayscaleImageView extends AppCompatImageView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrayscaleImageView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(attributeSet, "attributeSet");
    }

    public final void setGrayscale(int percentage) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1 - (percentage / 100));
        setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }
}
