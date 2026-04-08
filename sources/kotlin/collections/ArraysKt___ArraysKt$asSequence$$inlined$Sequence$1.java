package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m18302d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1 implements Sequence<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object[] f51493a;

    public ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1(Object[] objArr) {
        this.f51493a = objArr;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return ArrayIteratorKt.m18576a(this.f51493a);
    }
}
