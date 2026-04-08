package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {
    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw null;
     */
    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lock() {
        try {
            if (!this.f54746a.tryLock(50L, TimeUnit.MILLISECONDS)) {
                throw null;
            }
        } catch (InterruptedException unused) {
            throw null;
        }
    }
}
