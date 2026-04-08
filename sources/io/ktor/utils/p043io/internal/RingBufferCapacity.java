package io.ktor.utils.p043io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/internal/RingBufferCapacity;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class RingBufferCapacity {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47425b = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForRead$internal");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47426c = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForWrite$internal");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47427d = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* JADX INFO: renamed from: a */
    public final int f47428a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public RingBufferCapacity(int i) {
        this.f47428a = i;
        this._availableForWrite$internal = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m17546a(int i) {
        int i2;
        int i3;
        do {
            i2 = this._availableForWrite$internal;
            i3 = i2 + i;
            if (i3 > this.f47428a) {
                StringBuilder sbM24u = AbstractC0000a.m24u("Completed read overflow: ", " + ", " = ", i2, i);
                sbM24u.append(i3);
                sbM24u.append(" > ");
                sbM24u.append(this.f47428a);
                throw new IllegalArgumentException(sbM24u.toString());
            }
        } while (!f47426c.compareAndSet(this, i2, i3));
    }

    /* JADX INFO: renamed from: b */
    public final void m17547b(int i) {
        int i2;
        int i3;
        do {
            i2 = this._pendingToFlush;
            i3 = i2 + i;
            if (i3 > this.f47428a) {
                StringBuilder sbM24u = AbstractC0000a.m24u("Complete write overflow: ", " + ", " > ", i2, i);
                sbM24u.append(this.f47428a);
                throw new IllegalArgumentException(sbM24u.toString());
            }
        } while (!f47427d.compareAndSet(this, i2, i3));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17548c() {
        int andSet = f47427d.getAndSet(this, 0);
        return andSet == 0 ? this._availableForRead$internal > 0 : f47425b.addAndGet(this, andSet) > 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17549d() {
        return this._availableForWrite$internal == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m17550e() {
        this._availableForRead$internal = this.f47428a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m17551f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f47428a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17552g() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.f47428a) {
                return false;
            }
        } while (!f47426c.compareAndSet(this, i, 0));
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final int m17553h(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForRead$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!f47425b.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17554i(int i) {
        int i2;
        do {
            i2 = this._availableForRead$internal;
            if (i2 < i) {
                return false;
            }
        } while (!f47425b.compareAndSet(this, i2, i2 - i));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final int m17555j(int i) {
        int i2;
        int iMin;
        do {
            i2 = this._availableForWrite$internal;
            iMin = Math.min(i, i2);
            if (iMin == 0) {
                return 0;
            }
        } while (!f47426c.compareAndSet(this, i2, i2 - iMin));
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17556k(int i) {
        int i2;
        do {
            i2 = this._availableForWrite$internal;
            if (i2 < i) {
                return false;
            }
        } while (!f47426c.compareAndSet(this, i2, i2 - i));
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingBufferCapacity[read: ");
        sb.append(this._availableForRead$internal);
        sb.append(", write: ");
        sb.append(this._availableForWrite$internal);
        sb.append(", flush: ");
        sb.append(this._pendingToFlush);
        sb.append(", capacity: ");
        return AbstractC0000a.m17n(sb, this.f47428a, ']');
    }
}
