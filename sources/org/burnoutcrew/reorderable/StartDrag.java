package org.burnoutcrew.reorderable;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/burnoutcrew/reorderable/StartDrag;", "", "reorderable"}, m18303k = 1, m18304mv = {1, 7, 1}, m18306xi = 48)
public final /* data */ class StartDrag {

    /* JADX INFO: renamed from: a */
    public final long f58148a;

    /* JADX INFO: renamed from: b */
    public final Offset f58149b;

    public StartDrag(long j, Offset offset) {
        this.f58148a = j;
        this.f58149b = offset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartDrag)) {
            return false;
        }
        StartDrag startDrag = (StartDrag) obj;
        return PointerId.m5560a(this.f58148a, startDrag.f58148a) && Intrinsics.m18594b(this.f58149b, startDrag.f58149b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f58148a) * 31;
        Offset offset = this.f58149b;
        return iHashCode + (offset == null ? 0 : Long.hashCode(offset.f17524a));
    }

    public final String toString() {
        return "StartDrag(id=" + ((Object) PointerId.m5561b(this.f58148a)) + ", offset=" + this.f58149b + ')';
    }
}
