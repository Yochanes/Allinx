package androidx.coordinatorlayout.widget;

import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class DirectedAcyclicGraph<T> {

    /* JADX INFO: renamed from: a */
    public final Pools.SimplePool f22932a = new Pools.SimplePool(10);

    /* JADX INFO: renamed from: b */
    public final SimpleArrayMap f22933b = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: c */
    public final ArrayList f22934c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashSet f22935d = new HashSet();

    /* JADX INFO: renamed from: a */
    public final void m7389a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f22933b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m7389a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
