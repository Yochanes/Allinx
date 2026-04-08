package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.DoNotMock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@DoNotMock("Use Interners.new*Interner")
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public interface Interner<E> {
    E intern(E e);
}
