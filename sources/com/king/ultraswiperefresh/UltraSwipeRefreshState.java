package com.king.ultraswiperefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/king/ultraswiperefresh/UltraSwipeRefreshState;", "", "refresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class UltraSwipeRefreshState {

    /* JADX INFO: renamed from: a */
    public final MutatorMutex f43130a = new MutatorMutex();

    /* JADX INFO: renamed from: b */
    public final MutableState f43131b;

    /* JADX INFO: renamed from: c */
    public final MutableState f43132c;

    /* JADX INFO: renamed from: d */
    public final MutableState f43133d;

    /* JADX INFO: renamed from: e */
    public final MutableState f43134e;

    /* JADX INFO: renamed from: f */
    public final MutableState f43135f;

    /* JADX INFO: renamed from: g */
    public final MutableState f43136g;

    /* JADX INFO: renamed from: h */
    public final MutableFloatState f43137h;

    /* JADX INFO: renamed from: i */
    public final MutableFloatState f43138i;

    /* JADX INFO: renamed from: j */
    public final MutableFloatState f43139j;

    /* JADX INFO: renamed from: k */
    public final MutableFloatState f43140k;

    /* JADX INFO: renamed from: l */
    public final Animatable f43141l;

    public UltraSwipeRefreshState(boolean z2, boolean z3) {
        this.f43131b = SnapshotStateKt.m4525g(Boolean.valueOf(z2));
        this.f43132c = SnapshotStateKt.m4525g(Boolean.valueOf(z3));
        Boolean bool = Boolean.FALSE;
        this.f43133d = SnapshotStateKt.m4525g(bool);
        this.f43134e = SnapshotStateKt.m4525g(bool);
        this.f43135f = SnapshotStateKt.m4525g(UltraSwipeHeaderState.f43013a);
        this.f43136g = SnapshotStateKt.m4525g(UltraSwipeFooterState.f43009a);
        this.f43137h = PrimitiveSnapshotStateKt.m4404a(Float.MAX_VALUE);
        this.f43138i = PrimitiveSnapshotStateKt.m4404a(Float.MIN_VALUE);
        this.f43139j = PrimitiveSnapshotStateKt.m4404a(0.0f);
        this.f43140k = PrimitiveSnapshotStateKt.m4404a(0.0f);
        this.f43141l = AnimatableKt.m2260a(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public static final void m15375a(UltraSwipeRefreshState ultraSwipeRefreshState) {
        ((SnapshotMutableStateImpl) ultraSwipeRefreshState.f43136g).setValue(ultraSwipeRefreshState.m15382h() ? UltraSwipeFooterState.f43011c : (!ultraSwipeRefreshState.m15384j() || ultraSwipeRefreshState.m15380f() > ((SnapshotMutableFloatStateImpl) ultraSwipeRefreshState.f43138i).mo4376c()) ? UltraSwipeFooterState.f43009a : UltraSwipeFooterState.f43010b);
    }

    /* JADX INFO: renamed from: b */
    public static final void m15376b(UltraSwipeRefreshState ultraSwipeRefreshState) {
        ((SnapshotMutableStateImpl) ultraSwipeRefreshState.f43135f).setValue(ultraSwipeRefreshState.m15383i() ? UltraSwipeHeaderState.f43015c : (!ultraSwipeRefreshState.m15384j() || ultraSwipeRefreshState.m15380f() < ((SnapshotMutableFloatStateImpl) ultraSwipeRefreshState.f43137h).mo4376c()) ? UltraSwipeHeaderState.f43013a : UltraSwipeHeaderState.f43014b);
    }

    /* JADX INFO: renamed from: c */
    public static Object m15377c(UltraSwipeRefreshState ultraSwipeRefreshState, float f, ContinuationImpl continuationImpl) {
        MutatePriority mutatePriority = MutatePriority.f5091a;
        ultraSwipeRefreshState.getClass();
        Object objM2493b = ultraSwipeRefreshState.f43130a.m2493b(mutatePriority, new UltraSwipeRefreshState$animateOffsetTo$2(ultraSwipeRefreshState, f, null), continuationImpl);
        return objM2493b == CoroutineSingletons.f51584a ? objM2493b : Unit.f51459a;
    }

    /* JADX INFO: renamed from: d */
    public final UltraSwipeFooterState m15378d() {
        return (UltraSwipeFooterState) ((SnapshotMutableStateImpl) this.f43136g).getF20325a();
    }

    /* JADX INFO: renamed from: e */
    public final UltraSwipeHeaderState m15379e() {
        return (UltraSwipeHeaderState) ((SnapshotMutableStateImpl) this.f43135f).getF20325a();
    }

    /* JADX INFO: renamed from: f */
    public final float m15380f() {
        return ((Number) this.f43141l.m2256e()).floatValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15381g() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f43133d).getF20325a()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15382h() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f43132c).getF20325a()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15383i() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f43131b).getF20325a()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15384j() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f43134e).getF20325a()).booleanValue();
    }
}
