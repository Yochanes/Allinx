package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: androidx.emoji2.text.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1637a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f24349a;

    public /* synthetic */ ThreadFactoryC1637a(String str) {
        this.f24349a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f24349a);
        thread.setPriority(10);
        return thread;
    }
}
