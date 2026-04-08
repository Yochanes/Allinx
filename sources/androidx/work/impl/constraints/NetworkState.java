package androidx.work.impl.constraints;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/constraints/NetworkState;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class NetworkState {

    /* JADX INFO: renamed from: a */
    public final boolean f32910a;

    /* JADX INFO: renamed from: b */
    public final boolean f32911b;

    /* JADX INFO: renamed from: c */
    public final boolean f32912c;

    /* JADX INFO: renamed from: d */
    public final boolean f32913d;

    public NetworkState(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f32910a = z2;
        this.f32911b = z3;
        this.f32912c = z4;
        this.f32913d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.f32910a == networkState.f32910a && this.f32911b == networkState.f32911b && this.f32912c == networkState.f32912c && this.f32913d == networkState.f32913d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32913d) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(Boolean.hashCode(this.f32910a) * 31, 31, this.f32911b), 31, this.f32912c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.f32910a);
        sb.append(", isValidated=");
        sb.append(this.f32911b);
        sb.append(", isMetered=");
        sb.append(this.f32912c);
        sb.append(", isNotRoaming=");
        return AbstractC0455a.m2243r(sb, this.f32913d, ')');
    }
}
