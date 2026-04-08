package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "K", "V", "E", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
abstract class SnapshotMapSet<K, V, E> implements Set<E>, KMutableSet {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateMap f17058a;

    public SnapshotMapSet(SnapshotStateMap snapshotStateMap) {
        this.f17058a = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f17058a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f17058a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f17058a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.m18591b(this, objArr);
    }
}
