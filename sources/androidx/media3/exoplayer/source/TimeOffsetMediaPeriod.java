package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    /* JADX INFO: renamed from: a */
    public final MediaPeriod f27444a;

    /* JADX INFO: renamed from: b */
    public final long f27445b;

    /* JADX INFO: renamed from: c */
    public MediaPeriod.Callback f27446c;

    /* JADX INFO: compiled from: Proguard */
    public static final class TimeOffsetSampleStream implements SampleStream {

        /* JADX INFO: renamed from: a */
        public final SampleStream f27447a;

        /* JADX INFO: renamed from: b */
        public final long f27448b;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j) {
            this.f27447a = sampleStream;
            this.f27448b = j;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: a */
        public final boolean mo10476a() {
            return this.f27447a.mo10476a();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: h */
        public final void mo10477h() {
            this.f27447a.mo10477h();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: j */
        public final int mo10478j(long j) {
            return this.f27447a.mo10478j(j - this.f27448b);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        /* JADX INFO: renamed from: n */
        public final int mo10479n(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            int iMo10479n = this.f27447a.mo10479n(formatHolder, decoderInputBuffer, i);
            if (iMo10479n == -4) {
                decoderInputBuffer.f25938g += this.f27448b;
            }
            return iMo10479n;
        }
    }

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
        this.f27444a = mediaPeriod;
        this.f27445b = j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    /* JADX INFO: renamed from: b */
    public final void mo9903b(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.f27446c;
        callback.getClass();
        callback.mo9903b(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: c */
    public final boolean mo10464c(LoadingInfo loadingInfo) {
        LoadingInfo.Builder builder = new LoadingInfo.Builder();
        builder.f26229b = loadingInfo.f26226b;
        builder.f26230c = loadingInfo.f26227c;
        builder.f26228a = loadingInfo.f26225a - this.f27445b;
        return this.f27444a.mo10464c(new LoadingInfo(builder));
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: d */
    public final void mo9907d(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.f27446c;
        callback.getClass();
        callback.mo9907d(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public final long mo10465e() {
        long jMo10465e = this.f27444a.mo10465e();
        if (jMo10465e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo10465e + this.f27445b;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: f */
    public final void mo10466f() {
        this.f27444a.mo10466f();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: g */
    public final long mo10467g(long j, SeekParameters seekParameters) {
        long j2 = this.f27445b;
        return this.f27444a.mo10467g(j - j2, seekParameters) + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: i */
    public final long mo10468i(long j) {
        long j2 = this.f27445b;
        return this.f27444a.mo10468i(j - j2) + j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.f27444a.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: k */
    public final long mo10469k(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i];
            if (timeOffsetSampleStream != null) {
                sampleStream = timeOffsetSampleStream.f27447a;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        long j2 = this.f27445b;
        long jMo10469k = this.f27444a.mo10469k(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
            SampleStream sampleStream2 = sampleStreamArr2[i2];
            if (sampleStream2 == null) {
                sampleStreamArr[i2] = null;
            } else {
                SampleStream sampleStream3 = sampleStreamArr[i2];
                if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).f27447a != sampleStream2) {
                    sampleStreamArr[i2] = new TimeOffsetSampleStream(sampleStream2, j2);
                }
            }
        }
        return jMo10469k + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: m */
    public final long mo10470m() {
        long jMo10470m = this.f27444a.mo10470m();
        if (jMo10470m == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo10470m + this.f27445b;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: o */
    public final void mo10471o(MediaPeriod.Callback callback, long j) {
        this.f27446c = callback;
        this.f27444a.mo10471o(this, j - this.f27445b);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: p */
    public final TrackGroupArray mo10472p() {
        return this.f27444a.mo10472p();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: r */
    public final long mo10473r() {
        long jMo10473r = this.f27444a.mo10473r();
        if (jMo10473r == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo10473r + this.f27445b;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /* JADX INFO: renamed from: s */
    public final void mo10474s(long j, boolean z2) {
        this.f27444a.mo10474s(j - this.f27445b, z2);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    /* JADX INFO: renamed from: t */
    public final void mo10475t(long j) {
        this.f27444a.mo10475t(j - this.f27445b);
    }
}
