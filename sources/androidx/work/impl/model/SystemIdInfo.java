package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.AbstractC0455a;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Entity
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/model/SystemIdInfo;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final /* data */ class SystemIdInfo {

    /* JADX INFO: renamed from: a */
    public final String f32993a;

    /* JADX INFO: renamed from: b */
    public final int f32994b;

    /* JADX INFO: renamed from: c */
    public final int f32995c;

    public SystemIdInfo(String workSpecId, int i, int i2) {
        Intrinsics.m18599g(workSpecId, "workSpecId");
        this.f32993a = workSpecId;
        this.f32994b = i;
        this.f32995c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        return Intrinsics.m18594b(this.f32993a, systemIdInfo.f32993a) && this.f32994b == systemIdInfo.f32994b && this.f32995c == systemIdInfo.f32995c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32995c) + AbstractC0455a.m2228c(this.f32994b, this.f32993a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f32993a);
        sb.append(", generation=");
        sb.append(this.f32994b);
        sb.append(", systemId=");
        return AbstractC0000a.m17n(sb, this.f32995c, ')');
    }
}
