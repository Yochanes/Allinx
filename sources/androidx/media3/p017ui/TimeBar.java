package androidx.media3.p017ui;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface TimeBar {

    /* JADX INFO: compiled from: Proguard */
    public interface OnScrubListener {
        /* JADX INFO: renamed from: K */
        void mo11113K(long j);

        /* JADX INFO: renamed from: L */
        void mo11114L(long j);

        /* JADX INFO: renamed from: M */
        void mo11115M(long j, boolean z2);
    }

    /* JADX INFO: renamed from: a */
    void mo11097a(OnScrubListener onScrubListener);

    /* JADX INFO: renamed from: b */
    void mo11098b(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z2);

    void setPosition(long j);
}
