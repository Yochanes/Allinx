package androidx.appcompat.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f505a = 0;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m338a() {
            return 512;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
