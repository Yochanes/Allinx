package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a */
        public final KClass f55017a;

        /* JADX INFO: renamed from: b */
        public final int f55018b;

        public AbstractArrayMapAccessor(KClass kClass, int i) {
            this.f55017a = kClass;
            this.f55018b = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract ArrayMap mo20322c();

    public final boolean isEmpty() {
        return ((AttributeArrayOwner) this).f55023a.mo20323c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return mo20322c().iterator();
    }
}
