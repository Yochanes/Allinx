package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TrieIterator<E> extends AbstractListIterator<E> {

    /* JADX INFO: renamed from: c */
    public int f16785c;

    /* JADX INFO: renamed from: d */
    public Object[] f16786d;

    /* JADX INFO: renamed from: f */
    public boolean f16787f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f16785c = i3;
        Object[] objArr2 = new Object[i3];
        this.f16786d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f16787f = r5;
        objArr2[0] = objArr;
        m4640e(i - r5, 1);
    }

    /* JADX INFO: renamed from: c */
    public final Object m4639c() {
        int i = this.f16758a & 31;
        Object obj = this.f16786d[this.f16785c - 1];
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    /* JADX INFO: renamed from: e */
    public final void m4640e(int i, int i2) {
        int i3 = (this.f16785c - i2) * 5;
        while (i2 < this.f16785c) {
            Object[] objArr = this.f16786d;
            Object obj = objArr[i2 - 1];
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[UtilsKt.m4642a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4641f(int i) {
        int i2 = 0;
        while (UtilsKt.m4642a(this.f16758a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m4640e(this.f16758a, ((this.f16785c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM4639c = m4639c();
        int i = this.f16758a + 1;
        this.f16758a = i;
        if (i == this.f16759b) {
            this.f16787f = true;
            return objM4639c;
        }
        m4641f(0);
        return objM4639c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f16758a--;
        if (this.f16787f) {
            this.f16787f = false;
            return m4639c();
        }
        m4641f(31);
        return m4639c();
    }
}
