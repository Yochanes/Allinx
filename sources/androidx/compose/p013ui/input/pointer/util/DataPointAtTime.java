package androidx.compose.p013ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class DataPointAtTime {

    /* JADX INFO: renamed from: a */
    public long f18395a;

    /* JADX INFO: renamed from: b */
    public float f18396b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.f18395a == dataPointAtTime.f18395a && Float.compare(this.f18396b, dataPointAtTime.f18396b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18396b) + (Long.hashCode(this.f18395a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f18395a);
        sb.append(", dataPoint=");
        return AbstractC0000a.m16m(sb, this.f18396b, ')');
    }
}
