package androidx.media3.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.media.DrmInitData;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$SeekableInputReader;
import android.media.RouteDiscoveryPreference;
import android.os.IBinder;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyDisplayInfo;
import android.util.Pair;
import android.view.Surface;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: androidx.media3.common.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1740a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m9400A(MediaParser.SeekMap seekMap) {
        return seekMap.isSeekable();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m9401B(MediaParser mediaParser, MediaParser$SeekableInputReader mediaParser$SeekableInputReader) {
        return mediaParser.advance(mediaParser$SeekableInputReader);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m9402C() {
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ long m9403D(MediaParser.SeekPoint seekPoint) {
        return seekPoint.timeMicros;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m9404a() {
        return IBinder.getSuggestedMaxIpcSizeBytes();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m9405b(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m9406c(android.media.DrmInitData drmInitData) {
        return drmInitData.getSchemeInitDataCount();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ int m9407d(MediaParser$InputReader mediaParser$InputReader, byte[] bArr, int i, int i2) {
        return mediaParser$InputReader.read(bArr, i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ int m9408e(TelephonyDisplayInfo telephonyDisplayInfo) {
        return telephonyDisplayInfo.getOverrideNetworkType();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ long m9409f(MediaParser$InputReader mediaParser$InputReader) {
        return mediaParser$InputReader.getLength();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ long m9410g(MediaParser.SeekMap seekMap) {
        return seekMap.getDurationMicros();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ long m9411h(MediaParser.SeekPoint seekPoint) {
        return seekPoint.position;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m9412i(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DrmInitData.SchemeInitData m9413j(android.media.DrmInitData drmInitData, int i) {
        return drmInitData.getSchemeInitDataAt(i);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ android.media.DrmInitData m9414k(MediaParser.TrackData trackData) {
        return trackData.drmInitData;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ MediaFormat m9415l(MediaParser.TrackData trackData) {
        return trackData.mediaFormat;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ MediaParser$InputReader m9416m(Object obj) {
        return (MediaParser$InputReader) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m9417n() {
        return MediaParser.SeekPoint.START;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint m9418o(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ RouteDiscoveryPreference.Builder m9419p(ImmutableList immutableList) {
        return new RouteDiscoveryPreference.Builder(immutableList, false);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ RouteDiscoveryPreference m9420q(RouteDiscoveryPreference.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ Pair m9421r(MediaParser.SeekMap seekMap, long j) {
        return seekMap.getSeekPoints(j);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ String m9422s(MediaParser mediaParser) {
        return mediaParser.getParserName();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ List m9423t(ActivityManager activityManager) {
        return activityManager.getHistoricalProcessExitReasons(null, 0, 0);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ UUID m9424u(DrmInitData.SchemeInitData schemeInitData) {
        return schemeInitData.uuid;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m9425v() {
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m9426w(MediaParser mediaParser) {
        mediaParser.release();
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m9427x(MediaParser mediaParser, MediaParser.SeekPoint seekPoint) {
        mediaParser.seek(seekPoint);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m9428y(MediaParser mediaParser, MediaParser$SeekableInputReader mediaParser$SeekableInputReader) throws IOException {
        mediaParser.advance(mediaParser$SeekableInputReader);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m9429z(Surface surface, float f, int i) {
        surface.setFrameRate(f, i);
    }
}
