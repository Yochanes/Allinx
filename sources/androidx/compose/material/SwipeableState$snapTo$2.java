package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "T", "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SwipeableState$snapTo$2<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3798a(Map map, Continuation continuation) {
        SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        if (continuation instanceof SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) continuation;
            int i = swipeableState$snapTo$2$emit$1.f11383d;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.f11383d = i - Integer.MIN_VALUE;
            } else {
                swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, continuation);
            }
        }
        Object obj = swipeableState$snapTo$2$emit$1.f11381b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = swipeableState$snapTo$2$emit$1.f11383d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SwipeableState$snapTo$2 swipeableState$snapTo$2 = (SwipeableState$snapTo$2) swipeableState$snapTo$2$emit$1.f11380a;
            ResultKt.m18313b(obj);
            swipeableState$snapTo$2.getClass();
            throw null;
        }
        ResultKt.m18313b(obj);
        if (SwipeableKt.m3795a(null, map) == null) {
            throw new IllegalArgumentException("The target value must have an associated anchor.");
        }
        swipeableState$snapTo$2$emit$1.f11380a = this;
        swipeableState$snapTo$2$emit$1.f11383d = 1;
        throw null;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        m3798a((Map) obj, continuation);
        throw null;
    }
}
