package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SlotWriter {

    /* JADX INFO: renamed from: a */
    public final SlotTable f16583a;

    /* JADX INFO: renamed from: b */
    public int[] f16584b;

    /* JADX INFO: renamed from: c */
    public Object[] f16585c;

    /* JADX INFO: renamed from: d */
    public ArrayList f16586d;

    /* JADX INFO: renamed from: e */
    public HashMap f16587e;

    /* JADX INFO: renamed from: f */
    public MutableIntObjectMap f16588f;

    /* JADX INFO: renamed from: g */
    public int f16589g;

    /* JADX INFO: renamed from: h */
    public int f16590h;

    /* JADX INFO: renamed from: i */
    public int f16591i;

    /* JADX INFO: renamed from: j */
    public int f16592j;

    /* JADX INFO: renamed from: k */
    public int f16593k;

    /* JADX INFO: renamed from: l */
    public int f16594l;

    /* JADX INFO: renamed from: m */
    public int f16595m;

    /* JADX INFO: renamed from: n */
    public int f16596n;

    /* JADX INFO: renamed from: o */
    public int f16597o;

    /* JADX INFO: renamed from: p */
    public final IntStack f16598p;

    /* JADX INFO: renamed from: q */
    public final IntStack f16599q;

    /* JADX INFO: renamed from: r */
    public final IntStack f16600r;

    /* JADX INFO: renamed from: s */
    public MutableIntObjectMap f16601s;

    /* JADX INFO: renamed from: t */
    public int f16602t;

    /* JADX INFO: renamed from: u */
    public int f16603u;

    /* JADX INFO: renamed from: v */
    public int f16604v;

    /* JADX INFO: renamed from: w */
    public boolean f16605w;

    /* JADX INFO: renamed from: x */
    public MutableIntList f16606x;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static List m4515a(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z2, boolean z3, boolean z4) {
            List list;
            List list2;
            boolean zM4477I;
            List list3;
            int i2;
            Anchor anchorM4486R;
            List list4;
            Anchor anchorM4486R2;
            int i3;
            int i4;
            int iM4508s = slotWriter.m4508s(i);
            int i5 = i + iM4508s;
            int iM4496f = slotWriter.m4496f(slotWriter.m4506q(i), slotWriter.f16584b);
            int iM4496f2 = slotWriter.m4496f(slotWriter.m4506q(i5), slotWriter.f16584b);
            int i6 = iM4496f2 - iM4496f;
            boolean z5 = i >= 0 && (slotWriter.f16584b[(slotWriter.m4506q(i) * 5) + 1] & 201326592) != 0;
            slotWriter2.m4510u(iM4508s);
            slotWriter2.m4511v(i6, slotWriter2.f16602t);
            if (slotWriter.f16589g < i5) {
                slotWriter.m4514z(i5);
            }
            if (slotWriter.f16593k < iM4496f2) {
                slotWriter.m4469A(iM4496f2, i5);
            }
            int[] iArr = slotWriter2.f16584b;
            int i7 = slotWriter2.f16602t;
            int i8 = i7 * 5;
            ArraysKt.m18379n(i8, i * 5, slotWriter.f16584b, iArr, i5 * 5);
            Object[] objArr = slotWriter2.f16585c;
            int i9 = slotWriter2.f16591i;
            System.arraycopy(slotWriter.f16585c, iM4496f, objArr, i9, i6);
            int i10 = slotWriter2.f16604v;
            iArr[i8 + 2] = i10;
            int i11 = i7 - i;
            int i12 = i7 + iM4508s;
            int iM4496f3 = i9 - slotWriter2.m4496f(i7, iArr);
            int i13 = slotWriter2.f16595m;
            int i14 = slotWriter2.f16594l;
            int length = objArr.length;
            boolean z6 = z5;
            int i15 = i13;
            int i16 = i7;
            while (i16 < i12) {
                if (i16 != i7) {
                    int i17 = (i16 * 5) + 2;
                    iArr[i17] = iArr[i17] + i11;
                }
                int[] iArr2 = iArr;
                int iM4496f4 = slotWriter2.m4496f(i16, iArr) + iM4496f3;
                if (i15 < i16) {
                    i3 = i7;
                    i4 = 0;
                } else {
                    i3 = i7;
                    i4 = slotWriter2.f16593k;
                }
                iArr2[(i16 * 5) + 4] = SlotWriter.m4467h(iM4496f4, i4, i14, length);
                if (i16 == i15) {
                    i15++;
                }
                i16++;
                i7 = i3;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            slotWriter2.f16595m = i15;
            int iM4462b = SlotTableKt.m4462b(slotWriter.f16586d, i, slotWriter.m4503n());
            int iM4462b2 = SlotTableKt.m4462b(slotWriter.f16586d, i5, slotWriter.m4503n());
            if (iM4462b < iM4462b2) {
                ArrayList arrayList = slotWriter.f16586d;
                ArrayList arrayList2 = new ArrayList(iM4462b2 - iM4462b);
                for (int i18 = iM4462b; i18 < iM4462b2; i18++) {
                    Anchor anchor = (Anchor) arrayList.get(i18);
                    anchor.f16211a += i11;
                    arrayList2.add(anchor);
                }
                slotWriter2.f16586d.addAll(SlotTableKt.m4462b(slotWriter2.f16586d, slotWriter2.f16602t, slotWriter2.m4503n()), arrayList2);
                arrayList.subList(iM4462b, iM4462b2).clear();
                list = arrayList2;
            } else {
                list = EmptyList.f51496a;
            }
            List list5 = list;
            if (!list5.isEmpty()) {
                HashMap map = slotWriter.f16587e;
                HashMap map2 = slotWriter2.f16587e;
                if (map != null && map2 != null) {
                    int size = list5.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        Anchor anchor2 = (Anchor) list.get(i19);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int i20 = slotWriter2.f16604v;
            HashMap map3 = slotWriter2.f16587e;
            GroupSourceInformation groupSourceInformation2 = null;
            if (map3 != null && (anchorM4486R2 = slotWriter2.m4486R(i10)) != null) {
                groupSourceInformation2 = (GroupSourceInformation) map3.get(anchorM4486R2);
            }
            if (groupSourceInformation2 != null) {
                int i21 = i20 + 1;
                int i22 = slotWriter2.f16602t;
                int i23 = -1;
                while (i21 < i22) {
                    i23 = i21;
                    i21 = slotWriter2.f16584b[(i21 * 5) + 3] + i21;
                }
                ArrayList arrayList3 = groupSourceInformation2.f16370a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    groupSourceInformation2.f16370a = arrayList3;
                }
                if (i23 < 0 || (anchorM4486R = slotWriter2.m4486R(i23)) == null) {
                    list3 = list;
                    i2 = 0;
                } else {
                    int size2 = arrayList3.size();
                    int i24 = 0;
                    List list6 = list;
                    while (i24 < size2) {
                        Object obj = arrayList3.get(i24);
                        if (Intrinsics.m18594b(obj, anchorM4486R)) {
                            list4 = list6;
                        } else {
                            list4 = list6;
                            if (!(obj instanceof GroupSourceInformation) || !((GroupSourceInformation) obj).m4377a(anchorM4486R)) {
                                i24++;
                                list6 = list4;
                            }
                        }
                        i2 = i24;
                        list3 = list4;
                        break;
                    }
                    list3 = list6;
                    i2 = -1;
                }
                arrayList3.add(i2, slotWriter2.m4492b(i22));
                list2 = list3;
            } else {
                list2 = list;
            }
            int iM4473E = slotWriter.m4473E(i, slotWriter.f16584b);
            if (!z4) {
                zM4477I = false;
            } else if (z2) {
                boolean z7 = iM4473E >= 0;
                if (z7) {
                    slotWriter.m4484P();
                    slotWriter.m4491a(iM4473E - slotWriter.f16602t);
                    slotWriter.m4484P();
                }
                slotWriter.m4491a(i - slotWriter.f16602t);
                boolean zM4476H = slotWriter.m4476H();
                if (z7) {
                    slotWriter.m4480L();
                    slotWriter.m4498i();
                    slotWriter.m4480L();
                    slotWriter.m4498i();
                }
                zM4477I = zM4476H;
            } else {
                zM4477I = slotWriter.m4477I(i, iM4508s);
                slotWriter.m4478J(iM4496f, i6, i - 1);
            }
            if (zM4477I) {
                ComposerKt.m4316c("Unexpectedly removed anchors");
            }
            int i25 = slotWriter2.f16597o;
            int i26 = iArr3[i8 + 1];
            slotWriter2.f16597o = i25 + ((1073741824 & i26) == 0 ? i26 & 67108863 : 1);
            if (z3) {
                slotWriter2.f16602t = i12;
                slotWriter2.f16591i = i9 + i6;
            }
            if (z6) {
                slotWriter2.m4489U(i10);
            }
            return list2;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.f16583a = slotTable;
        int[] iArr = slotTable.f16569a;
        this.f16584b = iArr;
        Object[] objArr = slotTable.f16571c;
        this.f16585c = objArr;
        this.f16586d = slotTable.f16577n;
        this.f16587e = slotTable.f16578o;
        this.f16588f = slotTable.f16579p;
        int i = slotTable.f16570b;
        this.f16589g = i;
        this.f16590h = (iArr.length / 5) - i;
        int i2 = slotTable.f16572d;
        this.f16593k = i2;
        this.f16594l = objArr.length - i2;
        this.f16595m = i;
        this.f16598p = new IntStack();
        this.f16599q = new IntStack();
        this.f16600r = new IntStack();
        this.f16603u = i;
        this.f16604v = -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m4467h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* JADX INFO: renamed from: x */
    public static void m4468x(SlotWriter slotWriter) {
        int i = slotWriter.f16604v;
        int iM4506q = slotWriter.m4506q(i);
        int[] iArr = slotWriter.f16584b;
        int i2 = (iM4506q * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        slotWriter.m4489U(slotWriter.m4473E(i, iArr));
    }

    /* JADX INFO: renamed from: A */
    public final void m4469A(int i, int i2) {
        int i3 = this.f16594l;
        int i4 = this.f16593k;
        int i5 = this.f16595m;
        if (i4 != i) {
            Object[] objArr = this.f16585c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m4503n());
        if (i5 != iMin) {
            int length = this.f16585c.length - i3;
            if (iMin < i5) {
                int iM4506q = m4506q(iMin);
                int iM4506q2 = m4506q(i5);
                int i7 = this.f16589g;
                while (iM4506q < iM4506q2) {
                    int i8 = (iM4506q * 5) + 4;
                    int i9 = this.f16584b[i8];
                    if (!(i9 >= 0)) {
                        ComposerKt.m4316c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f16584b[i8] = -((length - i9) + 1);
                    iM4506q++;
                    if (iM4506q == i7) {
                        iM4506q += this.f16590h;
                    }
                }
            } else {
                int iM4506q3 = m4506q(i5);
                int iM4506q4 = m4506q(iMin);
                while (iM4506q3 < iM4506q4) {
                    int i10 = (iM4506q3 * 5) + 4;
                    int i11 = this.f16584b[i10];
                    if (!(i11 < 0)) {
                        ComposerKt.m4316c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f16584b[i10] = i11 + length + 1;
                    iM4506q3++;
                    if (iM4506q3 == this.f16589g) {
                        iM4506q3 += this.f16590h;
                    }
                }
            }
            this.f16595m = iMin;
        }
        this.f16593k = i;
    }

    /* JADX INFO: renamed from: B */
    public final List m4470B(Anchor anchor, SlotWriter slotWriter) {
        if (!(slotWriter.f16596n > 0)) {
            ComposerKt.m4316c("Check failed");
        }
        if (this.f16596n != 0) {
            ComposerKt.m4316c("Check failed");
        }
        if (!anchor.m4194a()) {
            ComposerKt.m4316c("Check failed");
        }
        int iM4493c = m4493c(anchor) + 1;
        int i = this.f16602t;
        if (i > iM4493c || iM4493c >= this.f16603u) {
            ComposerKt.m4316c("Check failed");
        }
        int iM4473E = m4473E(iM4493c, this.f16584b);
        int iM4508s = m4508s(iM4493c);
        int iM4472D = m4512w(iM4493c) ? 1 : m4472D(iM4493c);
        List listM4515a = Companion.m4515a(this, iM4493c, slotWriter, false, false, true);
        m4489U(iM4473E);
        boolean z2 = iM4472D > 0;
        while (iM4473E >= i) {
            int iM4506q = m4506q(iM4473E);
            int[] iArr = this.f16584b;
            int i2 = iM4506q * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iM4508s;
            if (z2) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z2 = false;
                } else {
                    SlotTableKt.m4464d(iM4506q, (i4 & 67108863) - iM4472D, iArr);
                }
            }
            iM4473E = m4473E(iM4473E, this.f16584b);
        }
        if (z2) {
            if (this.f16597o < iM4472D) {
                ComposerKt.m4316c("Check failed");
            }
            this.f16597o -= iM4472D;
        }
        return listM4515a;
    }

    /* JADX INFO: renamed from: C */
    public final Object m4471C(int i) {
        int iM4506q = m4506q(i);
        int[] iArr = this.f16584b;
        if ((iArr[(iM4506q * 5) + 1] & Ints.MAX_POWER_OF_TWO) != 0) {
            return this.f16585c[m4497g(m4496f(iM4506q, iArr))];
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final int m4472D(int i) {
        return this.f16584b[(m4506q(i) * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: E */
    public final int m4473E(int i, int[] iArr) {
        int i2 = iArr[(m4506q(i) * 5) + 2];
        return i2 > -2 ? i2 : (m4503n() + i2) - (-2);
    }

    /* JADX INFO: renamed from: F */
    public final Object m4474F(Object obj) {
        if (this.f16596n > 0) {
            m4511v(1, this.f16604v);
        }
        Object[] objArr = this.f16585c;
        int i = this.f16591i;
        this.f16591i = i + 1;
        Object obj2 = objArr[m4497g(i)];
        if (this.f16591i > this.f16592j) {
            ComposerKt.m4316c("Writing to an invalid slot");
        }
        this.f16585c[m4497g(this.f16591i - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: G */
    public final void m4475G() {
        int i;
        MutableIntList mutableIntList = this.f16606x;
        if (mutableIntList != null) {
            while (mutableIntList.f3679b != 0) {
                int iM4406b = PrioritySet.m4406b(mutableIntList);
                int iM4506q = m4506q(iM4406b);
                int iM4508s = iM4406b + 1;
                int iM4508s2 = m4508s(iM4406b) + iM4406b;
                while (true) {
                    if (iM4508s >= iM4508s2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f16584b[(m4506q(iM4508s) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM4508s += m4508s(iM4508s);
                    }
                }
                int[] iArr = this.f16584b;
                int i2 = (iM4506q * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) == 0 ? 0 : 1) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM4473E = m4473E(iM4406b, iArr);
                    if (iM4473E >= 0) {
                        PrioritySet.m4405a(mutableIntList, iM4473E);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m4476H() {
        Anchor anchorM4486R;
        Anchor anchorM4486R2;
        if (this.f16596n != 0) {
            ComposerKt.m4316c("Cannot remove group while inserting");
        }
        int i = this.f16602t;
        int i2 = this.f16591i;
        int iM4496f = m4496f(m4506q(i), this.f16584b);
        int iM4479K = m4479K();
        int i3 = this.f16604v;
        HashMap map = this.f16587e;
        GroupSourceInformation groupSourceInformation = (map == null || (anchorM4486R2 = m4486R(i3)) == null) ? null : (GroupSourceInformation) map.get(anchorM4486R2);
        if (groupSourceInformation != null && (anchorM4486R = m4486R(i)) != null) {
            groupSourceInformation.m4379c(anchorM4486R);
        }
        MutableIntList mutableIntList = this.f16606x;
        if (mutableIntList != null) {
            while (true) {
                int i4 = mutableIntList.f3679b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    RuntimeHelpersKt.m2145c("IntList is empty.");
                    throw null;
                }
                if (mutableIntList.f3678a[0] < i) {
                    break;
                }
                PrioritySet.m4406b(mutableIntList);
            }
        }
        boolean zM4477I = m4477I(i, this.f16602t - i);
        m4478J(iM4496f, this.f16591i - iM4496f, i - 1);
        this.f16602t = i;
        this.f16591i = i2;
        this.f16597o -= iM4479K;
        return zM4477I;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m4477I(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f16586d;
            m4514z(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f16587e;
                int i3 = i + i2;
                int iM4462b = SlotTableKt.m4462b(this.f16586d, i3, m4502m() - this.f16590h);
                if (iM4462b >= this.f16586d.size()) {
                    iM4462b--;
                }
                int i4 = iM4462b + 1;
                int i5 = 0;
                while (iM4462b >= 0) {
                    Anchor anchor = (Anchor) this.f16586d.get(iM4462b);
                    int iM4493c = m4493c(anchor);
                    if (iM4493c < i) {
                        break;
                    }
                    if (iM4493c < i3) {
                        anchor.f16211a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM4462b + 1;
                        }
                        i4 = iM4462b;
                    }
                    iM4462b--;
                }
                z = i4 < i5;
                if (z) {
                    this.f16586d.subList(i4, i5).clear();
                }
            }
            this.f16589g = i;
            this.f16590h += i2;
            int i6 = this.f16595m;
            if (i6 > i) {
                this.f16595m = Math.max(i, i6 - i2);
            }
            int i7 = this.f16603u;
            if (i7 >= this.f16589g) {
                this.f16603u = i7 - i2;
            }
            int i8 = this.f16604v;
            if (i8 >= 0 && (this.f16584b[(m4506q(i8) * 5) + 1] & 67108864) != 0) {
                m4489U(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: J */
    public final void m4478J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f16594l;
            int i5 = i + i2;
            m4469A(i5, i3);
            this.f16593k = i;
            this.f16594l = i4 + i2;
            Arrays.fill(this.f16585c, i, i5, (Object) null);
            int i6 = this.f16592j;
            if (i6 >= i) {
                this.f16592j = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final int m4479K() {
        int iM4506q = m4506q(this.f16602t);
        int iM4461a = SlotTableKt.m4461a(iM4506q, this.f16584b) + this.f16602t;
        this.f16602t = iM4461a;
        this.f16591i = m4496f(m4506q(iM4461a), this.f16584b);
        int i = this.f16584b[(iM4506q * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    /* JADX INFO: renamed from: L */
    public final void m4480L() {
        int i = this.f16603u;
        this.f16602t = i;
        this.f16591i = m4496f(m4506q(i), this.f16584b);
    }

    /* JADX INFO: renamed from: M */
    public final int m4481M(int i, int[] iArr) {
        if (i >= m4502m()) {
            return this.f16585c.length - this.f16594l;
        }
        int iM4463c = SlotTableKt.m4463c(i, iArr);
        return iM4463c < 0 ? (this.f16585c.length - this.f16594l) + iM4463c + 1 : iM4463c;
    }

    /* JADX INFO: renamed from: N */
    public final int m4482N(int i, int i2) {
        int iM4481M = m4481M(m4506q(i), this.f16584b);
        int i3 = iM4481M + i2;
        if (!(i3 >= iM4481M && i3 < m4496f(m4506q(i + 1), this.f16584b))) {
            ComposerKt.m4316c("Write to an invalid slot index " + i2 + " for group " + i);
        }
        return i3;
    }

    /* JADX INFO: renamed from: O */
    public final int m4483O(int i) {
        return m4496f(m4506q(m4508s(i) + i), this.f16584b);
    }

    /* JADX INFO: renamed from: P */
    public final void m4484P() {
        if (this.f16596n != 0) {
            ComposerKt.m4316c("Key must be supplied when inserting");
        }
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f16228a;
        m4485Q(composer$Companion$Empty$1, 0, composer$Companion$Empty$1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m4485Q(Object obj, int i, Object obj2, boolean z2) {
        int i2;
        Anchor anchorM4486R;
        int i3 = this.f16604v;
        Object[] objArr = this.f16596n > 0;
        this.f16600r.m4382c(this.f16597o);
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f16228a;
        if (objArr == true) {
            int i4 = this.f16602t;
            int iM4496f = m4496f(m4506q(i4), this.f16584b);
            m4510u(1);
            this.f16591i = iM4496f;
            this.f16592j = iM4496f;
            int iM4506q = m4506q(i4);
            int i5 = obj != composer$Companion$Empty$1 ? 1 : 0;
            int i6 = (z2 || obj2 == composer$Companion$Empty$1) ? 0 : 1;
            int iM4467h = m4467h(iM4496f, this.f16593k, this.f16594l, this.f16585c.length);
            if (iM4467h >= 0 && this.f16595m < i4) {
                iM4467h = -(((this.f16585c.length - this.f16594l) - iM4467h) + 1);
            }
            int[] iArr = this.f16584b;
            int i7 = this.f16604v;
            int i8 = iM4506q * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z2 ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM4467h;
            int i9 = (z2 ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m4511v(i9, i4);
                Object[] objArr2 = this.f16585c;
                int i10 = this.f16591i;
                if (z2) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.f16591i = i10;
            }
            this.f16597o = 0;
            i2 = i4 + 1;
            this.f16604v = i4;
            this.f16602t = i2;
            if (i3 >= 0) {
                HashMap map = this.f16587e;
                GroupSourceInformation groupSourceInformation = null;
                if (map != null && (anchorM4486R = m4486R(i3)) != null) {
                    groupSourceInformation = (GroupSourceInformation) map.get(anchorM4486R);
                }
                if (groupSourceInformation != null) {
                    GroupSourceInformation groupSourceInformationM4378b = groupSourceInformation.m4378b();
                    Anchor anchorM4492b = m4492b(i4);
                    ArrayList arrayList = groupSourceInformationM4378b.f16370a;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    groupSourceInformationM4378b.f16370a = arrayList;
                    arrayList.add(anchorM4492b);
                }
            }
        } else {
            this.f16598p.m4382c(i3);
            this.f16599q.m4382c((m4502m() - this.f16590h) - this.f16603u);
            int i11 = this.f16602t;
            int iM4506q2 = m4506q(i11);
            if (!Intrinsics.m18594b(obj2, composer$Companion$Empty$1)) {
                if (z2) {
                    m4490V(this.f16602t, obj2);
                } else {
                    m4488T(obj2);
                }
            }
            this.f16591i = m4481M(iM4506q2, this.f16584b);
            this.f16592j = m4496f(m4506q(this.f16602t + 1), this.f16584b);
            int[] iArr2 = this.f16584b;
            int i12 = iM4506q2 * 5;
            this.f16597o = iArr2[i12 + 1] & 67108863;
            this.f16604v = i11;
            this.f16602t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f16603u = i2;
    }

    /* JADX INFO: renamed from: R */
    public final Anchor m4486R(int i) {
        ArrayList arrayList;
        int iM4465e;
        if (i < 0 || i >= m4503n() || (iM4465e = SlotTableKt.m4465e((arrayList = this.f16586d), i, m4503n())) < 0) {
            return null;
        }
        return (Anchor) arrayList.get(iM4465e);
    }

    /* JADX INFO: renamed from: S */
    public final void m4487S(Object obj) {
        if (this.f16596n <= 0 || this.f16591i == this.f16593k) {
            m4474F(obj);
            return;
        }
        MutableIntObjectMap mutableIntObjectMap = this.f16601s;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap();
        }
        this.f16601s = mutableIntObjectMap;
        int i = this.f16604v;
        Object objM1992b = mutableIntObjectMap.m1992b(i);
        if (objM1992b == null) {
            objM1992b = new MutableObjectList();
            mutableIntObjectMap.m2028h(i, objM1992b);
        }
        ((MutableObjectList) objM1992b).m2058g(obj);
    }

    /* JADX INFO: renamed from: T */
    public final void m4488T(Object obj) {
        int iM4506q = m4506q(this.f16602t);
        int i = (iM4506q * 5) + 1;
        if ((this.f16584b[i] & 268435456) == 0) {
            ComposerKt.m4316c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f16585c;
        int[] iArr = this.f16584b;
        objArr[m4497g(Integer.bitCount(iArr[i] >> 29) + m4496f(iM4506q, iArr))] = obj;
    }

    /* JADX INFO: renamed from: U */
    public final void m4489U(int i) {
        if (i >= 0) {
            MutableIntList mutableIntList = this.f16606x;
            if (mutableIntList == null) {
                mutableIntList = new MutableIntList();
                this.f16606x = mutableIntList;
            }
            PrioritySet.m4405a(mutableIntList, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4490V(int i, Object obj) {
        boolean z2;
        int iM4506q = m4506q(i);
        int[] iArr = this.f16584b;
        if (iM4506q < iArr.length) {
            z2 = (iArr[(iM4506q * 5) + 1] & Ints.MAX_POWER_OF_TWO) != 0;
        }
        if (!z2) {
            ComposerKt.m4316c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f16585c[m4497g(m4496f(iM4506q, this.f16584b))] = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m4491a(int i) {
        boolean z2 = false;
        if (!(i >= 0)) {
            ComposerKt.m4316c("Cannot seek backwards");
        }
        if (!(this.f16596n <= 0)) {
            PreconditionsKt.m4403b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f16602t + i;
        if (i2 >= this.f16604v && i2 <= this.f16603u) {
            z2 = true;
        }
        if (!z2) {
            ComposerKt.m4316c("Cannot seek outside the current group (" + this.f16604v + '-' + this.f16603u + ')');
        }
        this.f16602t = i2;
        int iM4496f = m4496f(m4506q(i2), this.f16584b);
        this.f16591i = iM4496f;
        this.f16592j = iM4496f;
    }

    /* JADX INFO: renamed from: b */
    public final Anchor m4492b(int i) {
        ArrayList arrayList = this.f16586d;
        int iM4465e = SlotTableKt.m4465e(arrayList, i, m4503n());
        if (iM4465e >= 0) {
            return (Anchor) arrayList.get(iM4465e);
        }
        if (i > this.f16589g) {
            i = -(m4503n() - i);
        }
        Anchor anchor = new Anchor(i);
        arrayList.add(-(iM4465e + 1), anchor);
        return anchor;
    }

    /* JADX INFO: renamed from: c */
    public final int m4493c(Anchor anchor) {
        int i = anchor.f16211a;
        return i < 0 ? m4503n() + i : i;
    }

    /* JADX INFO: renamed from: d */
    public final void m4494d() {
        int i = this.f16596n;
        this.f16596n = i + 1;
        if (i == 0) {
            this.f16599q.m4382c((m4502m() - this.f16590h) - this.f16603u);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4495e(boolean z2) {
        this.f16605w = true;
        if (z2 && this.f16598p.f16372b == 0) {
            m4514z(m4503n());
            m4469A(this.f16585c.length - this.f16594l, this.f16589g);
            int i = this.f16593k;
            Arrays.fill(this.f16585c, i, this.f16594l + i, (Object) null);
            m4475G();
        }
        int[] iArr = this.f16584b;
        int i2 = this.f16589g;
        Object[] objArr = this.f16585c;
        int i3 = this.f16593k;
        ArrayList arrayList = this.f16586d;
        HashMap map = this.f16587e;
        MutableIntObjectMap mutableIntObjectMap = this.f16588f;
        SlotTable slotTable = this.f16583a;
        slotTable.getClass();
        if (!slotTable.f16575i) {
            PreconditionsKt.m4402a("Unexpected writer close()");
        }
        slotTable.f16575i = false;
        slotTable.f16569a = iArr;
        slotTable.f16570b = i2;
        slotTable.f16571c = objArr;
        slotTable.f16572d = i3;
        slotTable.f16577n = arrayList;
        slotTable.f16578o = map;
        slotTable.f16579p = mutableIntObjectMap;
    }

    /* JADX INFO: renamed from: f */
    public final int m4496f(int i, int[] iArr) {
        if (i >= m4502m()) {
            return this.f16585c.length - this.f16594l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f16585c.length - this.f16594l) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: g */
    public final int m4497g(int i) {
        return (this.f16594l * (i < this.f16593k ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: i */
    public final void m4498i() {
        MutableObjectList mutableObjectList;
        boolean z2 = this.f16596n > 0;
        int i = this.f16602t;
        int i2 = this.f16603u;
        int i3 = this.f16604v;
        int iM4506q = m4506q(i3);
        int i4 = this.f16597o;
        int i5 = i - i3;
        int i6 = iM4506q * 5;
        int i7 = i6 + 1;
        boolean z3 = (this.f16584b[i7] & Ints.MAX_POWER_OF_TWO) != 0;
        IntStack intStack = this.f16600r;
        if (z2) {
            MutableIntObjectMap mutableIntObjectMap = this.f16601s;
            if (mutableIntObjectMap != null && (mutableObjectList = (MutableObjectList) mutableIntObjectMap.m1992b(i3)) != null) {
                Object[] objArr = mutableObjectList.f3818a;
                int i8 = mutableObjectList.f3819b;
                for (int i9 = 0; i9 < i8; i9++) {
                    m4474F(objArr[i9]);
                }
            }
            int[] iArr = this.f16584b;
            iArr[i6 + 3] = i5;
            SlotTableKt.m4464d(iM4506q, i4, iArr);
            int iM4381b = intStack.m4381b();
            if (z3) {
                i4 = 1;
            }
            this.f16597o = iM4381b + i4;
            int iM4473E = m4473E(i3, this.f16584b);
            this.f16604v = iM4473E;
            int iM4503n = iM4473E < 0 ? m4503n() : m4506q(iM4473E + 1);
            int iM4496f = iM4503n >= 0 ? m4496f(iM4503n, this.f16584b) : 0;
            this.f16591i = iM4496f;
            this.f16592j = iM4496f;
            return;
        }
        if (i != i2) {
            ComposerKt.m4316c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f16584b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        SlotTableKt.m4464d(iM4506q, i4, iArr2);
        int iM4381b2 = this.f16598p.m4381b();
        this.f16603u = (m4502m() - this.f16590h) - this.f16599q.m4381b();
        this.f16604v = iM4381b2;
        int iM4473E2 = m4473E(i3, this.f16584b);
        int iM4381b3 = intStack.m4381b();
        this.f16597o = iM4381b3;
        if (iM4473E2 == iM4381b2) {
            this.f16597o = iM4381b3 + (z3 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z3 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM4473E2 != 0 && iM4473E2 != iM4381b2 && (i14 != 0 || i13 != 0)) {
                int iM4506q2 = m4506q(iM4473E2);
                if (i13 != 0) {
                    int[] iArr3 = this.f16584b;
                    int i15 = (iM4506q2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f16584b;
                    SlotTableKt.m4464d(iM4506q2, (iArr4[(iM4506q2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.f16584b;
                if ((iArr5[(iM4506q2 * 5) + 1] & Ints.MAX_POWER_OF_TWO) != 0) {
                    i14 = 0;
                }
                iM4473E2 = m4473E(iM4473E2, iArr5);
            }
        }
        this.f16597o += i14;
    }

    /* JADX INFO: renamed from: j */
    public final void m4499j() {
        if (this.f16596n <= 0) {
            PreconditionsKt.m4403b("Unbalanced begin/end insert");
        }
        int i = this.f16596n - 1;
        this.f16596n = i;
        if (i == 0) {
            if (this.f16600r.f16372b != this.f16598p.f16372b) {
                ComposerKt.m4316c("startGroup/endGroup mismatch while inserting");
            }
            this.f16603u = (m4502m() - this.f16590h) - this.f16599q.m4381b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4500k(int i) {
        boolean z2 = false;
        if (!(this.f16596n <= 0)) {
            ComposerKt.m4316c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f16604v;
        if (i2 != i) {
            if (i >= i2 && i < this.f16603u) {
                z2 = true;
            }
            if (!z2) {
                ComposerKt.m4316c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f16602t;
            int i4 = this.f16591i;
            int i5 = this.f16592j;
            this.f16602t = i;
            m4484P();
            this.f16602t = i3;
            this.f16591i = i4;
            this.f16592j = i5;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4501l(int i, int i2, int i3) {
        if (i >= this.f16589g) {
            i = -((m4503n() - i) + 2);
        }
        while (i3 < i2) {
            this.f16584b[(m4506q(i3) * 5) + 2] = i;
            int i4 = this.f16584b[(m4506q(i3) * 5) + 3] + i3;
            m4501l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m4502m() {
        return this.f16584b.length / 5;
    }

    /* JADX INFO: renamed from: n */
    public final int m4503n() {
        return m4502m() - this.f16590h;
    }

    /* JADX INFO: renamed from: o */
    public final int m4504o() {
        return this.f16585c.length - this.f16594l;
    }

    /* JADX INFO: renamed from: p */
    public final Object m4505p(int i) {
        int iM4506q = m4506q(i);
        int[] iArr = this.f16584b;
        int i2 = (iM4506q * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return Composer.Companion.f16228a;
        }
        return this.f16585c[Integer.bitCount(iArr[i2] >> 29) + m4496f(iM4506q, iArr)];
    }

    /* JADX INFO: renamed from: q */
    public final int m4506q(int i) {
        return (this.f16590h * (i < this.f16589g ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: r */
    public final Object m4507r(int i) {
        int iM4506q = m4506q(i);
        int[] iArr = this.f16584b;
        int i2 = iM4506q * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f16585c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: s */
    public final int m4508s(int i) {
        return SlotTableKt.m4461a(m4506q(i), this.f16584b);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4509t(int i, int i2) {
        int iM4502m;
        int iM4508s;
        if (i2 == this.f16604v) {
            iM4502m = this.f16603u;
        } else {
            IntStack intStack = this.f16598p;
            if (i2 > intStack.m4380a(0)) {
                iM4508s = m4508s(i2);
            } else {
                int[] iArr = intStack.f16371a;
                int iMin = Math.min(iArr.length, intStack.f16372b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM4508s = m4508s(i2);
                } else {
                    iM4502m = (m4502m() - this.f16590h) - this.f16599q.f16371a[i3];
                }
            }
            iM4502m = iM4508s + i2;
        }
        return i > i2 && i < iM4502m;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f16602t + " end=" + this.f16603u + " size = " + m4503n() + " gap=" + this.f16589g + '-' + (this.f16589g + this.f16590h) + ')';
    }

    /* JADX INFO: renamed from: u */
    public final void m4510u(int i) {
        if (i > 0) {
            int i2 = this.f16602t;
            m4514z(i2);
            int i3 = this.f16589g;
            int i4 = this.f16590h;
            int[] iArr = this.f16584b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                ArraysKt.m18379n(0, 0, iArr, iArr2, i3 * 5);
                ArraysKt.m18379n((i3 + i6) * 5, (i4 + i3) * 5, iArr, iArr2, length * 5);
                this.f16584b = iArr2;
                i4 = i6;
            }
            int i7 = this.f16603u;
            if (i7 >= i3) {
                this.f16603u = i7 + i;
            }
            int i8 = i3 + i;
            this.f16589g = i8;
            this.f16590h = i4 - i;
            int iM4467h = m4467h(i5 > 0 ? m4496f(m4506q(i2 + i), this.f16584b) : 0, this.f16595m >= i3 ? this.f16593k : 0, this.f16594l, this.f16585c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f16584b[(i9 * 5) + 4] = iM4467h;
            }
            int i10 = this.f16595m;
            if (i10 >= i3) {
                this.f16595m = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4511v(int i, int i2) {
        if (i > 0) {
            m4469A(this.f16591i, i2);
            int i3 = this.f16593k;
            int i4 = this.f16594l;
            if (i4 < i) {
                Object[] objArr = this.f16585c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f16585c = objArr2;
                i4 = i7;
            }
            int i9 = this.f16592j;
            if (i9 >= i3) {
                this.f16592j = i9 + i;
            }
            this.f16593k = i3 + i;
            this.f16594l = i4 - i;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4512w(int i) {
        return (this.f16584b[(m4506q(i) * 5) + 1] & Ints.MAX_POWER_OF_TWO) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final void m4513y(SlotTable slotTable, int i) {
        if (this.f16596n <= 0) {
            ComposerKt.m4316c("Check failed");
        }
        if (i == 0 && this.f16602t == 0 && this.f16583a.f16570b == 0) {
            int[] iArr = slotTable.f16569a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = slotTable.f16570b;
            if (i2 == i3) {
                int[] iArr2 = this.f16584b;
                Object[] objArr = this.f16585c;
                ArrayList arrayList = this.f16586d;
                HashMap map = this.f16587e;
                MutableIntObjectMap mutableIntObjectMap = this.f16588f;
                Object[] objArr2 = slotTable.f16571c;
                int i4 = slotTable.f16572d;
                HashMap map2 = slotTable.f16578o;
                MutableIntObjectMap mutableIntObjectMap2 = slotTable.f16579p;
                this.f16584b = iArr;
                this.f16585c = objArr2;
                this.f16586d = slotTable.f16577n;
                this.f16589g = i3;
                this.f16590h = (iArr.length / 5) - i3;
                this.f16593k = i4;
                this.f16594l = objArr2.length - i4;
                this.f16595m = i3;
                this.f16587e = map2;
                this.f16588f = mutableIntObjectMap2;
                slotTable.f16569a = iArr2;
                slotTable.f16570b = 0;
                slotTable.f16571c = objArr;
                slotTable.f16572d = 0;
                slotTable.f16577n = arrayList;
                slotTable.f16578o = map;
                slotTable.f16579p = mutableIntObjectMap;
                return;
            }
        }
        SlotWriter slotWriterM4459g = slotTable.m4459g();
        try {
            Companion.m4515a(slotWriterM4459g, i, this, true, true, false);
            slotWriterM4459g.m4495e(true);
        } catch (Throwable th) {
            slotWriterM4459g.m4495e(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4514z(int i) {
        Anchor anchor;
        int i2;
        Anchor anchor2;
        int i3;
        int i4;
        int i5 = this.f16590h;
        int i6 = this.f16589g;
        if (i6 != i) {
            if (!this.f16586d.isEmpty()) {
                int iM4502m = m4502m() - this.f16590h;
                if (i6 < i) {
                    for (int iM4462b = SlotTableKt.m4462b(this.f16586d, i6, iM4502m); iM4462b < this.f16586d.size() && (i3 = (anchor2 = (Anchor) this.f16586d.get(iM4462b)).f16211a) < 0 && (i4 = i3 + iM4502m) < i; iM4462b++) {
                        anchor2.f16211a = i4;
                    }
                } else {
                    for (int iM4462b2 = SlotTableKt.m4462b(this.f16586d, i, iM4502m); iM4462b2 < this.f16586d.size() && (i2 = (anchor = (Anchor) this.f16586d.get(iM4462b2)).f16211a) >= 0; iM4462b2++) {
                        anchor.f16211a = -(iM4502m - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f16584b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    ArraysKt.m18379n(i8 + i7, i7, iArr, iArr, i9);
                } else {
                    ArraysKt.m18379n(i9, i9 + i8, iArr, iArr, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM4502m2 = m4502m();
            if (i6 >= iM4502m2) {
                ComposerKt.m4316c("Check failed");
            }
            while (i6 < iM4502m2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f16584b[i10];
                int iM4503n = i11 > -2 ? i11 : (m4503n() + i11) - (-2);
                if (iM4503n >= i) {
                    iM4503n = -((m4503n() - iM4503n) - (-2));
                }
                if (iM4503n != i11) {
                    this.f16584b[i10] = iM4503n;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f16589g = i;
    }
}
