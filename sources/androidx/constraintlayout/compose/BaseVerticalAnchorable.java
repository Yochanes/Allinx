package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class BaseVerticalAnchorable implements VerticalAnchorable {

    /* JADX INFO: renamed from: a */
    public final CLObject f20843a;

    /* JADX INFO: renamed from: b */
    public final String f20844b;

    public BaseVerticalAnchorable(CLObject cLObject, int i) {
        this.f20843a = cLObject;
        this.f20844b = AnchorFunctions.m6746a(i);
    }

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    /* JADX INFO: renamed from: b */
    public final void mo6749b(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, float f2) {
        String strM6746a = AnchorFunctions.m6746a(verticalAnchor.f20877b);
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.m6943j(CLString.m6963j(verticalAnchor.f20876a.toString()));
        cLArray.m6943j(CLString.m6963j(strM6746a));
        cLArray.m6943j(new CLNumber(f));
        cLArray.m6943j(new CLNumber(f2));
        this.f20843a.m6941D(this.f20844b, cLArray);
    }
}
