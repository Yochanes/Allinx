package androidx.graphics.path;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m18302d2 = {"Landroidx/graphics/path/ConicConverter;", "", "", "conicPoints", "", "offset", "quadraticPoints", "", "weight", "tolerance", "internalConicToQuadratics", "([FI[FFF)I", "graphics-path_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConicConverter {
    private final native int internalConicToQuadratics(float[] conicPoints, int offset, float[] quadraticPoints, float weight, float tolerance);
}
