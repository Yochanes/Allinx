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

/* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C0891x58e3e91b implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        C0892x8f227701 c0892x8f227701;
        if (continuation instanceof C0892x8f227701) {
            c0892x8f227701 = (C0892x8f227701) continuation;
            int i = c0892x8f227701.f10718d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0892x8f227701.f10718d = i - Integer.MIN_VALUE;
            } else {
                c0892x8f227701 = new C0892x8f227701(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0892x8f227701.f10716b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0892x8f227701.f10718d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = c0892x8f227701.f10715a;
            ResultKt.m18313b(obj);
            return new Velocity(j3);
        }
        ResultKt.m18313b(obj);
        Orientation orientation = Orientation.f5829a;
        Velocity.m6686c(j2);
        c0892x8f227701.f10715a = j2;
        c0892x8f227701.f10718d = 1;
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
        C0893x8819a6ee c0893x8819a6ee;
        if (continuation instanceof C0893x8819a6ee) {
            c0893x8819a6ee = (C0893x8819a6ee) continuation;
            int i = c0893x8819a6ee.f10722d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0893x8819a6ee.f10722d = i - Integer.MIN_VALUE;
            } else {
                c0893x8819a6ee = new C0893x8819a6ee(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = c0893x8819a6ee.f10720b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c0893x8819a6ee.f10722d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Orientation orientation = Orientation.f5829a;
            Velocity.m6686c(j);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j2 = c0893x8819a6ee.f10719a;
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
