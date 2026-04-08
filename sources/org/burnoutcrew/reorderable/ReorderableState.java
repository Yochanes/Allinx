package org.burnoutcrew.reorderable;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lorg/burnoutcrew/reorderable/ReorderableState;", "T", "", "Companion", "reorderable"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public abstract class ReorderableState<T> {

    /* JADX INFO: renamed from: m */
    public static final Function1 f58103m = null;

    /* JADX INFO: renamed from: n */
    public static final Function1 f58104n = null;

    /* JADX INFO: renamed from: a */
    public final CoroutineScope f58105a;

    /* JADX INFO: renamed from: b */
    public final float f58106b;

    /* JADX INFO: renamed from: c */
    public final Function2 f58107c;

    /* JADX INFO: renamed from: d */
    public final SpringDragCancelledAnimation f58108d;

    /* JADX INFO: renamed from: e */
    public final MutableState f58109e;

    /* JADX INFO: renamed from: f */
    public final BufferedChannel f58110f;

    /* JADX INFO: renamed from: g */
    public final BufferedChannel f58111g;

    /* JADX INFO: renamed from: h */
    public final MutableState f58112h;

    /* JADX INFO: renamed from: i */
    public final MutableState f58113i;

    /* JADX INFO: renamed from: j */
    public Job f58114j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f58115k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f58116l;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m18302d2 = {"Lorg/burnoutcrew/reorderable/ReorderableState$Companion;", "", "", "ACCELERATION_LIMIT_TIME_MS", "J", "Lkotlin/Function1;", "", "EaseInQuintInterpolator", "Lkotlin/jvm/functions/Function1;", "EaseOutQuadInterpolator", "reorderable"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
    public static final class Companion {
    }

    public ReorderableState(CoroutineScope coroutineScope, float f, Function2 onMove, SpringDragCancelledAnimation springDragCancelledAnimation) {
        Intrinsics.m18599g(onMove, "onMove");
        this.f58105a = coroutineScope;
        this.f58106b = f;
        this.f58107c = onMove;
        this.f58108d = springDragCancelledAnimation;
        this.f58109e = SnapshotStateKt.m4525g(null);
        this.f58110f = ChannelKt.m20709a(0, 7, null);
        this.f58111g = ChannelKt.m20709a(0, 7, null);
        this.f58112h = SnapshotStateKt.m4525g(new Offset(0L));
        this.f58113i = SnapshotStateKt.m4525g(null);
        this.f58115k = new ArrayList();
        this.f58116l = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m21773a(float f, long j) {
        float fM21776g;
        float fMo21766u;
        float fM5055e;
        float fMo21764s;
        if (m21778i() != null) {
            if (mo21767v()) {
                fM21776g = m21777h() + mo21762q(r0);
                fMo21766u = mo21757l(r0) + fM21776g;
                fM5055e = Offset.m5056f(m21774e());
            } else {
                fM21776g = m21776g() + mo21760o(r0);
                fMo21766u = mo21766u(r0) + fM21776g;
                fM5055e = Offset.m5055e(m21774e());
            }
            if (fM5055e > 0.0f) {
                fMo21764s = fMo21766u - mo21763r();
                if (fMo21764s < 0.0f) {
                    fMo21764s = 0.0f;
                }
                int i = (int) (fMo21766u - fM21776g);
                if (fMo21764s != 0.0f) {
                    float fFloatValue = ((Number) ReorderableState$Companion$EaseInQuintInterpolator$1.f58117a.invoke(Float.valueOf(j > 1500 ? 1.0f : j / 1500))).floatValue() * ((Number) ReorderableState$Companion$EaseOutQuadInterpolator$1.f58118a.invoke(Float.valueOf(Math.min(1.0f, (Math.abs(fMo21764s) * 1.0f) / i)))).floatValue() * Math.signum(fMo21764s) * f;
                    return fFloatValue == 0.0f ? fMo21764s > 0.0f ? 1.0f : -1.0f : fFloatValue;
                }
            } else if (fM5055e < 0.0f) {
                fMo21764s = fM21776g - mo21764s();
                if (fMo21764s > 0.0f) {
                }
                int i2 = (int) (fMo21766u - fM21776g);
                if (fMo21764s != 0.0f) {
                }
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public Object mo21769b(Object obj, List items, int i, int i2) {
        int iMo21754d;
        int iAbs;
        int iMo21762q;
        int iAbs2;
        int iMo21760o;
        int iAbs3;
        int iMo21761p;
        int iAbs4;
        Intrinsics.m18599g(items, "items");
        int iMo21766u = mo21766u(obj) + i;
        int iMo21757l = mo21757l(obj) + i2;
        int iMo21760o2 = i - mo21760o(obj);
        int iMo21762q2 = i2 - mo21762q(obj);
        int size = items.size();
        Object obj2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj3 = items.get(i4);
            if (iMo21760o2 > 0 && (iMo21761p = mo21761p(obj3) - iMo21766u) < 0 && mo21761p(obj3) > mo21761p(obj) && (iAbs4 = Math.abs(iMo21761p)) > i3) {
                obj2 = obj3;
                i3 = iAbs4;
            }
            if (iMo21760o2 < 0 && (iMo21760o = mo21760o(obj3) - i) > 0 && mo21760o(obj3) < mo21760o(obj) && (iAbs3 = Math.abs(iMo21760o)) > i3) {
                obj2 = obj3;
                i3 = iAbs3;
            }
            if (iMo21762q2 < 0 && (iMo21762q = mo21762q(obj3) - i2) > 0 && mo21762q(obj3) < mo21762q(obj) && (iAbs2 = Math.abs(iMo21762q)) > i3) {
                obj2 = obj3;
                i3 = iAbs2;
            }
            if (iMo21762q2 > 0 && (iMo21754d = mo21754d(obj3) - iMo21757l) < 0 && mo21754d(obj3) > mo21754d(obj) && (iAbs = Math.abs(iMo21754d)) > i3) {
                obj2 = obj3;
                i3 = iAbs;
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList mo21770c(int i, int i2, Object obj) {
        int i3;
        ReorderableState<T> reorderableState = this;
        ArrayList arrayList = reorderableState.f58115k;
        arrayList.clear();
        ArrayList arrayList2 = reorderableState.f58116l;
        arrayList2.clear();
        int iMo21760o = reorderableState.mo21760o(obj) + i;
        int iMo21761p = reorderableState.mo21761p(obj) + i;
        int iMo21762q = reorderableState.mo21762q(obj) + i2;
        int iMo21754d = reorderableState.mo21754d(obj) + i2;
        int i4 = (iMo21760o + iMo21761p) / 2;
        int i5 = (iMo21762q + iMo21754d) / 2;
        List listMo21765t = reorderableState.mo21765t();
        int size = listMo21765t.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = listMo21765t.get(i6);
            int iMo21758m = reorderableState.mo21758m(obj2);
            Integer numM21775f = reorderableState.m21775f();
            if ((numM21775f != null && iMo21758m == numM21775f.intValue()) || reorderableState.mo21754d(obj2) < iMo21762q || reorderableState.mo21762q(obj2) > iMo21754d || reorderableState.mo21761p(obj2) < iMo21760o || reorderableState.mo21760o(obj2) > iMo21761p) {
                i3 = iMo21754d;
            } else {
                int iAbs = Math.abs(i4 - ((reorderableState.mo21761p(obj2) + reorderableState.mo21760o(obj2)) / 2));
                int iAbs2 = Math.abs(i5 - ((reorderableState.mo21754d(obj2) + reorderableState.mo21762q(obj2)) / 2));
                int i7 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                int size2 = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        i3 = iMo21754d;
                        break;
                    }
                    i3 = iMo21754d;
                    if (i7 <= ((Number) arrayList2.get(i9)).intValue()) {
                        break;
                    }
                    i8++;
                    i9++;
                    iMo21754d = i3;
                }
                arrayList.add(i8, obj2);
                arrayList2.add(i8, Integer.valueOf(i7));
            }
            i6++;
            reorderableState = this;
            iMo21754d = i3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo21754d(Object obj);

    /* JADX INFO: renamed from: e */
    public final long m21774e() {
        return ((Offset) ((SnapshotMutableStateImpl) this.f58112h).getF20325a()).f17524a;
    }

    /* JADX INFO: renamed from: f */
    public final Integer m21775f() {
        return (Integer) ((SnapshotMutableStateImpl) this.f58109e).getF20325a();
    }

    /* JADX INFO: renamed from: g */
    public final float m21776g() {
        if (m21778i() == null) {
            return 0.0f;
        }
        return (Offset.m5055e(m21774e()) + (((SnapshotMutableStateImpl) this.f58113i).getF20325a() != null ? mo21760o(r1) : 0)) - mo21760o(r0);
    }

    /* JADX INFO: renamed from: h */
    public final float m21777h() {
        if (m21778i() == null) {
            return 0.0f;
        }
        return (Offset.m5056f(m21774e()) + (((SnapshotMutableStateImpl) this.f58113i).getF20325a() != null ? mo21762q(r1) : 0)) - mo21762q(r0);
    }

    /* JADX INFO: renamed from: i */
    public final Object m21778i() {
        for (T t : mo21765t()) {
            int iMo21758m = mo21758m(t);
            Integer numM21775f = m21775f();
            if (numM21775f != null && iMo21758m == numM21775f.intValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo21755j();

    /* JADX INFO: renamed from: k */
    public abstract int mo21756k();

    /* JADX INFO: renamed from: l */
    public abstract int mo21757l(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract int mo21758m(Object obj);

    /* JADX INFO: renamed from: n */
    public abstract Object mo21759n(Object obj);

    /* JADX INFO: renamed from: o */
    public abstract int mo21760o(Object obj);

    /* JADX INFO: renamed from: p */
    public abstract int mo21761p(Object obj);

    /* JADX INFO: renamed from: q */
    public abstract int mo21762q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract int mo21763r();

    /* JADX INFO: renamed from: s */
    public abstract int mo21764s();

    /* JADX INFO: renamed from: t */
    public abstract List mo21765t();

    /* JADX INFO: renamed from: u */
    public abstract int mo21766u(Object obj);

    /* JADX INFO: renamed from: v */
    public abstract boolean mo21767v();

    /* JADX INFO: renamed from: w */
    public final void m21779w(int i, int i2) {
        Object f20325a = ((SnapshotMutableStateImpl) this.f58113i).getF20325a();
        if (f20325a == null) {
            return;
        }
        ((SnapshotMutableStateImpl) this.f58112h).setValue(new Offset(OffsetKt.m5061a(Offset.m5055e(m21774e()) + i, Offset.m5056f(m21774e()) + i2)));
        Object objM21778i = m21778i();
        if (objM21778i == null) {
            return;
        }
        Object objMo21769b = mo21769b(objM21778i, mo21770c((int) Offset.m5055e(m21774e()), (int) Offset.m5056f(m21774e()), f20325a), (int) (m21776g() + mo21760o(objM21778i)), (int) (m21777h() + mo21762q(objM21778i)));
        CoroutineScope coroutineScope = this.f58105a;
        if (objMo21769b != null) {
            if (mo21758m(objMo21769b) == mo21755j() || mo21758m(objM21778i) == mo21755j()) {
                BuildersKt.m20507c(coroutineScope, null, null, new ReorderableState$onDrag$1$1(this, objM21778i, objMo21769b, null), 3);
            } else {
                this.f58107c.invoke(new ItemPosition(mo21758m(objM21778i), mo21759n(objM21778i)), new ItemPosition(mo21758m(objMo21769b), mo21759n(objMo21769b)));
            }
            ((SnapshotMutableStateImpl) this.f58109e).setValue(Integer.valueOf(mo21758m(objMo21769b)));
        }
        float fM21773a = m21773a(this.f58106b, 0L);
        if (fM21773a == 0.0f) {
            return;
        }
        if (fM21773a == 0.0f) {
            Job job = this.f58114j;
            if (job != null) {
                ((JobSupport) job).mo17054i(null);
            }
            this.f58114j = null;
            return;
        }
        Job job2 = this.f58114j;
        if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
            this.f58114j = BuildersKt.m20507c(coroutineScope, null, null, new ReorderableState$autoscroll$1(fM21773a, this, null), 3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m21780x() {
        ReorderableState<T> reorderableState;
        Integer numM21775f = m21775f();
        MutableState mutableState = this.f58113i;
        if (numM21775f != null) {
            int iIntValue = numM21775f.intValue();
            Object f20325a = ((SnapshotMutableStateImpl) mutableState).getF20325a();
            reorderableState = this;
            BuildersKt.m20507c(reorderableState.f58105a, null, null, new ReorderableState$onDragCanceled$1(reorderableState, new ItemPosition(iIntValue, f20325a != null ? mo21759n(f20325a) : null), OffsetKt.m5061a(m21776g(), m21777h()), null), 3);
        } else {
            reorderableState = this;
        }
        Object f20325a2 = ((SnapshotMutableStateImpl) mutableState).getF20325a();
        if (f20325a2 != null) {
            mo21758m(f20325a2);
        }
        m21775f();
        ((SnapshotMutableStateImpl) mutableState).setValue(null);
        ((SnapshotMutableStateImpl) reorderableState.f58112h).setValue(new Offset(0L));
        ((SnapshotMutableStateImpl) reorderableState.f58109e).setValue(null);
        Job job = reorderableState.f58114j;
        if (job != null) {
            ((JobSupport) job).mo17054i(null);
        }
        reorderableState.f58114j = null;
    }

    /* JADX INFO: renamed from: y */
    public boolean mo21771y(int i, int i2) {
        T t;
        T next;
        if (mo21767v()) {
            i2 += mo21764s();
        } else {
            i += mo21764s();
        }
        Iterator<T> it = mo21765t().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iMo21760o = mo21760o(next);
            if (i <= mo21761p(next) && iMo21760o <= i) {
                int iMo21762q = mo21762q(next);
                if (i2 <= mo21754d(next) && iMo21762q <= i2) {
                    break;
                }
            }
        }
        if (next != null) {
            ((SnapshotMutableStateImpl) this.f58113i).setValue(next);
            ((SnapshotMutableStateImpl) this.f58109e).setValue(Integer.valueOf(mo21758m(next)));
            t = next;
        }
        return t != null;
    }

    /* JADX INFO: renamed from: z */
    public abstract Object mo21768z(int i, int i2, Continuation continuation);
}
