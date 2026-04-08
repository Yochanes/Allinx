package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.carousel.FractionalThreshold;
import androidx.constraintlayout.compose.carousel.ThresholdConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class MotionCarouselKt$MotionCarousel$3 extends Lambda implements Function2<String, String, ThresholdConfig> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new FractionalThreshold();
    }
}
