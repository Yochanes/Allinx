package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlaceholderDataSource implements DataSource {
    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: b */
    public final void mo9669b(TransferListener transferListener) {
    }
}
