package androidx.compose.p013ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "Companion", "packedValue", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class ColorModel {

    /* JADX INFO: renamed from: a */
    public static final long f17685a;

    /* JADX INFO: renamed from: b */
    public static final long f17686b;

    /* JADX INFO: renamed from: c */
    public static final long f17687c;

    /* JADX INFO: renamed from: d */
    public static final long f17688d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f17689e = 0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f17685a = (((long) 0) & 4294967295L) | j2;
        f17686b = (((long) 1) & 4294967295L) | j2;
        f17687c = j2 | (((long) 2) & 4294967295L);
        f17688d = (j & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m5313a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m5314b(long j) {
        return m5313a(j, f17685a) ? "Rgb" : m5313a(j, f17686b) ? "Xyz" : m5313a(j, f17687c) ? "Lab" : m5313a(j, f17688d) ? "Cmyk" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ColorModel)) {
            return false;
        }
        ((ColorModel) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return m5314b(0L);
    }
}
