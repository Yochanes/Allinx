package androidx.media3.common.util;

import androidx.media3.common.util.ListenerSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: androidx.media3.common.util.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1748a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CopyOnWriteArraySet f25676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f25677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ListenerSet.Event f25678c;

    public /* synthetic */ RunnableC1748a(CopyOnWriteArraySet copyOnWriteArraySet, int i, ListenerSet.Event event) {
        this.f25676a = copyOnWriteArraySet;
        this.f25677b = i;
        this.f25678c = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (ListenerSet.ListenerHolder listenerHolder : this.f25676a) {
            if (!listenerHolder.f25616d) {
                int i = this.f25677b;
                if (i != -1) {
                    listenerHolder.f25614b.m9245a(i);
                }
                listenerHolder.f25615c = true;
                this.f25678c.invoke(listenerHolder.f25613a);
            }
        }
    }
}
