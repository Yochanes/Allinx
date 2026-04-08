package io.ktor.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/ConcurrentSafeAttributes;", "Lio/ktor/util/AttributesJvmBase;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
final class ConcurrentSafeAttributes extends AttributesJvmBase {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f46445a = new ConcurrentHashMap();

    @Override // io.ktor.util.Attributes
    /* JADX INFO: renamed from: e */
    public final Object mo17158e(AttributeKey key, Function0 function0) {
        Intrinsics.m18599g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f46445a;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = function0.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    @Override // io.ktor.util.AttributesJvmBase
    /* JADX INFO: renamed from: g */
    public final Map mo17160g() {
        return this.f46445a;
    }
}
