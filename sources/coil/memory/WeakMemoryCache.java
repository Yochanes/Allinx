package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Lcoil/memory/WeakMemoryCache;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface WeakMemoryCache {
    /* JADX INFO: renamed from: a */
    MemoryCache.Value mo12478a(MemoryCache.Key key);

    /* JADX INFO: renamed from: b */
    void mo12479b(int i);

    /* JADX INFO: renamed from: c */
    void mo12480c(MemoryCache.Key key, Bitmap bitmap, Map map, int i);
}
