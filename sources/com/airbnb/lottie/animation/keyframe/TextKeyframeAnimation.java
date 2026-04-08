package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation$1 */
    /* JADX INFO: compiled from: Proguard */
    class C24001 extends LottieValueCallback<DocumentData> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* JADX INFO: renamed from: a */
        public final Object mo12553a(LottieFrameInfo lottieFrameInfo) {
            String str = ((DocumentData) lottieFrameInfo.f34900a).f34482a;
            String str2 = ((DocumentData) lottieFrameInfo.f34901b).f34482a;
            throw null;
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        Object obj;
        return (f != 1.0f || (obj = keyframe.f34886c) == null) ? (DocumentData) keyframe.f34885b : (DocumentData) obj;
    }
}
