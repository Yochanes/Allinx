package com.google.accompanist.insets;

import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m18302d2 = {"SCROLL_THRESHOLD", "", "linearInterpolator", "Landroid/view/animation/LinearInterpolator;", "insets_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SimpleImeAnimationControllerKt {
    private static final float SCROLL_THRESHOLD = 0.15f;

    @NotNull
    private static final LinearInterpolator linearInterpolator = new LinearInterpolator();

    public static final /* synthetic */ LinearInterpolator access$getLinearInterpolator$p() {
        return linearInterpolator;
    }
}
