package androidx.compose.foundation;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ScrollState implements ScrollableState {

    /* JADX INFO: renamed from: i */
    public static final SaverKt$Saver$1 f5146i;

    /* JADX INFO: renamed from: a */
    public final MutableIntState f5147a;

    /* JADX INFO: renamed from: e */
    public float f5151e;

    /* JADX INFO: renamed from: b */
    public final MutableIntState f5148b = SnapshotIntStateKt.m4516a(0);

    /* JADX INFO: renamed from: c */
    public final MutableInteractionSource f5149c = InteractionSourceKt.m2696a();

    /* JADX INFO: renamed from: d */
    public final MutableIntState f5150d = SnapshotIntStateKt.m4516a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f */
    public final ScrollableState f5152f = ScrollableStateKt.m2647a(new ScrollState$scrollableState$1(this));

    /* JADX INFO: renamed from: g */
    public final State f5153g = SnapshotStateKt.m4523e(new ScrollState$canScrollForward$2(this));

    /* JADX INFO: renamed from: h */
    public final State f5154h = SnapshotStateKt.m4523e(new ScrollState$canScrollBackward$2(this));

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        ScrollState$Companion$Saver$1 scrollState$Companion$Saver$1 = ScrollState$Companion$Saver$1.f5155a;
        ScrollState$Companion$Saver$2 scrollState$Companion$Saver$2 = ScrollState$Companion$Saver$2.f5156a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f16993a;
        f5146i = new SaverKt$Saver$1(scrollState$Companion$Saver$2, scrollState$Companion$Saver$1);
    }

    public ScrollState(int i) {
        this.f5147a = SnapshotIntStateKt.m4516a(i);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: a */
    public final boolean mo2507a() {
        return this.f5152f.mo2507a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: b */
    public final boolean mo2508b() {
        return ((Boolean) this.f5154h.getF20325a()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: c */
    public final Object mo2509c(MutatePriority mutatePriority, Function2 function2, ContinuationImpl continuationImpl) {
        Object objMo2509c = this.f5152f.mo2509c(mutatePriority, function2, continuationImpl);
        return objMo2509c == CoroutineSingletons.f51584a ? objMo2509c : Unit.f51459a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: d */
    public final boolean mo2510d() {
        return ((Boolean) this.f5153g.getF20325a()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: e */
    public final float mo2511e(float f) {
        return this.f5152f.mo2511e(f);
    }

    /* JADX INFO: renamed from: f */
    public final Object m2512f(int i, TweenSpec tweenSpec, SuspendLambda suspendLambda) {
        Object objM2639a = ScrollExtensionsKt.m2639a(this, i - ((SnapshotMutableIntStateImpl) this.f5147a).mo4383f(), tweenSpec, suspendLambda);
        return objM2639a == CoroutineSingletons.f51584a ? objM2639a : Unit.f51459a;
    }

    /* JADX INFO: renamed from: g */
    public final int m2513g() {
        return ((SnapshotMutableIntStateImpl) this.f5150d).mo4383f();
    }

    /* JADX INFO: renamed from: h */
    public final Object m2514h(int i, SuspendLambda suspendLambda) {
        return ScrollExtensionsKt.m2640b(this, i - ((SnapshotMutableIntStateImpl) this.f5147a).mo4383f(), suspendLambda);
    }
}
