package androidx.media3.exoplayer.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.Supplier;

/* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1844b implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f27049b;

    public /* synthetic */ C1844b(int i, int i2) {
        this.f27048a = i2;
        this.f27049b = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f27048a) {
            case 0:
                return new HandlerThread(AsynchronousMediaCodecAdapter.m10345q(this.f27049b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(AsynchronousMediaCodecAdapter.m10345q(this.f27049b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
