package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Predicate<T> {
    boolean apply(@ParametricNullness T t);

    boolean equals(@CheckForNull Object obj);
}
