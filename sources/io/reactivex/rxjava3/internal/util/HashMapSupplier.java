package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Supplier;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class HashMapSupplier implements Supplier<Map<Object, Object>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ HashMapSupplier[] f51226a = {new HashMapSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    HashMapSupplier EF5;

    public static HashMapSupplier valueOf(String str) {
        return (HashMapSupplier) Enum.valueOf(HashMapSupplier.class, str);
    }

    public static HashMapSupplier[] values() {
        return (HashMapSupplier[]) f51226a.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return new HashMap();
    }
}
