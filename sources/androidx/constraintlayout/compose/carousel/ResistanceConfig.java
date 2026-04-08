package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ResistanceConfig {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ((ResistanceConfig) obj).getClass();
        return 0.0f == 0.0f;
    }

    public final int hashCode() {
        return Float.hashCode(10.0f) + AbstractC0455a.m2226a(Float.hashCode(0.0f) * 31, 10.0f, 31);
    }

    public final String toString() {
        return "ResistanceConfig(basis=0.0, factorAtMin=10.0, factorAtMax=10.0)";
    }
}
