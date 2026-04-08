package okio;

import java.io.Closeable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Lokio/Source;", "Ljava/io/Closeable;", "Lokio/Closeable;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Source extends Closeable {
    /* JADX INFO: renamed from: J0 */
    long mo12415J0(Buffer buffer, long j);

    /* JADX INFO: renamed from: timeout */
    Timeout getF57877b();
}
