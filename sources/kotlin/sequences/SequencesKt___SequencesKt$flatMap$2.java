package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements Function1<Sequence<Object>, Iterator<Object>> {

    /* JADX INFO: renamed from: a */
    public static final SequencesKt___SequencesKt$flatMap$2 f55144a = new SequencesKt___SequencesKt$flatMap$2(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sequence p0 = (Sequence) obj;
        Intrinsics.m18599g(p0, "p0");
        return p0.getF55142a();
    }
}
