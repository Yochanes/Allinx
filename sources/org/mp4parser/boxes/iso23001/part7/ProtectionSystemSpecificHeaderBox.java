package org.mp4parser.boxes.iso23001.part7;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.UUIDConverter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59040j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59041n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59042o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59043p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59044q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59045r;

    static {
        Factory factory = new Factory(ProtectionSystemSpecificHeaderBox.class, "ProtectionSystemSpecificHeaderBox.java");
        f59040j = factory.m21739e(factory.m21738d("getKeyIds", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"));
        f59041n = factory.m21739e(factory.m21738d("setKeyIds", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", "void"));
        f59042o = factory.m21739e(factory.m21738d("getSystemId", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"));
        f59043p = factory.m21739e(factory.m21738d("setSystemId", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"));
        f59044q = factory.m21739e(factory.m21738d("getContent", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"));
        f59045r = factory.m21739e(factory.m21738d("setContent", "org.mp4parser.boxes.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", FirebaseAnalytics.Param.CONTENT, "", "void"));
        UUIDConverter.m21859a(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        UUIDConverter.m21859a(UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
        UUIDConverter.m21859a(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(null, 0, 16);
        if (this.f59263d > 0) {
            throw null;
        }
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }
}
