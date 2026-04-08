package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p013ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ScrollableNestedScrollConnection implements NestedScrollConnection {

    /* JADX INFO: renamed from: a */
    public final ScrollingLogic f5888a;

    /* JADX INFO: renamed from: b */
    public boolean f5889b;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z2) {
        this.f5888a = scrollingLogic;
        this.f5889b = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        ScrollableNestedScrollConnection$onPostFling$1 scrollableNestedScrollConnection$onPostFling$1;
        long jM6687d;
        long j3;
        if (continuation instanceof ScrollableNestedScrollConnection$onPostFling$1) {
            scrollableNestedScrollConnection$onPostFling$1 = (ScrollableNestedScrollConnection$onPostFling$1) continuation;
            int i = scrollableNestedScrollConnection$onPostFling$1.f5893d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollableNestedScrollConnection$onPostFling$1.f5893d = i - Integer.MIN_VALUE;
            } else {
                scrollableNestedScrollConnection$onPostFling$1 = new ScrollableNestedScrollConnection$onPostFling$1(this, (ContinuationImpl) continuation);
            }
        }
        Object objM2650b = scrollableNestedScrollConnection$onPostFling$1.f5891b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = scrollableNestedScrollConnection$onPostFling$1.f5893d;
        if (i2 == 0) {
            ResultKt.m18313b(objM2650b);
            jM6687d = 0;
            if (this.f5889b) {
                ScrollingLogic scrollingLogic = this.f5888a;
                if (scrollingLogic.f5941h) {
                    j3 = 0;
                    jM6687d = Velocity.m6687d(j2, j3);
                } else {
                    scrollableNestedScrollConnection$onPostFling$1.f5890a = j2;
                    scrollableNestedScrollConnection$onPostFling$1.f5893d = 1;
                    objM2650b = scrollingLogic.m2650b(j2, scrollableNestedScrollConnection$onPostFling$1);
                    if (objM2650b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j3 = ((Velocity) objM2650b).f20578a;
                    jM6687d = Velocity.m6687d(j2, j3);
                }
            }
        } else if (i2 == 1) {
            j2 = scrollableNestedScrollConnection$onPostFling$1.f5890a;
            ResultKt.m18313b(objM2650b);
            j3 = ((Velocity) objM2650b).f20578a;
            jM6687d = Velocity.m6687d(j2, j3);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = scrollableNestedScrollConnection$onPostFling$1.f5890a;
            ResultKt.m18313b(objM2650b);
            j3 = ((Velocity) objM2650b).f20578a;
            jM6687d = Velocity.m6687d(j2, j3);
        }
        return new Velocity(jM6687d);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.f5889b) {
            return 0L;
        }
        ScrollingLogic scrollingLogic = this.f5888a;
        if (scrollingLogic.f5934a.mo2507a()) {
            return 0L;
        }
        return scrollingLogic.m2656h(scrollingLogic.m2652d(scrollingLogic.f5934a.mo2511e(scrollingLogic.m2652d(scrollingLogic.m2655g(j2)))));
    }
}
