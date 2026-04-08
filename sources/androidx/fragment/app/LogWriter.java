package androidx.fragment.app;

import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Writer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class LogWriter extends Writer {

    /* JADX INFO: renamed from: b */
    public final StringBuilder f24763b = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);

    /* JADX INFO: renamed from: a */
    public final String f24762a = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m9084a() {
        StringBuilder sb = this.f24763b;
        if (sb.length() > 0) {
            Log.d(this.f24762a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m9084a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m9084a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m9084a();
            } else {
                this.f24763b.append(c2);
            }
        }
    }
}
