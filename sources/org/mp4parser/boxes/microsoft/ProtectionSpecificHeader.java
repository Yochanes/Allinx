package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
import java.util.HashMap;
import org.mp4parser.tools.Hex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ProtectionSpecificHeader {

    /* JADX INFO: renamed from: a */
    public static final HashMap f59067a = new HashMap();

    /* JADX INFO: renamed from: a */
    public abstract ByteBuffer mo21838a();

    public final boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProtectionSpecificHeader{data=");
        ByteBuffer byteBufferDuplicate = mo21838a().duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        sb.append(Hex.m21848a(0, bArr));
        sb.append('}');
        return sb.toString();
    }
}
