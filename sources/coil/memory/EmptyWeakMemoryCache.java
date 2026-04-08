package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/memory/EmptyWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class EmptyWeakMemoryCache implements WeakMemoryCache {
    @Override // coil.memory.WeakMemoryCache
    /* JADX INFO: renamed from: a */
    public final MemoryCache.Value mo12478a(MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.WeakMemoryCache
    /* JADX INFO: renamed from: b */
    public final void mo12479b(int i) {
    }

    @Override // coil.memory.WeakMemoryCache
    /* JADX INFO: renamed from: c */
    public final void mo12480c(MemoryCache.Key key, Bitmap bitmap, Map map, int i) {
    }
}
