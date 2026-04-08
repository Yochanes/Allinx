package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f54151g = 0;

    /* JADX INFO: renamed from: a */
    public final int f54152a;

    /* JADX INFO: renamed from: b */
    public List f54153b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public Map f54154c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d */
    public boolean f54155d;

    /* JADX INFO: renamed from: f */
    public volatile EntrySet f54156f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C61601 extends SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object> {
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap
        /* JADX INFO: renamed from: h */
        public final void mo19722h() {
            if (!this.f54155d) {
                for (int i = 0; i < this.f54153b.size(); i++) {
                    Map.Entry entry = (Map.Entry) this.f54153b.get(i);
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : m19720f()) {
                    if (((FieldSet.FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                    }
                }
            }
            super.mo19722h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return m19723j((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EmptySet {

        /* JADX INFO: renamed from: a */
        public static final Iterator f54157a = new C61611();

        /* JADX INFO: renamed from: b */
        public static final Iterable f54158b = new C61622();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$EmptySet$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61611 implements Iterator<Object> {
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

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap$EmptySet$2 */
        /* JADX INFO: compiled from: Proguard */
        public static class C61622 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return EmptySet.f54157a;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class Entry implements Comparable<SmallSortedMap<K, V>.Entry>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public final Comparable f54159a;

        /* JADX INFO: renamed from: b */
        public Object f54160b;

        public Entry(Comparable comparable, Object obj) {
            this.f54159a = comparable;
            this.f54160b = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f54159a.compareTo(((Entry) obj).f54159a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Comparable comparable = this.f54159a;
                    if (comparable == null ? key == null : comparable.equals(key)) {
                        Object obj2 = this.f54160b;
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
            return this.f54159a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f54160b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Comparable comparable = this.f54159a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f54160b;
            return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            int i = SmallSortedMap.f54151g;
            SmallSortedMap.this.m19719e();
            Object obj2 = this.f54160b;
            this.f54160b = obj;
            return obj2;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.f54159a);
            String strValueOf2 = String.valueOf(this.f54160b);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f54162a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f54163b;

        /* JADX INFO: renamed from: c */
        public Iterator f54164c;

        public EntryIterator() {
        }

        /* JADX INFO: renamed from: a */
        public final Iterator m19725a() {
            if (this.f54164c == null) {
                this.f54164c = SmallSortedMap.this.f54154c.entrySet().iterator();
            }
            return this.f54164c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f54162a + 1 < SmallSortedMap.this.f54153b.size() || m19725a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f54163b = true;
            int i = this.f54162a + 1;
            this.f54162a = i;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            return i < smallSortedMap.f54153b.size() ? (Map.Entry) smallSortedMap.f54153b.get(this.f54162a) : (Map.Entry) m19725a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f54163b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f54163b = false;
            int i = SmallSortedMap.f54151g;
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            smallSortedMap.m19719e();
            if (this.f54162a >= smallSortedMap.f54153b.size()) {
                m19725a().remove();
                return;
            }
            int i2 = this.f54162a;
            this.f54162a = i2 - 1;
            smallSortedMap.m19724k(i2);
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
            SmallSortedMap.this.m19723j((Comparable) entry.getKey(), entry.getValue());
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
        public final Iterator iterator() {
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
        this.f54152a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m19718c(Comparable comparable) {
        int i;
        int i2;
        int size = this.f54153b.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = comparable.compareTo(((Entry) this.f54153b.get(i4)).f54159a);
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
            int iCompareTo2 = comparable.compareTo(((Entry) this.f54153b.get(i3)).f54159a);
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
        m19719e();
        if (!this.f54153b.isEmpty()) {
            this.f54153b.clear();
        }
        if (this.f54154c.isEmpty()) {
            return;
        }
        this.f54154c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m19718c(comparable) >= 0 || this.f54154c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: e */
    public final void m19719e() {
        if (this.f54155d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f54156f == null) {
            this.f54156f = new EntrySet();
        }
        return this.f54156f;
    }

    /* JADX INFO: renamed from: f */
    public final Iterable m19720f() {
        return this.f54154c.isEmpty() ? EmptySet.f54158b : this.f54154c.entrySet();
    }

    /* JADX INFO: renamed from: g */
    public final SortedMap m19721g() {
        m19719e();
        if (this.f54154c.isEmpty() && !(this.f54154c instanceof TreeMap)) {
            this.f54154c = new TreeMap();
        }
        return (SortedMap) this.f54154c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM19718c = m19718c(comparable);
        return iM19718c >= 0 ? ((Entry) this.f54153b.get(iM19718c)).f54160b : this.f54154c.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public void mo19722h() {
        if (this.f54155d) {
            return;
        }
        this.f54154c = this.f54154c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f54154c);
        this.f54155d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final Object m19723j(Comparable comparable, Object obj) {
        m19719e();
        int iM19718c = m19718c(comparable);
        if (iM19718c >= 0) {
            return ((Entry) this.f54153b.get(iM19718c)).setValue(obj);
        }
        m19719e();
        boolean zIsEmpty = this.f54153b.isEmpty();
        int i = this.f54152a;
        if (zIsEmpty && !(this.f54153b instanceof ArrayList)) {
            this.f54153b = new ArrayList(i);
        }
        int i2 = -(iM19718c + 1);
        if (i2 >= i) {
            return m19721g().put(comparable, obj);
        }
        if (this.f54153b.size() == i) {
            Entry entry = (Entry) this.f54153b.remove(i - 1);
            m19721g().put(entry.f54159a, entry.f54160b);
        }
        this.f54153b.add(i2, new Entry(comparable, obj));
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final Object m19724k(int i) {
        m19719e();
        Object obj = ((Entry) this.f54153b.remove(i)).f54160b;
        if (!this.f54154c.isEmpty()) {
            Iterator it = m19721g().entrySet().iterator();
            List list = this.f54153b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Entry((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return m19723j((Comparable) obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m19719e();
        Comparable comparable = (Comparable) obj;
        int iM19718c = m19718c(comparable);
        if (iM19718c >= 0) {
            return m19724k(iM19718c);
        }
        if (this.f54154c.isEmpty()) {
            return null;
        }
        return this.f54154c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f54154c.size() + this.f54153b.size();
    }
}
