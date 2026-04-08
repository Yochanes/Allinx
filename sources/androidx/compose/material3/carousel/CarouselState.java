package androidx.compose.material3.carousel;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class CarouselState implements ScrollableState {

    /* JADX INFO: renamed from: a */
    public final MutableState f15300a;

    /* JADX INFO: renamed from: b */
    public final PagerState f15301b;

    /* JADX INFO: compiled from: Proguard */
    @ExperimentalMaterial3Api
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/carousel/CarouselState$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        ListSaverKt.m4749a(CarouselState$Companion$Saver$2.f15303a, CarouselState$Companion$Saver$1.f15302a);
    }

    public CarouselState(int i, float f, Function0 function0) {
        MutableState mutableStateM4525g = SnapshotStateKt.m4525g(function0);
        this.f15300a = mutableStateM4525g;
        this.f15301b = PagerStateKt.m3173a(i, f, (Function0) ((SnapshotMutableStateImpl) mutableStateM4525g).getF20325a());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: a */
    public final boolean mo2507a() {
        return this.f15301b.mo2507a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: c */
    public final Object mo2509c(MutatePriority mutatePriority, Function2 function2, ContinuationImpl continuationImpl) {
        Object objMo2509c = this.f15301b.mo2509c(mutatePriority, function2, continuationImpl);
        return objMo2509c == CoroutineSingletons.f51584a ? objMo2509c : Unit.f51459a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    /* JADX INFO: renamed from: e */
    public final float mo2511e(float f) {
        return this.f15301b.mo2511e(f);
    }
}
