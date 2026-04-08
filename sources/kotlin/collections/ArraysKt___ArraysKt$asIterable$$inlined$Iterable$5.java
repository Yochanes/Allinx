package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u001c\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5 implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long[] f51490a;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(long[] jArr) {
        this.f51490a = jArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return ArrayIteratorsKt.m18580d(this.f51490a);
    }
}
