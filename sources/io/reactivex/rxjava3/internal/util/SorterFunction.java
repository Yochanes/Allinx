package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {
    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, null);
        return list;
    }
}
