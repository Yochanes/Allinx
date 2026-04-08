package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* JADX INFO: renamed from: c */
    public final PersistentVectorBuilder f16778c;

    /* JADX INFO: renamed from: d */
    public int f16779d;

    /* JADX INFO: renamed from: f */
    public TrieIterator f16780f;

    /* JADX INFO: renamed from: g */
    public int f16781g;

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.f16774j);
        this.f16778c = persistentVectorBuilder;
        this.f16779d = persistentVectorBuilder.m4623j();
        this.f16781g = -1;
        m4638e();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void add(Object obj) {
        m4637c();
        int i = this.f16758a;
        PersistentVectorBuilder persistentVectorBuilder = this.f16778c;
        persistentVectorBuilder.add(i, obj);
        this.f16758a++;
        this.f16759b = persistentVectorBuilder.getF16774j();
        this.f16779d = persistentVectorBuilder.m4623j();
        this.f16781g = -1;
        m4638e();
    }

    /* JADX INFO: renamed from: c */
    public final void m4637c() {
        if (this.f16779d != this.f16778c.m4623j()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: e */
    public final void m4638e() {
        PersistentVectorBuilder persistentVectorBuilder = this.f16778c;
        Object[] objArr = persistentVectorBuilder.f16772g;
        if (objArr == null) {
            this.f16780f = null;
            return;
        }
        int i = (persistentVectorBuilder.f16774j - 1) & (-32);
        int i2 = this.f16758a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (persistentVectorBuilder.f16770d / 5) + 1;
        TrieIterator trieIterator = this.f16780f;
        if (trieIterator == null) {
            this.f16780f = new TrieIterator(objArr, i2, i, i3);
            return;
        }
        trieIterator.f16758a = i2;
        trieIterator.f16759b = i;
        trieIterator.f16785c = i3;
        if (trieIterator.f16786d.length < i3) {
            trieIterator.f16786d = new Object[i3];
        }
        trieIterator.f16786d[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        trieIterator.f16787f = r6;
        trieIterator.m4640e(i2 - r6, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m4637c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f16758a;
        this.f16781g = i;
        TrieIterator trieIterator = this.f16780f;
        PersistentVectorBuilder persistentVectorBuilder = this.f16778c;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.f16773i;
            this.f16758a = i + 1;
            return objArr[i];
        }
        if (trieIterator.hasNext()) {
            this.f16758a++;
            return trieIterator.next();
        }
        Object[] objArr2 = persistentVectorBuilder.f16773i;
        int i2 = this.f16758a;
        this.f16758a = i2 + 1;
        return objArr2[i2 - trieIterator.f16759b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m4637c();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f16758a;
        this.f16781g = i - 1;
        TrieIterator trieIterator = this.f16780f;
        PersistentVectorBuilder persistentVectorBuilder = this.f16778c;
        if (trieIterator == null) {
            Object[] objArr = persistentVectorBuilder.f16773i;
            int i2 = i - 1;
            this.f16758a = i2;
            return objArr[i2];
        }
        int i3 = trieIterator.f16759b;
        if (i <= i3) {
            this.f16758a = i - 1;
            return trieIterator.previous();
        }
        Object[] objArr2 = persistentVectorBuilder.f16773i;
        int i4 = i - 1;
        this.f16758a = i4;
        return objArr2[i4 - i3];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m4637c();
        int i = this.f16781g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder = this.f16778c;
        persistentVectorBuilder.mo4621e(i);
        int i2 = this.f16781g;
        if (i2 < this.f16758a) {
            this.f16758a = i2;
        }
        this.f16759b = persistentVectorBuilder.getF16774j();
        this.f16779d = persistentVectorBuilder.m4623j();
        this.f16781g = -1;
        m4638e();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void set(Object obj) {
        m4637c();
        int i = this.f16781g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder persistentVectorBuilder = this.f16778c;
        persistentVectorBuilder.set(i, obj);
        this.f16779d = persistentVectorBuilder.m4623j();
        m4638e();
    }
}
