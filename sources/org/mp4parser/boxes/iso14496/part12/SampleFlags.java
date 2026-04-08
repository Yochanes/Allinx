package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleFlags {
    /* JADX INFO: renamed from: a */
    public final void m21832a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) (((long) (0 << 28)) | ((long) (0 << 26)) | ((long) (0 << 24)) | ((long) (0 << 22)) | ((long) (0 << 20)) | ((long) (0 << 17)) | ((long) (0 << 16)) | ((long) 0)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((0 * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SampleFlags{reserved=");
        sb.append(0);
        sb.append(", isLeading=");
        sb.append(0);
        sb.append(", depOn=");
        sb.append(0);
        sb.append(", isDepOn=");
        sb.append(0);
        sb.append(", hasRedundancy=");
        sb.append(0);
        sb.append(", padValue=");
        sb.append(0);
        sb.append(", isDiffSample=");
        sb.append(false);
        sb.append(", degradPrio=");
        return AbstractC0000a.m17n(sb, 0, '}');
    }
}
