package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C0869xfccf8785 implements NestedScrollConnection {

    /* JADX INFO: renamed from: a */
    public final Orientation f10518a = Orientation.f5829a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnchoredDraggableState f10519b;

    public C0869xfccf8785(AnchoredDraggableState anchoredDraggableState) {
        this.f10519b = anchoredDraggableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        C0870x1c3b93eb c0870x1c3b93eb;
        if (continuation instanceof C0870x1c3b93eb) {
            c0870x1c3b93eb = (C0870x1c3b93eb) continuation;
            int i = c0870x1c3b93eb.f10523d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0870x1c3b93eb.f10523d = i - Integer.MIN_VALUE;
            } else {
                c0870x1c3b93eb = new C0870x1c3b93eb(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0870x1c3b93eb.f10521b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0870x1c3b93eb.f10523d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            float fM6685b = this.f10518a == Orientation.f5830b ? Velocity.m6685b(j2) : Velocity.m6686c(j2);
            c0870x1c3b93eb.f10520a = j2;
            c0870x1c3b93eb.f10523d = 1;
            if (this.f10519b.m3692j(fM6685b, c0870x1c3b93eb) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c0870x1c3b93eb.f10520a;
            ResultKt.m18313b(obj);
        }
        return new Velocity(j2);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
        AnchoredDraggableState anchoredDraggableState = this.f10519b;
        Orientation orientation = Orientation.f5830b;
        Orientation orientation2 = this.f10518a;
        float fM3686d = anchoredDraggableState.m3686d(orientation2 == orientation ? Offset.m5055e(j2) : Offset.m5056f(j2));
        float f = orientation2 == orientation ? fM3686d : 0.0f;
        if (orientation2 != Orientation.f5829a) {
            fM3686d = 0.0f;
        }
        return OffsetKt.m5061a(f, fM3686d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21924onPreFlingQWom1Mo(long j, Continuation continuation) {
        C0871x425444c4 c0871x425444c4;
        if (continuation instanceof C0871x425444c4) {
            c0871x425444c4 = (C0871x425444c4) continuation;
            int i = c0871x425444c4.f10527d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0871x425444c4.f10527d = i - Integer.MIN_VALUE;
            } else {
                c0871x425444c4 = new C0871x425444c4(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0871x425444c4.f10525b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0871x425444c4.f10527d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            float fM6685b = this.f10518a == Orientation.f5830b ? Velocity.m6685b(j) : Velocity.m6686c(j);
            AnchoredDraggableState anchoredDraggableState = this.f10519b;
            float fM3689g = anchoredDraggableState.m3689g();
            if (fM6685b >= 0.0f || fM3689g <= anchoredDraggableState.m3687e().mo3738d()) {
                j = 0;
            } else {
                c0871x425444c4.f10524a = j;
                c0871x425444c4.f10527d = 1;
                if (anchoredDraggableState.m3692j(fM6685b, c0871x425444c4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c0871x425444c4.f10524a;
            ResultKt.m18313b(obj);
        }
        return new Velocity(j);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        Orientation orientation = Orientation.f5830b;
        Orientation orientation2 = this.f10518a;
        float fM5055e = orientation2 == orientation ? Offset.m5055e(j) : Offset.m5056f(j);
        if (fM5055e >= 0.0f || i != 1) {
            return 0L;
        }
        float fM3686d = this.f10519b.m3686d(fM5055e);
        return OffsetKt.m5061a(orientation2 == orientation ? fM3686d : 0.0f, orientation2 == Orientation.f5829a ? fM3686d : 0.0f);
    }
}
