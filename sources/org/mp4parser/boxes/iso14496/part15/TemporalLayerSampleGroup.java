package org.mp4parser.boxes.iso14496.part15;

import org.mp4parser.boxes.samplegrouping.GroupEntry;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TemporalLayerSampleGroup extends GroupEntry {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return 0 == 0 && 0 == 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((0 * 31) + 0) * 31) + 0) * 31) + 0) * 31) + ((int) (0 ^ (0 >>> 32)))) * 31) + ((int) (0 ^ (0 >>> 32)))) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemporalLayerSampleGroup{temporalLayerId=");
        sb.append(0);
        sb.append(", tlprofile_space=");
        sb.append(0);
        sb.append(", tltier_flag=");
        sb.append(false);
        sb.append(", tlprofile_idc=");
        sb.append(0);
        sb.append(", tlprofile_compatibility_flags=");
        sb.append(0L);
        sb.append(", tlconstraint_indicator_flags=");
        sb.append(0L);
        sb.append(", tllevel_idc=");
        sb.append(0);
        sb.append(", tlMaxBitRate=");
        sb.append(0);
        sb.append(", tlAvgBitRate=");
        sb.append(0);
        sb.append(", tlConstantFrameRate=");
        sb.append(0);
        sb.append(", tlAvgFrameRate=");
        return AbstractC0000a.m17n(sb, 0, '}');
    }
}
