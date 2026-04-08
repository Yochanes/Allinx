package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f51510a;

    /* JADX INFO: renamed from: b */
    public final int f51511b;

    /* JADX INFO: renamed from: c */
    public int f51512c;

    /* JADX INFO: renamed from: d */
    public int f51513d;

    /* JADX INFO: renamed from: kotlin.collections.RingBuffer$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class C59831 extends AbstractIterator<Object> {

        /* JADX INFO: renamed from: c */
        public int f51514c;

        /* JADX INFO: renamed from: d */
        public int f51515d;

        public C59831() {
            this.f51514c = RingBuffer.this.f51513d;
            this.f51515d = RingBuffer.this.f51512c;
        }

        @Override // kotlin.collections.AbstractIterator
        /* JADX INFO: renamed from: c */
        public final void mo18318c() {
            int i = this.f51514c;
            if (i == 0) {
                this.f51467a = 2;
                return;
            }
            RingBuffer ringBuffer = RingBuffer.this;
            Object[] objArr = ringBuffer.f51510a;
            int i2 = this.f51515d;
            this.f51468b = objArr[i2];
            this.f51467a = 1;
            this.f51515d = (i2 + 1) % ringBuffer.f51511b;
            this.f51514c = i - 1;
        }
    }

    public RingBuffer(Object[] objArr, int i) {
        this.f51510a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f51511b = objArr.length;
            this.f51513d = i;
        } else {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM20q.append(objArr.length);
            throw new IllegalArgumentException(sbM20q.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF51513d() {
        return this.f51513d;
    }

    /* JADX INFO: renamed from: e */
    public final void m18496e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.f51513d) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM20q.append(this.f51513d);
            throw new IllegalArgumentException(sbM20q.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f51512c;
            int i3 = this.f51511b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f51510a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f51512c = i4;
            this.f51513d -= i;
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractList.Companion.m18320b(i, this.f51513d);
        return this.f51510a[(this.f51512c + i) % this.f51511b];
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C59831();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[getF51513d()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.m18599g(array, "array");
        int length = array.length;
        int i = this.f51513d;
        if (length < i) {
            array = Arrays.copyOf(array, i);
            Intrinsics.m18598f(array, "copyOf(...)");
        }
        int i2 = this.f51513d;
        int i3 = this.f51512c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.f51510a;
            if (i5 >= i2 || i3 >= this.f51511b) {
                break;
            }
            array[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            array[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }
}
