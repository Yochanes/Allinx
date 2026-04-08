package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.work.impl.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2276a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Processor f32785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WorkGenerationalId f32786b;

    public /* synthetic */ RunnableC2276a(Processor processor, WorkGenerationalId workGenerationalId) {
        this.f32785a = processor;
        this.f32786b = workGenerationalId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Processor processor = this.f32785a;
        WorkGenerationalId workGenerationalId = this.f32786b;
        synchronized (processor.f32688k) {
            try {
                Iterator it = processor.f32687j.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).mo12116b(workGenerationalId, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
