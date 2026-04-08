package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.BeyondBoundsLayout;
import androidx.compose.p013ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.modifier.ModifierLocalMap;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyLayoutBeyondBoundsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, BeyondBoundsLayout, LayoutModifierNode {

    /* JADX INFO: renamed from: x */
    public static final C0617xa5ff65d1 f7202x = new C0617xa5ff65d1();

    /* JADX INFO: renamed from: t */
    public LazyLayoutBeyondBoundsState f7203t;

    /* JADX INFO: renamed from: u */
    public LazyLayoutBeyondBoundsInfo f7204u;

    /* JADX INFO: renamed from: v */
    public boolean f7205v;

    /* JADX INFO: renamed from: w */
    public Orientation f7206w;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion;", "", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1", "emptyBeyondBoundsScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f20569a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalModifierNode
    /* JADX INFO: renamed from: P0 */
    public final ModifierLocalMap mo2210P0() {
        return ModifierLocalModifierNodeKt.m5699a(new Pair(BeyondBoundsLayoutKt.f18443a, this));
    }

    /* JADX INFO: renamed from: X1 */
    public final boolean m3029X1(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        if (i == 5 || i == 6) {
            if (this.f7206w == Orientation.f5830b) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f7206w == Orientation.f5829a) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (m3030Y1(i)) {
            if (interval.f7197b >= this.f7203t.getItemCount() - 1) {
                return false;
            }
        } else if (interval.f7196a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Y1 */
    public final boolean m3030Y1(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.f7205v;
            }
            if (i == 6) {
                if (this.f7205v) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = DelegatableNodeKt.m5743g(this).f18715G.ordinal();
                if (iOrdinal == 0) {
                    return this.f7205v;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f7205v) {
                    return false;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
                int iOrdinal2 = DelegatableNodeKt.m5743g(this).f18715G.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.f7205v;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f7205v) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.p013ui.layout.BeyondBoundsLayout
    /* JADX INFO: renamed from: g0 */
    public final Object mo3031g0(Function1 function1, int i) {
        if (this.f7203t.getItemCount() <= 0 || !this.f7203t.mo2913c() || !this.f17194s) {
            return function1.invoke(f7202x);
        }
        int iMo2911a = m3030Y1(i) ? this.f7203t.mo2911a() : this.f7203t.mo2914d();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo = this.f7204u;
        lazyLayoutBeyondBoundsInfo.getClass();
        LazyLayoutBeyondBoundsInfo.Interval interval = new LazyLayoutBeyondBoundsInfo.Interval(iMo2911a, iMo2911a);
        lazyLayoutBeyondBoundsInfo.f7195a.m4568b(interval);
        objectRef.f51659a = interval;
        int iMo2912b = this.f7203t.mo2912b() * 2;
        int itemCount = this.f7203t.getItemCount();
        if (iMo2912b > itemCount) {
            iMo2912b = itemCount;
        }
        Object objInvoke = null;
        int i2 = 0;
        while (objInvoke == null && m3029X1((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f51659a, i) && i2 < iMo2912b) {
            LazyLayoutBeyondBoundsInfo.Interval interval2 = (LazyLayoutBeyondBoundsInfo.Interval) objectRef.f51659a;
            int i3 = interval2.f7196a;
            boolean zM3030Y1 = m3030Y1(i);
            int i4 = interval2.f7197b;
            if (zM3030Y1) {
                i4++;
            } else {
                i3--;
            }
            LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo2 = this.f7204u;
            lazyLayoutBeyondBoundsInfo2.getClass();
            LazyLayoutBeyondBoundsInfo.Interval interval3 = new LazyLayoutBeyondBoundsInfo.Interval(i3, i4);
            lazyLayoutBeyondBoundsInfo2.f7195a.m4568b(interval3);
            this.f7204u.f7195a.m4576j((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f51659a);
            objectRef.f51659a = interval3;
            i2++;
            DelegatableNodeKt.m5743g(this).mo5687h();
            objInvoke = function1.invoke(new LazyLayoutBeyondBoundsModifierNode$layout$2(this, objectRef, i));
        }
        this.f7204u.f7195a.m4576j((LazyLayoutBeyondBoundsInfo.Interval) objectRef.f51659a);
        DelegatableNodeKt.m5743g(this).mo5687h();
        return objInvoke;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo21913measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableMo5611P = measurable.mo5611P(j);
        return measureScope.mo3065n1(placeableMo5611P.f18567a, placeableMo5611P.f18568b, MapsKt.m18481d(), new LazyLayoutBeyondBoundsModifierNode$measure$1(placeableMo5611P));
    }
}
