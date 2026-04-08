package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    /* JADX INFO: renamed from: c */
    public abstract int mo20323c();

    /* JADX INFO: renamed from: e */
    public abstract void mo20324e(int i, Object obj);

    public abstract Object get(int i);

    @Override // java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
