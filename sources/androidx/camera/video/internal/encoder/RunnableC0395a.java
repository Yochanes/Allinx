package androidx.camera.video.internal.encoder;

import androidx.camera.core.Logger;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.camera.video.internal.encoder.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0395a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EncoderImpl f3481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f3483c;

    public /* synthetic */ RunnableC0395a(EncoderImpl encoderImpl, ArrayList arrayList, Runnable runnable) {
        this.f3481a = encoderImpl;
        this.f3482b = arrayList;
        this.f3483c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncoderImpl encoderImpl = this.f3481a;
        if (encoderImpl.f3464a != EncoderImpl.InternalState.f3471f) {
            if (this.f3482b.isEmpty()) {
                throw null;
            }
            Logger.m1280a(null, "encoded data and input buffers are returned");
            throw null;
        }
        this.f3483c.run();
        if (encoderImpl.f3464a != EncoderImpl.InternalState.f3470d) {
            encoderImpl.getClass();
            throw null;
        }
        encoderImpl.getClass();
        throw null;
    }
}
