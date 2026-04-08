package com.airbnb.lottie.value;

import android.graphics.PointF;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    @Override // com.airbnb.lottie.value.LottieValueCallback
    /* JADX INFO: renamed from: a */
    public final Object mo12553a(LottieFrameInfo lottieFrameInfo) {
        ((Float) lottieFrameInfo.f34900a).floatValue();
        ((Float) lottieFrameInfo.f34901b).floatValue();
        PointF pointF = MiscUtils.f34878a;
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
