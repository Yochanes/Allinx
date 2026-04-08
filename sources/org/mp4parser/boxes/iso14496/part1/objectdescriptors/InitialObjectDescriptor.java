package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class InitialObjectDescriptor extends ObjectDescriptorBase {
    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        StringBuilder sb = new StringBuilder("InitialObjectDescriptor{objectDescriptorId=");
        sb.append(0);
        sb.append(", urlFlag=");
        sb.append(0);
        sb.append(", includeInlineProfileLevelFlag=");
        sb.append(0);
        sb.append(", urlLength=");
        sb.append(0);
        sb.append(", urlString='");
        sb.append((String) null);
        sb.append("', oDProfileLevelIndication=");
        sb.append(0);
        sb.append(", sceneProfileLevelIndication=");
        sb.append(0);
        sb.append(", audioProfileLevelIndication=");
        sb.append(0);
        sb.append(", visualProfileLevelIndication=");
        sb.append(0);
        sb.append(", graphicsProfileLevelIndication=");
        return AbstractC0000a.m11h(0, ", esDescriptors=null, extensionDescriptors=null, unknownDescriptors=null}", sb);
    }
}
