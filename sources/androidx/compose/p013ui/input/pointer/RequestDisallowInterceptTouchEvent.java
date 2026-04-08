package androidx.compose.p013ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "Lkotlin/Function1;", "", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RequestDisallowInterceptTouchEvent implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: a */
    public PointerInteropFilter f18354a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PointerInteropFilter pointerInteropFilter = this.f18354a;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.f18337c = zBooleanValue;
        }
        return Unit.f51459a;
    }
}
