package androidx.compose.p013ui.unit;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-unit_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DensityKt {
    /* JADX INFO: renamed from: a */
    public static final Density m6639a(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static Density m6640b() {
        return new DensityImpl(1.0f, 1.0f);
    }
}
