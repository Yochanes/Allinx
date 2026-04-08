package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaClock {
    /* JADX INFO: renamed from: d */
    void mo9813d(PlaybackParameters playbackParameters);

    /* JADX INFO: renamed from: e */
    PlaybackParameters mo9814e();

    /* JADX INFO: renamed from: s */
    long mo9815s();

    /* JADX INFO: renamed from: u */
    default boolean mo9816u() {
        return false;
    }
}
