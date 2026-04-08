package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class AdaptiveTrackSelection extends BaseTrackSelection {

    /* JADX INFO: renamed from: f */
    public final BandwidthMeter f27552f;

    /* JADX INFO: compiled from: Proguard */
    public static final class AdaptationCheckpoint {

        /* JADX INFO: renamed from: a */
        public final long f27553a;

        /* JADX INFO: renamed from: b */
        public final long f27554b;

        public AdaptationCheckpoint(long j, long j2) {
            this.f27553a = j;
            this.f27554b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.f27553a == adaptationCheckpoint.f27553a && this.f27554b == adaptationCheckpoint.f27554b;
        }

        public final int hashCode() {
            return (((int) this.f27553a) * 31) + ((int) this.f27554b);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Factory implements ExoTrackSelection.Factory {
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j, long j2, ImmutableList immutableList) {
        super(trackGroup, iArr);
        if (j2 < j) {
            Log.m9511g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f27552f = bandwidthMeter;
        ImmutableList.copyOf((Collection) immutableList);
    }

    /* JADX INFO: renamed from: n */
    public static void m10635n(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i);
            if (builder != null) {
                builder.add(new AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: b */
    public final int mo10438b() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: c */
    public final void mo10521c() {
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: f */
    public final void mo10524f() {
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: j */
    public final void mo10528j(float f) {
    }
}
