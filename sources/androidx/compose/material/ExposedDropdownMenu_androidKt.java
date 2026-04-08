package androidx.compose.material;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m18302d2 = {"", "width", "menuHeight", "material_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class ExposedDropdownMenu_androidKt {
    /* JADX INFO: renamed from: a */
    public static final void m3748a(IntRect intRect, LayoutCoordinates layoutCoordinates, int i, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rectM5630b = LayoutCoordinatesKt.m5630b(layoutCoordinates);
        function1.invoke(Integer.valueOf(((int) Math.max(rectM5630b.f17527b - intRect.f20565b, (intRect.f20567d - r1) - LayoutCoordinatesKt.m5630b(layoutCoordinates).f17529d)) - i));
    }
}
