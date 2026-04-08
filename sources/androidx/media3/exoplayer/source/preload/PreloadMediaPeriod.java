package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class PreloadMediaPeriod implements MediaPeriod {

    /* JADX INFO: renamed from: a */
    public final MediaPeriod f27511a;

    /* JADX INFO: renamed from: b */
    public boolean f27512b;

    /* JADX INFO: renamed from: c */
    public boolean f27513c;

    /* JADX INFO: renamed from: d */
    public MediaPeriod.Callback f27514d;

    /* JADX INFO: renamed from: f */
    public PreloadTrackSelectionHolder f27515f;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.source.preload.PreloadMediaPeriod$1 */
    /* JADX INFO: compiled from: Proguard */
    class C18971 implements MediaPeriod.Callback {
        public C18971() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        /* JADX INFO: renamed from: b */
        public final void mo9903b(MediaPeriod mediaPeriod) {
            PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
            preloadMediaPeriod.f27512b = true;
            MediaPeriod.Callback callback = preloadMediaPeriod.f27514d;
            callback.getClass();
            callback.mo9903b(preloadMediaPeriod);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: d */
        public final void mo9907d(SequenceableLoader sequenceableLoader) {
            PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
            MediaPeriod.Callback callback = preloadMediaPeriod.f27514d;
            callback.getClass();
            callback.mo9907d(preloadMediaPeriod);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PreloadTrackSelectionHolder {
    }

    public PreloadMediaPeriod(MediaPeriod mediaPeriod) {
        this.f27511a = mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: c */
    public final boolean mo10464c(LoadingInfo loadingInfo) {
        return this.f27511a.mo10464c(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public final long mo10465e() {
        return this.f27511a.mo10465e();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: f */
    public final void mo10466f() {
        this.f27511a.mo10466f();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: g */
    public final long mo10467g(long j, SeekParameters seekParameters) {
        return this.f27511a.mo10467g(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: i */
    public final long mo10468i(long j) {
        return this.f27511a.mo10468i(j);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.f27511a.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: k */
    public final long mo10469k(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        if (this.f27515f == null) {
            return this.f27511a.mo10469k(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }
        int length = sampleStreamArr.length;
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: m */
    public final long mo10470m() {
        return this.f27511a.mo10470m();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: o */
    public final void mo10471o(MediaPeriod.Callback callback, long j) {
        this.f27514d = callback;
        if (this.f27512b) {
            callback.mo9903b(this);
        } else {
            if (this.f27513c) {
                return;
            }
            this.f27513c = true;
            this.f27511a.mo10471o(new C18971(), j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: p */
    public final TrackGroupArray mo10472p() {
        return this.f27511a.mo10472p();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: r */
    public final long mo10473r() {
        return this.f27511a.mo10473r();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: s */
    public final void mo10474s(long j, boolean z2) {
        this.f27511a.mo10474s(j, z2);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: t */
    public final void mo10475t(long j) {
        this.f27511a.mo10475t(j);
    }
}
