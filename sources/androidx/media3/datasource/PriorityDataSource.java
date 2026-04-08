package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PriorityDataSource implements DataSource {

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements DataSource.Factory {
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: b */
    public final void mo9669b(TransferListener transferListener) {
        transferListener.getClass();
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: f */
    public final Map mo9670f() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) {
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        throw null;
    }
}
