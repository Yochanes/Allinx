package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.CacheDataSource;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultDownloaderFactory implements DownloaderFactory {
    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, m10437a(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, m10437a(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, m10437a(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Constructor m10437a(Class cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }
}
