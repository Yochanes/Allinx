package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class StaticChunkOffsetBox extends ChunkOffsetBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58761o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58762p;

    /* JADX INFO: renamed from: n */
    public long[] f58763n;

    static {
        Factory factory = new Factory(StaticChunkOffsetBox.class, "StaticChunkOffsetBox.java");
        f58761o = factory.m21739e(factory.m21738d("getChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "", "", "", "[J"));
        f58762p = factory.m21739e(factory.m21738d("setChunkOffsets", "org.mp4parser.boxes.iso14496.part12.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt(this.f58763n.length);
        for (long j : this.f58763n) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return (this.f58763n.length * 4) + 8;
    }

    @Override // org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox
    /* JADX INFO: renamed from: g */
    public final long[] mo21831g() {
        AbstractC0000a.m29z(Factory.m21736b(f58761o, this, this));
        return this.f58763n;
    }
}
