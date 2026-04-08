package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class StateSetIterator<T> implements Iterator<T>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateSet f17123a;

    /* JADX INFO: renamed from: b */
    public final Iterator f17124b;

    /* JADX INFO: renamed from: c */
    public Object f17125c;

    /* JADX INFO: renamed from: d */
    public Object f17126d;

    /* JADX INFO: renamed from: f */
    public int f17127f;

    public StateSetIterator(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f17123a = snapshotStateSet;
        this.f17124b = it;
        this.f17127f = snapshotStateSet.m4846f();
        this.f17125c = this.f17126d;
        this.f17126d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17126d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17123a.m4846f() != this.f17127f) {
            throw new ConcurrentModificationException();
        }
        this.f17125c = this.f17126d;
        Iterator it = this.f17124b;
        this.f17126d = it.hasNext() ? it.next() : null;
        Object obj = this.f17125c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.f17123a;
        if (snapshotStateSet.m4846f() != this.f17127f) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f17125c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        snapshotStateSet.remove(obj);
        this.f17125c = null;
        this.f17127f = snapshotStateSet.m4846f();
    }
}
