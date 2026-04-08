package org.mp4parser.boxes.iso14496.part14;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor;
import org.mp4parser.support.AbstractFullBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AbstractDescriptorBox extends AbstractFullBox {

    /* JADX INFO: renamed from: o */
    public static final Logger f58900o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58901p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58902q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58903r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58904s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58905t;

    /* JADX INFO: renamed from: j */
    public BaseDescriptor f58906j;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f58907n;

    static {
        Factory factory = new Factory(AbstractDescriptorBox.class, "AbstractDescriptorBox.java");
        f58901p = factory.m21739e(factory.m21738d("getData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"));
        f58902q = factory.m21739e(factory.m21738d("setData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"));
        f58903r = factory.m21739e(factory.m21738d("getDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor"));
        f58904s = factory.m21739e(factory.m21738d("setDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor", "descriptor", "", "void"));
        f58905t = factory.m21739e(factory.m21738d("getDescriptorAsString", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.lang.String"));
        f58900o = LoggerFactory.getLogger(AbstractDescriptorBox.class.getName());
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        this.f58907n.rewind();
        byteBuffer.put(this.f58907n);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public long mo21821b() {
        return this.f58907n.limit() + 4;
    }
}
