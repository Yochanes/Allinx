package androidx.media3.datasource;

import android.adservices.adid.AdId;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.appsetid.AppSetId;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.net.http.HeaderBlock;
import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.camera.camera2.internal.RunnableC0187a;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: androidx.media3.datasource.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1761c {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m9704A() {
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m9705B(UrlRequest urlRequest) {
        urlRequest.cancel();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m9706C() {
        new LeaveCustomAudienceRequest.Builder();
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m9707D(UrlRequest urlRequest) {
        urlRequest.start();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m9708a(AppSetId appSetId) {
        return appSetId.getScope();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m9709b(NetworkException networkException) {
        return networkException.getErrorCode();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m9710c(UrlResponseInfo urlResponseInfo) {
        return urlResponseInfo.getHttpStatusCode();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ AdId m9711d(Object obj) {
        return (AdId) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AdSelectionOutcome m9712e(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ AppSetId m9713f(Object obj) {
        return (AppSetId) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ CustomAudience.Builder m9714g() {
        return new CustomAudience.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ NetworkException m9715h(Object obj) {
        return (NetworkException) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ UrlRequest.Builder m9716i(HttpEngine httpEngine, String str, UrlRequest$Callback urlRequest$Callback) {
        return httpEngine.newUrlRequestBuilder(str, null, urlRequest$Callback);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ UrlRequest.Builder m9717j(UrlRequest.Builder builder) {
        return builder.setPriority(0);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ UrlRequest m9718k(UrlRequest.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ UrlResponseInfo m9719l(Object obj) {
        return (UrlResponseInfo) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ SurfaceSyncGroup m9720m() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ String m9721n(AdId adId) {
        return adId.getAdId();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ String m9722o(AppSetId appSetId) {
        return appSetId.getId();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ String m9723p(UrlResponseInfo urlResponseInfo) {
        return urlResponseInfo.getHttpStatusText();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ List m9724q(HeaderBlock headerBlock) {
        return headerBlock.getAsList();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m9725r() {
        new AdSelectionConfig.Builder();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m9726s(UrlRequest urlRequest) {
        urlRequest.followRedirect();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m9727t(UrlRequest urlRequest, UrlRequest$StatusListener urlRequest$StatusListener) {
        urlRequest.getStatus(urlRequest$StatusListener);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m9728u(UrlRequest urlRequest, ByteBuffer byteBuffer) {
        urlRequest.read(byteBuffer);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m9729v(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m9730w(SurfaceSyncGroup surfaceSyncGroup) {
        surfaceSyncGroup.markSyncReady();
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m9731x(AdId adId) {
        return adId.isLimitAdTrackingEnabled();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m9732y(SurfaceSyncGroup surfaceSyncGroup, AttachedSurfaceControl attachedSurfaceControl, RunnableC0187a runnableC0187a) {
        return surfaceSyncGroup.add(attachedSurfaceControl, runnableC0187a);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m9733z(Object obj) {
        return obj instanceof NetworkException;
    }
}
