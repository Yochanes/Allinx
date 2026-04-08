package androidx.compose.p013ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.os.Build;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import androidx.compose.runtime.Immutable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/ColorMatrixColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ColorMatrixColorFilter extends ColorFilter {

    /* JADX INFO: renamed from: b */
    public float[] f17587b;

    /* JADX INFO: renamed from: a */
    public final float[] m5204a() {
        float[] fArr = this.f17587b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f17586a;
        if (!(colorFilter instanceof android.graphics.ColorMatrixColorFilter) || 26 > Build.VERSION.SDK_INT) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        AbstractC1212a.m4895h((android.graphics.ColorMatrixColorFilter) colorFilter, colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f17587b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m5204a(), ((ColorMatrixColorFilter) obj).m5204a());
    }

    public final int hashCode() {
        float[] fArr = this.f17587b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f17587b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
