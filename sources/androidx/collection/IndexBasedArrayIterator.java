package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/IndexBasedArrayIterator;", "T", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public int f3669a;

    /* JADX INFO: renamed from: b */
    public int f3670b;

    /* JADX INFO: renamed from: c */
    public boolean f3671c;

    public IndexBasedArrayIterator(int i) {
        this.f3669a = i;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo1978c(int i);

    /* JADX INFO: renamed from: e */
    public abstract void mo1979e(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3670b < this.f3669a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo1978c = mo1978c(this.f3670b);
        this.f3670b++;
        this.f3671c = true;
        return objMo1978c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3671c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f3670b - 1;
        this.f3670b = i;
        mo1979e(i);
        this.f3669a--;
        this.f3671c = false;
    }
}
