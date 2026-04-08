package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final TrieNodeBaseIterator[] f16795a;

    /* JADX INFO: renamed from: b */
    public int f16796b;

    /* JADX INFO: renamed from: c */
    public boolean f16797c = true;

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        this.f16795a = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].m4686c(Integer.bitCount(trieNode.f16816a) * 2, 0, trieNode.f16819d);
        this.f16796b = 0;
        m4651c();
    }

    /* JADX INFO: renamed from: c */
    public final void m4651c() {
        int i = this.f16796b;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.f16795a;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i];
        if (trieNodeBaseIterator.f16824c < trieNodeBaseIterator.f16823b) {
            return;
        }
        while (-1 < i) {
            int iM4652e = m4652e(i);
            if (iM4652e == -1) {
                TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i];
                int i2 = trieNodeBaseIterator2.f16824c;
                Object[] objArr = trieNodeBaseIterator2.f16822a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    trieNodeBaseIterator2.f16824c = i2 + 1;
                    iM4652e = m4652e(i);
                }
            }
            if (iM4652e != -1) {
                this.f16796b = iM4652e;
                return;
            }
            if (i > 0) {
                TrieNodeBaseIterator trieNodeBaseIterator3 = trieNodeBaseIteratorArr[i - 1];
                int i3 = trieNodeBaseIterator3.f16824c;
                int length2 = trieNodeBaseIterator3.f16822a.length;
                trieNodeBaseIterator3.f16824c = i3 + 1;
            }
            trieNodeBaseIteratorArr[i].m4686c(0, 0, TrieNode.f16815e.f16819d);
            i--;
        }
        this.f16797c = false;
    }

    /* JADX INFO: renamed from: e */
    public final int m4652e(int i) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.f16795a;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i];
        int i2 = trieNodeBaseIterator.f16824c;
        if (i2 < trieNodeBaseIterator.f16823b) {
            return i;
        }
        Object[] objArr = trieNodeBaseIterator.f16822a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        TrieNode trieNode = (TrieNode) obj;
        if (i == 6) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i + 1];
            Object[] objArr2 = trieNode.f16819d;
            trieNodeBaseIterator2.m4686c(objArr2.length, 0, objArr2);
        } else {
            trieNodeBaseIteratorArr[i + 1].m4686c(Integer.bitCount(trieNode.f16816a) * 2, 0, trieNode.f16819d);
        }
        return m4652e(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16797c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f16797c) {
            throw new NoSuchElementException();
        }
        T next = this.f16795a[this.f16796b].next();
        m4651c();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
