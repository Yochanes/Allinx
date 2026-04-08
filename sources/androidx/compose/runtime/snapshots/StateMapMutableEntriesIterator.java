package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010'\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class C12081 implements Map.Entry<Object, Object>, KMutableMap.Entry {

        /* JADX INFO: renamed from: a */
        public final Object f17112a;

        /* JADX INFO: renamed from: b */
        public Object f17113b;

        public C12081() {
            Map.Entry entry = StateMapMutableEntriesIterator.this.f17118d;
            Intrinsics.m18596d(entry);
            this.f17112a = entry.getKey();
            Map.Entry entry2 = StateMapMutableEntriesIterator.this.f17118d;
            Intrinsics.m18596d(entry2);
            this.f17113b = entry2.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f17112a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f17113b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            StateMapMutableEntriesIterator stateMapMutableEntriesIterator = StateMapMutableEntriesIterator.this;
            if (stateMapMutableEntriesIterator.f17115a.m4832f().f17072d != stateMapMutableEntriesIterator.f17117c) {
                throw new ConcurrentModificationException();
            }
            Object obj2 = this.f17113b;
            stateMapMutableEntriesIterator.f17115a.put(this.f17112a, obj);
            this.f17113b = obj;
            return obj2;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        m4849c();
        if (this.f17118d != null) {
            return new C12081();
        }
        throw new IllegalStateException();
    }
}
