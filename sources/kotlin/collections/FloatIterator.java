package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0007\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/collections/FloatIterator;", "", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class FloatIterator implements Iterator<Float>, KMappedMarker {
    /* JADX INFO: renamed from: c */
    public abstract float mo18479c();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(mo18479c());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
