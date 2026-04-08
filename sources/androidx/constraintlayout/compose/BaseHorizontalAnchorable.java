package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {

    /* JADX INFO: renamed from: a */
    public final CLObject f20840a;

    /* JADX INFO: renamed from: b */
    public final String f20841b;

    public BaseHorizontalAnchorable(CLObject cLObject, int i) {
        this.f20840a = cLObject;
        String str = VerticalAlignment.TOP;
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = VerticalAlignment.BOTTOM;
            }
        }
        this.f20841b = str;
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* JADX INFO: renamed from: b */
    public final void mo6748b(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2) {
        int i = horizontalAnchor.f20874b;
        String str = VerticalAlignment.TOP;
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = VerticalAlignment.BOTTOM;
            }
        }
        CLArray cLArray = new CLArray(new char[0]);
        cLArray.m6943j(CLString.m6963j(horizontalAnchor.f20873a.toString()));
        cLArray.m6943j(CLString.m6963j(str));
        cLArray.m6943j(new CLNumber(f));
        cLArray.m6943j(new CLNumber(f2));
        this.f20840a.m6941D(this.f20841b, cLArray);
    }
}
