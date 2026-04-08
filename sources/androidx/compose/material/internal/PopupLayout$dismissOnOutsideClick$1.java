package androidx.compose.material.internal;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/unit/IntRect;", "invoke-KMgbckE", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements Function2<Offset, IntRect, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final PopupLayout$dismissOnOutsideClick$1 f11814a = new PopupLayout$dismissOnOutsideClick$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Offset offset = (Offset) obj;
        IntRect intRect = (IntRect) obj2;
        boolean z2 = false;
        if (offset != null) {
            long j = offset.f17524a;
            if (Offset.m5055e(j) < intRect.f20564a || Offset.m5055e(j) > intRect.f20566c || Offset.m5056f(j) < intRect.f20565b || Offset.m5056f(j) > intRect.f20567d) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
