package androidx.databinding;

import androidx.collection.ArrayMap;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableArrayMap<K, V> extends ArrayMap<K, V> implements ObservableMap<K, V> {
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    /* JADX INFO: renamed from: k */
    public final Object mo2129k(int i) {
        m2128j(i);
        return super.mo2129k(i);
    }

    @Override // androidx.collection.SimpleArrayMap
    /* JADX INFO: renamed from: l */
    public final Object mo2130l(int i, Object obj) {
        m2128j(i);
        return super.mo2130l(i, obj);
    }

    @Override // androidx.collection.ArrayMap
    /* JADX INFO: renamed from: o */
    public final boolean mo1976o(Collection collection) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            int iM2126g = m2126g(it.next());
            if (iM2126g >= 0) {
                mo2129k(iM2126g);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // androidx.collection.ArrayMap
    /* JADX INFO: renamed from: p */
    public final boolean mo1977p(Collection collection) {
        boolean z2 = false;
        for (int i = this.f3884c - 1; i >= 0; i--) {
            if (!collection.contains(m2128j(i))) {
                mo2129k(i);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return obj2;
    }
}
