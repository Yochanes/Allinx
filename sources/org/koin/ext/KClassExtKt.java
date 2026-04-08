package org.koin.ext;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"koin-core"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KClassExtKt {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f58257a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final String m21815a(KClass kClass) {
        Intrinsics.m18599g(kClass, "<this>");
        ConcurrentHashMap concurrentHashMap = f58257a;
        String str = (String) concurrentHashMap.get(kClass);
        if (str != null) {
            return str;
        }
        String name = JvmClassMappingKt.m18572b(kClass).getName();
        concurrentHashMap.put(kClass, name);
        return name;
    }
}
