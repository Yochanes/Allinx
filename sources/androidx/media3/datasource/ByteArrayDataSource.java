package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ByteArrayDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public Uri f25796e;

    /* JADX INFO: renamed from: f */
    public int f25797f;

    /* JADX INFO: renamed from: g */
    public int f25798g;

    /* JADX INFO: compiled from: Proguard */
    public interface UriResolver {
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25796e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25796e;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) {
        m9674m(dataSpec);
        this.f25796e = dataSpec.f25819a;
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f25798g;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        Assertions.m9466g(null);
        System.arraycopy(null, this.f25797f, bArr, i, iMin);
        this.f25797f += iMin;
        this.f25798g -= iMin;
        m9672k(iMin);
        return iMin;
    }
}
