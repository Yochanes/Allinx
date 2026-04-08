package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class zzah {
    @CanIgnoreReturnValue
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC0000a.m9f(i2, "at index "));
            }
        }
        return objArr;
    }
}
