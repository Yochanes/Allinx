package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.lang.ref.PhantomReference;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class FinalizablePhantomReference<T> extends PhantomReference<T> implements FinalizableReference {
    public FinalizablePhantomReference(@CheckForNull T t, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
