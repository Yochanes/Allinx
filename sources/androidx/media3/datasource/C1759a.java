package androidx.media3.datasource;

import android.util.Base64;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: androidx.media3.datasource.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1759a implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25915a;

    public /* synthetic */ C1759a(int i) {
        this.f25915a = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f25915a) {
            case 0:
                Supplier supplier = DataSourceBitmapLoader.f25811a;
                return MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
            default:
                byte[] bArr = new byte[12];
                DefaultPlaybackSessionManager.f26391i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
