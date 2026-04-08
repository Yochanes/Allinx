package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: androidx.media3.common.util.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1752e implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f25684a;

    public /* synthetic */ ThreadFactoryC1752e(String str) {
        this.f25684a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = Util.f25665a;
        return new Thread(runnable, this.f25684a);
    }
}
