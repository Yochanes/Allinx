package androidx.core.text.util;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Messenger;
import android.os.Process;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.sessions.SessionLifecycleService;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.text.util.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1451a {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m7676a() {
        return DateFormat.HourCycle.HOUR_CYCLE_11.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ DateFormat.HourCycle m7677b() {
        return DateFormat.HourCycle.HOUR_CYCLE_11;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m7678c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m7679d(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Object m7680e(Intent intent) {
        return intent.getParcelableExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, Messenger.class);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ String m7681f() {
        return Process.myProcessName();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ List m7682g(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getAudioDevicesForAttributes(audioAttributes);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m7683h(OnBackInvokedDispatcher onBackInvokedDispatcher, int i, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(i, onBackInvokedCallback);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ int m7684i() {
        return DateFormat.HourCycle.HOUR_CYCLE_12.ordinal();
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DateFormat.HourCycle m7685j() {
        return DateFormat.HourCycle.HOUR_CYCLE_12;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ List m7686k(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getDirectProfilesForAttributes(audioAttributes);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ int m7687l() {
        return DateFormat.HourCycle.HOUR_CYCLE_23.ordinal();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ DateFormat.HourCycle m7688m() {
        return DateFormat.HourCycle.HOUR_CYCLE_23;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ int m7689n() {
        return DateFormat.HourCycle.HOUR_CYCLE_24.ordinal();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ DateFormat.HourCycle m7690o() {
        return DateFormat.HourCycle.HOUR_CYCLE_24;
    }
}
