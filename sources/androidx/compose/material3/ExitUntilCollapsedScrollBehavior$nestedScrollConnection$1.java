package androidx.compose.material3;

import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        C1014x78ae0263 c1014x78ae0263;
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
        if (continuation instanceof C1014x78ae0263) {
            c1014x78ae0263 = (C1014x78ae0263) continuation;
            int i = c1014x78ae0263.f13325f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1014x78ae0263.f13325f = i - Integer.MIN_VALUE;
            } else {
                c1014x78ae0263 = new C1014x78ae0263(this, (ContinuationImpl) continuation);
            }
        }
        C1014x78ae0263 c1014x78ae02632 = c1014x78ae0263;
        Object objMo21915onPostFlingRZ2iAVY = c1014x78ae02632.f13323c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = c1014x78ae02632.f13325f;
        if (i2 == 0) {
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            c1014x78ae02632.f13321a = this;
            c1014x78ae02632.f13322b = j2;
            c1014x78ae02632.f13325f = 1;
            objMo21915onPostFlingRZ2iAVY = super.mo21915onPostFlingRZ2iAVY(j, j2, c1014x78ae02632);
            if (objMo21915onPostFlingRZ2iAVY == coroutineSingletons) {
                return coroutineSingletons;
            }
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = c1014x78ae02632.f13322b;
                ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
                return new Velocity(Velocity.m6688e(j3, ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a));
            }
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = c1014x78ae02632.f13321a;
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
        }
        long j4 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.getClass();
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        throw null;
    }
}
