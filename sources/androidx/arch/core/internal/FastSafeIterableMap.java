package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LifecycleObserver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* JADX INFO: renamed from: f */
    public final HashMap f1506f = new HashMap();

    @Override // androidx.arch.core.internal.SafeIterableMap
    /* JADX INFO: renamed from: a */
    public final SafeIterableMap.Entry mo806a(Object obj) {
        return (SafeIterableMap.Entry) this.f1506f.get(obj);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    /* JADX INFO: renamed from: c */
    public final Object mo807c(Object obj, Object obj2) {
        SafeIterableMap.Entry entryMo806a = mo806a(obj);
        if (entryMo806a != null) {
            return entryMo806a.f1512b;
        }
        HashMap map = this.f1506f;
        SafeIterableMap.Entry entry = new SafeIterableMap.Entry(obj, obj2);
        this.f1510d++;
        SafeIterableMap.Entry entry2 = this.f1508b;
        if (entry2 == null) {
            this.f1507a = entry;
            this.f1508b = entry;
        } else {
            entry2.f1513c = entry;
            entry.f1514d = entry2;
            this.f1508b = entry;
        }
        map.put(obj, entry);
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    /* JADX INFO: renamed from: d */
    public final Object mo808d(Object obj) {
        Object objMo808d = super.mo808d(obj);
        this.f1506f.remove(obj);
        return objMo808d;
    }

    /* JADX INFO: renamed from: e */
    public final Map.Entry m809e(LifecycleObserver lifecycleObserver) {
        HashMap map = this.f1506f;
        if (map.containsKey(lifecycleObserver)) {
            return ((SafeIterableMap.Entry) map.get(lifecycleObserver)).f1514d;
        }
        return null;
    }
}
