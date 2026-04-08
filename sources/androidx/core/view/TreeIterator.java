package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/core/view/TreeIterator;", "T", "", "core-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TreeIterator<T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final Function1 f23396a = ViewGroupKt$descendants$1$1.f23425a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f23397b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Iterator f23398c;

    public TreeIterator(Iterator it) {
        this.f23398c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23398c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f23398c.next();
        Iterator it = (Iterator) ViewGroupKt$descendants$1$1.f23425a.invoke(next);
        ArrayList arrayList = this.f23397b;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f23398c);
            this.f23398c = it;
            return next;
        }
        while (!this.f23398c.hasNext() && !arrayList.isEmpty()) {
            this.f23398c = (Iterator) CollectionsKt.m18411L(arrayList);
            CollectionsKt.m18430e0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
