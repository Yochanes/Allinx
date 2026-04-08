package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DateRangePickerKt$DateRangePicker$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !composer.mo4242t()) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
