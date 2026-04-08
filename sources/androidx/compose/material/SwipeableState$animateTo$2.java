package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
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
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "T", "anchors", "", "", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SwipeableState$animateTo$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f11361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SwipeableState f11362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AnimationSpec f11363c;

    public SwipeableState$animateTo$2(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.f11361a = obj;
        this.f11362b = swipeableState;
        this.f11363c = animationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3797a(Map map, Continuation continuation) throws Throwable {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        SwipeableState$animateTo$2<T> swipeableState$animateTo$2;
        Object objM18400C;
        Object objM18400C2;
        if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
            int i = swipeableState$animateTo$2$emit$1.f11368f;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.f11368f = i - Integer.MIN_VALUE;
            } else {
                swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
            }
        }
        Object obj = swipeableState$animateTo$2$emit$1.f11366c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = swipeableState$animateTo$2$emit$1.f11368f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = swipeableState$animateTo$2$emit$1.f11365b;
            swipeableState$animateTo$2 = (SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.f11364a;
            try {
                ResultKt.m18313b(obj);
                float fMo4376c = ((SnapshotMutableFloatStateImpl) swipeableState$animateTo$2.f11362b.f11344g).mo4376c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Math.abs(((Number) entry.getKey()).floatValue() - fMo4376c) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                objM18400C2 = CollectionsKt.m18400C(linkedHashMap.values());
                SwipeableState swipeableState = swipeableState$animateTo$2.f11362b;
                if (objM18400C2 == null) {
                    objM18400C2 = ((SnapshotMutableStateImpl) swipeableState.f11340c).getF20325a();
                }
                swipeableState.m3796a(objM18400C2);
                return Unit.f51459a;
            } catch (Throwable th) {
                th = th;
                float fMo4376c2 = ((SnapshotMutableFloatStateImpl) swipeableState$animateTo$2.f11362b.f11344g).mo4376c();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r9.hasNext()) {
                }
                objM18400C = CollectionsKt.m18400C(linkedHashMap2.values());
                SwipeableState swipeableState2 = swipeableState$animateTo$2.f11362b;
                if (objM18400C == null) {
                }
                swipeableState2.m3796a(objM18400C);
                throw th;
            }
        }
        ResultKt.m18313b(obj);
        try {
            Float fM3795a = SwipeableKt.m3795a(this.f11361a, map);
            if (fM3795a == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            SwipeableState swipeableState3 = this.f11362b;
            float fFloatValue = fM3795a.floatValue();
            AnimationSpec animationSpec = this.f11363c;
            swipeableState$animateTo$2$emit$1.f11364a = this;
            swipeableState$animateTo$2$emit$1.f11365b = map;
            swipeableState$animateTo$2$emit$1.f11368f = 1;
            Object objMo2596a = swipeableState3.f11353p.mo2596a(MutatePriority.f5091a, new SwipeableState$animateInternalToOffset$2(swipeableState3, fFloatValue, animationSpec, null), swipeableState$animateTo$2$emit$1);
            if (objMo2596a != CoroutineSingletons.f51584a) {
                objMo2596a = Unit.f51459a;
            }
            if (objMo2596a == coroutineSingletons) {
                return coroutineSingletons;
            }
            swipeableState$animateTo$2 = this;
            float fMo4376c3 = ((SnapshotMutableFloatStateImpl) swipeableState$animateTo$2.f11362b.f11344g).mo4376c();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            while (r9.hasNext()) {
            }
            objM18400C2 = CollectionsKt.m18400C(linkedHashMap3.values());
            SwipeableState swipeableState4 = swipeableState$animateTo$2.f11362b;
            if (objM18400C2 == null) {
            }
            swipeableState4.m3796a(objM18400C2);
            return Unit.f51459a;
        } catch (Throwable th2) {
            th = th2;
            swipeableState$animateTo$2 = this;
            float fMo4376c22 = ((SnapshotMutableFloatStateImpl) swipeableState$animateTo$2.f11362b.f11344g).mo4376c();
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - fMo4376c22) < 0.5f) {
                    linkedHashMap22.put(entry2.getKey(), entry2.getValue());
                }
            }
            objM18400C = CollectionsKt.m18400C(linkedHashMap22.values());
            SwipeableState swipeableState22 = swipeableState$animateTo$2.f11362b;
            if (objM18400C == null) {
                objM18400C = ((SnapshotMutableStateImpl) swipeableState22.f11340c).getF20325a();
            }
            swipeableState22.m3796a(objM18400C);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return m3797a((Map) obj, continuation);
    }
}
