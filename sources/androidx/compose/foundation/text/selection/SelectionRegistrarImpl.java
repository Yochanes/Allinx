package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    /* JADX INFO: renamed from: m */
    public static final SaverKt$Saver$1 f9872m;

    /* JADX INFO: renamed from: a */
    public boolean f9873a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f9874b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final MutableLongObjectMap f9875c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f9876d;

    /* JADX INFO: renamed from: e */
    public Function1 f9877e;

    /* JADX INFO: renamed from: f */
    public Function4 f9878f;

    /* JADX INFO: renamed from: g */
    public Function2 f9879g;

    /* JADX INFO: renamed from: h */
    public Function6 f9880h;

    /* JADX INFO: renamed from: i */
    public Function0 f9881i;

    /* JADX INFO: renamed from: j */
    public Function1 f9882j;

    /* JADX INFO: renamed from: k */
    public Function1 f9883k;

    /* JADX INFO: renamed from: l */
    public final MutableState f9884l;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        SelectionRegistrarImpl$Companion$Saver$1 selectionRegistrarImpl$Companion$Saver$1 = SelectionRegistrarImpl$Companion$Saver$1.f9885a;
        SelectionRegistrarImpl$Companion$Saver$2 selectionRegistrarImpl$Companion$Saver$2 = SelectionRegistrarImpl$Companion$Saver$2.f9886a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f16993a;
        f9872m = new SaverKt$Saver$1(selectionRegistrarImpl$Companion$Saver$2, selectionRegistrarImpl$Companion$Saver$1);
    }

    public SelectionRegistrarImpl(long j) {
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f3716a;
        this.f9875c = new MutableLongObjectMap();
        this.f9876d = new AtomicLong(j);
        MutableLongObjectMap mutableLongObjectMap2 = LongObjectMapKt.f3716a;
        Intrinsics.m18597e(mutableLongObjectMap2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f9884l = SnapshotStateKt.m4525g(mutableLongObjectMap2);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: a */
    public final void mo3633a(long j) {
        Function1 function1 = this.f9882j;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: b */
    public final long mo3634b() {
        AtomicLong atomicLong = this.f9876d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: c */
    public final void mo3635c() {
        Function0 function0 = this.f9881i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: d */
    public final LongObjectMap mo3636d() {
        return (LongObjectMap) ((SnapshotMutableStateImpl) this.f9884l).getF20325a();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: e */
    public final Selectable mo3637e(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate) {
        long j = multiWidgetSelectionDelegate.f9648a;
        if (j == 0) {
            InlineClassHelperKt.m2705a("The selectable contains an invalid id: " + j);
        }
        MutableLongObjectMap mutableLongObjectMap = this.f9875c;
        if (mutableLongObjectMap.m1996a(j)) {
            InlineClassHelperKt.m2705a("Another selectable with the id: " + multiWidgetSelectionDelegate + ".selectableId has already subscribed.");
        }
        mutableLongObjectMap.m2043h(j, multiWidgetSelectionDelegate);
        this.f9874b.add(multiWidgetSelectionDelegate);
        this.f9873a = false;
        return multiWidgetSelectionDelegate;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: f */
    public final void mo3638f(long j) {
        this.f9873a = false;
        Function1 function1 = this.f9877e;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: g */
    public final void mo3639g(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z2) {
        Function4 function4 = this.f9878f;
        if (function4 != null) {
            ((SelectionManager.C07922) function4).invoke(Boolean.valueOf(z2), layoutCoordinates, new Offset(j), selectionAdjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: h */
    public final void mo3640h(Selectable selectable) {
        long f9648a = selectable.getF9648a();
        MutableLongObjectMap mutableLongObjectMap = this.f9875c;
        if (mutableLongObjectMap.m1996a(f9648a)) {
            this.f9874b.remove(selectable);
            mutableLongObjectMap.m2042g(selectable.getF9648a());
            Function1 function1 = this.f9883k;
            if (function1 != null) {
                ((SelectionManager.C07977) function1).invoke(Long.valueOf(selectable.getF9648a()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* JADX INFO: renamed from: i */
    public final boolean mo3641i(LayoutCoordinates layoutCoordinates, long j, long j2, SelectionAdjustment selectionAdjustment, boolean z2) {
        Function6 function6 = this.f9880h;
        if (function6 == null) {
            return true;
        }
        return ((Boolean) ((SelectionManager.C07944) function6).mo3628n(Boolean.valueOf(z2), layoutCoordinates, new Offset(j), new Offset(j2), Boolean.FALSE, selectionAdjustment)).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m3642j(LayoutCoordinates layoutCoordinates) {
        boolean z2 = this.f9873a;
        ArrayList arrayList = this.f9874b;
        if (!z2) {
            CollectionsKt.m18445n0(arrayList, new C0815b(new SelectionRegistrarImpl$sort$1(layoutCoordinates), 0));
            this.f9873a = true;
        }
        return arrayList;
    }
}
