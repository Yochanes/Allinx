package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.Downloader;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DownloadManager {

    /* JADX INFO: renamed from: a */
    public int f27072a;

    /* JADX INFO: renamed from: b */
    public boolean f27073b;

    /* JADX INFO: compiled from: Proguard */
    public static final class DownloadUpdate {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InternalHandler extends Handler {
        /* JADX WARN: Finally extract failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    try {
                        throw null;
                    } catch (Throwable th) {
                        int i = Util.f25665a;
                        throw th;
                    }
                case 2:
                    throw null;
                case 3:
                    throw null;
                case 4:
                    ((String) message.obj).getClass();
                    throw null;
                case 5:
                    throw null;
                case 6:
                    throw null;
                case 7:
                    String str = ((DownloadRequest) message.obj).f27074a;
                    throw null;
                case 8:
                    throw null;
                case 9:
                    new ArrayList();
                    throw null;
                case 10:
                    ((Task) message.obj).getClass();
                    throw null;
                case 11:
                    Task task = (Task) message.obj;
                    int i2 = Util.f25665a;
                    task.getClass();
                    throw null;
                case TYPE_BYTES_VALUE:
                    throw null;
                case 13:
                    throw null;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Task extends Thread implements Downloader.ProgressListener {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10442a(boolean z2) {
        if (this.f27073b == z2) {
            return;
        }
        this.f27073b = z2;
        this.f27072a++;
        throw null;
    }
}
