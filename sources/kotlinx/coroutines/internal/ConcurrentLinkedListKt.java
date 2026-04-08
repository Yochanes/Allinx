package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cur", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConcurrentLinkedListKt {

    /* JADX INFO: renamed from: a */
    public static final Symbol f56313a = new Symbol("CLOSED");

    /* JADX INFO: renamed from: a */
    public static final Object m20814a(Segment segment, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (segment.f56355c >= j && !segment.mo20817c()) {
                return segment;
            }
            Object obj = ConcurrentLinkedListNode.f56314a.get(segment);
            Symbol symbol = f56313a;
            if (obj == symbol) {
                return symbol;
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) obj);
            if (segment2 == null) {
                segment2 = (Segment) function2.invoke(Long.valueOf(segment.f56355c + 1), segment);
                do {
                    atomicReferenceFieldUpdater = ConcurrentLinkedListNode.f56314a;
                    if (atomicReferenceFieldUpdater.compareAndSet(segment, null, segment2)) {
                        if (segment.mo20817c()) {
                            segment.m20818e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(segment) == null);
            }
            segment = segment2;
        }
    }
}
