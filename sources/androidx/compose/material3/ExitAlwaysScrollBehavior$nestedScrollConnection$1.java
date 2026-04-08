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
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        ExitAlwaysScrollBehavior$nestedScrollConnection$1 exitAlwaysScrollBehavior$nestedScrollConnection$1;
        if (continuation instanceof ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
            int i = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f13320f;
            if ((i & Integer.MIN_VALUE) != 0) {
                exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f13320f = i - Integer.MIN_VALUE;
            } else {
                exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, (ContinuationImpl) continuation);
            }
        }
        ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        Object objMo21915onPostFlingRZ2iAVY = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13318c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13320f;
        if (i2 == 0) {
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13316a = this;
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13317b = j2;
            exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13320f = 1;
            objMo21915onPostFlingRZ2iAVY = super.mo21915onPostFlingRZ2iAVY(j, j2, exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12);
            if (objMo21915onPostFlingRZ2iAVY == coroutineSingletons) {
                return coroutineSingletons;
            }
            exitAlwaysScrollBehavior$nestedScrollConnection$1 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13317b;
                ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
                return new Velocity(Velocity.m6688e(j3, ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a));
            }
            exitAlwaysScrollBehavior$nestedScrollConnection$1 = exitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$12.f13316a;
            ResultKt.m18313b(objMo21915onPostFlingRZ2iAVY);
        }
        long j4 = ((Velocity) objMo21915onPostFlingRZ2iAVY).f20578a;
        exitAlwaysScrollBehavior$nestedScrollConnection$1.getClass();
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        throw null;
    }
}
