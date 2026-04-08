package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UnknownDescriptor extends BaseDescriptor {

    /* JADX INFO: renamed from: b */
    public static final Logger f58554b = LoggerFactory.getLogger((Class<?>) UnknownDescriptor.class);

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    public final int mo21825a() {
        throw new RuntimeException("sdjlhfl");
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f58532a + ", sizeOfInstance=0, data=" + ((Object) null) + '}';
    }
}
