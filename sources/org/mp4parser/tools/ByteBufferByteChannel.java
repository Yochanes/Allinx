package org.mp4parser.tools;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferByteChannel implements ByteChannel {
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.remaining();
        throw null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.remaining();
        throw null;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
