package org.mp4parser.support;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import org.mp4parser.BasicContainer;
import org.mp4parser.ParsableBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AbstractContainerBox extends BasicContainer implements ParsableBox {

    /* JADX INFO: renamed from: b */
    public final String f59260b;

    public AbstractContainerBox(String str) {
        this.f58259a = new ArrayList();
        this.f59260b = str;
    }

    /* JADX INFO: renamed from: g */
    public ByteBuffer mo21840g() {
        ByteBuffer byteBufferWrap;
        long size = getSize();
        String str = this.f59260b;
        if (size >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = str.getBytes()[0];
            bArr[5] = str.getBytes()[1];
            bArr[6] = str.getBytes()[2];
            bArr[7] = str.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            byteBufferWrap.putLong(getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, str.getBytes()[0], str.getBytes()[1], str.getBytes()[2], str.getBytes()[3]});
            byteBufferWrap.putInt((int) getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(mo21840g());
        m21818d(writableByteChannel);
    }

    public long getSize() {
        long jM21817b = m21817b();
        return jM21817b + ((long) (8 + jM21817b >= 4294967296L ? 16 : 8));
    }
}
