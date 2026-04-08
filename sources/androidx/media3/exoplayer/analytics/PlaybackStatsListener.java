package androidx.media3.exoplayer.analytics;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PlaybackStatsTracker {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: H */
    public final void mo10083H(Player player, AnalyticsListener.Events events) {
        FlagSet flagSet = events.f26373a;
        if (flagSet.f25130a.size() == 0) {
            return;
        }
        if (flagSet.f25130a.size() <= 0) {
            throw null;
        }
        int iM9244a = flagSet.m9244a(0);
        events.m10120b(iM9244a);
        if (iM9244a != 0 && iM9244a != 11) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: z */
    public final void mo10118z(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener.EventTime eventTime) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: D */
    public final void mo10079D(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: F */
    public final void mo10081F(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: G */
    public final void mo10082G(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: p */
    public final void mo10108p(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: B */
    public final void mo10077B(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /* JADX INFO: renamed from: o */
    public final void mo10107o(int i, long j, AnalyticsListener.EventTime eventTime) {
    }
}
