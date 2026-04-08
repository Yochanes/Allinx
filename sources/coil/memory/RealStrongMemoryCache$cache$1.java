package coil.memory;

import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import coil.memory.RealStrongMemoryCache;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"coil/memory/RealStrongMemoryCache$cache$1", "Landroidx/collection/LruCache;", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/RealStrongMemoryCache$InternalValue;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class RealStrongMemoryCache$cache$1 extends LruCache<MemoryCache.Key, RealStrongMemoryCache.InternalValue> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RealStrongMemoryCache f33767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealStrongMemoryCache$cache$1(int i, RealStrongMemoryCache realStrongMemoryCache) {
        super(i);
        this.f33767a = realStrongMemoryCache;
    }

    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean z2, MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue, RealStrongMemoryCache.InternalValue internalValue2) {
        RealStrongMemoryCache.InternalValue internalValue3 = internalValue;
        this.f33767a.f33762a.mo12480c(key, internalValue3.f33764a, internalValue3.f33765b, internalValue3.f33766c);
    }

    @Override // androidx.collection.LruCache
    public final int sizeOf(MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue) {
        return internalValue.f33766c;
    }
}
