package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import androidx.compose.animation.AbstractC0455a;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(tags = {5})
public class DecoderSpecificInfo extends BaseDescriptor {
    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    public final int mo21825a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("DecoderSpecificInfo{bytes="), "null", '}');
    }
}
