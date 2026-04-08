package io.reactivex.rxjava3.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {

    /* JADX INFO: renamed from: g */
    public static final Integer f51247g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a */
    public final int f51248a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f51249b;

    /* JADX INFO: renamed from: c */
    public long f51250c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f51251d;

    /* JADX INFO: renamed from: f */
    public final int f51252f;

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f51248a = length() - 1;
        this.f51249b = new AtomicLong();
        this.f51251d = new AtomicLong();
        this.f51252f = Math.min(i / 4, f51247g.intValue());
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f51249b.get() == this.f51251d.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == 0) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f51249b;
        long j = atomicLong.get();
        int i = this.f51248a;
        int i2 = ((int) j) & i;
        if (j >= this.f51250c) {
            long j2 = ((long) this.f51252f) + j;
            if (get(i & ((int) j2)) == null) {
                this.f51250c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.f51251d;
        long j = atomicLong.get();
        int i = ((int) j) & this.f51248a;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
