package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ChunkOffset64BitBox extends ChunkOffsetBox {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58561n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58562o;

    static {
        Factory factory = new Factory(ChunkOffset64BitBox.class, "ChunkOffset64BitBox.java");
        f58561n = factory.m21739e(factory.m21738d("getChunkOffsets", "org.mp4parser.boxes.iso14496.part12.ChunkOffset64BitBox", "", "", "", "[J"));
        f58562o = factory.m21739e(factory.m21738d("setChunkOffsets", "org.mp4parser.boxes.iso14496.part12.ChunkOffset64BitBox", "[J", "chunkOffsets", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    @Override // org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox
    /* JADX INFO: renamed from: g */
    public final long[] mo21831g() {
        AbstractC0000a.m29z(Factory.m21736b(f58561n, this, this));
        return null;
    }
}
