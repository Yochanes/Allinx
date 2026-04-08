package okhttp3.internal.p047ws;

import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import okio.Buffer;
import okio.DeflaterSink;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MessageDeflater implements Closeable {

    /* JADX INFO: renamed from: a */
    public final boolean f57732a;

    /* JADX INFO: renamed from: b */
    public final Buffer f57733b;

    /* JADX INFO: renamed from: c */
    public final Deflater f57734c;

    /* JADX INFO: renamed from: d */
    public final DeflaterSink f57735d;

    public MessageDeflater(boolean z2) {
        this.f57732a = z2;
        Buffer buffer = new Buffer();
        this.f57733b = buffer;
        Deflater deflater = new Deflater(-1, true);
        this.f57734c = deflater;
        this.f57735d = new DeflaterSink(buffer, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f57735d.close();
    }
}
