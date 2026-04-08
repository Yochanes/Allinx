package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class HandlerBox extends AbstractFullBox {

    /* JADX INFO: renamed from: p */
    public static final Map f58597p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58598q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58599r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58600s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58601t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58602u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58603v;

    /* JADX INFO: renamed from: j */
    public String f58604j;

    /* JADX INFO: renamed from: n */
    public String f58605n;

    /* JADX INFO: renamed from: o */
    public boolean f58606o;

    static {
        Factory factory = new Factory(HandlerBox.class, "HandlerBox.java");
        f58598q = factory.m21739e(factory.m21738d("getHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"));
        f58599r = factory.m21739e(factory.m21738d("setHandlerType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "handlerType", "", "void"));
        f58600s = factory.m21739e(factory.m21738d("getName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"));
        f58601t = factory.m21739e(factory.m21738d("setName", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "java.lang.String", "name", "", "void"));
        f58602u = factory.m21739e(factory.m21738d("getHumanReadableTrackType", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"));
        f58603v = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.HandlerBox", "", "", "", "java.lang.String"));
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put("hint", "Hint Track");
        map.put("appl", "Apple specific");
        map.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        f58597p = Collections.unmodifiableMap(map);
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.put(IsoFile.m21819g(this.f58604j));
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        String str = this.f58605n;
        if (str != null) {
            byteBuffer.put(Utf8.m21860a(str));
        }
        if (this.f58606o) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return this.f58606o ? Utf8.m21861b(this.f58605n) + 25 : Utf8.m21861b(this.f58605n) + 24;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58603v, this, this), "HandlerBox[handlerType=");
        AbstractC0000a.m29z(Factory.m21736b(f58598q, this, this));
        sbM26w.append(this.f58604j);
        sbM26w.append(";name=");
        AbstractC0000a.m29z(Factory.m21736b(f58600s, this, this));
        return AbstractC0000a.m19p(sbM26w, this.f58605n, "]");
    }
}
