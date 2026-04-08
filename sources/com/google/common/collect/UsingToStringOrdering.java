package com.google.common.collect;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
final class UsingToStringOrdering extends Ordering<Object> implements Serializable {
    static final UsingToStringOrdering INSTANCE = new UsingToStringOrdering();
    private static final long serialVersionUID = 0;

    private UsingToStringOrdering() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
