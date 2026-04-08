package com.squareup.moshi;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class JsonUtf8Writer extends JsonWriter {

    /* JADX INFO: renamed from: b */
    public static final String[] f43386b = new String[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];

    /* JADX INFO: renamed from: com.squareup.moshi.JsonUtf8Writer$1 */
    /* JADX INFO: compiled from: Proguard */
    class C50221 implements Sink {
        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: o0 */
        public final void mo12451o0(Buffer buffer, long j) {
            throw null;
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public final Timeout getF57883b() {
            return Timeout.f57912d;
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f43386b[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f43386b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f43391a;
        if (i > 1) {
            throw new IOException("Incomplete document");
        }
        if (i == 1) {
            throw null;
        }
        this.f43391a = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f43391a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}
