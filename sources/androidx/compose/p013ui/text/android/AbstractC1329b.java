package androidx.compose.p013ui.text.android;

import android.animation.AnimatorSet;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.IBinder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.Display;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.JobIntentService;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.ui.text.android.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1329b {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m6447A(Display display) {
        return display.isHdr();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m6448B(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isShowingHintText();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m6449C(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m6450D(JobInfo.Builder builder, boolean z2) {
        builder.setRequiresStorageNotLow(z2);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m6451a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ JobWorkItem m6452b(JobParameters jobParameters) {
        return jobParameters.dequeueWork();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ ComponentName m6453c(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Intent m6454d(JobWorkItem jobWorkItem) {
        return jobWorkItem.getIntent();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Bitmap.Config m6455e(BitmapFactory.Options options) {
        return options.outConfig;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AudioFocusRequest.Builder m6456f(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder m6457g(AudioFocusRequest.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAudioAttributes(audioAttributes);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder m6458h(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder m6459i(AudioFocusRequest.Builder builder, boolean z2) {
        return builder.setWillPauseWhenDucked(z2);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ AudioFocusRequest m6460j(AudioFocusRequest.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ AudioFocusRequest m6461k(Object obj) {
        return (AudioFocusRequest) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ IBinder m6462l(JobIntentService.JobServiceEngineImpl jobServiceEngineImpl) {
        return jobServiceEngineImpl.getBinder();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m6463m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ String m6464n(TextPaint textPaint) {
        return textPaint.getFontVariationSettings();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m6465o(AnimatorSet animatorSet, long j) {
        animatorSet.setCurrentPlayTime(j);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m6466p(JobInfo.Builder builder, boolean z2) {
        builder.setRequiresBatteryNotLow(z2);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m6467q(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        jobParameters.completeWork(jobWorkItem);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m6468r(BitmapFactory.Options options, ColorSpace colorSpace) {
        options.inPreferredColorSpace = colorSpace;
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m6469s(Paint paint) {
        paint.setFontVariationSettings(null);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m6470t(Paint paint, String str) {
        paint.setFontVariationSettings(str);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m6471u(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m6472v(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setHintText(str);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m6473w(AccessibilityNodeInfo accessibilityNodeInfo, ArrayList arrayList) {
        accessibilityNodeInfo.setAvailableExtraData(arrayList);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m6474x(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setShowingHintText(z2);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m6475y(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m6476z(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }
}
