package kotlinx.coroutines.debug.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\n\u000b\fR\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R!\u0010\t\u001a\u0018\u0012\u0014\u0012\u00120\bR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u00078\u0002X\u0082\u0004¨\u0006\r"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "core", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55634b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55635c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f55636a;
    private volatile /* synthetic */ Object core$volatile = new Core(16);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\bR\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004R\u0019\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¨\u0006\t"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "Lkotlinx/atomicfu/AtomicInt;", "load", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", UserMetadata.KEYDATA_FILENAME, "values", "KeyValueIterator", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public final class Core {

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f55637g = AtomicIntegerFieldUpdater.newUpdater(Core.class, "load$volatile");

        /* JADX INFO: renamed from: a */
        public final int f55638a;

        /* JADX INFO: renamed from: b */
        public final int f55639b;

        /* JADX INFO: renamed from: c */
        public final int f55640c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicReferenceArray f55641d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReferenceArray f55642e;
        private volatile /* synthetic */ int load$volatile;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        @SourceDebugExtension
        public final class KeyValueIterator<E> implements Iterator<E>, KMutableIterator {

            /* JADX INFO: renamed from: a */
            public final Function2 f55644a;

            /* JADX INFO: renamed from: b */
            public int f55645b = -1;

            /* JADX INFO: renamed from: c */
            public Object f55646c;

            /* JADX INFO: renamed from: d */
            public Object f55647d;

            public KeyValueIterator(Function2 function2) {
                this.f55644a = function2;
                m20732c();
            }

            /* JADX INFO: renamed from: c */
            public final void m20732c() {
                T t;
                while (true) {
                    int i = this.f55645b + 1;
                    this.f55645b = i;
                    Core core = Core.this;
                    if (i >= core.f55638a) {
                        return;
                    }
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) core.f55641d.get(i);
                    if (hashedWeakRef != null && (t = hashedWeakRef.get()) != 0) {
                        this.f55646c = t;
                        Object obj = core.f55642e.get(this.f55645b);
                        if (obj instanceof Marked) {
                            obj = ((Marked) obj).f55660a;
                        }
                        if (obj != null) {
                            this.f55647d = obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f55645b < Core.this.f55638a;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.f55645b >= Core.this.f55638a) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f55646c;
                if (obj == null) {
                    Intrinsics.m18606n("key");
                    throw null;
                }
                Object obj2 = this.f55647d;
                if (obj2 == null) {
                    Intrinsics.m18606n("value");
                    throw null;
                }
                Object objInvoke = this.f55644a.invoke(obj, obj2);
                m20732c();
                return objInvoke;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("not implemented");
            }
        }

        public Core(int i) {
            this.f55638a = i;
            this.f55639b = Integer.numberOfLeadingZeros(i) + 1;
            this.f55640c = (i * 2) / 3;
            this.f55641d = new AtomicReferenceArray(i);
            this.f55642e = new AtomicReferenceArray(i);
        }

        /* JADX INFO: renamed from: a */
        public final Object m20729a(Object obj, Object obj2, HashedWeakRef hashedWeakRef) {
            Symbol symbol;
            int i;
            int iHashCode = (obj.hashCode() * (-1640531527)) >>> this.f55639b;
            boolean z2 = false;
            loop0: while (true) {
                AtomicReferenceArray atomicReferenceArray = this.f55641d;
                HashedWeakRef hashedWeakRef2 = (HashedWeakRef) atomicReferenceArray.get(iHashCode);
                symbol = ConcurrentWeakMapKt.f55653a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55637g;
                if (hashedWeakRef2 == null) {
                    if (obj2 != null) {
                        if (!z2) {
                            do {
                                i = atomicIntegerFieldUpdater.get(this);
                                if (i >= this.f55640c) {
                                    break loop0;
                                }
                            } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                            z2 = true;
                        }
                        boolean z3 = z2;
                        if (hashedWeakRef == null) {
                            hashedWeakRef = new HashedWeakRef(obj, ConcurrentWeakMap.this.f55636a);
                            obj.hashCode();
                        }
                        HashedWeakRef hashedWeakRef3 = hashedWeakRef;
                        while (!atomicReferenceArray.compareAndSet(iHashCode, null, hashedWeakRef3)) {
                            if (atomicReferenceArray.get(iHashCode) != null) {
                                z2 = z3;
                                hashedWeakRef = hashedWeakRef3;
                            }
                        }
                        break loop0;
                    }
                    return null;
                }
                Object obj3 = hashedWeakRef2.get();
                if (!obj.equals(obj3)) {
                    if (obj3 == null) {
                        m20731c(iHashCode);
                    }
                    if (iHashCode == 0) {
                        iHashCode = this.f55638a;
                    }
                    iHashCode--;
                } else if (z2) {
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                }
            }
            while (true) {
                AtomicReferenceArray atomicReferenceArray2 = this.f55642e;
                Object obj4 = atomicReferenceArray2.get(iHashCode);
                if (obj4 instanceof Marked) {
                    break;
                }
                while (!atomicReferenceArray2.compareAndSet(iHashCode, obj4, obj2)) {
                    if (atomicReferenceArray2.get(iHashCode) != obj4) {
                        break;
                    }
                }
                return obj4;
            }
            return symbol;
        }

        /* JADX INFO: renamed from: b */
        public final Core m20730b() {
            int i;
            Object obj;
            while (true) {
                ConcurrentWeakMap concurrentWeakMap = ConcurrentWeakMap.this;
                int iMo4655f = concurrentWeakMap.mo4655f();
                if (iMo4655f < 4) {
                    iMo4655f = 4;
                }
                Core core = new Core(Integer.highestOneBit(iMo4655f) * 4);
                while (i < this.f55638a) {
                    HashedWeakRef hashedWeakRef = (HashedWeakRef) this.f55641d.get(i);
                    Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        m20731c(i);
                    }
                    while (true) {
                        AtomicReferenceArray atomicReferenceArray = this.f55642e;
                        obj = atomicReferenceArray.get(i);
                        if (!(obj instanceof Marked)) {
                            Marked marked = obj == null ? ConcurrentWeakMapKt.f55654b : obj.equals(Boolean.TRUE) ? ConcurrentWeakMapKt.f55655c : new Marked(obj);
                            while (!atomicReferenceArray.compareAndSet(i, obj, marked)) {
                                if (atomicReferenceArray.get(i) != obj) {
                                    break;
                                }
                            }
                            break;
                        }
                        obj = ((Marked) obj).f55660a;
                        break;
                    }
                    i = (obj2 == null || obj == null || core.m20729a(obj2, obj, hashedWeakRef) != ConcurrentWeakMapKt.f55653a) ? i + 1 : 0;
                }
                return core;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m20731c(int i) {
            while (true) {
                AtomicReferenceArray atomicReferenceArray = this.f55642e;
                Object obj = atomicReferenceArray.get(i);
                if (obj == null || (obj instanceof Marked)) {
                    return;
                }
                while (!atomicReferenceArray.compareAndSet(i, obj, null)) {
                    if (atomicReferenceArray.get(i) != obj) {
                        break;
                    }
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.f55634b;
                ConcurrentWeakMap concurrentWeakMap = ConcurrentWeakMap.this;
                concurrentWeakMap.getClass();
                ConcurrentWeakMap.f55634b.decrementAndGet(concurrentWeakMap);
                return;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Entry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* JADX INFO: renamed from: a */
        public final Object f55649a;

        /* JADX INFO: renamed from: b */
        public final Object f55650b;

        public Entry(Object obj, Object obj2) {
            this.f55649a = obj;
            this.f55650b = obj2;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f55649a;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f55650b;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("not implemented");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public final class KeyValueSet<E> extends AbstractMutableSet<E> {

        /* JADX INFO: renamed from: a */
        public final Function2 f55651a;

        public KeyValueSet(Function2 function2) {
            this.f55651a = function2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException("not implemented");
        }

        @Override // kotlin.collections.AbstractMutableSet
        /* JADX INFO: renamed from: c */
        public final int mo4660c() {
            return ConcurrentWeakMap.this.mo4655f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            Core core = (Core) ConcurrentWeakMap.f55635c.get(ConcurrentWeakMap.this);
            core.getClass();
            return core.new KeyValueIterator(this.f55651a);
        }
    }

    public ConcurrentWeakMap(boolean z2) {
        this.f55636a = z2 ? new ReferenceQueue() : null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: c */
    public final Set mo4653c() {
        return new KeyValueSet(new C6257a(0));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((KeyValueSet) mo4654e()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: e */
    public final Set mo4654e() {
        return new KeyValueSet(new C6257a(1));
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* JADX INFO: renamed from: f */
    public final int mo4655f() {
        return f55634b.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) f55635c.get(this);
        core.getClass();
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> core.f55639b;
        while (true) {
            HashedWeakRef hashedWeakRef = (HashedWeakRef) core.f55641d.get(iHashCode);
            if (hashedWeakRef == null) {
                return null;
            }
            Object obj2 = hashedWeakRef.get();
            if (obj.equals(obj2)) {
                Object obj3 = core.f55642e.get(iHashCode);
                return obj3 instanceof Marked ? ((Marked) obj3).f55660a : obj3;
            }
            if (obj2 == null) {
                core.m20731c(iHashCode);
            }
            if (iHashCode == 0) {
                iHashCode = core.f55638a;
            }
            iHashCode--;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized Object m20728j(Object obj, Object obj2) {
        Object objM20729a;
        Core coreM20730b = (Core) f55635c.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.f55637g;
            objM20729a = coreM20730b.m20729a(obj, obj2, null);
            if (objM20729a == ConcurrentWeakMapKt.f55653a) {
                coreM20730b = coreM20730b.m20730b();
                f55635c.set(this, coreM20730b);
            }
        }
        return objM20729a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Core core = (Core) f55635c.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.f55637g;
        Object objM20729a = core.m20729a(obj, obj2, null);
        if (objM20729a == ConcurrentWeakMapKt.f55653a) {
            objM20729a = m20728j(obj, obj2);
        }
        if (objM20729a == null) {
            f55634b.incrementAndGet(this);
        }
        return objM20729a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        Core core = (Core) f55635c.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Core.f55637g;
        Object objM20729a = core.m20729a(obj, null, null);
        if (objM20729a == ConcurrentWeakMapKt.f55653a) {
            objM20729a = m20728j(obj, null);
        }
        if (objM20729a != null) {
            f55634b.decrementAndGet(this);
        }
        return objM20729a;
    }
}
