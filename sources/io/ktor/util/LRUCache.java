package io.ktor.util;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/LRUCache;", "K", "V", "Ljava/util/LinkedHashMap;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class LRUCache<K, V> extends LinkedHashMap<K, V> {
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        throw null;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry eldest) {
        Intrinsics.m18599g(eldest, "eldest");
        boolean z2 = super.size() > 0;
        if (!z2) {
            return z2;
        }
        eldest.getValue();
        throw null;
    }
}
