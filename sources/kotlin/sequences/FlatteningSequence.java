package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "State", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* JADX INFO: renamed from: a */
    public final Sequence f55123a;

    /* JADX INFO: renamed from: b */
    public final Function1 f55124b;

    /* JADX INFO: renamed from: c */
    public final Function1 f55125c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/sequences/FlatteningSequence$State;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class State {
    }

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62401 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final Iterator f55126a;

        /* JADX INFO: renamed from: b */
        public Iterator f55127b;

        /* JADX INFO: renamed from: c */
        public int f55128c;

        public C62401() {
            this.f55126a = FlatteningSequence.this.f55123a.getF55142a();
        }

        /* JADX INFO: renamed from: c */
        public final boolean m20355c() {
            Iterator it;
            Iterator it2 = this.f55127b;
            if (it2 != null && it2.hasNext()) {
                this.f55128c = 1;
                return true;
            }
            do {
                Iterator it3 = this.f55126a;
                if (!it3.hasNext()) {
                    this.f55128c = 2;
                    this.f55127b = null;
                    return false;
                }
                Object next = it3.next();
                FlatteningSequence flatteningSequence = FlatteningSequence.this;
                it = (Iterator) flatteningSequence.f55125c.invoke(flatteningSequence.f55124b.invoke(next));
            } while (!it.hasNext());
            this.f55127b = it;
            this.f55128c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f55128c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return m20355c();
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i = this.f55128c;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !m20355c()) {
                throw new NoSuchElementException();
            }
            this.f55128c = 0;
            Iterator it = this.f55127b;
            Intrinsics.m18596d(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FlatteningSequence(Sequence sequence, Function1 transformer, Function1 function1) {
        Intrinsics.m18599g(transformer, "transformer");
        this.f55123a = sequence;
        this.f55124b = transformer;
        this.f55125c = function1;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new C62401();
    }
}
