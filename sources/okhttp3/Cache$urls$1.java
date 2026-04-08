package okhttp3;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"okhttp3/Cache$urls$1", "", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Cache$urls$1 implements Iterator<String>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public boolean f57012a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f57012a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.f57012a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f57012a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
