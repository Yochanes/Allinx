package androidx.core.view.accessibility;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.exoplayer.audio.ExecutorC1815k;

/* JADX INFO: renamed from: androidx.core.view.accessibility.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1464a {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m8037a(Spatializer spatializer) {
        return spatializer.getImmersiveAudioLevel();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Spatializer m8038b(AudioManager audioManager) {
        return audioManager.getSpatializer();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Spatializer m8039c(Object obj) {
        return (Spatializer) obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8040d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m8041e(AudioAttributes.Builder builder) {
        builder.setSpatializationBehavior(0);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m8042f(Spatializer spatializer, Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener) {
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m8043g(Spatializer spatializer, ExecutorC1815k executorC1815k, Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener) {
        spatializer.addOnSpatializerStateChangedListener(executorC1815k, spatializer$OnSpatializerStateChangedListener);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ boolean m8044h(Spatializer spatializer) {
        return spatializer.isAvailable();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m8045i(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8046j() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m8047k(Spatializer spatializer) {
        return spatializer.isEnabled();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8048l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
    }
}
