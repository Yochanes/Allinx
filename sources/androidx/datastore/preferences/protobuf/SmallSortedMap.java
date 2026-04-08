package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f24107j = 0;

    /* JADX INFO: renamed from: a */
    public final int f24108a;

    /* JADX INFO: renamed from: b */
    public List f24109b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f24110c;

    /* JADX INFO: renamed from: d */
    public boolean f24111d;

    /* JADX INFO: renamed from: f */
    public volatile EntrySet f24112f;

    /* JADX INFO: renamed from: g */
    public Map f24113g;

    /* JADX INFO: renamed from: i */
    public volatile DescendingEntrySet f24114i;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C15851 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap
        /* JADX INFO: renamed from: j */
        public final void mo8634j() {
            if (!this.f24111d) {
                for (int i = 0; i < this.f24109b.size(); i++) {
                    ((FieldSet.FieldDescriptorLite) m8631f(i).getKey()).getClass();
                }
                Iterator it = m8632g().iterator();
                while (it.hasNext()) {
                    ((FieldSet.FieldDescriptorLite) ((Map.Entry) it.next()).getKey()).getClass();
                }
            }
            super.mo8634j();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return m8635k((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f24115a;

        /* JADX INFO: renamed from: b */
        public Iterator f24116b;

        public DescendingEntryIterator() {
            this.f24115a = SmallSortedMap.this.f24109b.size();
        }

        /* JADX INFO: renamed from: a */
        public final Iterator m8637a() {
            if (this.f24116b == null) {
                this.f24116b = SmallSortedMap.this.f24113g.entrySet().iterator();
            }
            return this.f24116b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f24115a;
            return (i > 0 && i <= SmallSortedMap.this.f24109b.size()) || m8637a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (m8637a().hasNext()) {
                return (Map.Entry) m8637a().next();
            }
            List list = SmallSortedMap.this.f24109b;
            int i = this.f24115a - 1;
            this.f24115a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        public DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EmptySet {

        /* JADX INFO: renamed from: a */
        public static final Iterator f24119a = new C15861();

        /* JADX INFO: renamed from: b */
        public static final Iterable f24120b = new C15872();

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$EmptySet$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C15861 implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.SmallSortedMap$EmptySet$2 */
        /* JADX INFO: compiled from: Proguard */
        public static class C15872 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f24119a;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* JADX INFO: renamed from: a */
        public final Comparable f24121a;

        /* JADX INFO: renamed from: b */
        public Object f24122b;

        public Entry(Comparable comparable, Object obj) {
            this.f24121a = comparable;
            this.f24122b = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f24121a.compareTo(((Entry) obj).f24121a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Comparable comparable = this.f24121a;
                    if (comparable == null ? key == null : comparable.equals(key)) {
                        Object obj2 = this.f24122b;
                        Object value = entry.getValue();
                        if (obj2 == null ? value == null : obj2.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f24121a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f24122b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.f24121a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f24122b;
            return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i = SmallSortedMap.f24107j;
            SmallSortedMap.this.m8630e();
            Object obj2 = this.f24122b;
            this.f24122b = obj;
            return obj2;
        }

        public final String toString() {
            return this.f24121a + "=" + this.f24122b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f24124a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f24125b;

        /* JADX INFO: renamed from: c */
        public Iterator f24126c;

        public EntryIterator() {
        }

        /* JADX INFO: renamed from: a */
        public final Iterator m8638a() {
            if (this.f24126c == null) {
                this.f24126c = SmallSortedMap.this.f24110c.entrySet().iterator();
            }
            return this.f24126c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f24124a + 1;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.f24109b.size() || (!smallSortedMap.f24110c.isEmpty() && m8638a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f24125b = true;
            int i = this.f24124a + 1;
            this.f24124a = i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.f24109b.size() ? (Map.Entry) smallSortedMap.f24109b.get(this.f24124a) : (Map.Entry) m8638a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f24125b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f24125b = false;
            int i = SmallSortedMap.f24107j;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.m8630e();
            if (this.f24124a >= smallSortedMap.f24109b.size()) {
                m8638a().remove();
                return;
            }
            int i2 = this.f24124a;
            this.f24124a = i2 - 1;
            smallSortedMap.m8636l(i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            SmallSortedMap.this.m8635k((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return SmallSortedMap.this.size();
        }
    }

    public SmallSortedMap(int i) {
        this.f24108a = i;
        Map map = Collections.EMPTY_MAP;
        this.f24110c = map;
        this.f24113g = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m8629c(Comparable comparable) {
        int i;
        int i2;
        int size = this.f24109b.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = comparable.compareTo(((Entry) this.f24109b.get(i4)).f24121a);
                if (iCompareTo < 0) {
                    i3 = i4 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    i = i4 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Entry) this.f24109b.get(i3)).f24121a);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i = 0;
                while (i <= i3) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8630e();
        if (!this.f24109b.isEmpty()) {
            this.f24109b.clear();
        }
        if (this.f24110c.isEmpty()) {
            return;
        }
        this.f24110c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8629c(comparable) >= 0 || this.f24110c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: e */
    public final void m8630e() {
        if (this.f24111d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f24112f == null) {
            this.f24112f = new EntrySet();
        }
        return this.f24112f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size == smallSortedMap.size()) {
            int size2 = this.f24109b.size();
            if (size2 != smallSortedMap.f24109b.size()) {
                return ((AbstractSet) entrySet()).equals(smallSortedMap.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m8631f(i).equals(smallSortedMap.m8631f(i))) {
                }
            }
            if (size2 != size) {
                return this.f24110c.equals(smallSortedMap.f24110c);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Map.Entry m8631f(int i) {
        return (Map.Entry) this.f24109b.get(i);
    }

    /* JADX INFO: renamed from: g */
    public final Iterable m8632g() {
        return this.f24110c.isEmpty() ? EmptySet.f24120b : this.f24110c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM8629c = m8629c(comparable);
        return iM8629c >= 0 ? ((Entry) this.f24109b.get(iM8629c)).f24122b : this.f24110c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final SortedMap m8633h() {
        m8630e();
        if (this.f24110c.isEmpty() && !(this.f24110c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f24110c = treeMap;
            this.f24113g = treeMap.descendingMap();
        }
        return (SortedMap) this.f24110c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f24109b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Entry) this.f24109b.get(i)).hashCode();
        }
        return this.f24110c.size() > 0 ? this.f24110c.hashCode() + iHashCode : iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public void mo8634j() {
        if (this.f24111d) {
            return;
        }
        this.f24110c = this.f24110c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f24110c);
        this.f24113g = this.f24113g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f24113g);
        this.f24111d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final Object m8635k(Comparable comparable, Object obj) {
        m8630e();
        int iM8629c = m8629c(comparable);
        if (iM8629c >= 0) {
            return ((Entry) this.f24109b.get(iM8629c)).setValue(obj);
        }
        m8630e();
        boolean zIsEmpty = this.f24109b.isEmpty();
        int i = this.f24108a;
        if (zIsEmpty && !(this.f24109b instanceof ArrayList)) {
            this.f24109b = new ArrayList(i);
        }
        int i2 = -(iM8629c + 1);
        if (i2 >= i) {
            return m8633h().put(comparable, obj);
        }
        if (this.f24109b.size() == i) {
            Entry entry = (Entry) this.f24109b.remove(i - 1);
            m8633h().put(entry.f24121a, entry.f24122b);
        }
        this.f24109b.add(i2, new Entry(comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Object m8636l(int i) {
        m8630e();
        Object obj = ((Entry) this.f24109b.remove(i)).f24122b;
        if (!this.f24110c.isEmpty()) {
            Iterator it = m8633h().entrySet().iterator();
            List list = this.f24109b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m8635k((Comparable) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8630e();
        Comparable comparable = (Comparable) obj;
        int iM8629c = m8629c(comparable);
        if (iM8629c >= 0) {
            return m8636l(iM8629c);
        }
        if (this.f24110c.isEmpty()) {
            return null;
        }
        return this.f24110c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f24110c.size() + this.f24109b.size();
    }
}
