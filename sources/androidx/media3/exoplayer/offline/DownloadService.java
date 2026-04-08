package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class DownloadService extends Service {

    /* JADX INFO: renamed from: d */
    public static final HashMap f27084d = new HashMap();

    /* JADX INFO: renamed from: a */
    public DownloadManagerHelper f27085a;

    /* JADX INFO: renamed from: b */
    public int f27086b;

    /* JADX INFO: renamed from: c */
    public boolean f27087c;

    /* JADX INFO: compiled from: Proguard */
    public static final class DownloadManagerHelper implements DownloadManager.Listener {

        /* JADX INFO: renamed from: a */
        public final DownloadManager f27088a;

        /* JADX INFO: renamed from: b */
        public DownloadService f27089b;

        public DownloadManagerHelper(Context context, DownloadManager downloadManager, Class cls) {
            this.f27088a = downloadManager;
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ForegroundNotificationUpdater {
    }

    /* JADX INFO: renamed from: a */
    public abstract DownloadManager m10443a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        Class<?> cls = getClass();
        DownloadManagerHelper downloadManagerHelper = (DownloadManagerHelper) f27084d.get(cls);
        if (downloadManagerHelper != null) {
            this.f27085a = downloadManagerHelper;
            Assertions.m9464e(downloadManagerHelper.f27089b == null);
            downloadManagerHelper.f27089b = this;
        } else {
            int i = Util.f25665a;
            DownloadManager downloadManagerM10443a = m10443a();
            downloadManagerM10443a.m10442a(false);
            new DownloadManagerHelper(getApplicationContext(), downloadManagerM10443a, cls);
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        DownloadManagerHelper downloadManagerHelper = this.f27085a;
        downloadManagerHelper.getClass();
        Assertions.m9464e(downloadManagerHelper.f27089b == this);
        downloadManagerHelper.f27089b = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        String stringExtra;
        DownloadManager downloadManager;
        this.f27086b = i2;
        this.f27087c = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        downloadManager = this.f27085a.f27088a;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    Log.m9507c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    downloadManager.f27072a++;
                    throw null;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    downloadManager.f27072a++;
                    throw null;
                }
                Log.m9507c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.m10442a(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.f27072a++;
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    downloadManager.f27072a++;
                    throw null;
                }
                Log.m9507c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    throw null;
                }
                Log.m9507c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                break;
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.m10442a(true);
                break;
            default:
                Log.m9507c("DownloadService", "Ignored unrecognized action: ".concat(action));
                break;
        }
        int i3 = Util.f25665a;
        if (downloadManager.f27072a == 0) {
            if (i3 < 28 && this.f27087c) {
                stopSelf();
                return 1;
            }
            stopSelfResult(this.f27086b);
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f27087c = true;
    }
}
