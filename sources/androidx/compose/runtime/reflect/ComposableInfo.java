package androidx.compose.runtime.reflect;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class ComposableInfo {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ((ComposableInfo) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0455a.m2228c(0, AbstractC0455a.m2228c(0, Boolean.hashCode(false) * 31, 31), 31);
    }

    public final String toString() {
        return "ComposableInfo(isComposable=false, realParamsCount=0, changedParams=0, defaultParams=0)";
    }
}
