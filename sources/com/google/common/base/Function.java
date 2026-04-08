package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    @ParametricNullness
    T apply(@ParametricNullness F f);

    boolean equals(@CheckForNull Object obj);
}
