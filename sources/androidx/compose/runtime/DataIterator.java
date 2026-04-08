package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/DataIterator;", "", "", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class DataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public int f16336a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16336a < 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f16336a;
        if (i >= 0) {
            throw null;
        }
        this.f16336a = i + 1;
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this;
    }
}
