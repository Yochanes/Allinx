package androidx.media3.exoplayer.analytics;

import android.app.job.JobInfo;
import android.graphics.ImageDecoder;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.net.NetworkRequest;
import android.os.StrictMode;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.view.AttachedSurfaceControl;
import android.view.RoundedCorner;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.WindowInsets;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.o */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1797o {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m10180a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m10181b(AudioProfile audioProfile) {
        return audioProfile.getEncapsulationType();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m10182c(RoundedCorner roundedCorner) {
        return roundedCorner.getRadius();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m10183d(byte[] bArr) {
        return ImageDecoder.createSource(bArr);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AudioProfile m10184e(Object obj) {
        return (AudioProfile) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m10185f(MediaDrm mediaDrm, byte[] bArr) {
        return mediaDrm.getPlaybackComponent(bArr);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m10186g(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ LogSessionId m10187h() {
        return LogSessionId.LOG_SESSION_ID_NONE;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ StrictMode.VmPolicy.Builder m10188i(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ Vibrator m10189j(VibratorManager vibratorManager) {
        return vibratorManager.getDefaultVibrator();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ VibratorManager m10190k(Object obj) {
        return (VibratorManager) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ AttachedSurfaceControl m10191l(SurfaceView surfaceView) {
        return surfaceView.getRootSurfaceControl();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ RoundedCorner m10192m(WindowInsets windowInsets) {
        return windowInsets.getRoundedCorner(0);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ RoundedCorner m10193n(WindowInsets windowInsets, int i) {
        return windowInsets.getRoundedCorner(i);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ String m10194o(LogSessionId logSessionId) {
        return logSessionId.getStringId();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m10195p(JobInfo.Builder builder) {
        builder.setExpedited(true);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m10196q(AudioTrack audioTrack, LogSessionId logSessionId) {
        audioTrack.setLogSessionId(logSessionId);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m10197r(MediaDrm.PlaybackComponent playbackComponent, LogSessionId logSessionId) {
        playbackComponent.setLogSessionId(logSessionId);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m10198s(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl.Transaction transaction) {
        attachedSurfaceControl.applyTransactionOnDraw(transaction);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m10199t(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m10200u(LogSessionId logSessionId) {
        return logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ int[] m10201v(AudioProfile audioProfile) {
        return audioProfile.getChannelMasks();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int[] m10202w(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ int m10203x(AudioProfile audioProfile) {
        return audioProfile.getFormat();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ RoundedCorner m10204y(WindowInsets windowInsets) {
        return windowInsets.getRoundedCorner(1);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int[] m10205z(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }
}
