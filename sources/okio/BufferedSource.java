package okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "Lokio/Buffer;", "Lokio/RealBufferedSource;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface BufferedSource extends Source, ReadableByteChannel {
    /* JADX INFO: renamed from: I */
    byte[] mo21568I();

    /* JADX INFO: renamed from: R0 */
    long mo21576R0(BufferedSink bufferedSink);

    /* JADX INFO: renamed from: X0 */
    InputStream mo21583X0();

    /* JADX INFO: renamed from: Y0 */
    int mo21584Y0(Options options);

    /* JADX INFO: renamed from: c */
    Buffer getF57896b();

    /* JADX INFO: renamed from: e0 */
    boolean mo21591e0(long j, ByteString byteString);

    /* JADX INFO: renamed from: i0 */
    String mo21596i0(Charset charset);

    boolean request(long j);
}
