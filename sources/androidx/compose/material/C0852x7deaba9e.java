package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C0852x7deaba9e implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        C0853x8eaee744 c0853x8eaee744;
        if (continuation instanceof C0853x8eaee744) {
            c0853x8eaee744 = (C0853x8eaee744) continuation;
            int i = c0853x8eaee744.f10306d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0853x8eaee744.f10306d = i - Integer.MIN_VALUE;
            } else {
                c0853x8eaee744 = new C0853x8eaee744(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0853x8eaee744.f10304b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0853x8eaee744.f10306d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = c0853x8eaee744.f10303a;
            ResultKt.m18313b(obj);
            return new Velocity(j3);
        }
        ResultKt.m18313b(obj);
        Orientation orientation = Orientation.f5829a;
        Velocity.m6686c(j2);
        c0853x8eaee744.f10303a = j2;
        c0853x8eaee744.f10306d = 1;
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
        Orientation orientation = Orientation.f5829a;
        Offset.m5056f(j2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21924onPreFlingQWom1Mo(long j, Continuation continuation) {
        C0854xe2eca24b c0854xe2eca24b;
        if (continuation instanceof C0854xe2eca24b) {
            c0854xe2eca24b = (C0854xe2eca24b) continuation;
            int i = c0854xe2eca24b.f10310d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0854xe2eca24b.f10310d = i - Integer.MIN_VALUE;
            } else {
                c0854xe2eca24b = new C0854xe2eca24b(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0854xe2eca24b.f10308b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0854xe2eca24b.f10310d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Orientation orientation = Orientation.f5829a;
            Velocity.m6686c(j);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j2 = c0854xe2eca24b.f10307a;
        ResultKt.m18313b(obj);
        return new Velocity(j2);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        Orientation orientation = Orientation.f5829a;
        if (Offset.m5056f(j) >= 0.0f || i != 1) {
            return 0L;
        }
        throw null;
    }
}
