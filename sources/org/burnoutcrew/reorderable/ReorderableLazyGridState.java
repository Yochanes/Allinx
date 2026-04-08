package org.burnoutcrew.reorderable;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lorg/burnoutcrew/reorderable/ReorderableLazyGridState;", "Lorg/burnoutcrew/reorderable/ReorderableState;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "reorderable"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public final class ReorderableLazyGridState extends ReorderableState<LazyGridItemInfo> {
    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: d */
    public final int mo21754d(Object obj) {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        Intrinsics.m18599g(lazyGridItemInfo, "<this>");
        return ((int) (lazyGridItemInfo.getF7079v() & 4294967295L)) + ((int) (lazyGridItemInfo.getF7078u() & 4294967295L));
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: j */
    public final int mo21755j() {
        throw null;
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: k */
    public final int mo21756k() {
        throw null;
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: l */
    public final int mo21757l(Object obj) {
        return (int) (((LazyGridItemInfo) obj).getF7078u() & 4294967295L);
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: m */
    public final int mo21758m(Object obj) {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        Intrinsics.m18599g(lazyGridItemInfo, "<this>");
        return lazyGridItemInfo.getF7058a();
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: n */
    public final Object mo21759n(Object obj) {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        Intrinsics.m18599g(lazyGridItemInfo, "<this>");
        return lazyGridItemInfo.getF7059b();
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: o */
    public final int mo21760o(Object obj) {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        Intrinsics.m18599g(lazyGridItemInfo, "<this>");
        return (int) (lazyGridItemInfo.getF7079v() >> 32);
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: p */
    public final int mo21761p(Object obj) {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        Intrinsics.m18599g(lazyGridItemInfo, "<this>");
        return ((int) (lazyGridItemInfo.getF7079v() >> 32)) + ((int) (lazyGridItemInfo.getF7078u() >> 32));
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: q */
    public final int mo21762q(Object obj) {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        Intrinsics.m18599g(lazyGridItemInfo, "<this>");
        return (int) (lazyGridItemInfo.getF7079v() & 4294967295L);
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: r */
    public final int mo21763r() {
        throw null;
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: s */
    public final int mo21764s() {
        throw null;
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: t */
    public final List mo21765t() {
        throw null;
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: u */
    public final int mo21766u(Object obj) {
        return (int) (((LazyGridItemInfo) obj).getF7078u() >> 32);
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: v */
    public final boolean mo21767v() {
        throw null;
    }

    @Override // org.burnoutcrew.reorderable.ReorderableState
    /* JADX INFO: renamed from: z */
    public final Object mo21768z(int i, int i2, Continuation continuation) {
        throw null;
    }
}
