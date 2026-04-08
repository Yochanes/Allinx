package kotlin.reflect.jvm.internal.impl.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f55081a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f55082b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public abstract int mo20173a(ConcurrentHashMap concurrentHashMap, String str, Function1 function1);

    /* JADX INFO: renamed from: b */
    public final int m20330b(KClass kClass) {
        Intrinsics.m18599g(kClass, "kClass");
        ConcurrentHashMap concurrentHashMap = this.f55081a;
        String strMo18587c = kClass.mo18587c();
        Intrinsics.m18596d(strMo18587c);
        return mo20173a(concurrentHashMap, strMo18587c, new TypeRegistry$getId$1(this));
    }
}
