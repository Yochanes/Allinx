package okhttp3.internal.cache;

import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;
import okio.ForwardingSource;
import okio.Source;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "Lokio/ForwardingSource;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DiskLruCache$Entry$newSource$1 extends ForwardingSource {

    /* JADX INFO: renamed from: b */
    public boolean f57337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DiskLruCache f57338c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DiskLruCache.Entry f57339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(Source source, DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        super(source);
        this.f57338c = diskLruCache;
        this.f57339d = entry;
    }

    @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.f57337b) {
            return;
        }
        this.f57337b = true;
        DiskLruCache diskLruCache = this.f57338c;
        DiskLruCache.Entry entry = this.f57339d;
        synchronized (diskLruCache) {
            int i = entry.f57334h - 1;
            entry.f57334h = i;
            if (i == 0 && entry.f57332f) {
                diskLruCache.m21359x(entry);
            }
        }
    }
}
