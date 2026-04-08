package androidx.constraintlayout.widget;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SharedValues {

    /* JADX INFO: renamed from: a */
    public HashMap f22895a;

    /* JADX INFO: compiled from: Proguard */
    public interface SharedValuesListener {
    }

    /* JADX INFO: renamed from: a */
    public final void m7373a(int i, SharedValuesListener sharedValuesListener) {
        HashMap map = this.f22895a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(sharedValuesListener));
    }
}
