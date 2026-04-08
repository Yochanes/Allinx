package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/model/WorkGenerationalId;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class WorkGenerationalId {

    /* JADX INFO: renamed from: a */
    public final String f33000a;

    /* JADX INFO: renamed from: b */
    public final int f33001b;

    public WorkGenerationalId(String workSpecId, int i) {
        Intrinsics.m18599g(workSpecId, "workSpecId");
        this.f33000a = workSpecId;
        this.f33001b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        return Intrinsics.m18594b(this.f33000a, workGenerationalId.f33000a) && this.f33001b == workGenerationalId.f33001b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33001b) + (this.f33000a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f33000a);
        sb.append(", generation=");
        return AbstractC0000a.m17n(sb, this.f33001b, ')');
    }
}
