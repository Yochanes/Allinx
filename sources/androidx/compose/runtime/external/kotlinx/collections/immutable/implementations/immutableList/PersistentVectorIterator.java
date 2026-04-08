package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {

    /* JADX INFO: renamed from: c */
    public final Object[] f16776c;

    /* JADX INFO: renamed from: d */
    public final TrieIterator f16777d;

    public PersistentVectorIterator(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.f16776c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f16777d = new TrieIterator(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        TrieIterator trieIterator = this.f16777d;
        if (trieIterator.hasNext()) {
            this.f16758a++;
            return trieIterator.next();
        }
        int i = this.f16758a;
        this.f16758a = i + 1;
        return this.f16776c[i - trieIterator.f16759b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f16758a;
        TrieIterator trieIterator = this.f16777d;
        int i2 = trieIterator.f16759b;
        if (i <= i2) {
            this.f16758a = i - 1;
            return trieIterator.previous();
        }
        int i3 = i - 1;
        this.f16758a = i3;
        return this.f16776c[i3 - i2];
    }
}
