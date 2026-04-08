package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: compiled from: Proguard */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry f24018a;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f24018a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.f24018a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.m8525a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.f24018a.getValue();
            MessageLite messageLite = lazyField.f24020a;
            lazyField.f24021b = null;
            lazyField.f24020a = (MessageLite) obj;
            return messageLite;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public final Iterator f24019a;

        public LazyIterator(Iterator it) {
            this.f24019a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24019a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.f24019a.next();
            if (!(entry.getValue() instanceof LazyField)) {
                return entry;
            }
            LazyEntry lazyEntry = new LazyEntry();
            lazyEntry.f24018a = entry;
            return lazyEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f24019a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final boolean equals(Object obj) {
        return m8525a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public final int hashCode() {
        return m8525a(null).hashCode();
    }

    public final String toString() {
        return m8525a(null).toString();
    }
}
