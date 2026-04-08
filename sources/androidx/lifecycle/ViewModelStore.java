package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class ViewModelStore {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f25011a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m9179a() {
        LinkedHashMap linkedHashMap = this.f25011a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
