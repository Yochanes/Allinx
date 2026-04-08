package org.mp4parser.boxes.iso14496.part15;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class HevcDecoderConfigurationRecord {

    /* JADX INFO: compiled from: Proguard */
    public static class Array {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbM25v = AbstractC0000a.m25v("HEVCDecoderConfigurationRecord{configurationVersion=0, general_profile_space=0, general_tier_flag=false, general_profile_idc=0, general_profile_compatibility_flags=0, general_constraint_indicator_flags=0, general_level_idc=0", ", reserved1=0", ", min_spatial_segmentation_idc=0", ", reserved2=0", ", parallelismType=0");
        sbM25v.append(", reserved3=0");
        sbM25v.append(", chromaFormat=0");
        sbM25v.append(", reserved4=0");
        sbM25v.append(", bitDepthLumaMinus8=0");
        sbM25v.append(", reserved5=0");
        sbM25v.append(", bitDepthChromaMinus8=0, avgFrameRate=0, constantFrameRate=0, numTemporalLayers=0, temporalIdNested=false, lengthSizeMinusOne=0, arrays=");
        sbM25v.append((Object) null);
        sbM25v.append('}');
        return sbM25v.toString();
    }
}
