package com.google.android.gms.dynamic;

import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zaa implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper.zac(this.zaa, lifecycleDelegate);
        Iterator it = DeferredLifecycleHelper.zab(this.zaa).iterator();
        while (it.hasNext()) {
            ((zah) it.next()).zab(DeferredLifecycleHelper.zaa(this.zaa));
        }
        DeferredLifecycleHelper.zab(this.zaa).clear();
        DeferredLifecycleHelper.zad(this.zaa, null);
    }
}
