package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "T", "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class CarouselSwipeableState$animateTo$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarouselSwipeableState f21092b;

    public CarouselSwipeableState$animateTo$2(Object obj, CarouselSwipeableState carouselSwipeableState) {
        SpringSpec springSpec = SwipeableDefaults.f21123a;
        this.f21091a = obj;
        this.f21092b = carouselSwipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6795a(Map map, Continuation continuation) throws Throwable {
        CarouselSwipeableState$animateTo$2$emit$1 carouselSwipeableState$animateTo$2$emit$1;
        CarouselSwipeableState$animateTo$2<T> carouselSwipeableState$animateTo$2;
        Object objM18400C;
        Object objM18400C2;
        if (continuation instanceof CarouselSwipeableState$animateTo$2$emit$1) {
            carouselSwipeableState$animateTo$2$emit$1 = (CarouselSwipeableState$animateTo$2$emit$1) continuation;
            int i = carouselSwipeableState$animateTo$2$emit$1.f21097f;
            if ((i & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$animateTo$2$emit$1.f21097f = i - Integer.MIN_VALUE;
            } else {
                carouselSwipeableState$animateTo$2$emit$1 = new CarouselSwipeableState$animateTo$2$emit$1(this, continuation);
            }
        }
        Object obj = carouselSwipeableState$animateTo$2$emit$1.f21095c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = carouselSwipeableState$animateTo$2$emit$1.f21097f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = carouselSwipeableState$animateTo$2$emit$1.f21094b;
            carouselSwipeableState$animateTo$2 = (CarouselSwipeableState$animateTo$2) carouselSwipeableState$animateTo$2$emit$1.f21093a;
            try {
                ResultKt.m18313b(obj);
                float fMo4376c = ((SnapshotMutableFloatStateImpl) carouselSwipeableState$animateTo$2.f21092b.f21075f).mo4376c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Math.abs(((Number) entry.getKey()).floatValue() - fMo4376c) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                objM18400C2 = CollectionsKt.m18400C(linkedHashMap.values());
                CarouselSwipeableState carouselSwipeableState = carouselSwipeableState$animateTo$2.f21092b;
                if (objM18400C2 == null) {
                    objM18400C2 = ((SnapshotMutableStateImpl) carouselSwipeableState.f21071b).getF20325a();
                }
                carouselSwipeableState.m6792c(objM18400C2);
                return Unit.f51459a;
            } catch (Throwable th) {
                th = th;
                float fMo4376c2 = ((SnapshotMutableFloatStateImpl) carouselSwipeableState$animateTo$2.f21092b.f21075f).mo4376c();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r7.hasNext()) {
                }
                objM18400C = CollectionsKt.m18400C(linkedHashMap2.values());
                CarouselSwipeableState carouselSwipeableState2 = carouselSwipeableState$animateTo$2.f21092b;
                if (objM18400C == null) {
                }
                carouselSwipeableState2.m6792c(objM18400C);
                throw th;
            }
        }
        ResultKt.m18313b(obj);
        try {
            Float fM6789a = CarouselSwipeableKt.m6789a(this.f21091a, map);
            if (fM6789a == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            CarouselSwipeableState carouselSwipeableState3 = this.f21092b;
            float fFloatValue = fM6789a.floatValue();
            SpringSpec springSpec = SwipeableDefaults.f21123a;
            carouselSwipeableState$animateTo$2$emit$1.f21093a = this;
            carouselSwipeableState$animateTo$2$emit$1.f21094b = map;
            carouselSwipeableState$animateTo$2$emit$1.f21097f = 1;
            if (carouselSwipeableState3.m6790a(fFloatValue, carouselSwipeableState$animateTo$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            carouselSwipeableState$animateTo$2 = this;
            float fMo4376c3 = ((SnapshotMutableFloatStateImpl) carouselSwipeableState$animateTo$2.f21092b.f21075f).mo4376c();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            while (r7.hasNext()) {
            }
            objM18400C2 = CollectionsKt.m18400C(linkedHashMap3.values());
            CarouselSwipeableState carouselSwipeableState4 = carouselSwipeableState$animateTo$2.f21092b;
            if (objM18400C2 == null) {
            }
            carouselSwipeableState4.m6792c(objM18400C2);
            return Unit.f51459a;
        } catch (Throwable th2) {
            th = th2;
            carouselSwipeableState$animateTo$2 = this;
            float fMo4376c22 = ((SnapshotMutableFloatStateImpl) carouselSwipeableState$animateTo$2.f21092b.f21075f).mo4376c();
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - fMo4376c22) < 0.5f) {
                    linkedHashMap22.put(entry2.getKey(), entry2.getValue());
                }
            }
            objM18400C = CollectionsKt.m18400C(linkedHashMap22.values());
            CarouselSwipeableState carouselSwipeableState22 = carouselSwipeableState$animateTo$2.f21092b;
            if (objM18400C == null) {
                objM18400C = ((SnapshotMutableStateImpl) carouselSwipeableState22.f21071b).getF20325a();
            }
            carouselSwipeableState22.m6792c(objM18400C);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return m6795a((Map) obj, continuation);
    }
}
