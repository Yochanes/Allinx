package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1", "Landroidx/compose/runtime/DerivedStateObserver;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1 implements DerivedStateObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SnapshotStateObserver.ObservedScopeMap f17096a;

    public SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1(SnapshotStateObserver.ObservedScopeMap observedScopeMap) {
        this.f17096a = observedScopeMap;
    }

    @Override // androidx.compose.runtime.DerivedStateObserver
    /* JADX INFO: renamed from: a */
    public final void mo4313a() {
        SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.f17096a;
        observedScopeMap.f17093j--;
    }

    @Override // androidx.compose.runtime.DerivedStateObserver
    public final void start() {
        this.f17096a.f17093j++;
    }
}
