package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.p013ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode$layout$2", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyLayoutBeyondBoundsModifierNode$layout$2 implements BeyondBoundsLayout.BeyondBoundsScope {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LazyLayoutBeyondBoundsModifierNode f7207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f7208b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7209c;

    public LazyLayoutBeyondBoundsModifierNode$layout$2(LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode, Ref.ObjectRef objectRef, int i) {
        this.f7207a = lazyLayoutBeyondBoundsModifierNode;
        this.f7208b = objectRef;
        this.f7209c = i;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
    /* JADX INFO: renamed from: a */
    public final boolean mo3032a() {
        return this.f7207a.m3029X1((LazyLayoutBeyondBoundsInfo.Interval) this.f7208b.f51659a, this.f7209c);
    }
}
