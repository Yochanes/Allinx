package androidx.databinding;

import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {

    /* JADX INFO: renamed from: androidx.databinding.ListChangeRegistry$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14881 extends CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ListChanges {
    }

    static {
        new Pools.SynchronizedPool(10);
    }
}
