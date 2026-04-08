package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1845c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AsynchronousMediaCodecCallback f27050a;

    public /* synthetic */ RunnableC1845c(AsynchronousMediaCodecCallback asynchronousMediaCodecCallback) {
        this.f27050a = asynchronousMediaCodecCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f27050a;
        synchronized (asynchronousMediaCodecCallback.f26922a) {
            try {
                if (asynchronousMediaCodecCallback.f26934m) {
                    return;
                }
                long j = asynchronousMediaCodecCallback.f26933l - 1;
                asynchronousMediaCodecCallback.f26933l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    asynchronousMediaCodecCallback.m10368a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (asynchronousMediaCodecCallback.f26922a) {
                    asynchronousMediaCodecCallback.f26935n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
