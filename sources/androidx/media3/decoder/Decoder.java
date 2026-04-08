package androidx.media3.decoder;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Decoder<I, O, E extends DecoderException> {
    /* JADX INFO: renamed from: a */
    Object mo9737a();

    /* JADX INFO: renamed from: b */
    void mo9738b(Object obj);

    /* JADX INFO: renamed from: c */
    void mo9739c(long j);

    /* JADX INFO: renamed from: e */
    Object mo9740e();

    void flush();

    String getName();

    void release();
}
