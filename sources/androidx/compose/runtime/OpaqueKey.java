package androidx.compose.runtime;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class OpaqueKey {

    /* JADX INFO: renamed from: a */
    public final String f16419a;

    public OpaqueKey(String str) {
        this.f16419a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && Intrinsics.m18594b(this.f16419a, ((OpaqueKey) obj).f16419a);
    }

    public final int hashCode() {
        return this.f16419a.hashCode();
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("OpaqueKey(key="), this.f16419a, ')');
    }
}
