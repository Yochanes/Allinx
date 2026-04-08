package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.IsoFile;
import org.mp4parser.ParsableBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBox implements ParsableBox {

    /* JADX INFO: renamed from: c */
    public static final Logger f59257c = LoggerFactory.getLogger((Class<?>) AbstractBox.class);

    /* JADX INFO: renamed from: a */
    public final String f59258a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f59259b = null;

    public AbstractBox(String str) {
        this.f59258a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21820a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: b */
    public abstract long mo21821b();

    /* JADX INFO: renamed from: c */
    public byte[] mo21837c() {
        return null;
    }

    @Override // org.mp4parser.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        long size = getSize();
        if (size > 2147483647L || size < -2147483648L) {
            throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + size + ")");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) size);
        int i = "uuid".equals(this.f59258a) ? 24 : 8;
        long jMo21821b = mo21821b();
        ByteBuffer byteBuffer = this.f59259b;
        boolean z2 = (jMo21821b + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
        String str = this.f59258a;
        if (z2) {
            byteBufferAllocate.putInt((int) getSize());
            byteBufferAllocate.put(IsoFile.m21819g(str));
        } else {
            byteBufferAllocate.putInt((int) 1);
            byteBufferAllocate.put(IsoFile.m21819g(str));
            byteBufferAllocate.putLong(getSize());
        }
        if ("uuid".equals(str)) {
            byteBufferAllocate.put(mo21837c());
        }
        mo21820a(byteBufferAllocate);
        ByteBuffer byteBuffer2 = this.f59259b;
        if (byteBuffer2 != null) {
            byteBuffer2.rewind();
            while (this.f59259b.remaining() > 0) {
                byteBufferAllocate.put(this.f59259b);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    @Override // org.mp4parser.Box
    public final long getSize() {
        long jMo21821b = mo21821b();
        long j = jMo21821b + ((long) ((jMo21821b >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(this.f59258a) ? 16 : 0)));
        ByteBuffer byteBuffer = this.f59259b;
        return j + ((long) (byteBuffer != null ? byteBuffer.limit() : 0));
    }
}
