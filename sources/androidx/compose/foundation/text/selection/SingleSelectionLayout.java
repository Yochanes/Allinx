package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.selection.Selection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SingleSelectionLayout implements SelectionLayout {

    /* JADX INFO: renamed from: a */
    public final boolean f9894a;

    /* JADX INFO: renamed from: b */
    public final int f9895b;

    /* JADX INFO: renamed from: c */
    public final int f9896c;

    /* JADX INFO: renamed from: d */
    public final Selection f9897d;

    /* JADX INFO: renamed from: e */
    public final SelectableInfo f9898e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SingleSelectionLayout$Companion;", "", "", "DEFAULT_SELECTABLE_ID", "J", "", "DEFAULT_SLOT", "I", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public SingleSelectionLayout(boolean z2, int i, int i2, Selection selection, SelectableInfo selectableInfo) {
        this.f9894a = z2;
        this.f9895b = i;
        this.f9896c = i2;
        this.f9897d = selection;
        this.f9898e = selectableInfo;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF9894a() {
        return this.f9894a;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SelectableInfo getF9898e() {
        return this.f9898e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Selection getF9897d() {
        return this.f9897d;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: d */
    public final SelectableInfo mo3556d() {
        return this.f9898e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: e */
    public final MutableLongObjectMap mo3557e(Selection selection) {
        boolean z2 = selection.f9662c;
        Selection.AnchorInfo anchorInfo = selection.f9661b;
        Selection.AnchorInfo anchorInfo2 = selection.f9660a;
        if ((!z2 && anchorInfo2.f9664b > anchorInfo.f9664b) || (z2 && anchorInfo2.f9664b <= anchorInfo.f9664b)) {
            selection = Selection.m3585a(selection, null, null, !z2, 3);
        }
        long j = this.f9898e.f9654a;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f3716a;
        MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
        mutableLongObjectMap2.m2043h(j, selection);
        return mutableLongObjectMap2;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: f */
    public final boolean mo3558f(SelectionLayout selectionLayout) {
        if (this.f9897d == null || selectionLayout == null || !(selectionLayout instanceof SingleSelectionLayout)) {
            return true;
        }
        if (this.f9895b != selectionLayout.getF9895b()) {
            return true;
        }
        if (this.f9896c != selectionLayout.getF9896c()) {
            return true;
        }
        if (this.f9894a != selectionLayout.getF9894a()) {
            return true;
        }
        SelectableInfo selectableInfo = this.f9898e;
        selectableInfo.getClass();
        SelectableInfo selectableInfo2 = ((SingleSelectionLayout) selectionLayout).f9898e;
        return (selectableInfo.f9654a == selectableInfo2.f9654a && selectableInfo.f9656c == selectableInfo2.f9656c && selectableInfo.f9657d == selectableInfo2.f9657d) ? false : true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getF9896c() {
        return this.f9896c;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: h */
    public final SelectableInfo mo3560h() {
        return this.f9898e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: i */
    public final CrossStatus mo3561i() {
        int i = this.f9895b;
        int i2 = this.f9896c;
        return i < i2 ? CrossStatus.f9618b : i > i2 ? CrossStatus.f9617a : this.f9898e.m3584b();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: k */
    public final SelectableInfo mo3563k() {
        return this.f9898e;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getF9895b() {
        return this.f9895b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f9894a + ", crossed=" + mo3561i() + ", info=\n\t" + this.f9898e + ')';
    }

    @Override // androidx.compose.foundation.text.selection.SelectionLayout
    /* JADX INFO: renamed from: j */
    public final void mo3562j(Function1 function1) {
    }
}
