package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m18302d2 = {"MaxProgressArc", "", "rememberUpdatedSlingshot", "Lcom/google/accompanist/swiperefresh/Slingshot;", "offsetY", "maxOffsetY", "height", "", "(FFILandroidx/compose/runtime/Composer;I)Lcom/google/accompanist/swiperefresh/Slingshot;", "swiperefresh_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SlingshotKt {
    public static final float MaxProgressArc = 0.8f;

    @Composable
    @NotNull
    public static final Slingshot rememberUpdatedSlingshot(float f, float f2, int i, @Nullable Composer composer, int i2) {
        composer.mo4228f(-2136847435);
        float fMin = Math.min(1.0f, f / f2);
        float fMax = (Math.max(fMin - 0.4f, 0.0f) * 5) / 3;
        float f3 = 2;
        float fMax2 = Math.max(0.0f, Math.min(Math.abs(f) - f2, f2 * f3) / f2) / 4;
        float fPow = (fMax2 - ((float) Math.pow(fMax2, 2))) * f3;
        int i3 = (((int) ((f2 * fMin) + ((f2 * fPow) * f3))) + i) - i;
        float f4 = fMax * 0.8f;
        float f5 = f4 <= 0.8f ? f4 : 0.8f;
        float f6 = ((fPow * f3) + ((0.4f * fMax) - 0.25f)) * 0.5f;
        float fMin2 = Math.min(1.0f, fMax);
        composer.mo4228f(-492369756);
        Object objMo4229g = composer.mo4229g();
        if (objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new Slingshot();
            composer.mo4214G(objMo4229g);
        }
        composer.mo4218K();
        Slingshot slingshot = (Slingshot) objMo4229g;
        slingshot.setOffset(i3);
        slingshot.setStartTrim(0.0f);
        slingshot.setEndTrim(f5);
        slingshot.setRotation(f6);
        slingshot.setArrowScale(fMin2);
        composer.mo4218K();
        return slingshot;
    }
}
