package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class Brush {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static LinearGradient m5171a(List list) {
            return new LinearGradient(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }

        /* JADX INFO: renamed from: b */
        public static LinearGradient m5172b(List list, long j, long j2, int i) {
            if ((i & 2) != 0) {
                j = 0;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = 9187343241974906880L;
            }
            return new LinearGradient(list, null, j3, j2);
        }

        /* JADX INFO: renamed from: c */
        public static RadialGradient m5173c(List list, long j, float f, int i) {
            if ((i & 2) != 0) {
                j = 9205357640488583168L;
            }
            return new RadialGradient(list, j, f);
        }

        /* JADX INFO: renamed from: d */
        public static LinearGradient m5174d(List list, float f, int i) {
            return new LinearGradient(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f)) & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5170a(float f, long j, Paint paint);
}
