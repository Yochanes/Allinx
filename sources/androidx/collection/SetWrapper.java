package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/SetWrapper;", "E", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
class SetWrapper<E> implements Set<E>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final ScatterSet f3852a;

    /* JADX INFO: renamed from: androidx.collection.SetWrapper$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.collection.SetWrapper$iterator$1", m18559f = "ScatterSet.kt", m18560l = {1153}, m18561m = "invokeSuspend")
    @SourceDebugExtension
    final class C04311 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        public Object[] f3853b;

        /* JADX INFO: renamed from: c */
        public long[] f3854c;

        /* JADX INFO: renamed from: d */
        public int f3855d;

        /* JADX INFO: renamed from: f */
        public int f3856f;

        /* JADX INFO: renamed from: g */
        public int f3857g;

        /* JADX INFO: renamed from: i */
        public int f3858i;

        /* JADX INFO: renamed from: j */
        public long f3859j;

        /* JADX INFO: renamed from: n */
        public int f3860n;

        /* JADX INFO: renamed from: o */
        public /* synthetic */ Object f3861o;

        public C04311(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C04311 c04311 = new C04311(continuation);
            c04311.f3861o = obj;
            return c04311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C04311) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            Object[] objArr;
            long[] jArr;
            int length;
            int i;
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = this.f3860n;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                sequenceScope = (SequenceScope) this.f3861o;
                ScatterSet scatterSet = SetWrapper.this.f3852a;
                objArr = scatterSet.f3847b;
                jArr = scatterSet.f3846a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    }
                    if (i != length) {
                    }
                }
                return Unit.f51459a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.f3858i;
            int i4 = this.f3857g;
            long j2 = this.f3859j;
            i = this.f3856f;
            int i5 = this.f3855d;
            long[] jArr2 = this.f3854c;
            Object[] objArr2 = this.f3853b;
            SequenceScope sequenceScope2 = (SequenceScope) this.f3861o;
            ResultKt.m18313b(obj);
            j2 >>= 8;
            i3++;
            if (i3 < i4) {
                if (i4 == 8) {
                    length = i5;
                    jArr = jArr2;
                    objArr = objArr2;
                    sequenceScope = sequenceScope2;
                    if (i != length) {
                        i++;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            sequenceScope2 = sequenceScope;
                            i3 = 0;
                            jArr2 = jArr;
                            i5 = length;
                            i4 = 8 - ((~(i - length)) >>> 31);
                            objArr2 = objArr;
                            j2 = j;
                            if (i3 < i4) {
                                if ((255 & j2) < 128) {
                                    Object obj2 = objArr2[(i << 3) + i3];
                                    this.f3861o = sequenceScope2;
                                    this.f3853b = objArr2;
                                    this.f3854c = jArr2;
                                    this.f3855d = i5;
                                    this.f3856f = i;
                                    this.f3859j = j2;
                                    this.f3857g = i4;
                                    this.f3858i = i3;
                                    this.f3860n = 1;
                                    sequenceScope2.mo20357c(obj2, this);
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f51584a;
                                    return coroutineSingletons;
                                }
                                j2 >>= 8;
                                i3++;
                                if (i3 < i4) {
                                }
                            }
                        }
                        if (i != length) {
                        }
                    }
                }
                return Unit.f51459a;
            }
        }
    }

    public SetWrapper(ScatterSet parent) {
        Intrinsics.m18599g(parent, "parent");
        this.f3852a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3852a.m2117b(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f3852a.m2117b(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.m18594b(this.f3852a, ((SetWrapper) obj).f3852a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f3852a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f3852a.m2118c();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return SequencesKt.m20370l(new C04311(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3852a.f3849d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.m18590a(this);
    }

    public final String toString() {
        return this.f3852a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.m18599g(array, "array");
        return CollectionToArray.m18591b(this, array);
    }
}
