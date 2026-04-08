package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayListSupplier implements Callable<List<Object>>, Function<Object, List<Object>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ArrayListSupplier[] f49271a = {new ArrayListSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    ArrayListSupplier EF5;

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) f49271a.clone();
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() {
        return new ArrayList();
    }
}
