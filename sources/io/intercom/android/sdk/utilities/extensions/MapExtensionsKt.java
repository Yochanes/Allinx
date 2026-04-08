package io.intercom.android.sdk.utilities.extensions;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"safeGetOrDefault", "V", "K", "", "key", "default", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class MapExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> V safeGetOrDefault(@NotNull Map<K, ? extends V> map, K k, V v) {
        Intrinsics.m18599g(map, "<this>");
        return map.getOrDefault(k, v);
    }
}
