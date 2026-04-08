package androidx.media3.common.util;

import com.chiclaim.android.downloader.DownloadExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: androidx.media3.common.util.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1753f implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25685a;

    public /* synthetic */ ThreadFactoryC1753f(int i) {
        this.f25685a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f25685a) {
            case 0:
                int i = Util.f25665a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            default:
                ThreadPoolExecutor threadPoolExecutor = DownloadExecutor.f35034a;
                return new Thread(runnable, "DownloadProgressTask");
        }
    }
}
