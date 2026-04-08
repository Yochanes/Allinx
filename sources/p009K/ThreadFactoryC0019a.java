package p009K;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC0019a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f28a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f29b;

    public /* synthetic */ ThreadFactoryC0019a(String str, boolean z2) {
        this.f28a = str;
        this.f29b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte[] bArr = Util.f57274a;
        String name = this.f28a;
        Intrinsics.m18599g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f29b);
        return thread;
    }
}
