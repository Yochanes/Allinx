package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FlatBufferBuilder {

    /* JADX INFO: compiled from: Proguard */
    public static class ByteBufferBackedInputStream extends InputStream {
        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ByteBufferFactory {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
    }
}
