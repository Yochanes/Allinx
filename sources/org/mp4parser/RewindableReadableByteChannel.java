package org.mp4parser;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class RewindableReadableByteChannel implements ReadableByteChannel {
    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        throw null;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.position();
        throw null;
    }
}
