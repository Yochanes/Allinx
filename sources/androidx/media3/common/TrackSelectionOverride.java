package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionOverride {

    /* JADX INFO: renamed from: a */
    public final TrackGroup f25370a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f25371b;

    static {
        Util.m9594D(0);
        Util.m9594D(1);
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.f25365a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f25370a = trackGroup;
        this.f25371b = ImmutableList.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionOverride.class == obj.getClass()) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            if (this.f25370a.equals(trackSelectionOverride.f25370a) && this.f25371b.equals(trackSelectionOverride.f25371b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f25371b.hashCode() * 31) + this.f25370a.hashCode();
    }
}
