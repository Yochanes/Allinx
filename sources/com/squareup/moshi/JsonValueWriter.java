package com.squareup.moshi;

import java.io.IOException;
import okio.ForwardingSink;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class JsonValueWriter extends JsonWriter {

    /* JADX INFO: renamed from: com.squareup.moshi.JsonValueWriter$1 */
    /* JADX INFO: compiled from: Proguard */
    class C50231 extends ForwardingSink {
        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
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
