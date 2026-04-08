package androidx.camera.video.internal;

import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class SharedByteBuffer implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    public final void finalize() throws Throwable {
        try {
            throw null;
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "SharedByteBuffer[buf: %s, shareId: 0x%x, instanceId:0x%x]", null, 0, Integer.valueOf(System.identityHashCode(this)));
    }
}
