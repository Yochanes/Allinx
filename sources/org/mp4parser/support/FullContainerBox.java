package org.mp4parser.support;

import java.nio.ByteBuffer;
import org.mp4parser.FullBox;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {

    /* JADX INFO: renamed from: c */
    public static final Logger f59265c = LoggerFactory.getLogger((Class<?>) FullContainerBox.class);

    @Override // org.mp4parser.support.AbstractContainerBox
    /* JADX INFO: renamed from: g */
    public final ByteBuffer mo21840g() {
        ByteBuffer byteBufferWrap;
        long size = getSize();
        String str = this.f59260b;
        if (size >= 4294967296L) {
            byte[] bArr = new byte[20];
            bArr[3] = 1;
            bArr[4] = str.getBytes()[0];
            bArr[5] = str.getBytes()[1];
            bArr[6] = str.getBytes()[2];
            bArr[7] = str.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            byteBufferWrap.putLong(getSize());
            IsoTypeWriter.m21857h(0, byteBufferWrap);
            IsoTypeWriter.m21856g(0, byteBufferWrap);
        } else {
            byte[] bArr2 = new byte[12];
            bArr2[4] = str.getBytes()[0];
            bArr2[5] = str.getBytes()[1];
            bArr2[6] = str.getBytes()[2];
            bArr2[7] = str.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr2);
            byteBufferWrap.putInt((int) getSize());
            byteBufferWrap.position(8);
            IsoTypeWriter.m21857h(0, byteBufferWrap);
            IsoTypeWriter.m21856g(0, byteBufferWrap);
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    @Override // org.mp4parser.BasicContainer
    public final String toString() {
        return getClass().getSimpleName().concat("[childBoxes]");
    }
}
