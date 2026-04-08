package androidx.core.view;

import android.app.Activity;
import android.graphics.Insets;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.ReportFragment;
import androidx.media3.exoplayer.audio.ExecutorC1815k;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.view.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1477j {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8126A() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m8127B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8128C() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m8129D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m8130a(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("caption-service-number", -1);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Insets m8131b(WindowInsets windowInsets) {
        return windowInsets.getMandatorySystemGestureInsets();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m8132c() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m8133d(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m8134e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ WindowInsets m8135f(WindowInsets windowInsets, int i, int i2, int i3, int i4) {
        return windowInsets.inset(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8136g() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ List m8137h(MediaCodecInfo.VideoCapabilities videoCapabilities) {
        return videoCapabilities.getSupportedPerformancePoints();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m8138i() {
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m8139j(Activity activity, ReportFragment.LifecycleCallbacks lifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(lifecycleCallbacks);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m8140k(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m8141l(AudioTrack.Builder builder, boolean z2) {
        builder.setOffloadedPlayback(z2);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m8142m(AudioTrack audioTrack) {
        audioTrack.setOffloadEndOfStream();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m8143n(AudioTrack audioTrack, int i, int i2) {
        audioTrack.setOffloadDelayPadding(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m8144o(AudioTrack audioTrack, AudioTrack$StreamEventCallback audioTrack$StreamEventCallback) {
        audioTrack.unregisterStreamEventCallback(audioTrack$StreamEventCallback);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m8145p(AudioTrack audioTrack, ExecutorC1815k executorC1815k, AudioTrack$StreamEventCallback audioTrack$StreamEventCallback) {
        audioTrack.registerStreamEventCallback(executorC1815k, audioTrack$StreamEventCallback);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m8146q(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioTrack.isDirectPlaybackSupported(audioFormat, audioAttributes);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m8147r(AudioTrack audioTrack) {
        return audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m8148s(MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint2) {
        return performancePoint.covers(performancePoint2);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m8149t(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m8150u(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("bitrate", -1);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ Insets m8151v(WindowInsets windowInsets) {
        return windowInsets.getSystemGestureInsets();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8152w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m8153x(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m8154y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m8155z(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("channel-count", -1);
    }
}
