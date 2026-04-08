package kotlin.collections;

import io.intercom.android.sdk.p032m5.push.C5615a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public volatile AbstractMap$keys$1 f51475a;

    /* JADX INFO: renamed from: b */
    public volatile C59801 f51476b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    /* JADX INFO: renamed from: kotlin.collections.AbstractMap$values$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C59801 extends AbstractCollection<Object> {
        public C59801() {
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: c */
        public final int getF16756c() {
            return AbstractMap.this.getF16794d();
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return AbstractMap.this.containsValue(obj);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new AbstractMap$values$1$iterator$1(AbstractMap.this.mo4645e().iterator());
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m18324k(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setMo4645e = mo4645e();
        if (setMo4645e.isEmpty()) {
            return false;
        }
        Iterator it = setMo4645e.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m18594b(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract Set mo4645e();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo4645e();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getF16794d() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v = get(key);
                if (Intrinsics.m18594b(value, v) && (v != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public Set mo4646f() {
        if (this.f51475a == null) {
            this.f51475a = new AbstractMap$keys$1(this);
        }
        AbstractMap$keys$1 abstractMap$keys$1 = this.f51475a;
        Intrinsics.m18596d(abstractMap$keys$1);
        return abstractMap$keys$1;
    }

    /* JADX INFO: renamed from: g */
    public int getF16794d() {
        return mo4645e().size();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry entryM18324k = m18324k(obj);
        if (entryM18324k != null) {
            return entryM18324k.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return mo4645e().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getF16794d() == 0;
    }

    /* JADX INFO: renamed from: j */
    public Collection mo4648j() {
        if (this.f51476b == null) {
            this.f51476b = new C59801();
        }
        C59801 c59801 = this.f51476b;
        Intrinsics.m18596d(c59801);
        return c59801;
    }

    /* JADX INFO: renamed from: k */
    public final Map.Entry m18324k(Object obj) {
        Object next;
        Iterator it = mo4645e().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.m18594b(((Map.Entry) next).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return mo4646f();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getF16794d();
    }

    public final String toString() {
        return CollectionsKt.m18409J(mo4645e(), ", ", "{", "}", new C5615a(this, 2), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return mo4648j();
    }
}
