package androidx.core.view;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import android.view.ContentInfo;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.core.view.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1463a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m7972A(TrackChangeEvent.Builder builder, int i) {
        builder.setWidth(i);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m7973B(TrackChangeEvent.Builder builder, String str) {
        builder.setCodecName(str);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m7974C(TrackChangeEvent.Builder builder, int i) {
        builder.setHeight(i);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m7975D(TrackChangeEvent.Builder builder, int i) {
        builder.setChannelCount(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m7976a(SparseArray sparseArray) {
        return sparseArray.contentHashCode();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m7977b(ContentInfo contentInfo) {
        return contentInfo.getFlags();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NetworkEvent.Builder m7978c() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ NetworkEvent.Builder m7979d(NetworkEvent.Builder builder, int i) {
        return builder.setNetworkType(i);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ NetworkEvent.Builder m7980e(NetworkEvent.Builder builder, long j) {
        return builder.setTimeSinceCreatedMillis(j);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ NetworkEvent m7981f(NetworkEvent.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PlaybackErrorEvent.Builder m7982g() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m7983h(PlaybackErrorEvent.Builder builder, int i) {
        return builder.setErrorCode(i);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m7984i(PlaybackErrorEvent.Builder builder, long j) {
        return builder.setTimeSinceCreatedMillis(j);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m7985j(PlaybackErrorEvent.Builder builder, Exception exc) {
        return builder.setException(exc);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m7986k(PlaybackMetrics.Builder builder) {
        return builder.setPlayerName("AndroidXMedia3");
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m7987l(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ TrackChangeEvent.Builder m7988m(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ TrackChangeEvent m7989n(TrackChangeEvent.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m7990o(PlaybackMetrics.Builder builder, int i) {
        builder.setDrmType(i);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m7991p(TrackChangeEvent.Builder builder) {
        builder.setTrackState(1);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m7992q(TrackChangeEvent.Builder builder, int i) {
        builder.setTrackChangeReason(i);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m7993r(TrackChangeEvent.Builder builder, String str) {
        builder.setContainerMimeType(str);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m7994s(TelephonyManager telephonyManager, TelephonyCallback telephonyCallback) {
        telephonyManager.unregisterTelephonyCallback(telephonyCallback);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m7995t(TelephonyManager telephonyManager, Executor executor, TelephonyCallback telephonyCallback) {
        telephonyManager.registerTelephonyCallback(executor, telephonyCallback);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m7996u(SparseArray sparseArray, SparseArray sparseArray2) {
        return sparseArray.contentEquals(sparseArray2);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ int m7997v(ContentInfo contentInfo) {
        return contentInfo.getSource();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ PlaybackErrorEvent.Builder m7998w(PlaybackErrorEvent.Builder builder, int i) {
        return builder.setSubErrorCode(i);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m7999x(PlaybackMetrics.Builder builder) {
        return builder.setPlayerVersion("1.6.0");
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m8000y(TrackChangeEvent.Builder builder, int i) {
        builder.setBitrate(i);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m8001z(TrackChangeEvent.Builder builder, String str) {
        builder.setSampleMimeType(str);
    }
}
