package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "K", "V", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public Object[] f16822a = TrieNode.f16815e.f16819d;

    /* JADX INFO: renamed from: b */
    public int f16823b;

    /* JADX INFO: renamed from: c */
    public int f16824c;

    /* JADX INFO: renamed from: c */
    public final void m4686c(int i, int i2, Object[] objArr) {
        this.f16822a = objArr;
        this.f16823b = i;
        this.f16824c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16824c < this.f16823b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
