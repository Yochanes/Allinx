package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class HashMapSupplier implements Callable<Map<Object, Object>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ HashMapSupplier[] f49277a = {new HashMapSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    HashMapSupplier EF5;

    public static HashMapSupplier valueOf(String str) {
        return (HashMapSupplier) Enum.valueOf(HashMapSupplier.class, str);
    }

    public static HashMapSupplier[] values() {
        return (HashMapSupplier[]) f49277a.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Map<Object, Object> call() {
        return new HashMap();
    }
}
