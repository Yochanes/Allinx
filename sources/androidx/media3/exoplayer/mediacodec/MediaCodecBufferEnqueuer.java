package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface MediaCodecBufferEnqueuer {
    /* JADX INFO: renamed from: a */
    void mo10364a(int i, CryptoInfo cryptoInfo, long j, int i2);

    /* JADX INFO: renamed from: b */
    void mo10365b(Bundle bundle);

    /* JADX INFO: renamed from: c */
    void mo10366c(int i, int i2, int i3, long j);

    /* JADX INFO: renamed from: d */
    void mo10367d();

    void flush();

    void shutdown();

    void start();
}
