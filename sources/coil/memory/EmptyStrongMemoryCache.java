package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/memory/EmptyStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class EmptyStrongMemoryCache implements StrongMemoryCache {

    /* JADX INFO: renamed from: a */
    public final WeakMemoryCache f33752a;

    public EmptyStrongMemoryCache(WeakMemoryCache weakMemoryCache) {
        this.f33752a = weakMemoryCache;
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: a */
    public final MemoryCache.Value mo12475a(MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: c */
    public final void mo12477c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.f33752a.mo12480c(key, bitmap, map, Bitmaps.m12522a(bitmap));
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: b */
    public final void mo12476b(int i) {
    }
}
