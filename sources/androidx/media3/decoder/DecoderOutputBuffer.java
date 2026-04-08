package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class DecoderOutputBuffer extends Buffer {

    /* JADX INFO: renamed from: b */
    public long f25941b;

    /* JADX INFO: renamed from: c */
    public int f25942c;

    /* JADX INFO: renamed from: d */
    public boolean f25943d;

    /* JADX INFO: compiled from: Proguard */
    public interface Owner<S extends DecoderOutputBuffer> {
    }

    /* JADX INFO: renamed from: h */
    public void mo9745h() {
        this.f25921a = 0;
        this.f25941b = 0L;
        this.f25942c = 0;
        this.f25943d = false;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo9746i();
}
