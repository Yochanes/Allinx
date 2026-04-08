package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class StateListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* JADX INFO: renamed from: a */
    public final SnapshotStateList f17108a;

    /* JADX INFO: renamed from: b */
    public int f17109b;

    /* JADX INFO: renamed from: c */
    public int f17110c = -1;

    /* JADX INFO: renamed from: d */
    public int f17111d;

    public StateListIterator(SnapshotStateList snapshotStateList, int i) {
        this.f17108a = snapshotStateList;
        this.f17109b = i - 1;
        this.f17111d = snapshotStateList.m4828j();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m4848c();
        int i = this.f17109b + 1;
        SnapshotStateList snapshotStateList = this.f17108a;
        snapshotStateList.add(i, obj);
        this.f17110c = -1;
        this.f17109b++;
        this.f17111d = snapshotStateList.m4828j();
    }

    /* JADX INFO: renamed from: c */
    public final void m4848c() {
        if (this.f17108a.m4828j() != this.f17111d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17109b < this.f17108a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17109b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m4848c();
        int i = this.f17109b + 1;
        this.f17110c = i;
        SnapshotStateList snapshotStateList = this.f17108a;
        SnapshotStateListKt.m4830a(i, snapshotStateList.size());
        Object obj = snapshotStateList.get(i);
        this.f17109b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17109b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m4848c();
        int i = this.f17109b;
        SnapshotStateList snapshotStateList = this.f17108a;
        SnapshotStateListKt.m4830a(i, snapshotStateList.size());
        int i2 = this.f17109b;
        this.f17110c = i2;
        this.f17109b--;
        return snapshotStateList.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17109b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m4848c();
        int i = this.f17109b;
        SnapshotStateList snapshotStateList = this.f17108a;
        snapshotStateList.remove(i);
        this.f17109b--;
        this.f17110c = -1;
        this.f17111d = snapshotStateList.m4828j();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m4848c();
        int i = this.f17110c;
        if (i < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        SnapshotStateList snapshotStateList = this.f17108a;
        snapshotStateList.set(i, obj);
        this.f17111d = snapshotStateList.m4828j();
    }
}
