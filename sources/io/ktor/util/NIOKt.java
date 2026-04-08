package io.ktor.util;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-utils"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class NIOKt {
    /* JADX INFO: renamed from: a */
    public static final int m17172a(ByteBuffer moveTo, ByteBuffer destination, int i) {
        Intrinsics.m18599g(moveTo, "$this$moveTo");
        Intrinsics.m18599g(destination, "destination");
        int iMin = Math.min(i, Math.min(moveTo.remaining(), destination.remaining()));
        if (iMin == moveTo.remaining()) {
            destination.put(moveTo);
            return iMin;
        }
        int iLimit = moveTo.limit();
        moveTo.limit(moveTo.position() + iMin);
        destination.put(moveTo);
        moveTo.limit(iLimit);
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m17173b(ByteBuffer moveToByteArray) {
        Intrinsics.m18599g(moveToByteArray, "$this$moveToByteArray");
        byte[] bArr = new byte[moveToByteArray.remaining()];
        moveToByteArray.get(bArr);
        return bArr;
    }
}
