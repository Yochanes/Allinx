package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMutableIterator {

    /* JADX INFO: renamed from: d */
    public final PersistentHashMapBuilder f16804d;

    /* JADX INFO: renamed from: f */
    public Object f16805f;

    /* JADX INFO: renamed from: g */
    public boolean f16806g;

    /* JADX INFO: renamed from: i */
    public int f16807i;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.f16800c, trieNodeBaseIteratorArr);
        this.f16804d = persistentHashMapBuilder;
        this.f16807i = persistentHashMapBuilder.f16802f;
    }

    /* JADX INFO: renamed from: f */
    public final void m4659f(int i, TrieNode trieNode, Object obj, int i2) {
        int i3 = i2 * 5;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.f16795a;
        if (i3 <= 30) {
            int iM4690d = 1 << TrieNodeKt.m4690d(i, i3);
            if (trieNode.m4670h(iM4690d)) {
                trieNodeBaseIteratorArr[i2].m4686c(Integer.bitCount(trieNode.f16816a) * 2, trieNode.m4668f(iM4690d), trieNode.f16819d);
                this.f16796b = i2;
                return;
            }
            int iM4681t = trieNode.m4681t(iM4690d);
            TrieNode trieNodeM4680s = trieNode.m4680s(iM4681t);
            trieNodeBaseIteratorArr[i2].m4686c(Integer.bitCount(trieNode.f16816a) * 2, iM4681t, trieNode.f16819d);
            m4659f(i, trieNodeM4680s, obj, i2 + 1);
            return;
        }
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i2];
        Object[] objArr = trieNode.f16819d;
        trieNodeBaseIterator.m4686c(objArr.length, 0, objArr);
        while (true) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i2];
            if (Intrinsics.m18594b(trieNodeBaseIterator2.f16822a[trieNodeBaseIterator2.f16824c], obj)) {
                this.f16796b = i2;
                return;
            } else {
                trieNodeBaseIteratorArr[i2].f16824c += 2;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final Object next() {
        if (this.f16804d.f16802f != this.f16807i) {
            throw new ConcurrentModificationException();
        }
        if (!this.f16797c) {
            throw new NoSuchElementException();
        }
        TrieNodeBaseIterator trieNodeBaseIterator = this.f16795a[this.f16796b];
        this.f16805f = trieNodeBaseIterator.f16822a[trieNodeBaseIterator.f16824c];
        this.f16806g = true;
        return super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public final void remove() {
        if (!this.f16806g) {
            throw new IllegalStateException();
        }
        boolean z2 = this.f16797c;
        PersistentHashMapBuilder persistentHashMapBuilder = this.f16804d;
        if (!z2) {
            TypeIntrinsics.m18627c(persistentHashMapBuilder).remove(this.f16805f);
        } else {
            if (!z2) {
                throw new NoSuchElementException();
            }
            TrieNodeBaseIterator trieNodeBaseIterator = this.f16795a[this.f16796b];
            Object obj = trieNodeBaseIterator.f16822a[trieNodeBaseIterator.f16824c];
            TypeIntrinsics.m18627c(persistentHashMapBuilder).remove(this.f16805f);
            m4659f(obj != null ? obj.hashCode() : 0, persistentHashMapBuilder.f16800c, obj, 0);
        }
        this.f16805f = null;
        this.f16806g = false;
        this.f16807i = persistentHashMapBuilder.f16802f;
    }
}
