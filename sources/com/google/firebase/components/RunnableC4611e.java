package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.components.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4611e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42752c;

    public /* synthetic */ RunnableC4611e(int i, Object obj, Object obj2) {
        this.f42750a = i;
        this.f42752c = obj;
        this.f42751b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42750a) {
            case 0:
                ComponentRuntime.m15114b((OptionalProvider) this.f42752c, (Provider) this.f42751b);
                break;
            case 1:
                ComponentRuntime.m15116d((LazySet) this.f42752c, (Provider) this.f42751b);
                break;
            default:
                EventBus.m15118a((Map.Entry) this.f42752c, (Event) this.f42751b);
                break;
        }
    }
}
