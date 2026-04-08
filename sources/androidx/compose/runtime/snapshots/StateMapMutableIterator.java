package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "K", "V", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
abstract class StateMapMutableIterator<K, V> {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateMap f17115a;

    /* JADX INFO: renamed from: b */
    public final Iterator f17116b;

    /* JADX INFO: renamed from: c */
    public int f17117c;

    /* JADX INFO: renamed from: d */
    public Map.Entry f17118d;

    /* JADX INFO: renamed from: f */
    public Map.Entry f17119f;

    public StateMapMutableIterator(SnapshotStateMap snapshotStateMap, Iterator it) {
        this.f17115a = snapshotStateMap;
        this.f17116b = it;
        this.f17117c = snapshotStateMap.m4832f().f17072d;
        m4849c();
    }

    /* JADX INFO: renamed from: c */
    public final void m4849c() {
        this.f17118d = this.f17119f;
        Iterator it = this.f17116b;
        this.f17119f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public final boolean hasNext() {
        return this.f17119f != null;
    }

    public final void remove() {
        SnapshotStateMap snapshotStateMap = this.f17115a;
        if (snapshotStateMap.m4832f().f17072d != this.f17117c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f17118d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        snapshotStateMap.remove(entry.getKey());
        this.f17118d = null;
        this.f17117c = snapshotStateMap.m4832f().f17072d;
    }
}
