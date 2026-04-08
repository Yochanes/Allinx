package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.offline.FilterableManifest;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {

    /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.SegmentDownloader$1 */
    /* JADX INFO: compiled from: Proguard */
    class C18591 extends RunnableFutureTask<FilterableManifest<Object>, IOException> {
        @Override // androidx.media3.common.util.RunnableFutureTask
        /* JADX INFO: renamed from: b */
        public final Object mo9575b() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Segment implements Comparable<Segment> {
        @Override // java.lang.Comparable
        public final int compareTo(Segment segment) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        @Override // androidx.media3.common.util.RunnableFutureTask
        /* JADX INFO: renamed from: a */
        public final void mo9574a() {
            throw null;
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        /* JADX INFO: renamed from: b */
        public final Object mo9575b() {
            throw null;
        }
    }
}
