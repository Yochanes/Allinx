package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class EmptySequence implements Sequence, DropTakeSequence {

    /* JADX INFO: renamed from: a */
    public static final EmptySequence f55115a = new EmptySequence();

    @Override // kotlin.sequences.DropTakeSequence
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Sequence mo20353a(int i) {
        return f55115a;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return EmptyIterator.f51495a;
    }
}
