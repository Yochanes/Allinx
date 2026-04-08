package io.ktor.utils.p043io.streams;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/utils/io/streams/StreamsKt$readerUTF8$1", "Ljava/io/Reader;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class StreamsKt$readerUTF8$1 extends Reader {
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Reader
    public final int read(char[] cbuf, int i, int i2) {
        Intrinsics.m18599g(cbuf, "cbuf");
        throw null;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        if (0 >= j) {
            return 0L;
        }
        Math.min(UserMetadata.MAX_INTERNAL_KEY_SIZE, j);
        throw null;
    }
}
