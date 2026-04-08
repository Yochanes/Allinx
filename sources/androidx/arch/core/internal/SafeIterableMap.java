package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public Entry f1507a;

    /* JADX INFO: renamed from: b */
    public Entry f1508b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f1509c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f1510d = 0;

    /* JADX INFO: compiled from: Proguard */
    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* JADX INFO: renamed from: b */
        public final Entry mo810b(Entry entry) {
            return entry.f1514d;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* JADX INFO: renamed from: c */
        public final Entry mo811c(Entry entry) {
            return entry.f1513c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* JADX INFO: renamed from: b */
        public final Entry mo810b(Entry entry) {
            return entry.f1513c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        /* JADX INFO: renamed from: c */
        public final Entry mo811c(Entry entry) {
            return entry.f1514d;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Entry<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final Object f1511a;

        /* JADX INFO: renamed from: b */
        public final Object f1512b;

        /* JADX INFO: renamed from: c */
        public Entry f1513c;

        /* JADX INFO: renamed from: d */
        public Entry f1514d;

        public Entry(Object obj, Object obj2) {
            this.f1511a = obj;
            this.f1512b = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f1511a.equals(entry.f1511a) && this.f1512b.equals(entry.f1512b);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f1511a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f1512b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f1511a.hashCode() ^ this.f1512b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f1511a + "=" + this.f1512b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public Entry f1515a;

        /* JADX INFO: renamed from: b */
        public boolean f1516b = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* JADX INFO: renamed from: a */
        public final void mo812a(Entry entry) {
            Entry entry2 = this.f1515a;
            if (entry == entry2) {
                Entry entry3 = entry2.f1514d;
                this.f1515a = entry3;
                this.f1516b = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f1516b) {
                return SafeIterableMap.this.f1507a != null;
            }
            Entry entry = this.f1515a;
            return (entry == null || entry.f1513c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f1516b) {
                this.f1516b = false;
                this.f1515a = SafeIterableMap.this.f1507a;
            } else {
                Entry entry = this.f1515a;
                this.f1515a = entry != null ? entry.f1513c : null;
            }
            return this.f1515a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public Entry f1518a;

        /* JADX INFO: renamed from: b */
        public Entry f1519b;

        public ListIterator(Entry entry, Entry entry2) {
            this.f1518a = entry2;
            this.f1519b = entry;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* JADX INFO: renamed from: a */
        public final void mo812a(Entry entry) {
            Entry entryMo811c = null;
            if (this.f1518a == entry && entry == this.f1519b) {
                this.f1519b = null;
                this.f1518a = null;
            }
            Entry entry2 = this.f1518a;
            if (entry2 == entry) {
                this.f1518a = mo810b(entry2);
            }
            Entry entry3 = this.f1519b;
            if (entry3 == entry) {
                Entry entry4 = this.f1518a;
                if (entry3 != entry4 && entry4 != null) {
                    entryMo811c = mo811c(entry3);
                }
                this.f1519b = entryMo811c;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract Entry mo810b(Entry entry);

        /* JADX INFO: renamed from: c */
        public abstract Entry mo811c(Entry entry);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1519b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Entry entry = this.f1519b;
            Entry entry2 = this.f1518a;
            this.f1519b = (entry == entry2 || entry2 == null) ? null : mo811c(entry);
            return entry;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static abstract class SupportRemove<K, V> {
        /* JADX INFO: renamed from: a */
        public abstract void mo812a(Entry entry);
    }

    /* JADX INFO: renamed from: a */
    public Entry mo806a(Object obj) {
        Entry entry = this.f1507a;
        while (entry != null && !entry.f1511a.equals(obj)) {
            entry = entry.f1513c;
        }
        return entry;
    }

    /* JADX INFO: renamed from: c */
    public Object mo807c(Object obj, Object obj2) {
        Entry entryMo806a = mo806a(obj);
        if (entryMo806a != null) {
            return entryMo806a.f1512b;
        }
        Entry entry = new Entry(obj, obj2);
        this.f1510d++;
        Entry entry2 = this.f1508b;
        if (entry2 == null) {
            this.f1507a = entry;
            this.f1508b = entry;
            return null;
        }
        entry2.f1513c = entry;
        entry.f1514d = entry2;
        this.f1508b = entry;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Object mo808d(Object obj) {
        Entry entryMo806a = mo806a(obj);
        if (entryMo806a == null) {
            return null;
        }
        this.f1510d--;
        WeakHashMap weakHashMap = this.f1509c;
        if (!weakHashMap.isEmpty()) {
            Iterator<K> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).mo812a(entryMo806a);
            }
        }
        Entry entry = entryMo806a.f1514d;
        if (entry != null) {
            entry.f1513c = entryMo806a.f1513c;
        } else {
            this.f1507a = entryMo806a.f1513c;
        }
        Entry entry2 = entryMo806a.f1513c;
        if (entry2 != null) {
            entry2.f1514d = entry;
        } else {
            this.f1508b = entry;
        }
        entryMo806a.f1513c = null;
        entryMo806a.f1514d = null;
        return entryMo806a.f1512b;
    }

    public final Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.f1508b, this.f1507a);
        this.f1509c.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((androidx.arch.core.internal.SafeIterableMap.ListIterator) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.f1510d != safeIterableMap.f1510d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                break;
            }
            ListIterator listIterator2 = (ListIterator) it2;
            if (!listIterator2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) listIterator.next();
            Object next = listIterator2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) listIterator.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.f1507a, this.f1508b);
        this.f1509c.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it;
            if (!listIterator.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) listIterator.next()).toString());
            if (listIterator.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
