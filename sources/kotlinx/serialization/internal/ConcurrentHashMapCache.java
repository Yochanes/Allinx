package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class ConcurrentHashMapCache<T> implements SerializerCache<T> {

    /* JADX INFO: renamed from: a */
    public final Function1 f56671a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f56672b = new ConcurrentHashMap();

    public ConcurrentHashMapCache(Function1 function1) {
        this.f56671a = function1;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    /* JADX INFO: renamed from: a */
    public final KSerializer mo20999a(KClass kClass) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f56672b;
        Class clsM18572b = JvmClassMappingKt.m18572b(kClass);
        Object cacheEntry = concurrentHashMap.get(clsM18572b);
        if (cacheEntry == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM18572b, (cacheEntry = new CacheEntry((KSerializer) this.f56671a.invoke(kClass))))) != null) {
            cacheEntry = objPutIfAbsent;
        }
        return ((CacheEntry) cacheEntry).f56657a;
    }
}
