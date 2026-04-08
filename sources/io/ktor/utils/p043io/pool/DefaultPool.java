package io.ktor.utils.p043io.pool;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18302d2 = {"Lio/ktor/utils/io/pool/DefaultPool;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "", VerticalAlignment.TOP, "J", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class DefaultPool<T> implements ObjectPool<T> {

    /* JADX INFO: renamed from: f */
    public static final AtomicLongFieldUpdater f47519f;

    /* JADX INFO: renamed from: a */
    public final int f47520a;

    /* JADX INFO: renamed from: b */
    public final int f47521b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceArray f47522c;

    /* JADX INFO: renamed from: d */
    public final int[] f47523d;
    private volatile long top;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/utils/io/pool/DefaultPool$Companion;", "", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "Lio/ktor/utils/io/pool/DefaultPool;", "Top", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, DefaultPool$Companion$Top$1.f47524a.getName());
        Intrinsics.m18598f(atomicLongFieldUpdaterNewUpdater, "AtomicLongFieldUpdater.n…wner::class.java, p.name)");
        f47519f = atomicLongFieldUpdaterNewUpdater;
    }

    public DefaultPool(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "capacity should be positive but it is ").toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f47520a = iHighestOneBit;
        this.f47521b = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f47522c = new AtomicReferenceArray(i2);
        this.f47523d = new int[i2];
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ long m17574a(DefaultPool defaultPool) {
        return defaultPool.top;
    }

    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: G */
    public final Object mo17488G() {
        Object objM17575h = m17575h();
        return objM17575h != null ? mo16936b(objM17575h) : mo16937g();
    }

    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: N0 */
    public final void mo17522N0(Object instance) {
        long j;
        long j2;
        Intrinsics.m18599g(instance, "instance");
        mo17150i(instance);
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f47521b) + 1;
        for (int i = 0; i < 8; i++) {
            AtomicReferenceArray atomicReferenceArray = this.f47522c;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.f47520a;
                    }
                }
            }
            if (iIdentityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j = this.top;
                j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.f47523d[iIdentityHashCode] = (int) (4294967295L & j);
            } while (!f47519f.compareAndSet(this, j, j2));
            return;
        }
        mo17487d(instance);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dispose();
    }

    /* JADX INFO: renamed from: d */
    public void mo17487d(Object instance) {
        Intrinsics.m18599g(instance, "instance");
    }

    public final void dispose() {
        while (true) {
            Object objM17575h = m17575h();
            if (objM17575h == null) {
                return;
            } else {
                mo17487d(objM17575h);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo16937g();

    /* JADX INFO: renamed from: h */
    public final Object m17575h() {
        long j;
        int i;
        DefaultPool<T> defaultPool;
        long j2;
        do {
            j = this.top;
            if (j != 0) {
                j2 = ((j >> 32) & 4294967295L) + 1;
                i = (int) (4294967295L & j);
                if (i != 0) {
                    defaultPool = this;
                }
            }
            i = 0;
            defaultPool = this;
            break;
        } while (!f47519f.compareAndSet(defaultPool, j, (j2 << 32) | ((long) this.f47523d[i])));
        if (i == 0) {
            return null;
        }
        return defaultPool.f47522c.getAndSet(i, null);
    }

    /* JADX INFO: renamed from: i */
    public void mo17150i(Object instance) {
        Intrinsics.m18599g(instance, "instance");
    }

    /* JADX INFO: renamed from: b */
    public Object mo16936b(Object obj) {
        return obj;
    }
}
