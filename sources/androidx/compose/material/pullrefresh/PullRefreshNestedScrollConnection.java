package androidx.compose.material.pullrefresh;

import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21924onPreFlingQWom1Mo(long j, Continuation continuation) {
        PullRefreshNestedScrollConnection$onPreFling$1 pullRefreshNestedScrollConnection$onPreFling$1;
        if (continuation instanceof PullRefreshNestedScrollConnection$onPreFling$1) {
            pullRefreshNestedScrollConnection$onPreFling$1 = (PullRefreshNestedScrollConnection$onPreFling$1) continuation;
            int i = pullRefreshNestedScrollConnection$onPreFling$1.f11819c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullRefreshNestedScrollConnection$onPreFling$1.f11819c = i - Integer.MIN_VALUE;
            } else {
                pullRefreshNestedScrollConnection$onPreFling$1 = new PullRefreshNestedScrollConnection$onPreFling$1(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = pullRefreshNestedScrollConnection$onPreFling$1.f11817a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pullRefreshNestedScrollConnection$onPreFling$1.f11819c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return new Velocity(VelocityKt.m6691a(0.0f, ((Number) obj).floatValue()));
        }
        ResultKt.m18313b(obj);
        new Float(Velocity.m6686c(j));
        pullRefreshNestedScrollConnection$onPreFling$1.f11819c = 1;
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        return 0L;
    }
}
