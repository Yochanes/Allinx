package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1796n {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m10150A(PlaybackMetrics.Builder builder, long j) {
        builder.setMediaDurationMillis(j);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m10151B(PlaybackMetrics.Builder builder, int i) {
        builder.setStreamSource(i);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m10152C(PlaybackMetrics.Builder builder, int i) {
        builder.setStreamType(i);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m10153D(PlaybackMetrics.Builder builder, int i) {
        builder.setPlaybackType(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ LogSessionId m10154a(PlaybackSession playbackSession) {
        return playbackSession.getSessionId();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m10155b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ PlaybackErrorEvent m10156c(PlaybackErrorEvent.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PlaybackMetrics.Builder m10157d() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ PlaybackMetrics m10158e(PlaybackMetrics.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ PlaybackSession m10159f(MediaMetricsManager mediaMetricsManager) {
        return mediaMetricsManager.createPlaybackSession();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PlaybackStateEvent.Builder m10160g() {
        return new PlaybackStateEvent.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder m10161h(PlaybackStateEvent.Builder builder, int i) {
        return builder.setState(i);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ PlaybackStateEvent.Builder m10162i(PlaybackStateEvent.Builder builder, long j) {
        return builder.setTimeSinceCreatedMillis(j);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ PlaybackStateEvent m10163j(PlaybackStateEvent.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ TrackChangeEvent.Builder m10164k(TrackChangeEvent.Builder builder, long j) {
        return builder.setTimeSinceCreatedMillis(j);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m10165l(PlaybackMetrics.Builder builder, int i) {
        builder.setAudioUnderrunCount(i);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m10166m(PlaybackMetrics.Builder builder, long j) {
        builder.setNetworkTransferDurationMillis(j);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m10167n(PlaybackSession playbackSession, NetworkEvent networkEvent) {
        playbackSession.reportNetworkEvent(networkEvent);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m10168o(PlaybackSession playbackSession, PlaybackErrorEvent playbackErrorEvent) {
        playbackSession.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m10169p(PlaybackSession playbackSession, PlaybackMetrics playbackMetrics) {
        playbackSession.reportPlaybackMetrics(playbackMetrics);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m10170q(PlaybackSession playbackSession, PlaybackStateEvent playbackStateEvent) {
        playbackSession.reportPlaybackStateEvent(playbackStateEvent);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m10171r(PlaybackSession playbackSession, TrackChangeEvent trackChangeEvent) {
        playbackSession.reportTrackChangeEvent(trackChangeEvent);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m10172s(TrackChangeEvent.Builder builder) {
        builder.setTrackState(0);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m10173t(TrackChangeEvent.Builder builder, float f) {
        builder.setVideoFrameRate(f);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m10174u(TrackChangeEvent.Builder builder, int i) {
        builder.setAudioSampleRate(i);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m10175v(TrackChangeEvent.Builder builder, String str) {
        builder.setLanguage(str);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m10176w(PlaybackMetrics.Builder builder, int i) {
        builder.setVideoFramesDropped(i);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m10177x(PlaybackMetrics.Builder builder, long j) {
        builder.setNetworkBytesRead(j);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m10178y(TrackChangeEvent.Builder builder, String str) {
        builder.setLanguageRegion(str);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m10179z(PlaybackMetrics.Builder builder, int i) {
        builder.setVideoFramesPlayed(i);
    }
}
