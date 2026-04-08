package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class AllocatedBuffer {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C15381 extends AllocatedBuffer {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$2 */
    /* JADX INFO: compiled from: Proguard */
    final class C15392 extends AllocatedBuffer {
    }

    /* JADX INFO: renamed from: a */
    public static C15381 m8302a(ByteBuffer byteBuffer) {
        Internal.m8515a(byteBuffer, "buffer");
        return new C15381();
    }

    /* JADX INFO: renamed from: b */
    public static void m8303b(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}
