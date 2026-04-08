package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaPeriod extends SequenceableLoader {

    /* JADX INFO: compiled from: Proguard */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        /* JADX INFO: renamed from: b */
        void mo9903b(MediaPeriod mediaPeriod);
    }

    /* JADX INFO: renamed from: f */
    void mo10466f();

    /* JADX INFO: renamed from: g */
    long mo10467g(long j, SeekParameters seekParameters);

    /* JADX INFO: renamed from: i */
    long mo10468i(long j);

    /* JADX INFO: renamed from: k */
    long mo10469k(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    /* JADX INFO: renamed from: m */
    long mo10470m();

    /* JADX INFO: renamed from: o */
    void mo10471o(Callback callback, long j);

    /* JADX INFO: renamed from: p */
    TrackGroupArray mo10472p();

    /* JADX INFO: renamed from: s */
    void mo10474s(long j, boolean z2);
}
