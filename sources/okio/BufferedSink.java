package okio;

import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface BufferedSink extends Sink, WritableByteChannel {
    /* JADX INFO: renamed from: G0 */
    BufferedSink mo21565G0(ByteString byteString);

    /* JADX INFO: renamed from: U0 */
    BufferedSink mo21579U0(long j);

    /* JADX INFO: renamed from: Z */
    BufferedSink mo21585Z(String str);

    /* JADX INFO: renamed from: c */
    Buffer getF57893b();

    /* JADX INFO: renamed from: q0 */
    long mo21600q0(Source source);

    BufferedSink write(byte[] bArr);

    BufferedSink write(byte[] bArr, int i, int i2);

    BufferedSink writeByte(int i);
}
