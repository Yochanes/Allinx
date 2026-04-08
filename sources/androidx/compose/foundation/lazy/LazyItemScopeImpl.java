package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyItemScopeImpl implements LazyItemScope {

    /* JADX INFO: renamed from: a */
    public MutableIntState f6758a;

    /* JADX INFO: renamed from: b */
    public MutableIntState f6759b;

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    /* JADX INFO: renamed from: a */
    public final Modifier mo2902a() {
        return new ParentSizeElement(null, this.f6759b, 2);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    /* JADX INFO: renamed from: b */
    public final Modifier mo2903b() {
        return new ParentSizeElement(this.f6758a, null, 4);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    /* JADX INFO: renamed from: c */
    public final Modifier mo2904c(Modifier modifier, SpringSpec springSpec, SpringSpec springSpec2) {
        return (springSpec == null && springSpec2 == null) ? modifier : modifier.then(new LazyLayoutAnimateItemElement(springSpec, springSpec2));
    }
}
