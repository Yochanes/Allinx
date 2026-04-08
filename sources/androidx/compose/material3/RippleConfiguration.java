package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/RippleConfiguration;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RippleConfiguration {

    /* JADX INFO: renamed from: a */
    public final long f14224a = Color.f17583k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RippleConfiguration) {
            return Color.m5181c(this.f14224a, ((RippleConfiguration) obj).f14224a);
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.f17584l;
        return Long.hashCode(this.f14224a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) Color.m5187i(this.f14224a)) + ", rippleAlpha=null)";
    }
}
