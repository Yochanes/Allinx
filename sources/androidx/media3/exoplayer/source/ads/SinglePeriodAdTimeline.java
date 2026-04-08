package androidx.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ForwardingTimeline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
@UnstableApi
public final class SinglePeriodAdTimeline extends ForwardingTimeline {

    /* JADX INFO: renamed from: c */
    public final AdPlaybackState f27469c;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.m9464e(timeline.mo9356h() == 1);
        Assertions.m9464e(timeline.mo9359o() == 1);
        this.f27469c = adPlaybackState;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    /* JADX INFO: renamed from: f */
    public final Timeline.Period mo9354f(int i, Timeline.Period period, boolean z2) {
        long j;
        this.f27190b.mo9354f(i, period, z2);
        long j2 = period.f25344d;
        if (j2 == -9223372036854775807L) {
            this.f27469c.getClass();
            j = -9223372036854775807L;
        } else {
            j = j2;
        }
        period.m9376h(period.f25341a, period.f25342b, period.f25343c, j, period.f25345e, this.f27469c, period.f25346f);
        return period;
    }
}
