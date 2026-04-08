package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class StorageKt {
    /* JADX INFO: renamed from: a */
    public static final Object m20097a(NotNullLazyValue notNullLazyValue, KProperty p2) {
        Intrinsics.m18599g(notNullLazyValue, "<this>");
        Intrinsics.m18599g(p2, "p");
        return notNullLazyValue.invoke();
    }
}
