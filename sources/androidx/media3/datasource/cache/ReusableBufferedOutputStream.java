package androidx.media3.datasource.cache;

import androidx.media3.common.util.Util;
import java.io.BufferedOutputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ReusableBufferedOutputStream extends BufferedOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = Util.f25665a;
        throw th;
    }
}
