package kotlin.concurrent;

import com.geetest.captcha.GTCaptcha4Holder;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/concurrent/ThreadsKt$thread$thread$1", "Ljava/lang/Thread;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ThreadsKt$thread$thread$1 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GTCaptcha4Holder.a f51572a;

    public ThreadsKt$thread$thread$1(GTCaptcha4Holder.a aVar) {
        this.f51572a = aVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f51572a.invoke();
    }
}
