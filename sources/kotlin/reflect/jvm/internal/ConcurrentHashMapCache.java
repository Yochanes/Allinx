package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/ConcurrentHashMapCache;", "V", "Lkotlin/reflect/jvm/internal/CacheByClass;", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class ConcurrentHashMapCache<V> extends CacheByClass<V> {

    /* JADX INFO: renamed from: a */
    public final Lambda f51757a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f51758b = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapCache(Function1 function1) {
        this.f51757a = (Lambda) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.CacheByClass
    /* JADX INFO: renamed from: a */
    public final Object mo18680a(Class key) {
        Intrinsics.m18599g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f51758b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f51757a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
