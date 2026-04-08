package androidx.media3.common.util;

import java.io.OutputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AtomicFile {

    /* JADX INFO: compiled from: Proguard */
    public static final class AtomicFileOutputStream extends OutputStream {

        /* JADX INFO: renamed from: a */
        public boolean f25572a;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f25572a) {
                return;
            }
            this.f25572a = true;
            throw null;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }
}
