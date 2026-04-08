package androidx.compose.p013ui.graphics;

import android.graphics.ColorMatrixColorFilter;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class ColorFilter {

    /* JADX INFO: renamed from: a */
    public final android.graphics.ColorFilter f17586a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static ColorMatrixColorFilter m5190a(float[] fArr) {
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrixColorFilter(fArr));
            colorMatrixColorFilter.f17587b = fArr;
            return colorMatrixColorFilter;
        }

        /* JADX INFO: renamed from: b */
        public static BlendModeColorFilter m5191b(long j) {
            return new BlendModeColorFilter(j, 5);
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f17586a = colorFilter;
    }
}
