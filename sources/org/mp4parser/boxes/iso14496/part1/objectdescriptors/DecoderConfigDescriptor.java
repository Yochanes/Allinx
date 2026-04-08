package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.util.ArrayList;
import java.util.Iterator;
import org.mp4parser.tools.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(tags = {4})
public class DecoderConfigDescriptor extends BaseDescriptor {

    /* JADX INFO: renamed from: i */
    public static final Logger f58536i = LoggerFactory.getLogger((Class<?>) DecoderConfigDescriptor.class);

    /* JADX INFO: renamed from: b */
    public int f58537b;

    /* JADX INFO: renamed from: c */
    public int f58538c;

    /* JADX INFO: renamed from: d */
    public int f58539d;

    /* JADX INFO: renamed from: e */
    public long f58540e;

    /* JADX INFO: renamed from: f */
    public long f58541f;

    /* JADX INFO: renamed from: g */
    public AudioSpecificConfig f58542g;

    /* JADX INFO: renamed from: h */
    public ArrayList f58543h;

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    public final int mo21825a() {
        AudioSpecificConfig audioSpecificConfig = this.f58542g;
        int iM21826b = (audioSpecificConfig == null ? 0 : audioSpecificConfig.m21826b()) + 13 + 0;
        Iterator it = this.f58543h.iterator();
        while (it.hasNext()) {
            iM21826b += ((ProfileLevelIndicationDescriptor) it.next()).m21826b();
        }
        return iM21826b;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.f58537b);
        sb.append(", streamType=");
        sb.append(this.f58538c);
        sb.append(", upStream=");
        sb.append(0);
        sb.append(", bufferSizeDB=");
        sb.append(this.f58539d);
        sb.append(", maxBitRate=");
        sb.append(this.f58540e);
        sb.append(", avgBitRate=");
        sb.append(this.f58541f);
        sb.append(", decoderSpecificInfo=");
        sb.append((Object) null);
        sb.append(", audioSpecificInfo=");
        sb.append(this.f58542g);
        sb.append(", configDescriptorDeadBytes=");
        sb.append(Hex.m21848a(0, new byte[0]));
        sb.append(", profileLevelIndicationDescriptors=");
        Object obj = this.f58543h;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
