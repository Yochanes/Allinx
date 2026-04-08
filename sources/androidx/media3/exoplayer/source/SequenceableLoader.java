package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface SequenceableLoader {

    /* JADX INFO: compiled from: Proguard */
    public interface Callback<T extends SequenceableLoader> {
        /* JADX INFO: renamed from: d */
        void mo9907d(SequenceableLoader sequenceableLoader);
    }

    /* JADX INFO: renamed from: c */
    boolean mo10464c(LoadingInfo loadingInfo);

    /* JADX INFO: renamed from: e */
    long mo10465e();

    boolean isLoading();

    /* JADX INFO: renamed from: r */
    long mo10473r();

    /* JADX INFO: renamed from: t */
    void mo10475t(long j);
}
