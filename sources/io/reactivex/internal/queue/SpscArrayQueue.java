package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {

    /* JADX INFO: renamed from: g */
    public static final Integer f49109g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a */
    public final int f49110a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f49111b;

    /* JADX INFO: renamed from: c */
    public long f49112c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f49113d;

    /* JADX INFO: renamed from: f */
    public final int f49114f;

    public SpscArrayQueue(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f49110a = length() - 1;
        this.f49111b = new AtomicLong();
        this.f49113d = new AtomicLong();
        this.f49114f = Math.min(i / 4, f49109g.intValue());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f49111b.get() == this.f49113d.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == 0) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f49111b;
        long j = atomicLong.get();
        int i = this.f49110a;
        int i2 = ((int) j) & i;
        if (j >= this.f49112c) {
            long j2 = ((long) this.f49114f) + j;
            if (get(i & ((int) j2)) == null) {
                this.f49112c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.f49113d;
        long j = atomicLong.get();
        int i = ((int) j) & this.f49110a;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
