package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p013ui.layout.PinnableContainer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* JADX INFO: renamed from: a */
    public final Object f7335a;

    /* JADX INFO: renamed from: b */
    public final LazyLayoutPinnedItemList f7336b;

    /* JADX INFO: renamed from: d */
    public int f7338d;

    /* JADX INFO: renamed from: e */
    public PinnableContainer.PinnedHandle f7339e;

    /* JADX INFO: renamed from: f */
    public boolean f7340f;

    /* JADX INFO: renamed from: c */
    public int f7337c = -1;

    /* JADX INFO: renamed from: g */
    public final MutableState f7341g = SnapshotStateKt.m4525g(null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.f7335a = obj;
        this.f7336b = lazyLayoutPinnedItemList;
    }

    @Override // androidx.compose.p013ui.layout.PinnableContainer
    /* JADX INFO: renamed from: a */
    public final PinnableContainer.PinnedHandle mo3068a() {
        if (this.f7340f) {
            InlineClassHelperKt.m2707c("Pin should not be called on an already disposed item ");
        }
        if (this.f7338d == 0) {
            this.f7336b.f7349a.add(this);
            PinnableContainer pinnableContainer = (PinnableContainer) ((SnapshotMutableStateImpl) this.f7341g).getF20325a();
            this.f7339e = pinnableContainer != null ? pinnableContainer.mo3068a() : null;
        }
        this.f7338d++;
        return this;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF7337c() {
        return this.f7337c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF7335a() {
        return this.f7335a;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public final void release() {
        if (this.f7340f) {
            return;
        }
        if (this.f7338d <= 0) {
            InlineClassHelperKt.m2707c("Release should only be called once");
        }
        int i = this.f7338d - 1;
        this.f7338d = i;
        if (i == 0) {
            this.f7336b.f7349a.remove(this);
            PinnableContainer.PinnedHandle pinnedHandle = this.f7339e;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.f7339e = null;
        }
    }
}
