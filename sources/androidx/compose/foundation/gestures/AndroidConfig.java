package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.unit.Density;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AndroidConfig implements ScrollConfig {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f5413a;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.f5413a = viewConfiguration;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* JADX INFO: renamed from: a */
    public final long mo2581a(Density density, PointerEvent pointerEvent) {
        int i = Build.VERSION.SDK_INT;
        ViewConfiguration viewConfiguration = this.f5413a;
        float f = -(i > 26 ? ViewConfigurationApi26Impl.m2681b(viewConfiguration) : density.mo2551X0(64));
        float f2 = -(i > 26 ? ViewConfigurationApi26Impl.m2680a(viewConfiguration) : density.mo2551X0(64));
        ?? r11 = pointerEvent.f18282a;
        Offset offset = new Offset(0L);
        int size = ((Collection) r11).size();
        int i2 = 0;
        while (true) {
            long j = offset.f17524a;
            if (i2 >= size) {
                return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
            }
            offset = new Offset(Offset.m5058h(j, ((PointerInputChange) r11.get(i2)).f18306j));
            i2++;
        }
    }
}
