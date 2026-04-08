package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.Writer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
@Deprecated
public class LogWriter extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (i2 > 0) {
            if (cArr[i] != '\n') {
                throw null;
            }
            throw null;
        }
    }
}
