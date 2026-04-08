package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f54746a;

    public DefaultSimpleLock(ReentrantLock reentrantLock) {
        this.f54746a = reentrantLock;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f54746a.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public final void unlock() {
        this.f54746a.unlock();
    }
}
