package kotlin.sequences;

import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a */
    public final int f55145a;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62441 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public int f55146a;

        public C62441() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f55146a < SubSequence.this.f55145a) {
                throw null;
            }
            if (this.f55146a >= 0) {
                return false;
            }
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f55146a < SubSequence.this.f55145a) {
                throw null;
            }
            int i = this.f55146a;
            if (i >= 0) {
                throw new NoSuchElementException();
            }
            this.f55146a = i + 1;
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public SubSequence(int i) {
        Intrinsics.m18599g(null, MTPushConstants.Operation.KEY_SEQUENCE);
        this.f55145a = i;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i > 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "endIndex should be not less than startIndex, but was 0 < ").toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* JADX INFO: renamed from: a */
    public final Sequence mo20353a(int i) {
        int i2 = this.f55145a;
        return i >= 0 - i2 ? EmptySequence.f55115a : new SubSequence(i2 + i);
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        new C62441();
        throw null;
    }
}
