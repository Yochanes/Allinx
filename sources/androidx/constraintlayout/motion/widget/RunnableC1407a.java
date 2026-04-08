package androidx.constraintlayout.motion.widget;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AbstractC1796n;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.p017ui.PlayerView;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.TransactionExecutor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.chiclaim.android.downloader.DownloadException;
import com.chiclaim.android.downloader.DownloadInfo;
import com.chiclaim.android.downloader.DownloadListener;
import com.chiclaim.android.downloader.DownloadObserver;
import com.chiclaim.android.downloader.DownloadRequest;
import com.chiclaim.android.downloader.EmbedDownloader;
import com.chiclaim.android.downloader.SystemDownloader;
import com.chiclaim.android.downloader.util.NotifierUtils;
import com.chiclaim.android.downloader.util.Utils;
import com.exchange.allin.R;
import com.geetest.gtc4.C3630c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalListeners;
import com.google.common.cache.RemovalNotification;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1407a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f22555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f22556c;

    public /* synthetic */ RunnableC1407a(int i, Object obj, Object obj2) {
        this.f22554a = i;
        this.f22555b = obj;
        this.f22556c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f22556c;
        Object obj2 = this.f22555b;
        switch (this.f22554a) {
            case 0:
                ViewTransition viewTransition = (ViewTransition) obj2;
                View[] viewArr = (View[]) obj;
                if (viewTransition.f22528p != -1) {
                    for (View view : viewArr) {
                        view.setTag(viewTransition.f22528p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (viewTransition.f22529q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(viewTransition.f22529q, null);
                    }
                    return;
                }
                return;
            case 1:
                ((ResourcesCompat.FontCallback) obj2).onFontRetrieved((Typeface) obj);
                return;
            case 2:
                ((DispatchQueue) obj2).getClass();
                throw null;
            case 3:
                AudioManagerCompat.f25440a = (AudioManager) ((Context) obj2).getSystemService("audio");
                ((ConditionVariable) obj).m9477e();
                return;
            case 4:
                AbstractC1796n.m10171r(((MediaMetricsListener) obj2).f26411d, (TrackChangeEvent) obj);
                return;
            case 5:
                AbstractC1796n.m10167n(((MediaMetricsListener) obj2).f26411d, (NetworkEvent) obj);
                return;
            case 6:
                AbstractC1796n.m10168o(((MediaMetricsListener) obj2).f26411d, (PlaybackErrorEvent) obj);
                return;
            case 7:
                AbstractC1796n.m10169p(((MediaMetricsListener) obj2).f26411d, (PlaybackMetrics) obj);
                return;
            case 8:
                AbstractC1796n.m10170q(((MediaMetricsListener) obj2).f26411d, (PlaybackStateEvent) obj);
                return;
            case 9:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj2;
                eventDispatcher.getClass();
                int i = Util.f25665a;
                eventDispatcher.f26522b.mo9851h((String) obj);
                return;
            case 10:
                ((AudioSink.Listener) obj2).mo10214b((AudioSink.AudioTrackConfig) obj);
                return;
            case 11:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj2;
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f28073i;
                Surface surface = sphericalGLSurfaceView.f28074j;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                Surface surface2 = new Surface(surfaceTexture2);
                sphericalGLSurfaceView.f28073i = surfaceTexture2;
                sphericalGLSurfaceView.f28074j = surface2;
                Iterator it = sphericalGLSurfaceView.f28067a.iterator();
                while (it.hasNext()) {
                    ((SphericalGLSurfaceView.VideoSurfaceListener) it.next()).mo9843C(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case TYPE_BYTES_VALUE:
                PlayerView.m11156a((PlayerView) obj2, (Bitmap) obj);
                return;
            case 13:
                MultiInstanceInvalidationClient this$0 = (MultiInstanceInvalidationClient) obj2;
                String[] tables = (String[]) obj;
                int i2 = MultiInstanceInvalidationClient$callback$1.f31926a;
                Intrinsics.m18599g(this$0, "this$0");
                Intrinsics.m18599g(tables, "$tables");
                this$0.getClass();
                throw null;
            case 14:
                Runnable command = (Runnable) obj2;
                Intrinsics.m18599g(command, "$command");
                TransactionExecutor this$02 = (TransactionExecutor) obj;
                Intrinsics.m18599g(this$02, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$02.m11849a();
                }
            case 15:
                ((TimeLimiter) obj2).f32816b.mo12144a((StartStopToken) obj, 3);
                return;
            case 16:
                Iterator it2 = ((List) obj2).iterator();
                while (it2.hasNext()) {
                    ((ConstraintListener) it2.next()).mo12185a(((ConstraintTracker) obj).f32954e);
                }
                return;
            case 17:
                Iterator it3 = ((WorkDatabase) obj2).mo12141w().mo12236a().iterator();
                while (it3.hasNext()) {
                    CancelWorkRunnable.m12274a((WorkManagerImpl) obj, (String) it3.next());
                }
                return;
            case 18:
                String string = ((UUID) obj).toString();
                Intrinsics.m18598f(string, "id.toString()");
                CancelWorkRunnable.m12274a((WorkManagerImpl) obj2, string);
                return;
            case 19:
                int i3 = DownloadObserver.f35040e;
                DownloadObserver downloadObserver = (DownloadObserver) obj2;
                DownloadInfo downloadInfo = (DownloadInfo) obj;
                SystemDownloader systemDownloader = downloadObserver.f35042b;
                DownloadRequest downloadRequest = systemDownloader.f35071a;
                long j = downloadInfo.f35035a;
                int i4 = j <= 0 ? 0 : (int) ((downloadInfo.f35036b / j) * ((double) 100));
                LinkedHashSet linkedHashSet = downloadRequest.f35068l;
                if (linkedHashSet != null) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        ((DownloadListener) it4.next()).mo12854f(i4);
                    }
                }
                int i5 = downloadInfo.f35037c;
                DownloadRequest downloadRequest2 = systemDownloader.f35071a;
                Context context = downloadObserver.f35043c;
                if (i5 == 8) {
                    context.getContentResolver().unregisterContentObserver(downloadObserver);
                    Uri uri = downloadInfo.f35039e;
                    if (uri != null) {
                        downloadRequest2.m12861b(uri);
                        return;
                    }
                    String string2 = context.getString(R.string.downloader_notifier_failed_missing_uri);
                    Intrinsics.m18598f(string2, "context.getString(R.stri…ifier_failed_missing_uri)");
                    downloadRequest2.m12862c(new DownloadException(4, string2, 0));
                    return;
                }
                if (i5 != 16) {
                    return;
                }
                context.getContentResolver().unregisterContentObserver(downloadObserver);
                String str = downloadInfo.f35038d;
                if (str == null) {
                    str = "-";
                }
                String string3 = context.getString(R.string.downloader_notifier_content_err_placeholder, str);
                Intrinsics.m18598f(string3, "context.getString(\n     …                        )");
                downloadRequest2.m12862c(new DownloadException(3, string3, 0));
                return;
            case 20:
                EmbedDownloader this$03 = (EmbedDownloader) obj2;
                Intrinsics.m18599g(this$03, "this$0");
                Exception exc = (Exception) obj;
                DownloadRequest downloadRequest3 = this$03.f35071a;
                if (downloadRequest3.f35063g != 2) {
                    int iHashCode = downloadRequest3.f35058b.hashCode();
                    int i6 = downloadRequest3.f35064h;
                    Context context2 = downloadRequest3.f35057a;
                    if (i6 == -1) {
                        i6 = context2.getApplicationInfo().icon;
                    }
                    int i7 = i6;
                    CharSequence charSequenceM12860a = downloadRequest3.m12860a();
                    if (charSequenceM12860a == null) {
                        charSequenceM12860a = "";
                    }
                    NotifierUtils.Companion.m12876a(downloadRequest3.f35057a, iHashCode, i7, -1, charSequenceM12860a, Utils.m12879b(context2, exc), 16, null, downloadRequest3.f35058b, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                }
                downloadRequest3.m12862c(exc);
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                JobInfoSchedulerService.m14423a((JobInfoSchedulerService) obj2, (JobParameters) obj);
                return;
            case 22:
                RemovalListeners.m14776a((RemovalListener) obj2, (RemovalNotification) obj);
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                OverlayPresenter.m16322h((OverlayPresenter) obj2, (View) obj);
                return;
            default:
                C3630c.m14402a((C3630c) obj2, (Context) obj);
                return;
        }
    }
}
