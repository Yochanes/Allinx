package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {

    /* JADX INFO: renamed from: f */
    public Bitmap f26867f;

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    /* JADX INFO: renamed from: h */
    public final void mo9745h() {
        this.f26867f = null;
        super.mo9745h();
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    /* JADX INFO: renamed from: i */
    public void mo9746i() {
        mo9745h();
    }
}
