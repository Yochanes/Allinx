package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultAllocator implements Allocator {

    /* JADX INFO: renamed from: d */
    public int f27691d;

    /* JADX INFO: renamed from: e */
    public int f27692e;

    /* JADX INFO: renamed from: a */
    public final boolean f27688a = true;

    /* JADX INFO: renamed from: b */
    public final int f27689b = 65536;

    /* JADX INFO: renamed from: f */
    public int f27693f = 0;

    /* JADX INFO: renamed from: g */
    public Allocation[] f27694g = new Allocation[100];

    /* JADX INFO: renamed from: c */
    public final byte[] f27690c = null;

    @Override // androidx.media3.exoplayer.upstream.Allocator
    /* JADX INFO: renamed from: a */
    public final synchronized void mo10657a(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.f27694g;
                int i = this.f27693f;
                this.f27693f = i + 1;
                allocationArr[i] = allocationNode.mo10559a();
                this.f27692e--;
                allocationNode = allocationNode.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    /* JADX INFO: renamed from: b */
    public final synchronized Allocation mo10658b() {
        Allocation allocation;
        try {
            int i = this.f27692e + 1;
            this.f27692e = i;
            int i2 = this.f27693f;
            if (i2 > 0) {
                Allocation[] allocationArr = this.f27694g;
                int i3 = i2 - 1;
                this.f27693f = i3;
                allocation = allocationArr[i3];
                allocation.getClass();
                this.f27694g[this.f27693f] = null;
            } else {
                Allocation allocation2 = new Allocation(new byte[this.f27689b], 0);
                Allocation[] allocationArr2 = this.f27694g;
                if (i > allocationArr2.length) {
                    this.f27694g = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
                allocation = allocation2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    /* JADX INFO: renamed from: c */
    public final synchronized void mo10659c(Allocation allocation) {
        Allocation[] allocationArr = this.f27694g;
        int i = this.f27693f;
        this.f27693f = i + 1;
        allocationArr[i] = allocation;
        this.f27692e--;
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    /* JADX INFO: renamed from: d */
    public final synchronized void mo10660d() {
        try {
            int i = 0;
            int iMax = Math.max(0, Util.m9614e(this.f27691d, this.f27689b) - this.f27692e);
            int i2 = this.f27693f;
            if (iMax >= i2) {
                return;
            }
            if (this.f27690c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    Allocation allocation = this.f27694g[i];
                    allocation.getClass();
                    if (allocation.f27682a == this.f27690c) {
                        i++;
                    } else {
                        Allocation allocation2 = this.f27694g[i3];
                        allocation2.getClass();
                        if (allocation2.f27682a != this.f27690c) {
                            i3--;
                        } else {
                            Allocation[] allocationArr = this.f27694g;
                            allocationArr[i] = allocation2;
                            allocationArr[i3] = allocation;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f27693f) {
                    return;
                }
            }
            Arrays.fill(this.f27694g, iMax, this.f27693f, (Object) null);
            this.f27693f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    /* JADX INFO: renamed from: e */
    public final int mo10661e() {
        return this.f27689b;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m10662f(int i) {
        boolean z2 = i < this.f27691d;
        this.f27691d = i;
        if (z2) {
            mo10660d();
        }
    }
}
