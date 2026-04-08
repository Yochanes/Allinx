package androidx.compose.p013ui.text.android;

import android.app.job.JobInfo;
import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.ProfilingManager;
import android.text.StaticLayout;
import androidx.core.os.AbstractC1438a;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.compose.ui.text.android.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1330c {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ LoudnessCodecController m6477a(int i, Executor executor, LoudnessCodecController$OnLoudnessCodecUpdateListener loudnessCodecController$OnLoudnessCodecUpdateListener) {
        return LoudnessCodecController.create(i, executor, loudnessCodecController$OnLoudnessCodecUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Class m6478b() {
        return ProfilingManager.class;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m6479c(JobInfo.Builder builder, String str) {
        builder.setTraceTag(str);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m6480d(LoudnessCodecController loudnessCodecController) {
        loudnessCodecController.close();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m6481e(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m6482f(MediaCodec mediaCodec) {
        mediaCodec.detachOutputSurface();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m6483g(ProfilingManager profilingManager, AbstractC1438a abstractC1438a) {
        profilingManager.unregisterForAllProfilingResults(abstractC1438a);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m6484h(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m6485i(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        return loudnessCodecController.addMediaCodec(mediaCodec);
    }
}
