package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TrieNode<E> {

    /* JADX INFO: renamed from: d */
    public static final TrieNode f16840d = new TrieNode(0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f16841a;

    /* JADX INFO: renamed from: b */
    public Object[] f16842b;

    /* JADX INFO: renamed from: c */
    public final MutabilityOwnership f16843c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f16841a = i;
        this.f16842b = objArr;
        this.f16843c = mutabilityOwnership;
    }

    /* JADX INFO: renamed from: h */
    public static TrieNode m4696h(int i, Object obj, int i2, Object obj2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership);
        }
        int iM4717c = TrieNodeKt.m4717c(i, i3);
        int iM4717c2 = TrieNodeKt.m4717c(i2, i3);
        if (iM4717c != iM4717c2) {
            return new TrieNode((1 << iM4717c) | (1 << iM4717c2), iM4717c < iM4717c2 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, mutabilityOwnership);
        }
        return new TrieNode(1 << iM4717c, new Object[]{m4696h(i, obj, i2, obj2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    /* JADX INFO: renamed from: a */
    public final TrieNode m4697a(int i, int i2, Object obj) {
        int iM4717c = 1 << TrieNodeKt.m4717c(i, i2);
        if (m4702f(iM4717c)) {
            return new TrieNode(this.f16841a | iM4717c, TrieNodeKt.m4715a(obj, this.f16842b, m4703g(iM4717c)), null);
        }
        int iM4703g = m4703g(iM4717c);
        Object obj2 = this.f16842b[iM4703g];
        if (obj2 instanceof TrieNode) {
            TrieNode trieNodeM4711p = m4711p(iM4703g);
            TrieNode trieNode = i2 == 30 ? ArraysKt.m18376k(trieNodeM4711p.f16842b, obj) ? trieNodeM4711p : new TrieNode(0, TrieNodeKt.m4715a(obj, trieNodeM4711p.f16842b, 0), null) : trieNodeM4711p.m4697a(i, i2 + 5, obj);
            if (trieNodeM4711p != trieNode) {
                return m4713r(iM4703g, trieNode);
            }
        } else if (!Intrinsics.m18594b(obj, obj2)) {
            Object[] objArr = this.f16842b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM4703g] = m4704i(iM4703g, i, obj, i2, null);
            return new TrieNode(this.f16841a, objArrCopyOf, null);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final int m4698b() {
        if (this.f16841a == 0) {
            return this.f16842b.length;
        }
        int iM4698b = 0;
        for (Object obj : this.f16842b) {
            iM4698b += obj instanceof TrieNode ? ((TrieNode) obj).m4698b() : 1;
        }
        return iM4698b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4699c(int i, int i2, Object obj) {
        int iM4717c = 1 << TrieNodeKt.m4717c(i, i2);
        if (m4702f(iM4717c)) {
            return false;
        }
        int iM4703g = m4703g(iM4717c);
        Object obj2 = this.f16842b[iM4703g];
        if (!(obj2 instanceof TrieNode)) {
            return Intrinsics.m18594b(obj, obj2);
        }
        TrieNode trieNodeM4711p = m4711p(iM4703g);
        return i2 == 30 ? ArraysKt.m18376k(trieNodeM4711p.f16842b, obj) : trieNodeM4711p.m4699c(i, i2 + 5, obj);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4700d(int i, TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (i > 30) {
            for (Object obj : trieNode.f16842b) {
                if (ArraysKt.m18376k(this.f16842b, obj)) {
                }
            }
            return true;
        }
        int i2 = this.f16841a;
        int i3 = trieNode.f16841a;
        int i4 = i2 & i3;
        if (i4 == i3) {
            while (i4 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i4);
                int iM4703g = m4703g(iLowestOneBit);
                int iM4703g2 = trieNode.m4703g(iLowestOneBit);
                Object obj2 = this.f16842b[iM4703g];
                Object obj3 = trieNode.f16842b[iM4703g2];
                boolean z2 = obj2 instanceof TrieNode;
                boolean z3 = obj3 instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.m18597e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.m18597e(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((TrieNode) obj2).m4700d(i + 5, (TrieNode) obj3)) {
                        i4 ^= iLowestOneBit;
                    }
                } else if (z2) {
                    Intrinsics.m18597e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((TrieNode) obj2).m4699c(obj3 != null ? obj3.hashCode() : 0, i + 5, obj3)) {
                        i4 ^= iLowestOneBit;
                    }
                } else if (!z3 && Intrinsics.m18594b(obj2, obj3)) {
                    i4 ^= iLowestOneBit;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4701e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f16841a != trieNode.f16841a) {
            return false;
        }
        int length = this.f16842b.length;
        for (int i = 0; i < length; i++) {
            if (this.f16842b[i] != trieNode.f16842b[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4702f(int i) {
        return (i & this.f16841a) == 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m4703g(int i) {
        return Integer.bitCount((i - 1) & this.f16841a);
    }

    /* JADX INFO: renamed from: i */
    public final TrieNode m4704i(int i, int i2, Object obj, int i3, MutabilityOwnership mutabilityOwnership) {
        Object obj2 = this.f16842b[i];
        return m4696h(obj2 != null ? obj2.hashCode() : 0, obj2, i2, obj, i3 + 5, mutabilityOwnership);
    }

    /* JADX INFO: renamed from: j */
    public final TrieNode m4705j(int i, Object obj, int i2, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNodeM4705j;
        int iM4717c = 1 << TrieNodeKt.m4717c(i, i2);
        boolean zM4702f = m4702f(iM4717c);
        MutabilityOwnership mutabilityOwnership = this.f16843c;
        if (zM4702f) {
            persistentHashSetBuilder.m4692f(persistentHashSetBuilder.f16832f + 1);
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f16829b;
            int iM4703g = m4703g(iM4717c);
            if (mutabilityOwnership != mutabilityOwnership2) {
                return new TrieNode(this.f16841a | iM4717c, TrieNodeKt.m4715a(obj, this.f16842b, iM4703g), mutabilityOwnership2);
            }
            this.f16842b = TrieNodeKt.m4715a(obj, this.f16842b, iM4703g);
            this.f16841a |= iM4717c;
            return this;
        }
        int iM4703g2 = m4703g(iM4717c);
        Object obj2 = this.f16842b[iM4703g2];
        if (obj2 instanceof TrieNode) {
            TrieNode trieNodeM4711p = m4711p(iM4703g2);
            if (i2 != 30) {
                trieNodeM4705j = trieNodeM4711p.m4705j(i, obj, i2 + 5, persistentHashSetBuilder);
            } else if (ArraysKt.m18376k(trieNodeM4711p.f16842b, obj)) {
                trieNodeM4705j = trieNodeM4711p;
            } else {
                persistentHashSetBuilder.m4692f(persistentHashSetBuilder.f16832f + 1);
                if (trieNodeM4711p.f16843c == persistentHashSetBuilder.f16829b) {
                    trieNodeM4711p.f16842b = TrieNodeKt.m4715a(obj, trieNodeM4711p.f16842b, 0);
                    trieNodeM4705j = trieNodeM4711p;
                } else {
                    trieNodeM4705j = new TrieNode(0, TrieNodeKt.m4715a(obj, trieNodeM4711p.f16842b, 0), persistentHashSetBuilder.f16829b);
                }
            }
            if (trieNodeM4711p != trieNodeM4705j) {
                return m4710o(iM4703g2, trieNodeM4705j, persistentHashSetBuilder.f16829b);
            }
        } else if (!Intrinsics.m18594b(obj, obj2)) {
            persistentHashSetBuilder.m4692f(persistentHashSetBuilder.f16832f + 1);
            MutabilityOwnership mutabilityOwnership3 = persistentHashSetBuilder.f16829b;
            if (mutabilityOwnership == mutabilityOwnership3) {
                this.f16842b[iM4703g2] = m4704i(iM4703g2, i, obj, i2, mutabilityOwnership3);
                return this;
            }
            Object[] objArr = this.f16842b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM4703g2] = m4704i(iM4703g2, i, obj, i2, mutabilityOwnership3);
            return new TrieNode(this.f16841a, objArrCopyOf, mutabilityOwnership3);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final TrieNode m4706k(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object objM4696h;
        if (this == trieNode) {
            deltaCounter.f16896a = m4698b() + deltaCounter.f16896a;
            return this;
        }
        MutabilityOwnership mutabilityOwnership = this.f16843c;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f16829b;
            if (this == trieNode) {
                deltaCounter.m4720a(this.f16842b.length);
                return this;
            }
            Object[] objArr = this.f16842b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f16842b.length);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            Object[] objArr2 = trieNode.f16842b;
            int length = this.f16842b.length;
            int i2 = 0;
            for (int i3 = 0; i3 < objArr2.length; i3++) {
                if (!ArraysKt.m18376k(this.f16842b, objArr2[i3])) {
                    objArrCopyOf[length + i2] = objArr2[i3];
                    i2++;
                }
            }
            int length2 = i2 + this.f16842b.length;
            deltaCounter.m4720a(objArrCopyOf.length - length2);
            if (length2 != this.f16842b.length) {
                if (length2 == trieNode.f16842b.length) {
                    return trieNode;
                }
                if (length2 != objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
                    Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
                }
                if (!Intrinsics.m18594b(mutabilityOwnership, mutabilityOwnership2)) {
                    return new TrieNode(0, objArrCopyOf, mutabilityOwnership2);
                }
                this.f16842b = objArrCopyOf;
                return this;
            }
        } else {
            int i4 = this.f16841a;
            int i5 = trieNode.f16841a | i4;
            TrieNode trieNode2 = (i5 == i4 && Intrinsics.m18594b(mutabilityOwnership, persistentHashSetBuilder.f16829b)) ? this : new TrieNode(i5, new Object[Integer.bitCount(i5)], persistentHashSetBuilder.f16829b);
            int i6 = 0;
            while (i5 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i5);
                int iM4703g = m4703g(iLowestOneBit);
                int iM4703g2 = trieNode.m4703g(iLowestOneBit);
                Object[] objArr3 = trieNode2.f16842b;
                if (m4702f(iLowestOneBit)) {
                    objM4696h = trieNode.f16842b[iM4703g2];
                } else if (trieNode.m4702f(iLowestOneBit)) {
                    objM4696h = this.f16842b[iM4703g];
                } else {
                    Object obj = this.f16842b[iM4703g];
                    Object obj2 = trieNode.f16842b[iM4703g2];
                    boolean z2 = obj instanceof TrieNode;
                    boolean z3 = obj2 instanceof TrieNode;
                    if (z2 && z3) {
                        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        objM4696h = ((TrieNode) obj).m4706k((TrieNode) obj2, i + 5, deltaCounter, persistentHashSetBuilder);
                    } else if (z2) {
                        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        TrieNode trieNode3 = (TrieNode) obj;
                        int i7 = persistentHashSetBuilder.f16832f;
                        objM4696h = trieNode3.m4705j(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.f16832f == i7) {
                            deltaCounter.f16896a++;
                        }
                    } else if (z3) {
                        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        TrieNode trieNode4 = (TrieNode) obj2;
                        int i8 = persistentHashSetBuilder.f16832f;
                        objM4696h = trieNode4.m4705j(obj != null ? obj.hashCode() : 0, obj, i + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.f16832f == i8) {
                            deltaCounter.f16896a++;
                        }
                    } else if (Intrinsics.m18594b(obj, obj2)) {
                        deltaCounter.f16896a++;
                        objM4696h = obj;
                    } else {
                        objM4696h = m4696h(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, persistentHashSetBuilder.f16829b);
                    }
                }
                objArr3[i6] = objM4696h;
                i6++;
                i5 ^= iLowestOneBit;
            }
            if (!m4701e(trieNode2)) {
                return trieNode.m4701e(trieNode2) ? trieNode : trieNode2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final TrieNode m4707l(int i, Object obj, int i2, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode trieNodeM4707l;
        int iM4717c = 1 << TrieNodeKt.m4717c(i, i2);
        if (!m4702f(iM4717c)) {
            int iM4703g = m4703g(iM4717c);
            Object obj2 = this.f16842b[iM4703g];
            boolean z2 = obj2 instanceof TrieNode;
            MutabilityOwnership mutabilityOwnership = this.f16843c;
            if (z2) {
                TrieNode trieNodeM4711p = m4711p(iM4703g);
                if (i2 == 30) {
                    int iM18345L = ArraysKt.m18345L(trieNodeM4711p.f16842b, obj);
                    if (iM18345L != -1) {
                        persistentHashSetBuilder.m4692f(persistentHashSetBuilder.f16832f - 1);
                        MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f16829b;
                        if (trieNodeM4711p.f16843c == mutabilityOwnership2) {
                            trieNodeM4711p.f16842b = TrieNodeKt.m4716b(iM18345L, trieNodeM4711p.f16842b);
                            trieNodeM4707l = trieNodeM4711p;
                        } else {
                            trieNodeM4707l = new TrieNode(0, TrieNodeKt.m4716b(iM18345L, trieNodeM4711p.f16842b), mutabilityOwnership2);
                        }
                    } else {
                        trieNodeM4707l = trieNodeM4711p;
                    }
                } else {
                    trieNodeM4707l = trieNodeM4711p.m4707l(i, obj, i2 + 5, persistentHashSetBuilder);
                }
                MutabilityOwnership mutabilityOwnership3 = persistentHashSetBuilder.f16829b;
                if (mutabilityOwnership == mutabilityOwnership3 || trieNodeM4711p != trieNodeM4707l) {
                    return m4710o(iM4703g, trieNodeM4707l, mutabilityOwnership3);
                }
            } else if (Intrinsics.m18594b(obj, obj2)) {
                persistentHashSetBuilder.m4692f(persistentHashSetBuilder.f16832f - 1);
                MutabilityOwnership mutabilityOwnership4 = persistentHashSetBuilder.f16829b;
                if (mutabilityOwnership != mutabilityOwnership4) {
                    return new TrieNode(this.f16841a ^ iM4717c, TrieNodeKt.m4716b(iM4703g, this.f16842b), mutabilityOwnership4);
                }
                this.f16842b = TrieNodeKt.m4716b(iM4703g, this.f16842b);
                this.f16841a ^= iM4717c;
                return this;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4708m(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        TrieNode trieNode3 = trieNode;
        TrieNode trieNode4 = f16840d;
        if (this == trieNode3) {
            deltaCounter.m4720a(m4698b());
            return trieNode4;
        }
        MutabilityOwnership mutabilityOwnership = this.f16843c;
        int i2 = 0;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f16829b;
            if (this == trieNode3) {
                deltaCounter.m4720a(this.f16842b.length);
                return trieNode4;
            }
            Object[] objArr = Intrinsics.m18594b(mutabilityOwnership2, mutabilityOwnership) ? this.f16842b : new Object[this.f16842b.length];
            Object[] objArr2 = this.f16842b;
            int i3 = 0;
            for (int i4 = 0; i4 < objArr2.length; i4++) {
                if (!ArraysKt.m18376k(trieNode3.f16842b, objArr2[i4])) {
                    objArr[i3] = objArr2[i4];
                    i3++;
                }
            }
            deltaCounter.m4720a(this.f16842b.length - i3);
            if (i3 != 0) {
                if (i3 == 1) {
                    return objArr[0];
                }
                if (i3 != this.f16842b.length) {
                    if (i3 == objArr.length) {
                        return new TrieNode(0, objArr, mutabilityOwnership2);
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
                    Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
                    return new TrieNode(0, objArrCopyOf, mutabilityOwnership2);
                }
                return this;
            }
            return trieNode4;
        }
        int i5 = this.f16841a & trieNode3.f16841a;
        if (i5 != 0) {
            if (Intrinsics.m18594b(mutabilityOwnership, persistentHashSetBuilder.f16829b)) {
                trieNode2 = this;
            } else {
                int i6 = this.f16841a;
                Object[] objArr3 = this.f16842b;
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                Intrinsics.m18598f(objArrCopyOf2, "copyOf(...)");
                trieNode2 = new TrieNode<>(i6, objArrCopyOf2, persistentHashSetBuilder.f16829b);
            }
            int i7 = this.f16841a;
            while (i5 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i5);
                int iM4703g = m4703g(iLowestOneBit);
                int iM4703g2 = trieNode3.m4703g(iLowestOneBit);
                Object objM4708m = this.f16842b[iM4703g];
                Object obj = trieNode3.f16842b[iM4703g2];
                boolean z2 = objM4708m instanceof TrieNode;
                int i8 = i2;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.m18597e(objM4708m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objM4708m = ((TrieNode) objM4708m).m4708m((TrieNode) obj, i + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z2) {
                    Intrinsics.m18597e(objM4708m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    TrieNode trieNode5 = (TrieNode) objM4708m;
                    int i9 = persistentHashSetBuilder.f16832f;
                    TrieNode trieNodeM4707l = trieNode5.m4707l(obj != null ? obj.hashCode() : i8, obj, i + 5, persistentHashSetBuilder);
                    if (i9 != persistentHashSetBuilder.f16832f) {
                        deltaCounter.m4720a(1);
                        Object[] objArr4 = trieNodeM4707l.f16842b;
                        if (objArr4.length == 1) {
                            objM4708m = objArr4[i8];
                            if (objM4708m instanceof TrieNode) {
                                objM4708m = trieNodeM4707l;
                            }
                        }
                    }
                } else if (z3) {
                    Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    if (((TrieNode) obj).m4699c(objM4708m != null ? objM4708m.hashCode() : i8, i + 5, objM4708m)) {
                        deltaCounter.m4720a(1);
                        objM4708m = trieNode4;
                    }
                } else if (Intrinsics.m18594b(objM4708m, obj)) {
                    deltaCounter.m4720a(1);
                    objM4708m = trieNode4;
                }
                if (objM4708m == trieNode4) {
                    i7 ^= iLowestOneBit;
                }
                trieNode2.f16842b[iM4703g] = objM4708m;
                i5 ^= iLowestOneBit;
                trieNode3 = trieNode;
                i2 = i8;
            }
            int i10 = i2;
            int iBitCount = Integer.bitCount(i7);
            if (i7 != 0) {
                if (i7 != this.f16841a) {
                    if (iBitCount == 1 && i != 0) {
                        Object obj2 = trieNode2.f16842b[trieNode2.m4703g(i7)];
                        return obj2 instanceof TrieNode ? new TrieNode(i7, new Object[]{obj2}, persistentHashSetBuilder.f16829b) : obj2;
                    }
                    Object[] objArr5 = new Object[iBitCount];
                    Object[] objArr6 = trieNode2.f16842b;
                    for (int i11 = i10; i11 < objArr6.length; i11++) {
                        Object obj3 = objArr6[i11];
                        if (obj3 != trieNode4) {
                            objArr5[i10] = obj3;
                            i10++;
                        }
                    }
                    return new TrieNode(i7, objArr5, persistentHashSetBuilder.f16829b);
                }
                if (!trieNode2.m4701e(this)) {
                    return trieNode2;
                }
            }
            return trieNode4;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012c  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4709n(TrieNode trieNode, int i, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        int i2;
        if (this == trieNode) {
            deltaCounter.m4720a(m4698b());
            return this;
        }
        MutabilityOwnership mutabilityOwnership = this.f16843c;
        TrieNode trieNode2 = f16840d;
        if (i > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f16829b;
            if (this == trieNode) {
                deltaCounter.m4720a(this.f16842b.length);
                return this;
            }
            Object[] objArr = Intrinsics.m18594b(mutabilityOwnership2, mutabilityOwnership) ? this.f16842b : new Object[Math.min(this.f16842b.length, trieNode.f16842b.length)];
            Object[] objArr2 = this.f16842b;
            int i3 = 0;
            for (int i4 = 0; i4 < objArr2.length; i4++) {
                if (ArraysKt.m18376k(trieNode.f16842b, objArr2[i4])) {
                    objArr[i3] = objArr2[i4];
                    i3++;
                }
            }
            deltaCounter.m4720a(i3);
            if (i3 != 0) {
                if (i3 == 1) {
                    return objArr[0];
                }
                if (i3 != this.f16842b.length) {
                    if (i3 == trieNode.f16842b.length) {
                        return trieNode;
                    }
                    if (i3 == objArr.length) {
                        return new TrieNode(0, objArr, mutabilityOwnership2);
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
                    Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
                    return new TrieNode(0, objArrCopyOf, mutabilityOwnership2);
                }
                return this;
            }
            return trieNode2;
        }
        int i5 = this.f16841a & trieNode.f16841a;
        if (i5 != 0) {
            TrieNode<E> trieNode3 = (Intrinsics.m18594b(mutabilityOwnership, persistentHashSetBuilder.f16829b) && i5 == this.f16841a) ? this : new TrieNode<>(i5, new Object[Integer.bitCount(i5)], persistentHashSetBuilder.f16829b);
            int i6 = i5;
            int i7 = 0;
            int i8 = 0;
            while (i6 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i6);
                int iM4703g = m4703g(iLowestOneBit);
                int iM4703g2 = trieNode.m4703g(iLowestOneBit);
                Object objM4709n = this.f16842b[iM4703g];
                Object obj = trieNode.f16842b[iM4703g2];
                boolean z2 = objM4709n instanceof TrieNode;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.m18597e(objM4709n, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                    objM4709n = ((TrieNode) objM4709n).m4709n((TrieNode) obj, i + 5, deltaCounter, persistentHashSetBuilder);
                } else {
                    if (z2) {
                        Intrinsics.m18597e(objM4709n, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        if (((TrieNode) objM4709n).m4699c(obj != null ? obj.hashCode() : 0, i + 5, obj)) {
                            i2 = 1;
                            deltaCounter.m4720a(1);
                            objM4709n = obj;
                        } else {
                            objM4709n = trieNode2;
                        }
                    } else if (z3) {
                        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        if (((TrieNode) obj).m4699c(objM4709n != null ? objM4709n.hashCode() : 0, i + 5, objM4709n)) {
                            i2 = 1;
                            deltaCounter.m4720a(1);
                        } else {
                            i2 = 1;
                            objM4709n = trieNode2;
                        }
                    } else {
                        i2 = 1;
                        if (Intrinsics.m18594b(objM4709n, obj)) {
                            deltaCounter.m4720a(1);
                        } else {
                            objM4709n = trieNode2;
                        }
                    }
                    if (objM4709n == trieNode2) {
                        i7 |= iLowestOneBit;
                    }
                    trieNode3.f16842b[i8] = objM4709n;
                    i8 += i2;
                    i6 ^= iLowestOneBit;
                }
                i2 = 1;
                if (objM4709n == trieNode2) {
                }
                trieNode3.f16842b[i8] = objM4709n;
                i8 += i2;
                i6 ^= iLowestOneBit;
            }
            int iBitCount = Integer.bitCount(i7);
            if (i7 != 0) {
                if (i7 == i5) {
                    if (!trieNode3.m4701e(this)) {
                        return trieNode3.m4701e(trieNode) ? trieNode : trieNode3;
                    }
                    return this;
                }
                if (iBitCount == 1 && i != 0) {
                    Object obj2 = trieNode3.f16842b[trieNode3.m4703g(i7)];
                    return obj2 instanceof TrieNode ? new TrieNode(i7, new Object[]{obj2}, persistentHashSetBuilder.f16829b) : obj2;
                }
                Object[] objArr3 = new Object[iBitCount];
                int i9 = 0;
                for (Object obj3 : trieNode3.f16842b) {
                    if (obj3 != trieNode2) {
                        objArr3[i9] = obj3;
                        i9++;
                    }
                }
                return new TrieNode(i7, objArr3, persistentHashSetBuilder.f16829b);
            }
        }
        return trieNode2;
    }

    /* JADX INFO: renamed from: o */
    public final TrieNode m4710o(int i, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = trieNode.f16842b;
        Object obj = trieNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            obj = trieNode;
            if (!(obj2 instanceof TrieNode)) {
                if (this.f16842b.length == 1) {
                    trieNode.f16841a = this.f16841a;
                    return trieNode;
                }
                obj = obj2;
            }
        }
        if (this.f16843c == mutabilityOwnership) {
            this.f16842b[i] = obj;
            return this;
        }
        Object[] objArr2 = this.f16842b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new TrieNode(this.f16841a, objArrCopyOf, mutabilityOwnership);
    }

    /* JADX INFO: renamed from: p */
    public final TrieNode m4711p(int i) {
        Object obj = this.f16842b[i];
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    /* JADX INFO: renamed from: q */
    public final TrieNode m4712q(int i, int i2, Object obj) {
        TrieNode trieNodeM4712q;
        int iM4717c = 1 << TrieNodeKt.m4717c(i, i2);
        if (!m4702f(iM4717c)) {
            int iM4703g = m4703g(iM4717c);
            Object obj2 = this.f16842b[iM4703g];
            if (obj2 instanceof TrieNode) {
                TrieNode trieNodeM4711p = m4711p(iM4703g);
                if (i2 == 30) {
                    int iM18345L = ArraysKt.m18345L(trieNodeM4711p.f16842b, obj);
                    trieNodeM4712q = iM18345L != -1 ? new TrieNode(0, TrieNodeKt.m4716b(iM18345L, trieNodeM4711p.f16842b), null) : trieNodeM4711p;
                } else {
                    trieNodeM4712q = trieNodeM4711p.m4712q(i, i2 + 5, obj);
                }
                if (trieNodeM4711p != trieNodeM4712q) {
                    return m4713r(iM4703g, trieNodeM4712q);
                }
            } else if (Intrinsics.m18594b(obj, obj2)) {
                return new TrieNode(this.f16841a ^ iM4717c, TrieNodeKt.m4716b(iM4703g, this.f16842b), null);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final TrieNode m4713r(int i, TrieNode trieNode) {
        Object[] objArr = trieNode.f16842b;
        Object obj = trieNode;
        if (objArr.length == 1) {
            Object obj2 = objArr[0];
            obj = trieNode;
            if (!(obj2 instanceof TrieNode)) {
                if (this.f16842b.length == 1) {
                    trieNode.f16841a = this.f16841a;
                    return trieNode;
                }
                obj = obj2;
            }
        }
        Object[] objArr2 = this.f16842b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new TrieNode(this.f16841a, objArrCopyOf, null);
    }
}
