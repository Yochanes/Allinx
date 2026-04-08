package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public int f51467a;

    /* JADX INFO: renamed from: b */
    public Object f51468b;

    /* JADX INFO: renamed from: c */
    public abstract void mo18318c();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f51467a;
        if (i == 0) {
            this.f51467a = 3;
            mo18318c();
            return this.f51467a == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f51467a;
        if (i == 1) {
            this.f51467a = 0;
            return this.f51468b;
        }
        if (i != 2) {
            this.f51467a = 3;
            mo18318c();
            if (this.f51467a == 1) {
                this.f51467a = 0;
                return this.f51468b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
