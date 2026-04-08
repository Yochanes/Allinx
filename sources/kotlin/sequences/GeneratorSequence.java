package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/GeneratorSequence;", "", "T", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class GeneratorSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a */
    public final Function0 f55130a;

    /* JADX INFO: renamed from: b */
    public final Function1 f55131b;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62411 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public Object f55132a;

        /* JADX INFO: renamed from: b */
        public int f55133b = -2;

        public C62411() {
        }

        /* JADX INFO: renamed from: c */
        public final void m20356c() {
            Object objInvoke;
            int i = this.f55133b;
            GeneratorSequence generatorSequence = GeneratorSequence.this;
            if (i == -2) {
                objInvoke = generatorSequence.f55130a.invoke();
            } else {
                Function1 function1 = generatorSequence.f55131b;
                Object obj = this.f55132a;
                Intrinsics.m18596d(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f55132a = objInvoke;
            this.f55133b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f55133b < 0) {
                m20356c();
            }
            return this.f55133b == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f55133b < 0) {
                m20356c();
            }
            if (this.f55133b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f55132a;
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f55133b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public GeneratorSequence(Function0 function0, Function1 function1) {
        this.f55130a = function0;
        this.f55131b = function1;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new C62411();
    }
}
