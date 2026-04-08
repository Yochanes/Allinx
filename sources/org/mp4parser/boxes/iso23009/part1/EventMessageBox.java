package org.mp4parser.boxes.iso23009.part1;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class EventMessageBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59046j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59047n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59048o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59049p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59050q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59051r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59052s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59053t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59054u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f59055v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f59056w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f59057x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f59058y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f59059z;

    static {
        Factory factory = new Factory(EventMessageBox.class, "EventMessageBox.java");
        f59046j = factory.m21739e(factory.m21738d("getSchemeIdUri", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"));
        f59047n = factory.m21739e(factory.m21738d("setSchemeIdUri", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"));
        f59056w = factory.m21739e(factory.m21738d("getId", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"));
        f59057x = factory.m21739e(factory.m21738d("setId", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "id", "", "void"));
        f59058y = factory.m21739e(factory.m21738d("getMessageData", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "[B"));
        f59059z = factory.m21739e(factory.m21738d("setMessageData", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"));
        f59048o = factory.m21739e(factory.m21738d("getValue", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"));
        f59049p = factory.m21739e(factory.m21738d("setValue", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"));
        f59050q = factory.m21739e(factory.m21738d("getTimescale", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"));
        f59051r = factory.m21739e(factory.m21738d("setTimescale", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "timescale", "", "void"));
        f59052s = factory.m21739e(factory.m21738d("getPresentationTimeDelta", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"));
        f59053t = factory.m21739e(factory.m21738d("setPresentationTimeDelta", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "presentationTimeDelta", "", "void"));
        f59054u = factory.m21739e(factory.m21738d("getEventDuration", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "", "", "", "long"));
        f59055v = factory.m21739e(factory.m21738d("setEventDuration", "org.mp4parser.boxes.iso23009.part1.EventMessageBox", "long", "eventDuration", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(Utf8.m21860a(null));
        byte b2 = (byte) 0;
        byteBuffer.put(b2);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put(b2);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.put((byte[]) null);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        Utf8.m21861b(null);
        Utf8.m21861b(null);
        throw null;
    }
}
