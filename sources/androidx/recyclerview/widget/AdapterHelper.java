package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AdapterHelper implements OpReorderer.Callback {

    /* JADX INFO: renamed from: d */
    public final RecyclerView.C21476 f31524d;

    /* JADX INFO: renamed from: a */
    public final Pools.SimplePool f31521a = new Pools.SimplePool(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList f31522b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f31523c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f31526f = 0;

    /* JADX INFO: renamed from: e */
    public final OpReorderer f31525e = new OpReorderer(this);

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UpdateOp {

        /* JADX INFO: renamed from: a */
        public int f31527a;

        /* JADX INFO: renamed from: b */
        public int f31528b;

        /* JADX INFO: renamed from: c */
        public Object f31529c;

        /* JADX INFO: renamed from: d */
        public int f31530d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UpdateOp)) {
                    return false;
                }
                UpdateOp updateOp = (UpdateOp) obj;
                int i = this.f31527a;
                if (i != updateOp.f31527a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.f31530d - this.f31528b) != 1 || this.f31530d != updateOp.f31528b || this.f31528b != updateOp.f31530d) {
                    if (this.f31530d != updateOp.f31530d || this.f31528b != updateOp.f31528b) {
                        return false;
                    }
                    Object obj2 = this.f31529c;
                    if (obj2 != null) {
                        if (!obj2.equals(updateOp.f31529c)) {
                            return false;
                        }
                    } else if (updateOp.f31529c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f31527a * 31) + this.f31528b) * 31) + this.f31530d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f31527a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f31528b);
            sb.append("c:");
            sb.append(this.f31530d);
            sb.append(",p:");
            return AbstractC0000a.m18o(sb, this.f31529c, "]");
        }
    }

    public AdapterHelper(RecyclerView.C21476 c21476) {
        this.f31524d = c21476;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11522a(int i) {
        ArrayList arrayList = this.f31523c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f31527a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = updateOp.f31528b;
                    int i5 = updateOp.f31530d + i4;
                    while (i4 < i5) {
                        if (m11527f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m11527f(updateOp.f31530d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m11523b() {
        ArrayList arrayList = this.f31523c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f31524d.m11651a((UpdateOp) arrayList.get(i));
        }
        m11532k(arrayList);
        this.f31526f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m11524c() {
        m11523b();
        ArrayList arrayList = this.f31522b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            int i2 = updateOp.f31527a;
            RecyclerView.C21476 c21476 = this.f31524d;
            if (i2 == 1) {
                c21476.m11651a(updateOp);
                c21476.m11654d(updateOp.f31528b, updateOp.f31530d);
            } else if (i2 == 2) {
                c21476.m11651a(updateOp);
                c21476.m11656f(updateOp.f31528b, updateOp.f31530d);
            } else if (i2 == 4) {
                c21476.m11651a(updateOp);
                c21476.m11653c(updateOp.f31528b, updateOp.f31530d, updateOp.f31529c);
            } else if (i2 == 8) {
                c21476.m11651a(updateOp);
                c21476.m11655e(updateOp.f31528b, updateOp.f31530d);
            }
        }
        m11532k(arrayList);
        this.f31526f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m11525d(UpdateOp updateOp) {
        int i;
        int i2 = updateOp.f31527a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM11533l = m11533l(updateOp.f31528b, i2);
        int i3 = updateOp.f31528b;
        int i4 = updateOp.f31527a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < updateOp.f31530d; i6++) {
            int iM11533l2 = m11533l((i * i6) + updateOp.f31528b, updateOp.f31527a);
            int i7 = updateOp.f31527a;
            if (i7 == 2 ? iM11533l2 != iM11533l : !(i7 == 4 && iM11533l2 == iM11533l + 1)) {
                UpdateOp updateOpM11529h = m11529h(i7, updateOp.f31529c, iM11533l, i5);
                m11526e(updateOpM11529h, i3);
                updateOpM11529h.f31529c = null;
                this.f31521a.mo7692a(updateOpM11529h);
                if (updateOp.f31527a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM11533l = iM11533l2;
            } else {
                i5++;
            }
        }
        Object obj = updateOp.f31529c;
        updateOp.f31529c = null;
        this.f31521a.mo7692a(updateOp);
        if (i5 > 0) {
            UpdateOp updateOpM11529h2 = m11529h(updateOp.f31527a, obj, iM11533l, i5);
            m11526e(updateOpM11529h2, i3);
            updateOpM11529h2.f31529c = null;
            this.f31521a.mo7692a(updateOpM11529h2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11526e(UpdateOp updateOp, int i) {
        RecyclerView.C21476 c21476 = this.f31524d;
        c21476.m11651a(updateOp);
        int i2 = updateOp.f31527a;
        if (i2 == 2) {
            c21476.m11656f(i, updateOp.f31530d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c21476.m11653c(i, updateOp.f31530d, updateOp.f31529c);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m11527f(int i, int i2) {
        ArrayList arrayList = this.f31523c;
        int size = arrayList.size();
        while (i2 < size) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f31527a;
            if (i3 == 8) {
                int i4 = updateOp.f31528b;
                if (i4 == i) {
                    i = updateOp.f31530d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (updateOp.f31530d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = updateOp.f31528b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = updateOp.f31530d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += updateOp.f31530d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11528g() {
        return this.f31522b.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public final UpdateOp m11529h(int i, Object obj, int i2, int i3) {
        UpdateOp updateOp = (UpdateOp) this.f31521a.mo7693b();
        if (updateOp != null) {
            updateOp.f31527a = i;
            updateOp.f31528b = i2;
            updateOp.f31530d = i3;
            updateOp.f31529c = obj;
            return updateOp;
        }
        UpdateOp updateOp2 = new UpdateOp();
        updateOp2.f31527a = i;
        updateOp2.f31528b = i2;
        updateOp2.f31530d = i3;
        updateOp2.f31529c = obj;
        return updateOp2;
    }

    /* JADX INFO: renamed from: i */
    public final void m11530i(UpdateOp updateOp) {
        this.f31523c.add(updateOp);
        int i = updateOp.f31527a;
        RecyclerView.C21476 c21476 = this.f31524d;
        if (i == 1) {
            c21476.m11654d(updateOp.f31528b, updateOp.f31530d);
            return;
        }
        if (i == 2) {
            int i2 = updateOp.f31528b;
            int i3 = updateOp.f31530d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i2, i3, false);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            c21476.m11653c(updateOp.f31528b, updateOp.f31530d, updateOp.f31529c);
        } else if (i == 8) {
            c21476.m11655e(updateOp.f31528b, updateOp.f31530d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11531j() {
        byte b2;
        boolean z2;
        byte b3;
        UpdateOp updateOpM11529h;
        int i;
        int i2;
        UpdateOp updateOpM11529h2;
        boolean z3;
        boolean z4;
        UpdateOp updateOpM11529h3;
        ArrayList arrayList = this.f31522b;
        OpReorderer opReorderer = this.f31525e;
        opReorderer.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                b2 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((UpdateOp) arrayList.get(size)).f31527a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(i3);
            int i4 = updateOp2.f31527a;
            if (i4 != 1) {
                AdapterHelper adapterHelper = opReorderer.f31690a;
                if (i4 == 2) {
                    int i5 = updateOp.f31528b;
                    int i6 = updateOp.f31530d;
                    if (i5 < i6) {
                        z4 = updateOp2.f31528b == i5 && updateOp2.f31530d == i6 - i5;
                        z3 = false;
                    } else if (updateOp2.f31528b == i6 + 1 && updateOp2.f31530d == i5 - i6) {
                        z4 = true;
                        z3 = true;
                    } else {
                        z3 = true;
                        z4 = false;
                    }
                    int i7 = updateOp2.f31528b;
                    if (i6 < i7) {
                        updateOp2.f31528b = i7 - 1;
                    } else {
                        int i8 = updateOp2.f31530d;
                        if (i6 < i7 + i8) {
                            updateOp2.f31530d = i8 - 1;
                            updateOp.f31527a = 2;
                            updateOp.f31530d = 1;
                            if (updateOp2.f31530d == 0) {
                                arrayList.remove(i3);
                                updateOp2.f31529c = null;
                                adapterHelper.f31521a.mo7692a(updateOp2);
                            }
                        }
                    }
                    int i9 = updateOp.f31528b;
                    int i10 = updateOp2.f31528b;
                    if (i9 <= i10) {
                        updateOp2.f31528b = i10 + 1;
                    } else {
                        int i11 = i10 + updateOp2.f31530d;
                        if (i9 < i11) {
                            updateOpM11529h3 = adapterHelper.m11529h(2, null, i9 + 1, i11 - i9);
                            updateOp2.f31530d = updateOp.f31528b - updateOp2.f31528b;
                        }
                        if (z4) {
                            if (z3) {
                                if (updateOpM11529h3 != null) {
                                    int i12 = updateOp.f31528b;
                                    if (i12 > updateOpM11529h3.f31528b) {
                                        updateOp.f31528b = i12 - updateOpM11529h3.f31530d;
                                    }
                                    int i13 = updateOp.f31530d;
                                    if (i13 > updateOpM11529h3.f31528b) {
                                        updateOp.f31530d = i13 - updateOpM11529h3.f31530d;
                                    }
                                }
                                int i14 = updateOp.f31528b;
                                if (i14 > updateOp2.f31528b) {
                                    updateOp.f31528b = i14 - updateOp2.f31530d;
                                }
                                int i15 = updateOp.f31530d;
                                if (i15 > updateOp2.f31528b) {
                                    updateOp.f31530d = i15 - updateOp2.f31530d;
                                }
                            } else {
                                if (updateOpM11529h3 != null) {
                                    int i16 = updateOp.f31528b;
                                    if (i16 >= updateOpM11529h3.f31528b) {
                                        updateOp.f31528b = i16 - updateOpM11529h3.f31530d;
                                    }
                                    int i17 = updateOp.f31530d;
                                    if (i17 >= updateOpM11529h3.f31528b) {
                                        updateOp.f31530d = i17 - updateOpM11529h3.f31530d;
                                    }
                                }
                                int i18 = updateOp.f31528b;
                                if (i18 >= updateOp2.f31528b) {
                                    updateOp.f31528b = i18 - updateOp2.f31530d;
                                }
                                int i19 = updateOp.f31530d;
                                if (i19 >= updateOp2.f31528b) {
                                    updateOp.f31530d = i19 - updateOp2.f31530d;
                                }
                            }
                            arrayList.set(size, updateOp2);
                            if (updateOp.f31528b != updateOp.f31530d) {
                                arrayList.set(i3, updateOp);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (updateOpM11529h3 != null) {
                                arrayList.add(size, updateOpM11529h3);
                            }
                        } else {
                            arrayList.set(size, updateOp2);
                            arrayList.remove(i3);
                            updateOp.f31529c = null;
                            adapterHelper.f31521a.mo7692a(updateOp);
                        }
                    }
                    updateOpM11529h3 = null;
                    if (z4) {
                    }
                } else if (i4 == 4) {
                    int i20 = updateOp.f31530d;
                    int i21 = updateOp2.f31528b;
                    if (i20 < i21) {
                        updateOp2.f31528b = i21 - 1;
                    } else {
                        int i22 = updateOp2.f31530d;
                        if (i20 < i21 + i22) {
                            updateOp2.f31530d = i22 - 1;
                            updateOpM11529h = adapterHelper.m11529h(4, updateOp2.f31529c, updateOp.f31528b, 1);
                        }
                        i = updateOp.f31528b;
                        i2 = updateOp2.f31528b;
                        if (i > i2) {
                            updateOp2.f31528b = i2 + 1;
                        } else {
                            int i23 = i2 + updateOp2.f31530d;
                            if (i < i23) {
                                int i24 = i23 - i;
                                updateOpM11529h2 = adapterHelper.m11529h(4, updateOp2.f31529c, i + 1, i24);
                                updateOp2.f31530d -= i24;
                            }
                            arrayList.set(i3, updateOp);
                            if (updateOp2.f31530d > 0) {
                                arrayList.set(size, updateOp2);
                            } else {
                                arrayList.remove(size);
                                updateOp2.f31529c = null;
                                adapterHelper.f31521a.mo7692a(updateOp2);
                            }
                            if (updateOpM11529h != null) {
                                arrayList.add(size, updateOpM11529h);
                            }
                            if (updateOpM11529h2 != null) {
                                arrayList.add(size, updateOpM11529h2);
                            }
                        }
                        updateOpM11529h2 = null;
                        arrayList.set(i3, updateOp);
                        if (updateOp2.f31530d > 0) {
                        }
                        if (updateOpM11529h != null) {
                        }
                        if (updateOpM11529h2 != null) {
                        }
                    }
                    updateOpM11529h = null;
                    i = updateOp.f31528b;
                    i2 = updateOp2.f31528b;
                    if (i > i2) {
                    }
                    updateOpM11529h2 = null;
                    arrayList.set(i3, updateOp);
                    if (updateOp2.f31530d > 0) {
                    }
                    if (updateOpM11529h != null) {
                    }
                    if (updateOpM11529h2 != null) {
                    }
                }
            } else {
                int i25 = updateOp.f31530d;
                int i26 = updateOp2.f31528b;
                int i27 = i25 < i26 ? -1 : 0;
                int i28 = updateOp.f31528b;
                if (i28 < i26) {
                    i27++;
                }
                if (i26 <= i28) {
                    updateOp.f31528b = i28 + updateOp2.f31530d;
                }
                int i29 = updateOp2.f31528b;
                if (i29 <= i25) {
                    updateOp.f31530d = i25 + updateOp2.f31530d;
                }
                updateOp2.f31528b = i29 + i27;
                arrayList.set(size, updateOp2);
                arrayList.set(i3, updateOp);
            }
        }
        int size2 = arrayList.size();
        int i30 = 0;
        while (i30 < size2) {
            UpdateOp updateOpM11529h4 = (UpdateOp) arrayList.get(i30);
            int i31 = updateOpM11529h4.f31527a;
            if (i31 != 1) {
                RecyclerView.C21476 c21476 = this.f31524d;
                if (i31 == 2) {
                    int i32 = updateOpM11529h4.f31528b;
                    int i33 = updateOpM11529h4.f31530d + i32;
                    int i34 = i32;
                    int i35 = 0;
                    byte b4 = -1;
                    while (i34 < i33) {
                        if (c21476.m11652b(i34) != null || m11522a(i34)) {
                            if (b4 == 0) {
                                m11525d(m11529h(2, null, i32, i35));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            b3 = 1;
                        } else {
                            if (b4 == 1) {
                                m11530i(m11529h(2, null, i32, i35));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            b3 = 0;
                        }
                        if (z2) {
                            i34 -= i35;
                            i33 -= i35;
                            i35 = 1;
                        } else {
                            i35++;
                        }
                        i34++;
                        b4 = b3;
                    }
                    if (i35 != updateOpM11529h4.f31530d) {
                        updateOpM11529h4.f31529c = null;
                        this.f31521a.mo7692a(updateOpM11529h4);
                        updateOpM11529h4 = m11529h(2, null, i32, i35);
                    }
                    if (b4 == 0) {
                        m11525d(updateOpM11529h4);
                    } else {
                        m11530i(updateOpM11529h4);
                    }
                } else if (i31 == 4) {
                    int i36 = updateOpM11529h4.f31528b;
                    int i37 = updateOpM11529h4.f31530d + i36;
                    int i38 = i36;
                    int i39 = 0;
                    while (i36 < i37) {
                        if (c21476.m11652b(i36) != null || m11522a(i36)) {
                            if (b2 == 0) {
                                m11525d(m11529h(4, updateOpM11529h4.f31529c, i38, i39));
                                i38 = i36;
                                i39 = 0;
                            }
                            b2 = 1;
                        } else {
                            if (b2 == 1) {
                                m11530i(m11529h(4, updateOpM11529h4.f31529c, i38, i39));
                                i38 = i36;
                                i39 = 0;
                            }
                            b2 = 0;
                        }
                        i39++;
                        i36++;
                    }
                    if (i39 != updateOpM11529h4.f31530d) {
                        Object obj = updateOpM11529h4.f31529c;
                        updateOpM11529h4.f31529c = null;
                        this.f31521a.mo7692a(updateOpM11529h4);
                        updateOpM11529h4 = m11529h(4, obj, i38, i39);
                    }
                    if (b2 == 0) {
                        m11525d(updateOpM11529h4);
                    } else {
                        m11530i(updateOpM11529h4);
                    }
                } else if (i31 == 8) {
                    m11530i(updateOpM11529h4);
                }
            } else {
                m11530i(updateOpM11529h4);
            }
            i30++;
            b2 = -1;
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: k */
    public final void m11532k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i);
            updateOp.f31529c = null;
            this.f31521a.mo7692a(updateOp);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: l */
    public final int m11533l(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.f31523c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            int i5 = updateOp.f31527a;
            if (i5 == 8) {
                int i6 = updateOp.f31528b;
                int i7 = updateOp.f31530d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            updateOp.f31528b = i6 + 1;
                            updateOp.f31530d = i7 + 1;
                        } else if (i2 == 2) {
                            updateOp.f31528b = i6 - 1;
                            updateOp.f31530d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        updateOp.f31530d = i7 + 1;
                    } else if (i2 == 2) {
                        updateOp.f31530d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        updateOp.f31528b = i6 + 1;
                    } else if (i2 == 2) {
                        updateOp.f31528b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = updateOp.f31528b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= updateOp.f31530d;
                    } else if (i5 == 2) {
                        i += updateOp.f31530d;
                    }
                } else if (i2 == 1) {
                    updateOp.f31528b = i8 + 1;
                } else if (i2 == 2) {
                    updateOp.f31528b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size2);
            if (updateOp2.f31527a == 8) {
                int i9 = updateOp2.f31530d;
                if (i9 == updateOp2.f31528b || i9 < 0) {
                    arrayList.remove(size2);
                    updateOp2.f31529c = null;
                    this.f31521a.mo7692a(updateOp2);
                }
            } else if (updateOp2.f31530d <= 0) {
                arrayList.remove(size2);
                updateOp2.f31529c = null;
                this.f31521a.mo7692a(updateOp2);
            }
        }
        return i;
    }
}
