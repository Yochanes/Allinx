package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Supplier<T> {
    @ParametricNullness
    T get();
}
