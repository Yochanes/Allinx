package io.reactivex.rxjava3.operators;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: n */
    public static final int f51253n = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: o */
    public static final Object f51254o = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f51255a;

    /* JADX INFO: renamed from: b */
    public final int f51256b;

    /* JADX INFO: renamed from: c */
    public long f51257c;

    /* JADX INFO: renamed from: d */
    public final int f51258d;

    /* JADX INFO: renamed from: f */
    public AtomicReferenceArray f51259f;

    /* JADX INFO: renamed from: g */
    public final int f51260g;

    /* JADX INFO: renamed from: i */
    public AtomicReferenceArray f51261i;

    /* JADX INFO: renamed from: j */
    public final AtomicLong f51262j;

    public SpscLinkedArrayQueue(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f51255a = atomicLong;
        this.f51262j = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f51259f = atomicReferenceArray;
        this.f51258d = i2;
        this.f51256b = Math.min(iNumberOfLeadingZeros / 4, f51253n);
        this.f51261i = atomicReferenceArray;
        this.f51260g = i2;
        this.f51257c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m18272a(Serializable serializable, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f51259f;
        AtomicLong atomicLong = this.f51255a;
        long j = atomicLong.get();
        long j2 = 2 + j;
        int i = this.f51258d;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, obj);
            atomicReferenceArray.lazySet(i2, serializable);
            atomicLong.lazySet(j2);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f51259f = atomicReferenceArray2;
        int i3 = ((int) j) & i;
        atomicReferenceArray2.lazySet(i3 + 1, obj);
        atomicReferenceArray2.lazySet(i3, serializable);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f51254o);
        atomicLong.lazySet(j2);
    }

    /* JADX INFO: renamed from: b */
    public final Object m18273b() {
        AtomicReferenceArray atomicReferenceArray = this.f51261i;
        int i = (int) this.f51262j.get();
        int i2 = this.f51260g;
        int i3 = i & i2;
        Object obj = atomicReferenceArray.get(i3);
        if (obj != f51254o) {
            return obj;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.f51261i = atomicReferenceArray2;
        return atomicReferenceArray2.get(i3);
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
        return this.f51255a.get() == this.f51262j.get();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f51259f;
        AtomicLong atomicLong = this.f51255a;
        long j = atomicLong.get();
        int i = this.f51258d;
        int i2 = ((int) j) & i;
        if (j < this.f51257c) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.f51256b) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f51257c = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f51259f = atomicReferenceArray2;
        this.f51257c = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, f51254o);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f51261i;
        AtomicLong atomicLong = this.f51262j;
        long j = atomicLong.get();
        int i = this.f51260g;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z2 = obj == f51254o;
        if (obj != null && !z2) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z2) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.f51261i = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
