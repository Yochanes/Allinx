package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "InternalValue", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RealStrongMemoryCache implements StrongMemoryCache {

    /* JADX INFO: renamed from: a */
    public final WeakMemoryCache f33762a;

    /* JADX INFO: renamed from: b */
    public final RealStrongMemoryCache$cache$1 f33763b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/memory/RealStrongMemoryCache$InternalValue;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class InternalValue {

        /* JADX INFO: renamed from: a */
        public final Bitmap f33764a;

        /* JADX INFO: renamed from: b */
        public final Map f33765b;

        /* JADX INFO: renamed from: c */
        public final int f33766c;

        public InternalValue(Bitmap bitmap, Map map, int i) {
            this.f33764a = bitmap;
            this.f33765b = map;
            this.f33766c = i;
        }
    }

    public RealStrongMemoryCache(int i, WeakMemoryCache weakMemoryCache) {
        this.f33762a = weakMemoryCache;
        this.f33763b = new RealStrongMemoryCache$cache$1(i, this);
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: a */
    public final MemoryCache.Value mo12475a(MemoryCache.Key key) {
        InternalValue internalValue = this.f33763b.get(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.f33764a, internalValue.f33765b);
        }
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: b */
    public final void mo12476b(int i) {
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.f33763b;
        if (i >= 40) {
            realStrongMemoryCache$cache$1.evictAll();
        } else {
            if (10 > i || i >= 20) {
                return;
            }
            realStrongMemoryCache$cache$1.trimToSize(realStrongMemoryCache$cache$1.size() / 2);
        }
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: c */
    public final void mo12477c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int iM12522a = Bitmaps.m12522a(bitmap);
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.f33763b;
        if (iM12522a <= realStrongMemoryCache$cache$1.maxSize()) {
            realStrongMemoryCache$cache$1.put(key, new InternalValue(bitmap, map, iM12522a));
        } else {
            realStrongMemoryCache$cache$1.remove(key);
            this.f33762a.mo12480c(key, bitmap, map, iM12522a);
        }
    }
}
