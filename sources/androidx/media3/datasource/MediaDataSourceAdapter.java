package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@UnstableApi
public class MediaDataSourceAdapter extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public Uri f25894e;

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25894e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25894e;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) {
        this.f25894e = dataSpec.f25819a;
        m9674m(dataSpec);
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        throw null;
    }
}
