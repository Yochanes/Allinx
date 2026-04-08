package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@SourceDebugExtension
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: renamed from: f */
    public static final SnapshotIdSet f17030f = new SnapshotIdSet(0, 0, 0, null);

    /* JADX INFO: renamed from: a */
    public final long f17031a;

    /* JADX INFO: renamed from: b */
    public final long f17032b;

    /* JADX INFO: renamed from: c */
    public final long f17033c;

    /* JADX INFO: renamed from: d */
    public final long[] f17034d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m18559f = "SnapshotIdSet.kt", m18560l = {252, 256, 263}, m18561m = "invokeSuspend")
    @SourceDebugExtension
    final class C12041 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        public long[] f17035b;

        /* JADX INFO: renamed from: c */
        public int f17036c;

        /* JADX INFO: renamed from: d */
        public int f17037d;

        /* JADX INFO: renamed from: f */
        public int f17038f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f17039g;

        public C12041(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12041 c12041 = SnapshotIdSet.this.new C12041(continuation);
            c12041.f17039g = obj;
            return c12041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C12041) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:26:0x009e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c8 -> B:37:0x00ca). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            SequenceScope sequenceScope;
            long[] jArr;
            int length;
            int i;
            SequenceScope sequenceScope2;
            int i2;
            SequenceScope sequenceScope3;
            int i3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i4 = this.f17038f;
            SnapshotIdSet snapshotIdSet = SnapshotIdSet.this;
            long j2 = snapshotIdSet.f17031a;
            long j3 = snapshotIdSet.f17033c;
            long j4 = snapshotIdSet.f17032b;
            if (i4 == 0) {
                j = 1;
                ResultKt.m18313b(obj);
                sequenceScope = (SequenceScope) this.f17039g;
                jArr = snapshotIdSet.f17034d;
                if (jArr != null) {
                    length = jArr.length;
                    i = 0;
                }
                if (j4 != 0) {
                    sequenceScope2 = sequenceScope;
                    i2 = 0;
                    if (i2 >= 64) {
                    }
                }
                if (j2 != 0) {
                }
                return Unit.f51459a;
            }
            if (i4 == 1) {
                length = this.f17037d;
                int i5 = this.f17036c;
                j = 1;
                jArr = this.f17035b;
                sequenceScope = (SequenceScope) this.f17039g;
                ResultKt.m18313b(obj);
                i = i5 + 1;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = this.f17036c;
                    sequenceScope3 = (SequenceScope) this.f17039g;
                    ResultKt.m18313b(obj);
                    j = 1;
                    i3 = i6 + 1;
                    if (i3 < 64) {
                        if (((j << i3) & j2) != 0) {
                            Long l = new Long(j3 + ((long) i3) + ((long) 64));
                            this.f17039g = sequenceScope3;
                            this.f17035b = null;
                            this.f17036c = i3;
                            this.f17038f = 3;
                            sequenceScope3.mo20357c(l, this);
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f51584a;
                            return coroutineSingletons;
                        }
                        i6 = i3;
                        i3 = i6 + 1;
                        if (i3 < 64) {
                        }
                    }
                    return Unit.f51459a;
                }
                i2 = this.f17036c;
                sequenceScope2 = (SequenceScope) this.f17039g;
                ResultKt.m18313b(obj);
                j = 1;
                i2++;
                if (i2 >= 64) {
                    sequenceScope = sequenceScope2;
                    if (j2 != 0) {
                        sequenceScope3 = sequenceScope;
                        i3 = 0;
                        if (i3 < 64) {
                        }
                    }
                    return Unit.f51459a;
                }
                if ((j4 & (j << i2)) != 0) {
                    Long l2 = new Long(j3 + ((long) i2));
                    this.f17039g = sequenceScope2;
                    this.f17035b = null;
                    this.f17036c = i2;
                    this.f17038f = 2;
                    sequenceScope2.mo20357c(l2, this);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.f51584a;
                    return coroutineSingletons;
                }
                i2++;
                if (i2 >= 64) {
                }
            }
            if (i < length) {
                Long l3 = new Long(jArr[i]);
                this.f17039g = sequenceScope;
                this.f17035b = jArr;
                this.f17036c = i;
                this.f17037d = length;
                this.f17038f = 1;
                sequenceScope.mo20357c(l3, this);
                return coroutineSingletons;
            }
            if (j4 != 0) {
            }
            if (j2 != 0) {
            }
            return Unit.f51459a;
        }
    }

    public SnapshotIdSet(long j, long j2, long j3, long[] jArr) {
        this.f17031a = j;
        this.f17032b = j2;
        this.f17033c = j3;
        this.f17034d = jArr;
    }

    /* JADX INFO: renamed from: c */
    public final SnapshotIdSet m4797c(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetM4798e;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2 = f17030f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j = snapshotIdSet.f17033c;
        long j2 = this.f17033c;
        long[] jArr2 = snapshotIdSet.f17034d;
        long j3 = snapshotIdSet.f17032b;
        long j4 = snapshotIdSet.f17031a;
        if (j == j2 && jArr2 == (jArr = this.f17034d)) {
            return new SnapshotIdSet(this.f17031a & (~j4), this.f17032b & (~j3), j2, jArr);
        }
        if (jArr2 != null) {
            snapshotIdSetM4798e = this;
            for (long j5 : jArr2) {
                snapshotIdSetM4798e = snapshotIdSetM4798e.m4798e(j5);
            }
        } else {
            snapshotIdSetM4798e = this;
        }
        long j6 = 0;
        long j7 = snapshotIdSet.f17033c;
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if ((j3 & (1 << i)) != 0) {
                    snapshotIdSetM4798e = snapshotIdSetM4798e.m4798e(((long) i) + j7);
                }
            }
        }
        if (j4 != 0) {
            int i2 = 0;
            while (i2 < 64) {
                if (((1 << i2) & j4) != j6) {
                    snapshotIdSetM4798e = snapshotIdSetM4798e.m4798e(((long) i2) + j7 + ((long) 64));
                }
                i2++;
                j6 = 0;
            }
        }
        return snapshotIdSetM4798e;
    }

    /* JADX INFO: renamed from: e */
    public final SnapshotIdSet m4798e(long j) {
        long[] jArr;
        int iM4802a;
        long[] jArr2;
        long j2 = this.f17033c;
        long j3 = j - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.f17032b;
            if ((j5 & j4) != 0) {
                return new SnapshotIdSet(this.f17031a, j5 & (~j4), j2, this.f17034d);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.f17031a;
            if ((j7 & j6) != 0) {
                return new SnapshotIdSet(j7 & (~j6), this.f17032b, j2, this.f17034d);
            }
        } else if (j3 < 0 && (jArr = this.f17034d) != null && (iM4802a = SnapshotId_jvmKt.m4802a(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM4802a > 0) {
                    ArraysKt.m18382q(jArr, jArr3, 0, 0, iM4802a);
                }
                if (iM4802a < i) {
                    ArraysKt.m18382q(jArr, jArr3, iM4802a, iM4802a + 1, length);
                }
                jArr2 = jArr3;
            }
            return new SnapshotIdSet(this.f17031a, this.f17032b, this.f17033c, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4799f(long j) {
        long[] jArr;
        long j2 = j - this.f17033c;
        return (j2 < 0 || j2 >= 64) ? (j2 < 64 || j2 >= 128) ? j2 <= 0 && (jArr = this.f17034d) != null && SnapshotId_jvmKt.m4802a(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.f17031a) != 0 : ((1 << ((int) j2)) & this.f17032b) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final SnapshotIdSet m4800g(SnapshotIdSet snapshotIdSet) {
        long j;
        SnapshotIdSet snapshotIdSetM4801j;
        SnapshotIdSet snapshotIdSetM4801j2 = snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = f17030f;
        if (snapshotIdSetM4801j2 == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSetM4801j2;
        }
        long j2 = snapshotIdSetM4801j2.f17033c;
        long j3 = this.f17033c;
        long j4 = this.f17032b;
        long j5 = this.f17031a;
        long[] jArr = snapshotIdSetM4801j2.f17034d;
        long j6 = snapshotIdSetM4801j2.f17032b;
        long j7 = snapshotIdSetM4801j2.f17031a;
        if (j2 == j3) {
            long[] jArr2 = this.f17034d;
            j = j4;
            if (jArr == jArr2) {
                return new SnapshotIdSet(j5 | j7, j | j6, j3, jArr2);
            }
        } else {
            j = j4;
        }
        int i = 0;
        long[] jArr3 = this.f17034d;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j8 : jArr3) {
                    snapshotIdSetM4801j2 = snapshotIdSetM4801j2.m4801j(j8);
                }
            }
            long j9 = this.f17033c;
            if (j != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j) != 0) {
                        snapshotIdSetM4801j2 = snapshotIdSetM4801j2.m4801j(((long) i2) + j9);
                    }
                }
            }
            if (j5 != 0) {
                while (i < 64) {
                    if (((1 << i) & j5) != 0) {
                        snapshotIdSetM4801j2 = snapshotIdSetM4801j2.m4801j(((long) i) + j9 + ((long) 64));
                    }
                    i++;
                }
            }
            return snapshotIdSetM4801j2;
        }
        if (jArr != null) {
            snapshotIdSetM4801j = this;
            for (long j10 : jArr) {
                snapshotIdSetM4801j = snapshotIdSetM4801j.m4801j(j10);
            }
        } else {
            snapshotIdSetM4801j = this;
        }
        long j11 = snapshotIdSetM4801j2.f17033c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    snapshotIdSetM4801j = snapshotIdSetM4801j.m4801j(((long) i3) + j11);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    snapshotIdSetM4801j = snapshotIdSetM4801j.m4801j(((long) i) + j11 + ((long) 64));
                }
                i++;
            }
        }
        return snapshotIdSetM4801j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return SequencesKt.m20370l(new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new C12041(null)).f55141a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SnapshotIdSet m4801j(long j) {
        long j2;
        int i;
        long j3;
        long[] jArr;
        int i2;
        long j4;
        long j5 = this.f17033c;
        long j6 = j - j5;
        long j7 = this.f17032b;
        if (j6 < 0 || j6 >= 64) {
            long j8 = this.f17031a;
            if (j6 < 64 || j6 >= 128) {
                long[] jArr2 = this.f17034d;
                if (j6 < 128) {
                    if (jArr2 == null) {
                        return new SnapshotIdSet(j8, j7, j5, new long[]{j});
                    }
                    int iM4802a = SnapshotId_jvmKt.m4802a(jArr2, j);
                    if (iM4802a < 0) {
                        int i3 = -(iM4802a + 1);
                        int length = jArr2.length;
                        long[] jArr3 = new long[length + 1];
                        ArraysKt.m18382q(jArr2, jArr3, 0, 0, i3);
                        ArraysKt.m18382q(jArr2, jArr3, i3 + 1, i3, length);
                        jArr3[i3] = j;
                        return new SnapshotIdSet(this.f17031a, this.f17032b, this.f17033c, jArr3);
                    }
                } else if (!m4799f(j)) {
                    long j9 = 64;
                    long j10 = ((j + 1) / j9) * j9;
                    if (j10 < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long[] jArr4 = null;
                    long j11 = j7;
                    int i4 = 1;
                    long j12 = this.f17033c;
                    long j13 = j8;
                    SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
                    while (true) {
                        if (j12 >= j10) {
                            j2 = j12;
                            i = i4;
                            j3 = j11;
                            break;
                        }
                        if (j11 != 0) {
                            if (snapshotIdArrayBuilder == null) {
                                snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(jArr2);
                            }
                            int i5 = 0;
                            while (i5 < 64) {
                                if ((j11 & (1 << i5)) != 0) {
                                    i2 = i4;
                                    j4 = j10;
                                    snapshotIdArrayBuilder.f17029a.m2037a(((long) i5) + j12);
                                } else {
                                    i2 = i4;
                                    j4 = j10;
                                }
                                i5++;
                                i4 = i2;
                                j10 = j4;
                            }
                        }
                        int i6 = i4;
                        long j14 = j10;
                        if (j13 == 0) {
                            i = i6;
                            j2 = j14;
                            j3 = 0;
                            break;
                        }
                        j12 += j9;
                        i4 = i6;
                        j11 = j13;
                        j10 = j14;
                        j13 = 0;
                    }
                    if (snapshotIdArrayBuilder == null) {
                        jArr = jArr2;
                    } else {
                        MutableLongList mutableLongList = snapshotIdArrayBuilder.f17029a;
                        int i7 = mutableLongList.f3710b;
                        if (i7 != 0) {
                            jArr4 = new long[i7];
                            long[] jArr5 = mutableLongList.f3709a;
                            for (int i8 = 0; i8 < i7; i8 += i) {
                                jArr4[i8] = jArr5[i8];
                            }
                        }
                        if (jArr4 != null) {
                            jArr = jArr4;
                        }
                    }
                    return new SnapshotIdSet(j13, j3, j2, jArr).m4801j(j);
                }
            } else {
                long j15 = 1 << (((int) j6) - 64);
                if ((j8 & j15) == 0) {
                    return new SnapshotIdSet(j8 | j15, j7, j5, this.f17034d);
                }
            }
        } else {
            long j16 = 1 << ((int) j6);
            if ((j7 & j16) == 0) {
                return new SnapshotIdSet(this.f17031a, j7 | j16, j5, this.f17034d);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
