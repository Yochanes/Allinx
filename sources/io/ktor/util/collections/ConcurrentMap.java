package io.ktor.util.collections;

import androidx.compose.animation.AbstractC0455a;
import io.ktor.util.InternalAPI;
import io.ktor.util.Lock;
import io.ktor.util.collections.internal.ConcurrentMapKeys;
import io.ktor.util.collections.internal.ConcurrentMapValues;
import io.ktor.util.collections.internal.ForwardListIterator;
import io.ktor.util.collections.internal.ForwardListNode;
import io.ktor.util.collections.internal.ForwardListNode$$special$$inlined$shared$1;
import io.ktor.util.collections.internal.MapNode;
import io.ktor.util.collections.internal.MapNode$$special$$inlined$shared$1;
import io.ktor.util.collections.internal.MutableMapEntries;
import io.ktor.util.collections.internal.SharedForwardList;
import io.ktor.util.collections.internal.SharedForwardList$$special$$inlined$shared$2;
import io.ktor.util.collections.internal.SharedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/util/collections/ConcurrentMap;", "", "Key", "Value", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ConcurrentMap<Key, Value> implements Map<Key, Value>, KMutableMap {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty[] f46519d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f46520f;
    volatile /* synthetic */ int _size;

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap$$special$$inlined$shared$1 f46521a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap$$special$$inlined$shared$2 f46522b;

    /* JADX INFO: renamed from: c */
    public final Lock f46523c;

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$clear$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59401 extends Lambda implements Function0<Unit> {
        public C59401() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SharedList sharedList = new SharedList(32);
            KProperty[] kPropertyArr = ConcurrentMap.f46519d;
            ConcurrentMap concurrentMap = ConcurrentMap.this;
            KProperty[] kPropertyArr2 = ConcurrentMap.f46519d;
            concurrentMap.f46521a.setValue(concurrentMap, kPropertyArr2[0], sharedList);
            SharedForwardList sharedForwardList = new SharedForwardList();
            concurrentMap.f46522b.setValue(concurrentMap, kPropertyArr2[1], sharedForwardList);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$containsValue$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59411 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f46531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59411(Object obj) {
            super(0);
            this.f46531b = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x000c, code lost:
        
            continue;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke() {
            boolean z2;
            ForwardListIterator forwardListIterator;
            KProperty[] kPropertyArr = ConcurrentMap.f46519d;
            Iterator it = ConcurrentMap.this.m17188e().iterator();
            loop0: while (true) {
                SharedList.C59521 c59521 = (SharedList.C59521) it;
                if (!c59521.hasNext()) {
                    z2 = false;
                    break;
                }
                SharedForwardList sharedForwardList = (SharedForwardList) c59521.next();
                if (sharedForwardList != null) {
                    Iterator it2 = sharedForwardList.iterator();
                    do {
                        forwardListIterator = (ForwardListIterator) it2;
                        if (forwardListIterator.hasNext()) {
                        }
                    } while (!Intrinsics.m18594b(((MapNode) forwardListIterator.next()).getValue(), this.f46531b));
                    z2 = true;
                    break loop0;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$equals$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59421 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f46533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59421(Object obj) {
            super(0);
            this.f46533b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj = this.f46533b;
            boolean z2 = false;
            if (obj != null && (obj instanceof Map) && ((Map) obj).size() == ConcurrentMap.this._size) {
                Iterator it = ((Map) this.f46533b).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if (!Intrinsics.m18594b(ConcurrentMap.this.get(key), entry.getValue())) {
                        break;
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$get$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Value", "Key", "", "invoke", "()Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59431 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f46535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59431(Object obj) {
            super(0);
            this.f46535b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object next;
            ConcurrentMap concurrentMap = ConcurrentMap.this;
            Object obj = this.f46535b;
            KProperty[] kPropertyArr = ConcurrentMap.f46519d;
            SharedForwardList sharedForwardList = (SharedForwardList) concurrentMap.m17188e().f46581a.get(obj.hashCode() & (concurrentMap.m17188e().f46582b - 1));
            if (sharedForwardList != null) {
                Iterator it = sharedForwardList.iterator();
                while (true) {
                    ForwardListIterator forwardListIterator = (ForwardListIterator) it;
                    if (!forwardListIterator.hasNext()) {
                        next = null;
                        break;
                    }
                    next = forwardListIterator.next();
                    if (((MapNode) next).f46570c.equals(obj)) {
                        break;
                    }
                }
                MapNode mapNode = (MapNode) next;
                if (mapNode != null) {
                    return mapNode.getValue();
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$hashCode$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59441 extends Lambda implements Function0<Integer> {
        public C59441() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MutableMapEntries.C59511 c59511 = new MutableMapEntries.C59511(new MutableMapEntries(ConcurrentMap.this));
            int iHashCode = 7;
            while (c59511.f46575a.hasNext()) {
                Map.Entry<Object, Object> next = c59511.next();
                iHashCode = ArraysKt.m18364d0(new Object[]{Integer.valueOf(next.getKey().hashCode()), Integer.valueOf(next.getValue().hashCode()), Integer.valueOf(iHashCode)}).hashCode();
            }
            return Integer.valueOf(iHashCode);
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$put$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Value", "Key", "", "invoke", "()Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59451 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f46542b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f46543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59451(Object obj, Object obj2) {
            super(0);
            this.f46542b = obj;
            this.f46543c = obj2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object next;
            ConcurrentMap concurrentMap = ConcurrentMap.this;
            if (concurrentMap._size / concurrentMap.m17188e().f46582b > 0.5d) {
                ConcurrentMap concurrentMap2 = ConcurrentMap.this;
                ConcurrentMap concurrentMap3 = new ConcurrentMap(null, concurrentMap2.m17188e().f46582b * 2, 1);
                concurrentMap3.putAll(concurrentMap2);
                concurrentMap2.f46521a.setValue(concurrentMap2, ConcurrentMap.f46519d[0], concurrentMap3.m17188e());
            }
            ConcurrentMap concurrentMap4 = ConcurrentMap.this;
            int iHashCode = this.f46542b.hashCode() & (concurrentMap4.m17188e().f46582b - 1);
            SharedForwardList sharedForwardList = (SharedForwardList) concurrentMap4.m17188e().f46581a.get(iHashCode);
            if (sharedForwardList == null) {
                sharedForwardList = new SharedForwardList();
                concurrentMap4.m17188e().m17195c(iHashCode, sharedForwardList);
            }
            Iterator it = sharedForwardList.iterator();
            while (true) {
                ForwardListIterator forwardListIterator = (ForwardListIterator) it;
                if (!forwardListIterator.hasNext()) {
                    next = null;
                    break;
                }
                next = forwardListIterator.next();
                if (((MapNode) next).f46570c.equals(this.f46542b)) {
                    break;
                }
            }
            MapNode mapNode = (MapNode) next;
            if (mapNode != null) {
                Object value = mapNode.getValue();
                mapNode.f46569b.setValue(mapNode, MapNode.f46567d[1], this.f46543c);
                return value;
            }
            MapNode mapNode2 = new MapNode(this.f46542b, this.f46543c);
            ConcurrentMap concurrentMap5 = ConcurrentMap.this;
            SharedForwardList sharedForwardList2 = (SharedForwardList) concurrentMap5.f46522b.getValue(concurrentMap5, ConcurrentMap.f46519d[1]);
            sharedForwardList2.getClass();
            ForwardListNode forwardListNodeM17194e = sharedForwardList2.m17194e();
            Intrinsics.m18596d(forwardListNodeM17194e);
            ForwardListNode forwardListNode = new ForwardListNode(forwardListNodeM17194e.f46563c, forwardListNodeM17194e.m17191a(), mapNode2, forwardListNodeM17194e);
            ForwardListNode$$special$$inlined$shared$1 forwardListNode$$special$$inlined$shared$1 = forwardListNodeM17194e.f46561a;
            KProperty[] kPropertyArr = ForwardListNode.f46560e;
            forwardListNode$$special$$inlined$shared$1.setValue(forwardListNodeM17194e, kPropertyArr[0], forwardListNode);
            KProperty[] kPropertyArr2 = SharedForwardList.f46576c;
            KProperty property = kPropertyArr2[1];
            SharedForwardList$$special$$inlined$shared$2 sharedForwardList$$special$$inlined$shared$2 = sharedForwardList2.f46578b;
            sharedForwardList$$special$$inlined$shared$2.getClass();
            Intrinsics.m18599g(property, "property");
            sharedForwardList$$special$$inlined$shared$2.f46580a = forwardListNode;
            ForwardListNode forwardListNodeM17194e2 = sharedForwardList2.m17194e();
            Intrinsics.m18596d(forwardListNodeM17194e2);
            mapNode2.f46568a.setValue(mapNode2, MapNode.f46567d[0], forwardListNodeM17194e2);
            ForwardListNode forwardListNodeM17193c = sharedForwardList.m17193c();
            Intrinsics.m18596d(forwardListNodeM17193c);
            ForwardListNode forwardListNode2 = new ForwardListNode(forwardListNodeM17193c.f46563c, forwardListNodeM17193c.m17191a(), mapNode2, forwardListNodeM17193c);
            forwardListNodeM17193c.f46561a.setValue(forwardListNodeM17193c, kPropertyArr[0], forwardListNode2);
            if (Intrinsics.m18594b(sharedForwardList.m17193c(), sharedForwardList.m17194e())) {
                KProperty property2 = kPropertyArr2[1];
                SharedForwardList$$special$$inlined$shared$2 sharedForwardList$$special$$inlined$shared$22 = sharedForwardList.f46578b;
                sharedForwardList$$special$$inlined$shared$22.getClass();
                Intrinsics.m18599g(property2, "property");
                sharedForwardList$$special$$inlined$shared$22.f46580a = forwardListNode2;
            }
            ConcurrentMap.f46520f.incrementAndGet(ConcurrentMap.this);
            return null;
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$remove$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Value", "Key", "", "invoke", "()Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59461 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f46545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59461(Object obj) {
            super(0);
            this.f46545b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ForwardListIterator forwardListIterator;
            MapNode mapNode;
            ConcurrentMap concurrentMap = ConcurrentMap.this;
            Object obj = this.f46545b;
            KProperty[] kPropertyArr = ConcurrentMap.f46519d;
            SharedForwardList sharedForwardList = (SharedForwardList) concurrentMap.m17188e().f46581a.get(obj.hashCode() & (concurrentMap.m17188e().f46582b - 1));
            if (sharedForwardList != null) {
                Iterator it = sharedForwardList.iterator();
                do {
                    forwardListIterator = (ForwardListIterator) it;
                    if (forwardListIterator.hasNext()) {
                        mapNode = (MapNode) forwardListIterator.next();
                    }
                } while (!mapNode.f46570c.equals(obj));
                Object value = mapNode.getValue();
                ConcurrentMap.f46520f.decrementAndGet(concurrentMap);
                MapNode$$special$$inlined$shared$1 mapNode$$special$$inlined$shared$1 = mapNode.f46568a;
                KProperty[] kPropertyArr2 = MapNode.f46567d;
                ForwardListNode forwardListNode = (ForwardListNode) mapNode$$special$$inlined$shared$1.getValue(mapNode, kPropertyArr2[0]);
                Intrinsics.m18596d(forwardListNode);
                forwardListNode.m17192b();
                mapNode$$special$$inlined$shared$1.setValue(mapNode, kPropertyArr2[0], null);
                forwardListIterator.remove();
                return value;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.collections.ConcurrentMap$toString$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59471 extends Lambda implements Function0<String> {
        public C59471() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            StringBuilder sb = new StringBuilder("{");
            MutableMapEntries.C59511 c59511 = new MutableMapEntries.C59511(new MutableMapEntries(ConcurrentMap.this));
            int i = 0;
            while (c59511.f46575a.hasNext()) {
                Map.Entry<Object, Object> next = c59511.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.m18455s0();
                    throw null;
                }
                Map.Entry<Object, Object> entry = next;
                Object key = entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(key);
                sb2.append('=');
                sb2.append(value);
                sb.append(sb2.toString());
                if (i != ConcurrentMap.this._size - 1) {
                    sb.append(", ");
                }
                i = i2;
            }
            sb.append("}");
            String string = sb.toString();
            Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ConcurrentMap.class, "table", "getTable()Lio/ktor/util/collections/internal/SharedList;", 0);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f46519d = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(ConcurrentMap.class, "insertionOrder", "getInsertionOrder()Lio/ktor/util/collections/internal/SharedForwardList;", 0, reflectionFactory)};
        f46520f = AtomicIntegerFieldUpdater.newUpdater(ConcurrentMap.class, "_size");
    }

    public ConcurrentMap(Lock lock, int i, int i2) {
        lock = (i2 & 1) != 0 ? new Lock() : lock;
        i = (i2 & 2) != 0 ? 32 : i;
        this.f46523c = lock;
        SharedList sharedList = new SharedList(i);
        ConcurrentMap$$special$$inlined$shared$1 concurrentMap$$special$$inlined$shared$1 = new ConcurrentMap$$special$$inlined$shared$1();
        concurrentMap$$special$$inlined$shared$1.f46524a = sharedList;
        this.f46521a = concurrentMap$$special$$inlined$shared$1;
        SharedForwardList sharedForwardList = new SharedForwardList();
        ConcurrentMap$$special$$inlined$shared$2 concurrentMap$$special$$inlined$shared$2 = new ConcurrentMap$$special$$inlined$shared$2();
        concurrentMap$$special$$inlined$shared$2.f46525a = sharedForwardList;
        this.f46522b = concurrentMap$$special$$inlined$shared$2;
        this._size = 0;
    }

    /* JADX INFO: renamed from: c */
    public final Object m17187c(Object key, Function0 function0) {
        Intrinsics.m18599g(key, "key");
        return m17189f(new ConcurrentMap$computeIfAbsent$1(this, key, function0));
    }

    @Override // java.util.Map
    public final void clear() {
        m17189f(new C59401());
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj == null || get(obj) == null) ? false : true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null) {
            return ((Boolean) m17189f(new C59411(obj))).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final SharedList m17188e() {
        return (SharedList) this.f46521a.getValue(this, f46519d[0]);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new MutableMapEntries(this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return ((Boolean) m17189f(new C59421(obj))).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final Object m17189f(Function0 function0) {
        Lock lock = this.f46523c;
        try {
            lock.f46472a.lock();
            return function0.invoke();
        } finally {
            lock.m17171a();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            return m17189f(new C59431(obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ((Number) m17189f(new C59441())).intValue();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this._size == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new ConcurrentMapKeys(this);
    }

    @Override // java.util.Map
    public final Object put(Object key, Object value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        return m17189f(new C59451(key, value));
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.m18599g(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj != null) {
            return m17189f(new C59461(obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this._size;
    }

    public final String toString() {
        return (String) m17189f(new C59471());
    }

    @Override // java.util.Map
    public final Collection values() {
        return new ConcurrentMapValues(this);
    }
}
