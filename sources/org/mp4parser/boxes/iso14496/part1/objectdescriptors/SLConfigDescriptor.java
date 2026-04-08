package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(tags = {6})
public class SLConfigDescriptor extends BaseDescriptor {

    /* JADX INFO: renamed from: b */
    public int f58553b;

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    public final int mo21825a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f58553b == ((SLConfigDescriptor) obj).f58553b;
    }

    public final int hashCode() {
        return this.f58553b;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        return AbstractC0000a.m17n(new StringBuilder("SLConfigDescriptor{predefined="), this.f58553b, '}');
    }
}
