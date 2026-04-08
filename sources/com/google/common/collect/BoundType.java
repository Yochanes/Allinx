package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z2) {
        this.inclusive = z2;
    }

    public static BoundType forBoolean(boolean z2) {
        return z2 ? CLOSED : OPEN;
    }
}
