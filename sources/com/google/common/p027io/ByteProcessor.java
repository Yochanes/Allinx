package com.google.common.p027io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock("Implement it normally")
@J2ktIncompatible
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processBytes(byte[] bArr, int i, int i2);
}
