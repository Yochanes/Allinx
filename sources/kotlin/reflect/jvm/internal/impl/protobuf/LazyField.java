package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: compiled from: Proguard */
    public static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry f54122a;

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f54122a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField lazyField = (LazyField) this.f54122a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.m19711a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            LazyField lazyField = (LazyField) this.f54122a.getValue();
            MessageLite messageLite = lazyField.f54124a;
            lazyField.f54124a = (MessageLite) obj;
            return messageLite;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator f54123a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54123a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry entry = (Map.Entry) this.f54123a.next();
            if (!(entry.getValue() instanceof LazyField)) {
                return entry;
            }
            LazyEntry lazyEntry = new LazyEntry();
            lazyEntry.f54122a = entry;
            return lazyEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f54123a.remove();
        }
    }

    /* JADX INFO: renamed from: a */
    public final MessageLite m19711a() {
        if (this.f54124a == null) {
            synchronized (this) {
                if (this.f54124a == null) {
                    try {
                        this.f54124a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f54124a;
    }

    public final boolean equals(Object obj) {
        return m19711a().equals(obj);
    }

    public final int hashCode() {
        return m19711a().hashCode();
    }

    public final String toString() {
        return m19711a().toString();
    }
}
