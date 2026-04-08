package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConstrainedLayoutReference extends LayoutReference {

    /* JADX INFO: renamed from: b */
    public final Object f20867b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayoutBaseScope.VerticalAnchor f20868c;

    /* JADX INFO: renamed from: d */
    public final ConstraintLayoutBaseScope.HorizontalAnchor f20869d;

    /* JADX INFO: renamed from: e */
    public final ConstraintLayoutBaseScope.VerticalAnchor f20870e;

    /* JADX INFO: renamed from: f */
    public final ConstraintLayoutBaseScope.HorizontalAnchor f20871f;

    public ConstrainedLayoutReference(Object obj) {
        super(obj);
        this.f20867b = obj;
        this.f20868c = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, this);
        this.f20869d = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, this);
        this.f20870e = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, this);
        this.f20871f = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, this);
    }

    @Override // androidx.constraintlayout.compose.LayoutReference
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getF20867b() {
        return this.f20867b;
    }
}
