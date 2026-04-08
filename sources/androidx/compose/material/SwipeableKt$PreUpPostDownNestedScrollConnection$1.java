package androidx.compose.material;

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
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material/SwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            int i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11333d;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11333d = i - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11331b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11333d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11330a;
            ResultKt.m18313b(obj);
            return new Velocity(j3);
        }
        ResultKt.m18313b(obj);
        Offset.m5056f(OffsetKt.m5061a(Velocity.m6685b(j2), Velocity.m6686c(j2)));
        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11330a = j2;
        swipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.f11333d = 1;
        throw null;
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i != 1) {
            return 0L;
        }
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
        SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        if (continuation instanceof SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            int i = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11336c;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11336c = i - Integer.MIN_VALUE;
            } else {
                swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, (ContinuationImpl) continuation);
            }
        }
        Object obj = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11334a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = swipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.f11336c;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (Offset.m5056f(OffsetKt.m5061a(Velocity.m6685b(j), Velocity.m6686c(j))) < 0.0f) {
                throw null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return new Velocity(0L);
    }

    @Override // androidx.compose.p013ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo21925onPreScrollOzD1aCk(long j, int i) {
        if (Offset.m5056f(j) >= 0.0f || i != 1) {
            return 0L;
        }
        throw null;
    }
}
