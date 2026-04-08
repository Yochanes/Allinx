package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/JoinedKey;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class JoinedKey {

    /* JADX INFO: renamed from: a */
    public final Integer f16382a;

    /* JADX INFO: renamed from: b */
    public final Object f16383b;

    public JoinedKey(Integer num, Object obj) {
        this.f16382a = num;
        this.f16383b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return this.f16382a.equals(joinedKey.f16382a) && Intrinsics.m18594b(this.f16383b, joinedKey.f16383b);
    }

    public final int hashCode() {
        int iHashCode = this.f16382a.hashCode() * 31;
        Object obj = this.f16383b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f16382a + ", right=" + this.f16383b + ')';
    }
}
