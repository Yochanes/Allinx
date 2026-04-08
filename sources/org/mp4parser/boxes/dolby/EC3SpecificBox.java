package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class EC3SpecificBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58503d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58504f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58505g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58506i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58507j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58508n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58509o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58510p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58511q;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final String toString() {
            return "Entry{fscod=0, bsid=0, bsmod=0, acmod=0, lfeon=0, reserved=0, num_dep_sub=0, chan_loc=0, reserved2=0}";
        }
    }

    static {
        Factory factory = new Factory(EC3SpecificBox.class, "EC3SpecificBox.java");
        f58503d = factory.m21739e(factory.m21738d("getContentSize", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "long"));
        f58504f = factory.m21739e(factory.m21738d("getContent", "org.mp4parser.boxes.dolby.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"));
        f58505g = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "java.util.List"));
        f58506i = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.dolby.EC3SpecificBox", "java.util.List", "entries", "", "void"));
        f58507j = factory.m21739e(factory.m21738d("addEntry", "org.mp4parser.boxes.dolby.EC3SpecificBox", "org.mp4parser.boxes.dolby.EC3SpecificBox$Entry", "entry", "", "void"));
        f58508n = factory.m21739e(factory.m21738d("getDataRate", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "int"));
        f58509o = factory.m21739e(factory.m21738d("setDataRate", "org.mp4parser.boxes.dolby.EC3SpecificBox", "int", "dataRate", "", "void"));
        f58510p = factory.m21739e(factory.m21738d("getNumIndSub", "org.mp4parser.boxes.dolby.EC3SpecificBox", "", "", "", "int"));
        f58511q = factory.m21739e(factory.m21738d("setNumIndSub", "org.mp4parser.boxes.dolby.EC3SpecificBox", "int", "numIndSub", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        JoinPoint joinPointM21737c = Factory.m21737c(f58504f, this, this, byteBuffer);
        RequiresParseDetailAspect.m21845a().getClass();
        RequiresParseDetailAspect.m21846b(joinPointM21737c);
        new BitWriterBuffer(byteBuffer).m21829a(0, 13);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        AbstractC0000a.m29z(Factory.m21736b(f58503d, this, this));
        throw null;
    }
}
