package androidx.constraintlayout.compose.carousel;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "T", "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class CarouselSwipeableState$snapTo$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CarouselSwipeableState f21111a;

    public CarouselSwipeableState$snapTo$2(CarouselSwipeableState carouselSwipeableState) {
        this.f21111a = carouselSwipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6796a(Map map, Continuation continuation) {
        CarouselSwipeableState$snapTo$2$emit$1 carouselSwipeableState$snapTo$2$emit$1;
        CarouselSwipeableState$snapTo$2<T> carouselSwipeableState$snapTo$2;
        if (continuation instanceof CarouselSwipeableState$snapTo$2$emit$1) {
            carouselSwipeableState$snapTo$2$emit$1 = (CarouselSwipeableState$snapTo$2$emit$1) continuation;
            int i = carouselSwipeableState$snapTo$2$emit$1.f21115d;
            if ((i & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$snapTo$2$emit$1.f21115d = i - Integer.MIN_VALUE;
            } else {
                carouselSwipeableState$snapTo$2$emit$1 = new CarouselSwipeableState$snapTo$2$emit$1(this, continuation);
            }
        }
        Object obj = carouselSwipeableState$snapTo$2$emit$1.f21113b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = carouselSwipeableState$snapTo$2$emit$1.f21115d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Float fM6789a = CarouselSwipeableKt.m6789a(OpsMetricTracker.START, map);
            if (fM6789a == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            float fFloatValue = fM6789a.floatValue();
            carouselSwipeableState$snapTo$2$emit$1.f21112a = this;
            carouselSwipeableState$snapTo$2$emit$1.f21115d = 1;
            if (this.f21111a.m6793d(fFloatValue, carouselSwipeableState$snapTo$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            carouselSwipeableState$snapTo$2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            carouselSwipeableState$snapTo$2 = (CarouselSwipeableState$snapTo$2) carouselSwipeableState$snapTo$2$emit$1.f21112a;
            ResultKt.m18313b(obj);
        }
        carouselSwipeableState$snapTo$2.f21111a.m6792c(OpsMetricTracker.START);
        return Unit.f51459a;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return m6796a((Map) obj, continuation);
    }
}
