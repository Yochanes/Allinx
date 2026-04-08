package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ArrayListSupplier implements Supplier<List<Object>>, Function<Object, List<Object>> {

    /* JADX INFO: renamed from: a */
    public static final ArrayListSupplier f51219a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ArrayListSupplier[] f51220b;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        f51219a = arrayListSupplier;
        f51220b = new ArrayListSupplier[]{arrayListSupplier};
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) f51220b.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return new ArrayList();
    }
}
