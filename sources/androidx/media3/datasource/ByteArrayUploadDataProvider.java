package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import androidx.annotation.RequiresExtension;
import androidx.compose.foundation.text.input.internal.AbstractC0746e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresExtension
final class ByteArrayUploadDataProvider extends UploadDataProvider {

    /* JADX INFO: renamed from: a */
    public final byte[] f25799a;

    /* JADX INFO: renamed from: b */
    public int f25800b;

    public ByteArrayUploadDataProvider(byte[] bArr) {
        this.f25799a = bArr;
    }

    public final long getLength() {
        return this.f25799a.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int iMin = Math.min(byteBuffer.remaining(), this.f25799a.length - this.f25800b);
        byteBuffer.put(this.f25799a, this.f25800b, iMin);
        this.f25800b += iMin;
        AbstractC0746e.m3457p(uploadDataSink);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f25800b = 0;
        AbstractC0746e.m3438A(uploadDataSink);
    }
}
