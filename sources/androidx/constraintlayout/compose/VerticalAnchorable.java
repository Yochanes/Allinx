package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/VerticalAnchorable;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public interface VerticalAnchorable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    static void m6788a(VerticalAnchorable verticalAnchorable, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, int i) {
        if ((i & 2) != 0) {
            f = 0;
        }
        verticalAnchorable.mo6749b(verticalAnchor, f, 0);
    }

    /* JADX INFO: renamed from: b */
    void mo6749b(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, float f2);
}
