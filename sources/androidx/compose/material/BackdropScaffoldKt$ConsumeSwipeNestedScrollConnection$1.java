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

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material/BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnchoredDraggableState f10200a;

    public BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(AnchoredDraggableState anchoredDraggableState) {
        Orientation orientation = Orientation.f5829a;
        this.f10200a = anchoredDraggableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        C0839x9c2945e2 c0839x9c2945e2;
        if (continuation instanceof C0839x9c2945e2) {
            c0839x9c2945e2 = (C0839x9c2945e2) continuation;
            int i = c0839x9c2945e2.f10204d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0839x9c2945e2.f10204d = i - Integer.MIN_VALUE;
            } else {
                c0839x9c2945e2 = new C0839x9c2945e2(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0839x9c2945e2.f10202b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0839x9c2945e2.f10204d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Orientation orientation = Orientation.f5829a;
            float fM6686c = Velocity.m6686c(j2);
            c0839x9c2945e2.f10201a = j2;
            c0839x9c2945e2.f10204d = 1;
            if (this.f10200a.m3692j(fM6686c, c0839x9c2945e2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = c0839x9c2945e2.f10201a;
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
        AnchoredDraggableState anchoredDraggableState = this.f10200a;
        Orientation orientation = Orientation.f5829a;
        return OffsetKt.m5061a(0.0f, anchoredDraggableState.m3686d(Offset.m5056f(j2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21924onPreFlingQWom1Mo(long j, Continuation continuation) {
        C0840x677cf7ed c0840x677cf7ed;
        if (continuation instanceof C0840x677cf7ed) {
            c0840x677cf7ed = (C0840x677cf7ed) continuation;
            int i = c0840x677cf7ed.f10208d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0840x677cf7ed.f10208d = i - Integer.MIN_VALUE;
            } else {
                c0840x677cf7ed = new C0840x677cf7ed(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0840x677cf7ed.f10206b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0840x677cf7ed.f10208d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Orientation orientation = Orientation.f5829a;
            float fM6686c = Velocity.m6686c(j);
            AnchoredDraggableState anchoredDraggableState = this.f10200a;
            float fM3689g = anchoredDraggableState.m3689g();
            if (fM6686c >= 0.0f || fM3689g <= anchoredDraggableState.m3687e().mo3738d()) {
                j = 0;
            } else {
                c0840x677cf7ed.f10205a = j;
                c0840x677cf7ed.f10208d = 1;
                if (anchoredDraggableState.m3692j(fM6686c, c0840x677cf7ed) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c0840x677cf7ed.f10205a;
            ResultKt.m18313b(obj);
        }
        return new Velocity(j);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        Orientation orientation = Orientation.f5829a;
        float fM5056f = Offset.m5056f(j);
        if (fM5056f >= 0.0f || i != 1) {
            return 0L;
        }
        return OffsetKt.m5061a(0.0f, this.f10200a.m3686d(fM5056f));
    }
}
