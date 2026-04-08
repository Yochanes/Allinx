package coil.memory;

import coil.memory.MemoryCache;
import coil.util.Collections;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/memory/RealMemoryCache;", "Lcoil/memory/MemoryCache;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class RealMemoryCache implements MemoryCache {

    /* JADX INFO: renamed from: a */
    public final StrongMemoryCache f33760a;

    /* JADX INFO: renamed from: b */
    public final WeakMemoryCache f33761b;

    public RealMemoryCache(StrongMemoryCache strongMemoryCache, WeakMemoryCache weakMemoryCache) {
        this.f33760a = strongMemoryCache;
        this.f33761b = weakMemoryCache;
    }

    @Override // coil.memory.MemoryCache
    /* JADX INFO: renamed from: a */
    public final MemoryCache.Value mo12481a(MemoryCache.Key key) {
        MemoryCache.Value valueMo12475a = this.f33760a.mo12475a(key);
        return valueMo12475a == null ? this.f33761b.mo12478a(key) : valueMo12475a;
    }

    @Override // coil.memory.MemoryCache
    /* JADX INFO: renamed from: b */
    public final void mo12482b(int i) {
        this.f33760a.mo12476b(i);
        this.f33761b.mo12479b(i);
    }

    @Override // coil.memory.MemoryCache
    /* JADX INFO: renamed from: c */
    public final void mo12483c(MemoryCache.Key key, MemoryCache.Value value) {
        this.f33760a.mo12477c(new MemoryCache.Key(key.f33755a, Collections.m12526b(key.f33756b)), value.f33757a, Collections.m12526b(value.f33758b));
    }
}
