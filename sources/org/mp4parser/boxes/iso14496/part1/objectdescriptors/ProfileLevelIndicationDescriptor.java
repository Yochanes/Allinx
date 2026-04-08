package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(tags = {20})
public class ProfileLevelIndicationDescriptor extends BaseDescriptor {
    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    public final int mo21825a() {
        return 1;
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
        return 0;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(0) + '}';
    }
}
