package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ItemDataBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58612d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58613f;

    static {
        Factory factory = new Factory(ItemDataBox.class, "ItemDataBox.java");
        f58612d = factory.m21739e(factory.m21738d("getData", "org.mp4parser.boxes.iso14496.part12.ItemDataBox", "", "", "", "java.nio.ByteBuffer"));
        f58613f = factory.m21739e(factory.m21738d("setData", "org.mp4parser.boxes.iso14496.part12.ItemDataBox", "java.nio.ByteBuffer", "data", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put((ByteBuffer) null);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }
}
