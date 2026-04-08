package com.google.common.collect;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(AbstractC1610a.m8733k(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void checkPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must be positive but was: " + i);
    }

    public static void checkRemove(boolean z2) {
        Preconditions.checkState(z2, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + j);
    }
}
