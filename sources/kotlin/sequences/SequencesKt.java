package kotlin.sequences;

import io.intercom.android.sdk.p032m5.helpcenter.p034ui.components.C5511a;
import io.intercom.android.sdk.p032m5.inbox.C5555a;
import io.intercom.android.sdk.p032m5.push.C5615a;
import io.intercom.android.sdk.survey.block.C5698n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.TransformingSequence;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/sequences/SequencesKt__SequenceBuilderKt", "kotlin/sequences/SequencesKt__SequencesJVMKt", "kotlin/sequences/SequencesKt__SequencesKt", "kotlin/sequences/SequencesKt___SequencesJvmKt", "kotlin/sequences/SequencesKt___SequencesKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class SequencesKt extends SequencesKt___SequencesKt {
    /* JADX INFO: renamed from: b */
    public static Sequence m20360b(Iterator it) {
        Intrinsics.m18599g(it, "<this>");
        return new ConstrainedOnceSequence(new SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1(it));
    }

    /* JADX INFO: renamed from: c */
    public static int m20361c(Sequence sequence) {
        Iterator f55142a = sequence.getF55142a();
        int i = 0;
        while (f55142a.hasNext()) {
            f55142a.next();
            i++;
            if (i < 0) {
                CollectionsKt.m18453r0();
                throw null;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static Sequence m20362d(Sequence sequence, int i) {
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).mo20353a(i) : new DropSequence(sequence, i);
        }
        throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Requested element count ", " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Sequence m20363e() {
        return EmptySequence.f55115a;
    }

    /* JADX INFO: renamed from: f */
    public static FilteringSequence m20364f(Sequence sequence, Function1 function1) {
        Intrinsics.m18599g(sequence, "<this>");
        return new FilteringSequence(sequence, true, function1);
    }

    /* JADX INFO: renamed from: g */
    public static FilteringSequence m20365g(Sequence sequence, Function1 function1) {
        Intrinsics.m18599g(sequence, "<this>");
        return new FilteringSequence(sequence, false, function1);
    }

    /* JADX INFO: renamed from: h */
    public static FlatteningSequence m20366h(Sequence sequence, Function1 function1) {
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$2.f55144a);
    }

    /* JADX INFO: renamed from: i */
    public static Sequence m20367i(C5511a c5511a, Function1 function1) {
        return new GeneratorSequence(c5511a, function1);
    }

    /* JADX INFO: renamed from: j */
    public static Sequence m20368j(Object obj, Function1 function1) {
        return obj == null ? EmptySequence.f55115a : new GeneratorSequence(new C5555a(obj, 5), function1);
    }

    /* JADX INFO: renamed from: k */
    public static Sequence m20369k(Function0 function0) {
        return new ConstrainedOnceSequence(new GeneratorSequence(function0, new C5615a(function0)));
    }

    /* JADX INFO: renamed from: l */
    public static Iterator m20370l(Function2 function2) {
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.f55140d = IntrinsicsKt.m18555a(sequenceBuilderIterator, sequenceBuilderIterator, function2);
        return sequenceBuilderIterator;
    }

    /* JADX INFO: renamed from: m */
    public static Object m20371m(Sequence sequence) {
        Iterator f55142a = sequence.getF55142a();
        if (!f55142a.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = f55142a.next();
        while (f55142a.hasNext()) {
            next = f55142a.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: n */
    public static TransformingSequence m20372n(Sequence sequence, Function1 transform) {
        Intrinsics.m18599g(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    /* JADX INFO: renamed from: o */
    public static FilteringSequence m20373o(Sequence sequence, Function1 function1) {
        return m20365g(new TransformingSequence(sequence, function1), new C5698n(13));
    }

    /* JADX INFO: renamed from: p */
    public static FlatteningSequence m20374p(FlatteningSequence flatteningSequence, Iterable iterable) {
        return SequencesKt__SequencesKt.m20378a(ArraysKt.m18367f(new Sequence[]{flatteningSequence, CollectionsKt.m18444n(iterable)}));
    }

    /* JADX INFO: renamed from: q */
    public static FlatteningSequence m20375q(TransformingSequence transformingSequence, Object obj) {
        return SequencesKt__SequencesKt.m20378a(ArraysKt.m18367f(new Sequence[]{transformingSequence, ArraysKt.m18367f(new Object[]{obj})}));
    }

    /* JADX INFO: renamed from: r */
    public static List m20376r(Sequence sequence) {
        Intrinsics.m18599g(sequence, "<this>");
        Iterator f55142a = sequence.getF55142a();
        if (!f55142a.hasNext()) {
            return EmptyList.f51496a;
        }
        Object next = f55142a.next();
        if (!f55142a.hasNext()) {
            return CollectionsKt.m18413N(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (f55142a.hasNext()) {
            arrayList.add(f55142a.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m20377s(TransformingSequence transformingSequence) {
        Intrinsics.m18599g(transformingSequence, "<this>");
        ArrayList arrayList = new ArrayList();
        TransformingSequence.C62481 c62481 = new TransformingSequence.C62481();
        while (c62481.f55159a.hasNext()) {
            arrayList.add(c62481.next());
        }
        return arrayList;
    }
}
