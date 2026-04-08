package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class WeakMapCtorCache extends CtorCache {

    /* JADX INFO: renamed from: a */
    public static final WeakMapCtorCache f56369a = new WeakMapCtorCache();

    static {
        new ReentrantReadWriteLock();
        new WeakHashMap();
    }
}
